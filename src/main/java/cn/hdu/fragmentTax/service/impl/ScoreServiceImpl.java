package cn.hdu.fragmentTax.service.impl;

import cn.hdu.fragmentTax.dao.entity.*;
import cn.hdu.fragmentTax.dao.mapper.*;
import cn.hdu.fragmentTax.view.request.EditAllScoreRequ;
import cn.hdu.fragmentTax.view.request.EditEntranceInfoRequ;
import cn.hdu.fragmentTax.view.request.EditTutorCoerRequ;
import cn.hdu.fragmentTax.view.response.GetAllScoreResp;
import cn.hdu.fragmentTax.view.response.GetEntranceInfoResp;
import cn.hdu.fragmentTax.view.response.GetTutorCoerResp;
import cn.hdu.fragmentTax.service.IScoreService;
import cn.hdu.fragmentTax.service.impl.model.IScoreModel;
import cn.hdu.fragmentTax.utils.FormatUtil;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class ScoreServiceImpl implements IScoreService {
    @Autowired
    private IStuBaseMapper stuBaseMapper;
    @Autowired
    private IScoreEntranceMapper scoreEntranceMapper;
    @Autowired
    private IScoreAverageMapper scoreAverageMapper;
    @Autowired
    private IScoreAllMapper scoreAllMapper;
    @Autowired
    private ITutorsMapper tutorsMapper;
    @Autowired
    private ICounsellorsMapper counsellorsMapper;

    @Autowired
    private IScoreModel scoreModel;

    @Override
    public Map<String, Object> editEntrScore(EditEntranceInfoRequ editEntranceInfoRequ) {
        Map<String, Object> resp = new HashMap<>();
        ScoreEntranceEntity scoreEntranceEntity = scoreModel.crateScoreEntranceEntity(editEntranceInfoRequ);
        try {
            scoreEntranceMapper.insertScore(scoreEntranceEntity);
            scoreAverageMapper.insertLanguage(editEntranceInfoRequ.getStuId(), editEntranceInfoRequ.getLanguagesTypes(), editEntranceInfoRequ.getLanguagesScore());
            stuBaseMapper.updateUSchool(editEntranceInfoRequ.getStuId(), editEntranceInfoRequ.getuSchool(), editEntranceInfoRequ.getuMajor(),
                    editEntranceInfoRequ.getIdCard(), editEntranceInfoRequ.getMasterMajor(), editEntranceInfoRequ.getMasterDirection(),
                    editEntranceInfoRequ.getPoliticalOutlook(), editEntranceInfoRequ.getBiogenicLand(), editEntranceInfoRequ.geteMail(),
                    editEntranceInfoRequ.getEmergencyContact(), editEntranceInfoRequ.getEmergencyPhone());
            resp.put("c", 200);
            resp.put("r", "修改成功");
        } catch (Exception e) {
            resp.put("c", 401);
            resp.put("r", "数据库错误");
        }
        return resp;
    }

    @Override
    public Map<String, Object> getEntrScore(String stuId) {
        Map<String, Object> resp = new HashMap<>();
        StuBaseEntity stuBaseEntity = stuBaseMapper.queryByStuId(stuId);
        ScoreEntranceEntity scoreEntranceEntity = scoreEntranceMapper.queryByStuId(stuId);
        ScoreAverageEntity scoreAverageEntity = scoreAverageMapper.queryByStuId(stuId);
        GetEntranceInfoResp getEntranceInfoResp = new GetEntranceInfoResp();
//        getEntranceInfoResp.setStuId(stuId);
//        getEntranceInfoResp.setuSchool(stuBaseEntity.getUSchool());
//        getEntranceInfoResp.setuMajor(stuBaseEntity.getUMajor());
        BeanUtils.copyProperties(stuBaseEntity, getEntranceInfoResp);
        if (!FormatUtil.isEmpty(scoreEntranceEntity)){
            BeanUtils.copyProperties(scoreEntranceEntity, getEntranceInfoResp);
//            getEntranceInfoResp.setEnglish(scoreEntranceEntity.getEnglish());
//            getEntranceInfoResp.setMath(scoreEntranceEntity.getMath());
//            getEntranceInfoResp.setPolitical(scoreEntranceEntity.getPolitical());
//            getEntranceInfoResp.setSpecialized(scoreEntranceEntity.getSpecialized());
        }
        if (!FormatUtil.isEmpty(scoreAverageEntity)) {
            getEntranceInfoResp.setLanguagesTypes(scoreAverageEntity.getLanguagesTypes());
            getEntranceInfoResp.setLanguagesScore(scoreAverageEntity.getLanguagesScore());
        }
        resp.put("c", 200);
        resp.put("r", getEntranceInfoResp);
        return resp;
    }

    @Override
    public Map<String, Object> editTuCoer(EditTutorCoerRequ editTutorCoerRequ) {
        Map<String, Object> resp = new HashMap<>();
        TutorsEntity tutorsEntity = tutorsMapper.queryByTutorName(editTutorCoerRequ.getTutor());
        CounsellorsEntity counsellorsEntity = counsellorsMapper.queryByCoerName(editTutorCoerRequ.getCounsellor());
        if (FormatUtil.isEmpty(tutorsEntity) || FormatUtil.isEmpty(counsellorsEntity)) {
            resp.put("c", 304);
            resp.put("r", "辅导员或者导师Id错误");
            return resp;
        }
        try {
            stuBaseMapper.updateTuCoer(editTutorCoerRequ.getStuId(), tutorsEntity.getTutorId(), counsellorsEntity.getCounsellorId(), editTutorCoerRequ.getSecretary());
            resp.put("c", 200);
            resp.put("r", "修改成功");
        } catch (Exception e) {
            resp.put("c", 401);
            resp.put("r", "数据库错误");
        }
        return resp;
    }

    @Override
    public Map<String, Object> getTuCoer(String stuId) {
        Map<String, Object> resp = new HashMap<>();
        StuBaseEntity stuBaseEntity = stuBaseMapper.queryByStuId(stuId);
        GetTutorCoerResp getTutorCoerResp = new GetTutorCoerResp();
        getTutorCoerResp.setStuId(stuId);
        getTutorCoerResp.setSecretary(stuBaseEntity.getSecretary());
        if (!FormatUtil.isEmpty(stuBaseEntity.getCounsellorId())) {
            CounsellorsEntity counsellorsEntity = counsellorsMapper.queryByCoId(stuBaseEntity.getCounsellorId());
            getTutorCoerResp.setCounsellor(counsellorsEntity.getName());
        }
        if (!FormatUtil.isEmpty(stuBaseEntity.getTutorId())) {
            TutorsEntity tutorsEntity = tutorsMapper.queryByTuId(stuBaseEntity.getTutorId());
            getTutorCoerResp.setTutor(tutorsEntity.getName());
        }
        resp.put("c", 200);
        resp.put("r", getTutorCoerResp);
        return resp;
    }

    @Override
    public Map<String, Object> getAllScore(String stuId) {
        Map<String, Object> resp = new HashMap<>();
        ScoreAllEntity scoreAllEntity = scoreAllMapper.queryByStuId(stuId);
        if (FormatUtil.isEmpty(scoreAllEntity)) {
            resp.put("c", 305);
            resp.put("r", "没有成绩登记");
            return resp;
        }
        GetAllScoreResp getAllScoreResp = scoreModel.createAllScoreResp(scoreAllEntity);
        // 比较平均成绩是否正确
        Map<String, Object> score = ScoreAllEntity.getAverageScore(scoreAllEntity);
        ScoreAverageEntity scoreAverageEntity = scoreAverageMapper.queryByStuId(stuId);
        if ((Float)score.get("averageScore") == scoreAverageEntity.getAverageScore()) {
            getAllScoreResp.setAverageScore(scoreAverageEntity.getAverageScore());
            getAllScoreResp.setCurrNumber(scoreAverageEntity.getCurrNumber());
            resp.put("c", 200);
            resp.put("r", getAllScoreResp);
        }else {
            scoreAverageMapper.updateAverageScore(scoreAllEntity.getStuId(), (Float) score.get("averageScore"), (Integer) score.get("currNumber"));
            getAllScoreResp.setCurrNumber((Integer) score.get("currNumber"));
            getAllScoreResp.setAverageScore((Float) score.get("averageScore"));
            resp.put("c", 200);
            resp.put("r", getAllScoreResp);
        }
        return resp;
    }

    @Override
    public Map<String, Object> editAllScore(EditAllScoreRequ editAllScoreResp) {
        Map<String, Object> resp = new HashMap<>();
        ScoreAllEntity scoreAllEntity = scoreModel.createScoreAllEntity(editAllScoreResp);
        // todo 做一个成绩判断是否是错误的改动
        try {
            Map<String, Object> score = ScoreAllEntity.getAverageScore(scoreAllEntity);
            scoreAverageMapper.updateAverageScore(scoreAllEntity.getStuId(), (Float) score.get("averageScore"), (Integer) score.get("currNumber"));
            scoreAllMapper.updateScore(scoreAllEntity);
            resp.put("c", 200);
            resp.put("r", "修改成功");
        } catch (Exception e) {
            resp.put("c", 401);
            resp.put("r", "数据库错误");
        }
        return resp;
    }

}
