package cn.hdu.fragmentTax.service.impl.model.impl;

import cn.hdu.fragmentTax.dao.entity.ScoreAllEntity;
import cn.hdu.fragmentTax.dao.entity.ScoreEntranceEntity;
import cn.hdu.fragmentTax.view.request.EditAllScoreRequ;
import cn.hdu.fragmentTax.view.request.EditEntranceInfoRequ;
import cn.hdu.fragmentTax.view.response.GetAllScoreResp;
import cn.hdu.fragmentTax.service.impl.model.IScoreModel;
import cn.hdu.fragmentTax.utils.DateUtil;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;


@Service
public class ScoreModelImpl implements IScoreModel {
    @Override
    public ScoreEntranceEntity crateScoreEntranceEntity(EditEntranceInfoRequ editEntranceInfoRequ) {
        ScoreEntranceEntity scoreEntranceEntity = new ScoreEntranceEntity();
        scoreEntranceEntity.setStuId(editEntranceInfoRequ.getStuId());
        scoreEntranceEntity.setEnglish(editEntranceInfoRequ.getEnglish());
        scoreEntranceEntity.setMath(editEntranceInfoRequ.getMath());
        scoreEntranceEntity.setPolitical(editEntranceInfoRequ.getPolitical());
        scoreEntranceEntity.setSpecialized(editEntranceInfoRequ.getSpecialized());
        scoreEntranceEntity.setCreatedTime(DateUtil.getCurrentDatetime());
        return scoreEntranceEntity;
    }

    @Override
    public GetAllScoreResp createAllScoreResp(ScoreAllEntity scoreAllEntity) {
        GetAllScoreResp getAllScoreResp = new GetAllScoreResp();
//        getAllScoreResp.setCharacteristicSocialism(scoreAllEntity.getCharacteristicSocialism());
//        getAllScoreResp.setEngineeringMathematics(scoreAllEntity.getEngineeringMathematics());
//        getAllScoreResp.setFirstForeignLanguage(scoreAllEntity.getFirstForeignLanguage());
//        getAllScoreResp.setNumericalAnalysis(scoreAllEntity.getNumericalAnalysis());
        BeanUtils.copyProperties(scoreAllEntity, getAllScoreResp);
        return getAllScoreResp;
    }

    @Override
    public ScoreAllEntity createScoreAllEntity(EditAllScoreRequ editAllScoreResp) {
        ScoreAllEntity scoreAllEntity = new ScoreAllEntity();
        scoreAllEntity.setStuId(editAllScoreResp.getStuId());
        if (editAllScoreResp.getCharacteristicSocialism() >= 0) {
            scoreAllEntity.setCharacteristicSocialism(editAllScoreResp.getCharacteristicSocialism());
        } else {
            scoreAllEntity.setCharacteristicSocialism(-1);
        }
        if (editAllScoreResp.getEngineeringMathematics() >= 0) {
            scoreAllEntity.setEngineeringMathematics(editAllScoreResp.getEngineeringMathematics());
        } else {
            scoreAllEntity.setEngineeringMathematics(-1);
        }
        if (editAllScoreResp.getFirstForeignLanguage() >= 0) {
            scoreAllEntity.setFirstForeignLanguage(editAllScoreResp.getFirstForeignLanguage());
        } else {
            scoreAllEntity.setFirstForeignLanguage(-1);
        }
        if (editAllScoreResp.getNumericalAnalysis() >= 0) {
            scoreAllEntity.setNumericalAnalysis(editAllScoreResp.getNumericalAnalysis());
        } else {
            scoreAllEntity.setNumericalAnalysis(-1);
        }


        if (editAllScoreResp.getNami() >= 0) {
            scoreAllEntity.setNami(editAllScoreResp.getNami());
        } else {
            scoreAllEntity.setNami(-1);
        }
        if (editAllScoreResp.getXiandaililun() >= 0) {
            scoreAllEntity.setXiandaililun(editAllScoreResp.getXiandaililun());
        } else {
            scoreAllEntity.setXiandaililun(-1);
        }
        if (editAllScoreResp.getJixiezhizao() >= 0) {
            scoreAllEntity.setJixiezhizao(editAllScoreResp.getJixiezhizao());
        } else {
            scoreAllEntity.setJixiezhizao(-1);
        }
        if (editAllScoreResp.getJixiejiaozuo() >= 0) {
            scoreAllEntity.setJixiejiaozuo(editAllScoreResp.getJixiejiaozuo());
        } else {
            scoreAllEntity.setJixiejiaozuo(-1);
        }

        if (editAllScoreResp.getDianyingyantao() >= 0) {
            scoreAllEntity.setDianyingyantao(editAllScoreResp.getDianyingyantao());
        } else {
            scoreAllEntity.setDianyingyantao(-1);
        }
        if (editAllScoreResp.getJidianxue() >= 0) {
            scoreAllEntity.setJidianxue(editAllScoreResp.getJidianxue());
        } else {
            scoreAllEntity.setJidianxue(-1);
        }
        if (editAllScoreResp.getJisuanjichu() >= 0) {
            scoreAllEntity.setJisuanjichu(editAllScoreResp.getJisuanjichu());
        } else {
            scoreAllEntity.setJisuanjichu(-1);
        }

        if (editAllScoreResp.getJixiejiagong() >= 0) {
            scoreAllEntity.setJixiejiagong(editAllScoreResp.getJixiejiagong());
        }else {
            scoreAllEntity.setJixiejiagong(-1);
        }
        if (editAllScoreResp.getJisuanyingyong() >= 0) {
            scoreAllEntity.setJisuanyingyong(editAllScoreResp.getJisuanyingyong());
        } else {
            scoreAllEntity.setJisuanyingyong(-1);
        }
        return scoreAllEntity;
    }
}
