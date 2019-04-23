package cn.hdu.fragmentTax.service.impl;

import cn.hdu.fragmentTax.dao.entity.AllPrizeEntity;
import cn.hdu.fragmentTax.dao.entity.HonorEntity;
import cn.hdu.fragmentTax.dao.entity.PaperEntity;
import cn.hdu.fragmentTax.dao.entity.StuBaseEntity;
import cn.hdu.fragmentTax.dao.mapper.*;
import cn.hdu.fragmentTax.model.request.AdminExamRequ;
import cn.hdu.fragmentTax.model.request.AdminQueryRequ;
import cn.hdu.fragmentTax.model.response.GetHonorResp;
import cn.hdu.fragmentTax.model.response.GetPaperResp;
import cn.hdu.fragmentTax.service.IAdminService;
import cn.hdu.fragmentTax.service.impl.model.IAdminModel;
import cn.hdu.fragmentTax.service.impl.model.IPrizeModel;
import cn.hdu.fragmentTax.utils.FormatUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.awt.print.Paper;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

@Service
public class AdminServiceImpl implements IAdminService {


    @Autowired
    private IHonorMapper honorMapper;

    @Autowired
    private IPaperMapper paperMapper;

    @Autowired
    private IAllPrizeMapper allPrizeMapper;

    @Autowired
    private IPatentMapper patentMapper;

    @Autowired
    private ICompetitionMapper competitionMapper;

    @Autowired
    private IInnovativeProMapper innovativeProMapper;

    @Autowired
    private IEntrepreneurialProMapper entrepreneurialProMapper;

    @Autowired
    private IAcademicExchangeMapper academicExchangeMapper;

    @Autowired
    private IEngineeringProMapper engineeringProMapper;

    @Autowired
    private IWorkMapper workMapper;

    @Autowired
    private IMasterPaperMapper masterPaperMapper;

    @Autowired
    private IAdminModel adminModel;

    @Autowired
    private IStuBaseMapper stuBaseMapper;

    @Override
    public Map<String, Object> showHonorsForTeacher(AdminQueryRequ adminQueryRequ) {
        Map<String, Object> resp = new HashMap<>();
        String status = FormatUtil.strings2String(getIntAuditStatus(adminQueryRequ.getStatus()));
        List<HonorEntity> honorEntities = null;
        List<GetHonorResp> getHonorResps = new LinkedList<GetHonorResp>();
        if (adminQueryRequ.getState() == 1) {
//            辅导员查询
            honorEntities = honorMapper.queryForAdmin(status);
        } else {
//            导师查询
            List<StuBaseEntity> stuBaseEntities = stuBaseMapper.queryByTutorId(adminQueryRequ.getUserId());
            String stuIds = FormatUtil.strings2String(getStuIds(stuBaseEntities));
            if (stuIds.equals("")){
                resp.put("c", 200);
                resp.put("r", getHonorResps);
                return resp;
            }
            honorEntities = honorMapper.queryForTutor(status, stuIds);
        }
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

    @Override
    public Map<String, Object> showPapersForTeacher(AdminQueryRequ adminQueryRequ) {
        Map<String, Object> resp = new HashMap<>();
        String status = FormatUtil.strings2String(getIntAuditStatus(adminQueryRequ.getStatus()));
        List<PaperEntity> paperEntities = null;
        List<GetPaperResp> getPaperResps = new LinkedList<GetPaperResp>();
        if (adminQueryRequ.getState() == 1) {
//            辅导员查询
            paperEntities = paperMapper.queryForAdmin(status);
        } else {
//            导师查询
            List<StuBaseEntity> stuBaseEntities = stuBaseMapper.queryByTutorId(adminQueryRequ.getUserId());
            String stuIds = FormatUtil.strings2String(getStuIds(stuBaseEntities));
            if (stuIds.equals("")){
                resp.put("c", 200);
                resp.put("r", getPaperResps);
                return resp;
            }
            paperEntities = paperMapper.queryForTutor(status, stuIds);
        }
        for (PaperEntity paperEntity : paperEntities) {
            StuBaseEntity stuBaseEntity = stuBaseMapper.queryByStuId(paperEntity.getStuId());
            if (FormatUtil.isEmpty(stuBaseEntity)) {
                continue;
            }
            GetPaperResp getPaperResp = adminModel.createGetPaperResp(paperEntity, stuBaseEntity);
            getPaperResps.add(getPaperResp);
        }
        resp.put("c", 200);
        resp.put("r", getPaperResps);
        return resp;
    }

    @Override
    public Map<String, Object> examPaper(AdminExamRequ adminExamRequ) {
        Map<String, Object> resp = new HashMap<>();
        try {
            paperMapper.updateScore(adminExamRequ.getId(), adminExamRequ.getScore(), 2);
            // 更新分数
            Float allPaperScore = 0.0f;
            List<PaperEntity> paperEntities = paperMapper.queryByStuId(adminExamRequ.getStuId(), 2);
            for (PaperEntity paperEntity : paperEntities) {
                allPaperScore = allPaperScore + paperEntity.getScore();
            }
            allPrizeMapper.updatePaperScore(adminExamRequ.getStuId(), allPaperScore);
            // 更新排名
            Integer order = 1;
            List<AllPrizeEntity> allPrizeEntities = allPrizeMapper.orderByPaper();
            for (AllPrizeEntity allPrizeEntity : allPrizeEntities) {
                allPrizeMapper.updatePaperNum(allPrizeEntity.getId(), order);
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

    private String[] getStuIds(List<StuBaseEntity> stuBaseEntities) {
        String stuIds[] = new String[stuBaseEntities.size()];
        int i = 0;
        for (StuBaseEntity stuBaseEntity : stuBaseEntities) {
            stuIds[i] = stuBaseEntity.getStuId();
            i = i + 1;
        }
        return stuIds;
    }
}
