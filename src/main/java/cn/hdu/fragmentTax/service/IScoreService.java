package cn.hdu.fragmentTax.service;

import cn.hdu.fragmentTax.view.request.EditAllScoreRequ;
import cn.hdu.fragmentTax.view.request.EditEntranceInfoRequ;
import cn.hdu.fragmentTax.view.request.EditTutorCoerRequ;

import java.util.Map;

public interface IScoreService {
    Map<String,Object> editEntrScore(EditEntranceInfoRequ editEntranceInfoRequ);

    Map<String,Object> getEntrScore(String stuId);

    Map<String,Object> editTuCoer(EditTutorCoerRequ editTutorCoerRequ);

    Map<String,Object> getTuCoer(String stuId);

    Map<String,Object> getAllScore(String stuId);

    Map<String,Object> editAllScore(EditAllScoreRequ editAllScoreResp);
}
