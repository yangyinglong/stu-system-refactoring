package cn.hdu.fragmentTax.service.impl.model;

import cn.hdu.fragmentTax.dao.entity.*;
import cn.hdu.fragmentTax.model.request.EditCompetitionRequ;
import cn.hdu.fragmentTax.model.request.EditHonorResp;
import cn.hdu.fragmentTax.model.request.EditPaperRequ;
import cn.hdu.fragmentTax.model.request.EditPatentRequ;
import cn.hdu.fragmentTax.model.response.*;

import java.text.ParseException;

public interface IPrizeModel {
    HonorEntity createHonorEntity(EditHonorResp editHonorResp);

    GetHonorResp createGetHonorResp(HonorEntity honorEntity);

    GetPrizesResp createGetPrizesResp(AllPrizeEntity allPrizeEntity);

    PaperEntity createPaperEntity(EditPaperRequ editPaperRequ) throws ParseException;

    GetPaperResp createGetPaperResp(PaperEntity paperEntity);

    PatentEntity createPatentEntity(EditPatentRequ editPatentRequ) throws ParseException;

    GetPatentResp createGetPatentResp(PatentEntity patentResp);

    CompetitionEntity createCompetitionEntity(EditCompetitionRequ editCompetitionRequ) throws ParseException;

    GetCompetitionResp createGetCompetitionResp(CompetitionEntity competitionEntity);
}
