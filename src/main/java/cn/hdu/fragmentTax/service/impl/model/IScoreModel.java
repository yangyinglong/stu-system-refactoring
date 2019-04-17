package cn.hdu.fragmentTax.service.impl.model;

import cn.hdu.fragmentTax.dao.entity.ScoreAllEntity;
import cn.hdu.fragmentTax.dao.entity.ScoreEntranceEntity;
import cn.hdu.fragmentTax.model.request.EditAllScoreRequ;
import cn.hdu.fragmentTax.model.request.EditEntranceInfoRequ;
import cn.hdu.fragmentTax.model.response.GetAllScoreResp;

public interface IScoreModel {
    ScoreEntranceEntity crateScoreEntranceEntity(EditEntranceInfoRequ editEntranceInfoRequ);

    GetAllScoreResp createAllScoreResp(ScoreAllEntity scoreAllEntity);

    ScoreAllEntity createScoreAllEntity(EditAllScoreRequ editAllScoreResp);
}
