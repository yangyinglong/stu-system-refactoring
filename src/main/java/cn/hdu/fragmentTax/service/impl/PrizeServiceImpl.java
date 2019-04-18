package cn.hdu.fragmentTax.service.impl;

import cn.hdu.fragmentTax.dao.entity.AllPrizeEntity;
import cn.hdu.fragmentTax.dao.entity.HonorEntity;
import cn.hdu.fragmentTax.dao.entity.PaperEntity;
import cn.hdu.fragmentTax.dao.entity.PatentEntity;
import cn.hdu.fragmentTax.dao.mapper.IAllPrizeMapper;
import cn.hdu.fragmentTax.dao.mapper.IHonorMapper;
import cn.hdu.fragmentTax.dao.mapper.IPaperMapper;
import cn.hdu.fragmentTax.dao.mapper.IPatentMapper;
import cn.hdu.fragmentTax.model.request.EditHonorResp;
import cn.hdu.fragmentTax.model.request.EditPaperRequ;
import cn.hdu.fragmentTax.model.request.EditPatentRequ;
import cn.hdu.fragmentTax.model.response.GetHonorResp;
import cn.hdu.fragmentTax.model.response.GetPaperResp;
import cn.hdu.fragmentTax.model.response.GetPatentResp;
import cn.hdu.fragmentTax.model.response.GetPrizesResp;
import cn.hdu.fragmentTax.service.IPrizeService;
import cn.hdu.fragmentTax.service.impl.model.IPrizeModel;
import cn.hdu.fragmentTax.utils.DateUtil;
import cn.hdu.fragmentTax.utils.FormatUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class PrizeServiceImpl implements IPrizeService {

    @Autowired
    private IPrizeModel prizeModel;

    @Autowired
    private IHonorMapper honorMapper;

    @Autowired
    private IPaperMapper paperMapper;

    @Autowired
    private IAllPrizeMapper allPrizeMapper;

    @Autowired
    private IPatentMapper patentMapper;

    @Override
    public Map<String, Object> editHonor(EditHonorResp editHonorResp) {
        Map<String, Object> resp = new HashMap<>();
        HonorEntity honorEntity = prizeModel.createHonorEntity(editHonorResp);
        if (!FormatUtil.isEmpty(editHonorResp.getId())) {
            // 更新
            honorEntity.setId(editHonorResp.getId());
            try {
                honorMapper.update(honorEntity);
                resp.put("c", 200);
                resp.put("r", "修改成功");
            } catch (Exception e) {
                resp.put("c", 401);
                resp.put("r", "数据库错误");
            }
        } else {
            // 插入
            try {
                honorMapper.insert(honorEntity);
                resp.put("c", 200);
                resp.put("r", "插入成功");
            } catch (Exception e) {
                resp.put("c", 401);
                resp.put("r", "数据库错误");
            }
        }
        return resp;
    }

    @Override
    public Map<String, Object> getHonors(String stuId) {
        Map<String, Object> resp = new HashMap<>();
        List<HonorEntity> honorEntities = honorMapper.queryStuId(stuId);
        List<GetHonorResp> getHonorResps = new ArrayList<GetHonorResp>();
        for (HonorEntity honorEntity : honorEntities) {
            GetHonorResp getHonorResp = prizeModel.createGetHonorResp(honorEntity);
            getHonorResps.add(getHonorResp);
        }
        resp.put("c", 200);
        resp.put("r", getHonorResps);
        return resp;
    }

    @Override
    public Map<String, Object> getPrizes(String stuId) {
        Map<String, Object> resp = new HashMap<>();
        AllPrizeEntity allPrizeEntity = allPrizeMapper.queryByStuId(stuId);
        if (FormatUtil.isEmpty(allPrizeEntity)) {
            allPrizeMapper.insertFirst(stuId, DateUtil.getCurrentDatetime());
            allPrizeEntity = new AllPrizeEntity();
            allPrizeEntity.setHonorNum(0);
            allPrizeEntity.setHonorScore(0);
            allPrizeEntity.setPaperNum(0);
            allPrizeEntity.setPaperSocre(0);
            allPrizeEntity.setPatentNum(0);
            allPrizeEntity.setPatentScore(0);
        }
        GetPrizesResp getPrizesResp = prizeModel.createGetPrizesResp(allPrizeEntity);
        resp.put("c", 200);
        resp.put("r", getPrizesResp);
        return resp;
    }

    @Override
    public Map<String, Object> editPaper(EditPaperRequ editPaperRequ){
        Map<String, Object> resp = new HashMap<>();
        if (!FormatUtil.isEmpty(editPaperRequ.getId())) {
            // 更新

            try {
                PaperEntity paperEntity = prizeModel.createPaperEntity(editPaperRequ);
                paperEntity.setId(editPaperRequ.getId());
                paperMapper.update(paperEntity);
                resp.put("c", 200);
                resp.put("r", "修改成功");
            } catch (Exception e) {
                resp.put("c", 401);
                resp.put("r", "数据库错误");
            }
        } else {
            // 插入
            try {
                PaperEntity paperEntity = prizeModel.createPaperEntity(editPaperRequ);
                paperMapper.insert(paperEntity);
                resp.put("c", 200);
                resp.put("r", "插入成功");
            } catch (Exception e) {
                resp.put("c", 401);
                resp.put("r", "数据库错误");
            }
        }
        return resp;
    }

    @Override
    public Map<String, Object> getPapers(String stuId) {
        Map<String, Object> resp = new HashMap<>();
        List<PaperEntity> paperEntities = paperMapper.queryStuId(stuId);
        List<GetPaperResp> getPaperResps = new ArrayList<GetPaperResp>();
        for (PaperEntity paperEntity : paperEntities) {
            GetPaperResp getPaperResp = prizeModel.createGetPaperResp(paperEntity);
            getPaperResps.add(getPaperResp);
        }
        resp.put("c", 200);
        resp.put("r", getPaperResps);
        return resp;
    }

    @Override
    public Map<String, Object> editPatent(EditPatentRequ editPatentRequ) {
        Map<String, Object> resp = new HashMap<>();
        if (!FormatUtil.isEmpty(editPatentRequ.getId())) {
            // 更新

            try {
                PatentEntity patentEntity = prizeModel.createPatentEntity(editPatentRequ);
                patentEntity.setId(editPatentRequ.getId());
                patentMapper.update(patentEntity);
                resp.put("c", 200);
                resp.put("r", "修改成功");
            } catch (Exception e) {
                resp.put("c", 401);
                resp.put("r", "数据库错误");
            }
        } else {
            // 插入
            try {
                PatentEntity patentEntity = prizeModel.createPatentEntity(editPatentRequ);
                patentMapper.insert(patentEntity);
                resp.put("c", 200);
                resp.put("r", "插入成功");
            } catch (Exception e) {
                resp.put("c", 401);
                resp.put("r", "数据库错误");
            }
        }
        return resp;
    }

    @Override
    public Map<String, Object> getPatents(String stuId) {
        Map<String, Object> resp = new HashMap<>();
        List<PatentEntity> patentEntities = patentMapper.queryStuId(stuId);
        List<GetPatentResp> getPatentResps = new ArrayList<GetPatentResp>();
        for (PatentEntity patentResp : patentEntities) {
            GetPatentResp getPatentResp = prizeModel.createGetPatentResp(patentResp);
            getPatentResps.add(getPatentResp);
        }
        resp.put("c", 200);
        resp.put("r", getPatentResps);
        return resp;
    }

}
