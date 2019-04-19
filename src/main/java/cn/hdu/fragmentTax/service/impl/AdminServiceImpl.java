package cn.hdu.fragmentTax.service.impl;

import cn.hdu.fragmentTax.dao.entity.AllPrizeEntity;
import cn.hdu.fragmentTax.dao.entity.HonorEntity;
import cn.hdu.fragmentTax.dao.entity.StuBaseEntity;
import cn.hdu.fragmentTax.dao.mapper.IAllPrizeMapper;
import cn.hdu.fragmentTax.dao.mapper.IHonorMapper;
import cn.hdu.fragmentTax.dao.mapper.IStuBaseMapper;
import cn.hdu.fragmentTax.model.request.AdminExamRequ;
import cn.hdu.fragmentTax.model.request.AdminQueryRequ;
import cn.hdu.fragmentTax.model.response.GetHonorResp;
import cn.hdu.fragmentTax.service.IAdminService;
import cn.hdu.fragmentTax.service.impl.model.IAdminModel;
import cn.hdu.fragmentTax.service.impl.model.IPrizeModel;
import cn.hdu.fragmentTax.utils.FormatUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

@Service
public class AdminServiceImpl implements IAdminService {

    @Autowired
    private IHonorMapper honorMapper;
    @Autowired
    private IStuBaseMapper stuBaseMapper;
    @Autowired
    private IAllPrizeMapper allPrizeMapper;

    @Autowired
    private IPrizeModel prizeModel;
    @Autowired
    private IAdminModel adminModel;

    @Override
    public Map<String, Object> showHonorsForTeacher(AdminQueryRequ adminQueryRequ) {
        Map<String, Object> resp = new HashMap<>();
        String status = FormatUtil.strings2String(getIntAuditStatus(adminQueryRequ.getStatus()));
        List<HonorEntity> honorEntities = honorMapper.queryForAdmin(status);
        List<GetHonorResp> getHonorResps = new LinkedList<GetHonorResp>();
        for (HonorEntity honorEntity : honorEntities) {
            StuBaseEntity stuBaseEntity = stuBaseMapper.queryByStuId(honorEntity.getStuId());
            if (FormatUtil.isEmpty(stuBaseEntity)) {
                continue;
            }
            GetHonorResp getHonorResp = adminModel.createGetHonorResp(honorEntity, stuBaseEntity);
            getHonorResps.add(getHonorResp);
        }
        resp.put("c", 200);
        resp.put("r", getHonorResps);
        return resp;
    }

    @Override
    public Map<String, Object> examHonor(AdminExamRequ adminExamRequ) {
        Map<String, Object> resp = new HashMap<>();
        try {
            honorMapper.updateScore(adminExamRequ.getId(), adminExamRequ.getScore(), 2);
            // 更新分数
            Float allHonorScore = 0.0f;
            List<HonorEntity> honorEntities = honorMapper.queryByStuId(adminExamRequ.getStuId(), 2);
            for (HonorEntity honorEntity : honorEntities) {
                allHonorScore = allHonorScore + honorEntity.getScore();
            }
            allPrizeMapper.updateHonorScore(adminExamRequ.getStuId(), allHonorScore);
            // 更新排名
            Integer order = 1;
            List<AllPrizeEntity> allPrizeEntities = allPrizeMapper.orderByHonor();
            for (AllPrizeEntity allPrizeEntity : allPrizeEntities) {
                allPrizeMapper.updateHonorNum(allPrizeEntity.getId(), order);
                order = order + 1;
            }
            resp.put("c", 200);
            resp.put("r", "审核成功");
        } catch (Exception e) {
            resp.put("c", 401);
            resp.put("r", "数据库错误");
        }
        return resp;
    }


    private String[] getIntAuditStatus(String[] auditStatus) {
        for (int i = 0; i < auditStatus.length; i++) {
            if (auditStatus[i].equals("已删除")) {
                auditStatus[i] = "0";
            } else if (auditStatus[i].equals("待审核")) {
                auditStatus[i] = "1";
            } else if (auditStatus[i].equals("已通过")) {
                auditStatus[i] = "2";
            }
        }
        return auditStatus;
    }
}
