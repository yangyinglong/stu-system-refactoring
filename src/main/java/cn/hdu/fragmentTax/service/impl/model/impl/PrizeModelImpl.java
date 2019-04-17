package cn.hdu.fragmentTax.service.impl.model.impl;

import cn.hdu.fragmentTax.dao.entity.AllPrizeEntity;
import cn.hdu.fragmentTax.dao.entity.HonorEntity;
import cn.hdu.fragmentTax.dao.entity.PaperEntity;
import cn.hdu.fragmentTax.model.request.EditHonorResp;
import cn.hdu.fragmentTax.model.request.EditPaperRequ;
import cn.hdu.fragmentTax.model.response.GetHonorResp;
import cn.hdu.fragmentTax.model.response.GetPaperResp;
import cn.hdu.fragmentTax.model.response.GetPrizesResp;
import cn.hdu.fragmentTax.service.impl.model.IPrizeModel;
import cn.hdu.fragmentTax.utils.DateUtil;
import org.springframework.stereotype.Service;
import sun.security.krb5.internal.PAData;

@Service
public class PrizeModelImpl implements IPrizeModel {
    @Override
    public HonorEntity createHonorEntity(EditHonorResp editHonorResp) {
        HonorEntity honorEntity = new HonorEntity();
        honorEntity.setStuId(editHonorResp.getStuId());
        honorEntity.setHonorGrade(editHonorResp.getHonorGrade());
        honorEntity.setHonorLevel(editHonorResp.getHonorLevel());
        honorEntity.setHonorType(editHonorResp.getHonorType());
        honorEntity.setCreatedTime(DateUtil.getCurrentDatetime());
        honorEntity.setScore(10);
        honorEntity.setState(1);
        return honorEntity;
    }

    @Override
    public GetHonorResp createGetHonorResp(HonorEntity honorEntity) {
        GetHonorResp getHonorResp = new GetHonorResp();
        getHonorResp.setId(honorEntity.getId());
        getHonorResp.setStuId(honorEntity.getStuId());
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
    public GetPrizesResp createGetPrizesResp(AllPrizeEntity allPrizeEntity) {
        GetPrizesResp getPrizesResp = new GetPrizesResp();
        getPrizesResp.setHonorNum(allPrizeEntity.getHonorNum());
        getPrizesResp.setHonorScore(allPrizeEntity.getHonorScore());
        getPrizesResp.setPaperNum(allPrizeEntity.getPaperNum());
        getPrizesResp.setPaperScore(allPrizeEntity.getPaperSocre());
        getPrizesResp.setPatentNum(allPrizeEntity.getPatentNum());
        getPrizesResp.setPatentScore(allPrizeEntity.getPatentScore());
        return getPrizesResp;
    }

    @Override
    public PaperEntity createPaperEntity(EditPaperRequ editPaperRequ) {
        PaperEntity paperEntity = new PaperEntity();
        paperEntity.setStuId(editPaperRequ.getStuId());
        paperEntity.setJournalTitle(editPaperRequ.getJournalTitle());
        paperEntity.setPaperTitle(editPaperRequ.getPaperTitle());
        paperEntity.setPaperGrade(editPaperRequ.getPaperGrade());
        paperEntity.setPaperState(editPaperRequ.getPaperState());
        paperEntity.setRanking(editPaperRequ.getRanking());
        paperEntity.setTotalNumber(editPaperRequ.getTotalNumber());
        paperEntity.setCreatedTime(DateUtil.getCurrentDatetime());
        paperEntity.setScore(10);
        paperEntity.setState(1);
        return paperEntity;
    }

    @Override
    public GetPaperResp createGetPaperResp(PaperEntity paperEntity) {
        GetPaperResp getPaperResp = new GetPaperResp();
        getPaperResp.setId(paperEntity.getId());
        getPaperResp.setStuId(paperEntity.getStuId());
        getPaperResp.setPaperTitle(paperEntity.getPaperTitle());
        getPaperResp.setJournalTitle(paperEntity.getJournalTitle());
        getPaperResp.setRanking(paperEntity.getRanking());
        getPaperResp.setTotalNumber(paperEntity.getTotalNumber());
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
}
