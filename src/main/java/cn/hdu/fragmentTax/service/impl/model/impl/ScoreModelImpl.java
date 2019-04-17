package cn.hdu.fragmentTax.service.impl.model.impl;

import cn.hdu.fragmentTax.dao.entity.ScoreAllEntity;
import cn.hdu.fragmentTax.dao.entity.ScoreEntranceEntity;
import cn.hdu.fragmentTax.model.request.EditAllScoreRequ;
import cn.hdu.fragmentTax.model.request.EditEntranceInfoRequ;
import cn.hdu.fragmentTax.model.response.GetAllScoreResp;
import cn.hdu.fragmentTax.service.impl.model.IScoreModel;
import cn.hdu.fragmentTax.utils.DateUtil;
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
        getAllScoreResp.setCharacteristicSocialism(scoreAllEntity.getCharacteristicSocialism());
        getAllScoreResp.setEngineeringMathematics(scoreAllEntity.getEngineeringMathematics());
        getAllScoreResp.setFirstForeignLanguage(scoreAllEntity.getFirstForeignLanguage());
        getAllScoreResp.setNumericalAnalysis(scoreAllEntity.getNumericalAnalysis());
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
        if (scoreAllEntity.getFirstForeignLanguage() >= 0) {
            scoreAllEntity.setFirstForeignLanguage(editAllScoreResp.getFirstForeignLanguage());
        } else {
            scoreAllEntity.setFirstForeignLanguage(-1);
        }
        if (scoreAllEntity.getNumericalAnalysis() >= 0) {
            scoreAllEntity.setNumericalAnalysis(editAllScoreResp.getNumericalAnalysis());
        } else {
            scoreAllEntity.setNumericalAnalysis(-1);
        }
        return scoreAllEntity;
    }
}
