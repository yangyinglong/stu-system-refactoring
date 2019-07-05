package cn.hdu.fragmentTax.service.impl.model.impl;

import cn.hdu.fragmentTax.dao.entity.*;
import cn.hdu.fragmentTax.dao.mapper.IStuBaseMapper;
import cn.hdu.fragmentTax.view.response.*;
import cn.hdu.fragmentTax.service.impl.model.IAdminModel;
import cn.hdu.fragmentTax.utils.FormatUtil;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AdminModelImpl implements IAdminModel {
    @Autowired
    private IStuBaseMapper stuBaseMapper;

    @Override
    public GetHonorResp createGetHonorResp(HonorEntity honorEntity, StuBaseEntity stuBaseEntity) {
        GetHonorResp getHonorResp = new GetHonorResp();
        getHonorResp.setName(stuBaseEntity.getName());
        getHonorResp.setId(honorEntity.getId());
        getHonorResp.setStuId(honorEntity.getStuId());
        getHonorResp.setScore(honorEntity.getScore());
        getHonorResp.setProofMaterialId(honorEntity.getProofMaterialId());
        if (honorEntity.getHonorType() == 1) {
            getHonorResp.setHonorType("本科生奖学金");
        } else if (honorEntity.getHonorType() == 2) {
            getHonorResp.setHonorType("研究生奖学金");
        } else if (honorEntity.getHonorType() == 3) {
            getHonorResp.setHonorType("企业奖学金");
        } else if (honorEntity.getHonorType() == 4) {
            getHonorResp.setHonorType("优秀毕业生");
        } else if (honorEntity.getHonorType() == 5) {
            getHonorResp.setHonorType("三好学生");
        } else if (honorEntity.getHonorType() == 6) {
            getHonorResp.setHonorType("优秀班干部");
        } else if (honorEntity.getHonorType() == 7) {
            getHonorResp.setHonorType("优秀党支书");
        } else if (honorEntity.getHonorType() == 8) {
            getHonorResp.setHonorType("优秀团支书");
        } else if (honorEntity.getHonorType() == 9) {
            getHonorResp.setHonorType("十佳大学生");
        } else {
            getHonorResp.setHonorType("其他");
        }

        if (honorEntity.getHonorGrade() == 1) {
            getHonorResp.setHonorGrade("一等奖");
        } else if (honorEntity.getHonorGrade() == 2) {
            getHonorResp.setHonorGrade("二等奖");
        } else {
            getHonorResp.setHonorGrade("三等奖");
        }

        if (honorEntity.getHonorLevel() == 1) {
            getHonorResp.setHonorLevel("国家级");
        } else if (honorEntity.getHonorLevel() == 2) {
            getHonorResp.setHonorLevel("省级");
        } else if (honorEntity.getHonorLevel() == 3) {
            getHonorResp.setHonorLevel("企业");
        } else {
            getHonorResp.setHonorLevel("校级");
        }
        if (honorEntity.getState() == 1) {
            getHonorResp.setStatus("待审核");
        } else {
            getHonorResp.setStatus("已通过");
        }
        getHonorResp.setGetDate(honorEntity.getCreatedTime().split(" ")[0]);
        return getHonorResp;
    }

    @Override
    public GetPaperResp createGetPaperResp(PaperEntity paperEntity, StuBaseEntity stuBaseEntity) {
        GetPaperResp getPaperResp = new GetPaperResp();
        getPaperResp.setName(stuBaseEntity.getName());
        getPaperResp.setId(paperEntity.getId());
        getPaperResp.setStuId(paperEntity.getStuId());
        getPaperResp.setPaperTitle(paperEntity.getPaperTitle());
        getPaperResp.setJournalTitle(paperEntity.getJournalTitle());
        getPaperResp.setRanking(paperEntity.getRanking());
        getPaperResp.setTotalNumber(paperEntity.getTotalNumber());
        getPaperResp.setGetDate(paperEntity.getCreatedTime().split(" ")[0]);
        getPaperResp.setScore(paperEntity.getScore());
        getPaperResp.setProofMaterialId(paperEntity.getProofMaterialId());
        if (paperEntity.getPaperGrade() == 1) {
            getPaperResp.setPaperGrade("一般");
        } else if (paperEntity.getPaperGrade() == 2) {
            getPaperResp.setPaperGrade("核心");
        } else if (paperEntity.getPaperGrade() == 3) {
            getPaperResp.setPaperGrade("一级");
        } else if (paperEntity.getPaperGrade() == 4) {
            getPaperResp.setPaperGrade("EI");
        } else if (paperEntity.getPaperGrade() == 5) {
            getPaperResp.setPaperGrade("SCI一区");
        } else if (paperEntity.getPaperGrade() == 6) {
            getPaperResp.setPaperGrade("SCI二区");
        } else if (paperEntity.getPaperGrade() == 7) {
            getPaperResp.setPaperGrade("SCI三区");
        } else {
            getPaperResp.setPaperGrade("SCI四区");
        }

        if (paperEntity.getPaperState() == 1) {
            getPaperResp.setPaperState("投稿");
        } else if (paperEntity.getPaperState() == 2) {
            getPaperResp.setPaperState("初审");
        } else if (paperEntity.getPaperState() == 3) {
            getPaperResp.setPaperState("外审");
        } else if (paperEntity.getPaperState() == 4) {
            getPaperResp.setPaperState("复审");
        } else if (paperEntity.getPaperState() == 5) {
            getPaperResp.setPaperState("录用");
        } else if (paperEntity.getPaperState() == 6) {
            getPaperResp.setPaperState("在线");
        } else if (paperEntity.getPaperState() == 7) {
            getPaperResp.setPaperState("出版");
        } else {
            getPaperResp.setPaperState("未知");
        }

        if (paperEntity.getState() == 1) {
            getPaperResp.setStatus("待审核");
        } else if (paperEntity.getState() == 2) {
            getPaperResp.setStatus("已通过");
        } else {
            getPaperResp.setStatus("已删除");
        }
        return getPaperResp;
    }

    @Override
    public GetPatentResp createGetPatentResp(PatentEntity patentEntity, StuBaseEntity stuBaseEntity) {
        GetPatentResp getPatentResp = new GetPatentResp();
        getPatentResp.setName(stuBaseEntity.getName());
        getPatentResp.setId(patentEntity.getId());
        getPatentResp.setStuId(patentEntity.getStuId());
        getPatentResp.setPatentName(patentEntity.getPatentName());
        getPatentResp.setRanking(patentEntity.getRanking());
        getPatentResp.setTotalNumber(patentEntity.getTotalNumber());
        getPatentResp.setGetDate(patentEntity.getCreatedTime().split(" ")[0]);
        getPatentResp.setScore(patentEntity.getScore());
        getPatentResp.setProofMaterialId(patentEntity.getProofMaterialId());
        if (patentEntity.getState() == 1) {
            getPatentResp.setStatus("待审核");
        } else if (patentEntity.getState() == 2) {
            getPatentResp.setStatus("已通过");
        } else {
            getPatentResp.setStatus("已删除");
        }
//        1-实用新型专利,2-发明专利
        if (patentEntity.getPatentType() == 1) {
            getPatentResp.setPatentType("实用新型专利");
        } else {
            getPatentResp.setPatentType("发明专利");
        }
        // 专利状态：1-申请,2-受理,3-审查中,4-一审,5-二审,6-三审,7-授权
        if (patentEntity.getPatentState() == 1) {
            getPatentResp.setPatentState("申请");
        } else if (patentEntity.getPatentState() == 2) {
            getPatentResp.setPatentState("受理");
        } else if (patentEntity.getPatentState() == 3) {
            getPatentResp.setPatentState("审查中");
        } else if (patentEntity.getPatentState() == 4) {
            getPatentResp.setPatentState("一审");
        } else if (patentEntity.getPatentState() == 5) {
            getPatentResp.setPatentState("二审");
        } else if (patentEntity.getPatentState() == 6) {
            getPatentResp.setPatentState("三审");
        } else {
            getPatentResp.setPatentState("授权");
        }

        return getPatentResp;
    }

    @Override
    public GetCompetitionResp createGetCompetitionResp(CompetitionEntity competitionEntity, StuBaseEntity stuBaseEntity) {
        GetCompetitionResp getCompetitionResp = new GetCompetitionResp();
        BeanUtils.copyProperties(competitionEntity, getCompetitionResp);
        getCompetitionResp.setName(stuBaseEntity.getName());
        getCompetitionResp.setGetDate(competitionEntity.getCreatedTime().split(" ")[0]);
        if (competitionEntity.getState() == 1) {
            getCompetitionResp.setStatus("待审核");
        } else if (competitionEntity.getState() == 2) {
            getCompetitionResp.setStatus("已通过");
        } else {
            getCompetitionResp.setStatus("已删除");
        }
        return getCompetitionResp;
    }

    @Override
    public GetInnoProResp createGetInnoProResp(EntrepreneurialProEntity entrepreneurialProEntity, StuBaseEntity stuBaseEntity) {
        GetInnoProResp getInnoProResp = new GetInnoProResp();
        BeanUtils.copyProperties(entrepreneurialProEntity, getInnoProResp);
        getInnoProResp.setName(stuBaseEntity.getName());
        getInnoProResp.setGetDate(entrepreneurialProEntity.getCreatedTime().split(" ")[0]);
        if (entrepreneurialProEntity.getState() == 1) {
            getInnoProResp.setStatus("待审核");
        } else if (entrepreneurialProEntity.getState() == 2) {
            getInnoProResp.setStatus("已通过");
        } else {
            getInnoProResp.setStatus("已删除");
        }
        return getInnoProResp;
    }

    @Override
    public GetInnoProResp createGetInnoProResp(InnovativeProEntity innovativeProEntity, StuBaseEntity stuBaseEntity) {
        GetInnoProResp getInnoProResp = new GetInnoProResp();
        BeanUtils.copyProperties(innovativeProEntity, getInnoProResp);
        getInnoProResp.setName(stuBaseEntity.getName());
        getInnoProResp.setGetDate(innovativeProEntity.getCreatedTime().split(" ")[0]);
        if (innovativeProEntity.getState() == 1) {
            getInnoProResp.setStatus("待审核");
        } else if (innovativeProEntity.getState() == 2) {
            getInnoProResp.setStatus("已通过");
        } else {
            getInnoProResp.setStatus("已删除");
        }
        return getInnoProResp;
    }

    @Override
    public GetEngiProResp createGetEngiProResp(EngineeringProEntity engineeringProEntity, StuBaseEntity stuBaseEntity) {
        GetEngiProResp getEngiProResp = new GetEngiProResp();
        BeanUtils.copyProperties(engineeringProEntity, getEngiProResp);
        getEngiProResp.setGetDate(engineeringProEntity.getCreatedTime().split(" ")[0]);
        getEngiProResp.setName(stuBaseEntity.getName());
        if (engineeringProEntity.getState() == 1) {
            getEngiProResp.setStatus("待审核");
        } else if (engineeringProEntity.getState() == 2) {
            getEngiProResp.setStatus("已通过");
        } else {
            getEngiProResp.setStatus("已删除");
        }
        return getEngiProResp;
    }

    @Override
    public GetAcadExchResp createGetAcadExchResp(AcademicExchangeEntity academicExchangeEntity, StuBaseEntity stuBaseEntity) {
        GetAcadExchResp getAcadExchResp = new GetAcadExchResp();
        BeanUtils.copyProperties(academicExchangeEntity, getAcadExchResp);
        getAcadExchResp.setName(stuBaseEntity.getName());
        getAcadExchResp.setStartTime(academicExchangeEntity.getStartTime().split(" ")[0]);
        getAcadExchResp.setEndTime(academicExchangeEntity.getEndTime().split(" ")[0]);
        if (academicExchangeEntity.getState() == 1) {
            getAcadExchResp.setStatus("待审核");
        } else if (academicExchangeEntity.getState() == 2) {
            getAcadExchResp.setStatus("已通过");
        } else {
            getAcadExchResp.setStatus("已删除");
        }
        return getAcadExchResp;
    }

    @Override
    public GetMasterPaperResp createGetMasterPaperResp(MasterPaperEntity masterPaperEntity, StuBaseEntity stuBaseEntity) {
        GetMasterPaperResp getMasterPaperResp = new GetMasterPaperResp();
        BeanUtils.copyProperties(masterPaperEntity, getMasterPaperResp);
        getMasterPaperResp.setName(stuBaseEntity.getName());
        getMasterPaperResp.setGetDate(masterPaperEntity.getCreatedTime().split(" ")[0]);
        if (masterPaperEntity.getState() == 1) {
            getMasterPaperResp.setStatus("待审核");
        } else if (masterPaperEntity.getState() == 2) {
            getMasterPaperResp.setStatus("已通过");
        } else {
            getMasterPaperResp.setStatus("已删除");
        }
        return getMasterPaperResp;
    }

    @Override
    public GetWorkResp createGetWorkResp(WorkEntity workEntity, StuBaseEntity stuBaseEntity) {
        GetWorkResp getWorkResp = new GetWorkResp();
        BeanUtils.copyProperties(workEntity, getWorkResp);
        getWorkResp.setName(stuBaseEntity.getName());
        getWorkResp.setGetDate(workEntity.getCreatedTime().split(" ")[0]);
        if (workEntity.getState() == 1) {
            getWorkResp.setStatus("待审核");
        } else if (workEntity.getState() == 2) {
            getWorkResp.setStatus("已通过");
        } else {
            getWorkResp.setStatus("已删除");
        }
        return getWorkResp;
    }

    @Override
    public GetStuForTeacherResp createGetStuForTeacherResp(StuBaseEntity stuBaseEntity, TutorsEntity tutorsEntity, CounsellorsEntity counsellorsEntity, ScoreEntranceEntity scoreEntranceEntity, ScoreAverageEntity scoreAverageEntity) {
        GetStuForTeacherResp getStuForTeacherResp = new GetStuForTeacherResp();
        BeanUtils.copyProperties(stuBaseEntity, getStuForTeacherResp);
        if (1 == stuBaseEntity.getSex()) {
            getStuForTeacherResp.setSex("男");
        } else {
            getStuForTeacherResp.setSex("女");
        }
        if (!FormatUtil.isEmpty(counsellorsEntity)) {
            getStuForTeacherResp.setCounsellorName(counsellorsEntity.getName());
        }
        if (!FormatUtil.isEmpty(tutorsEntity)) {
            getStuForTeacherResp.setTuturName(tutorsEntity.getName());
        }
        if (!FormatUtil.isEmpty(scoreEntranceEntity)) {
            BeanUtils.copyProperties(scoreEntranceEntity, getStuForTeacherResp);
        }
        if (!FormatUtil.isEmpty(scoreAverageEntity)) {
            BeanUtils.copyProperties(scoreAverageEntity, getStuForTeacherResp);
        }
        return getStuForTeacherResp;
    }

    @Override
    public GetPrizeForTeacherResp createGetPrizeForTeacherResp(AllPrizeEntity allPrizeEntity, StuBaseEntity stuBaseEntity, int allStuNum) {
        GetPrizeForTeacherResp getPrizeForTeacherResp = new GetPrizeForTeacherResp();
        BeanUtils.copyProperties(allPrizeEntity, getPrizeForTeacherResp);
        getPrizeForTeacherResp.setCompetitionNum(String.valueOf(allPrizeEntity.getCompetitionNum())+"/"+String.valueOf(allStuNum));
        getPrizeForTeacherResp.setEngiNum(String.valueOf(allPrizeEntity.getEngiNum())+"/"+String.valueOf(allStuNum));
        getPrizeForTeacherResp.setEntrNum(String.valueOf(allPrizeEntity.getEntrNum())+"/"+String.valueOf(allStuNum));
        getPrizeForTeacherResp.setExchNum(String.valueOf(allPrizeEntity.getExchNum())+"/"+String.valueOf(allStuNum));
        getPrizeForTeacherResp.setHonorNum(String.valueOf(allPrizeEntity.getHonorNum())+"/"+String.valueOf(allStuNum));
        getPrizeForTeacherResp.setInnoNum(String.valueOf(allPrizeEntity.getInnoNum())+"/"+String.valueOf(allStuNum));
        getPrizeForTeacherResp.setMasterNum(String.valueOf(allPrizeEntity.getMasterNum())+"/"+String.valueOf(allStuNum));
        getPrizeForTeacherResp.setMasterNum(String.valueOf(allPrizeEntity.getMasterNum())+"/"+String.valueOf(allStuNum));
        getPrizeForTeacherResp.setPaperNum(String.valueOf(allPrizeEntity.getPaperNum())+"/"+String.valueOf(allStuNum));
        getPrizeForTeacherResp.setPatentNum(String.valueOf(allPrizeEntity.getPatentNum())+"/"+String.valueOf(allStuNum));
        getPrizeForTeacherResp.setWorkNum(String.valueOf(allPrizeEntity.getWorkNum())+"/"+String.valueOf(allStuNum));
        getPrizeForTeacherResp.setName(stuBaseEntity.getName());

        return getPrizeForTeacherResp;
    }

    @Override
    public GetAllScoreResp createGetAllScoreResp(ScoreAllEntity scoreAllEntity) {
        GetAllScoreResp getAllScoreResp = new GetAllScoreResp();

//        if (scoreAllEntity.getJixiejiagong() != -1) {
//            getAllScoreResp.setJixiejiagong(scoreAllEntity.getJixiejiagong());
//        }
//        if (scoreAllEntity.getJixiejiaozuo() != -1) {
//            getAllScoreResp.setJixiejiaozuo(scoreAllEntity.getJixiejiaozuo());
//        }
//        if (scoreAllEntity.getJixiezhizao() != -1) {
//            getAllScoreResp.setJixiezhizao(scoreAllEntity.getJixiezhizao());
//        }
//        if (scoreAllEntity.getXiandaililun() != -1) {
//            getAllScoreResp.setXiandaililun(scoreAllEntity.getXiandaililun());
//        }
//        if (scoreAllEntity.getNami() != -1) {
//            getAllScoreResp.setNami(scoreAllEntity.getNami());
//        }
//        if (scoreAllEntity.getJisuanyingyong() != -1) {
//            getAllScoreResp.setJisuanyingyong(scoreAllEntity.getJisuanyingyong());
//        }
//        if (scoreAllEntity.getJisuanjichu() != -1) {
//            getAllScoreResp.setJisuanjichu(scoreAllEntity.getJisuanjichu());
//        }
//
//        if (scoreAllEntity.getJidianxue() != -1) {
//            getAllScoreResp.setJidianxue(scoreAllEntity.getJidianxue());
//        }
//        if (scoreAllEntity.getDianyingyantao() != -1) {
//            getAllScoreResp.setDianyingyantao(scoreAllEntity.getDianyingyantao());
//        }
//        if (scoreAllEntity.getNumericalAnalysis() != -1) {
//            getAllScoreResp.setNumericalAnalysis(scoreAllEntity.getNumericalAnalysis());
//        }
//        if (scoreAllEntity.getFirstForeignLanguage() != -1) {
//            getAllScoreResp.setFirstForeignLanguage(scoreAllEntity.getFirstForeignLanguage());
//        }
//        if (scoreAllEntity.getCharacteristicSocialism() != -1) {
//            getAllScoreResp.setCharacteristicSocialism(scoreAllEntity.getCharacteristicSocialism());
//        }
//        if (scoreAllEntity.getEngineeringMathematics() != -1) {
//            getAllScoreResp.setEngineeringMathematics(scoreAllEntity.getEngineeringMathematics());
//        }

        BeanUtils.copyProperties(scoreAllEntity, getAllScoreResp);
        return getAllScoreResp;
    }
}
