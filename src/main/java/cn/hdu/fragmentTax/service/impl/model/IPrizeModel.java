package cn.hdu.fragmentTax.service.impl.model;

import cn.hdu.fragmentTax.dao.entity.AllPrizeEntity;
import cn.hdu.fragmentTax.dao.entity.HonorEntity;
import cn.hdu.fragmentTax.dao.entity.PaperEntity;
import cn.hdu.fragmentTax.dao.entity.PatentEntity;
import cn.hdu.fragmentTax.model.request.EditHonorResp;
import cn.hdu.fragmentTax.model.request.EditPaperRequ;
import cn.hdu.fragmentTax.model.request.EditPatentRequ;
import cn.hdu.fragmentTax.model.response.GetHonorResp;
import cn.hdu.fragmentTax.model.response.GetPaperResp;
import cn.hdu.fragmentTax.model.response.GetPatentResp;
import cn.hdu.fragmentTax.model.response.GetPrizesResp;

import java.text.ParseException;

public interface IPrizeModel {
    HonorEntity createHonorEntity(EditHonorResp editHonorResp);

    GetHonorResp createGetHonorResp(HonorEntity honorEntity);

    GetPrizesResp createGetPrizesResp(AllPrizeEntity allPrizeEntity);

    PaperEntity createPaperEntity(EditPaperRequ editPaperRequ) throws ParseException;

    GetPaperResp createGetPaperResp(PaperEntity paperEntity);

    PatentEntity createPatentEntity(EditPatentRequ editPatentRequ) throws ParseException;

    GetPatentResp createGetPatentResp(PatentEntity patentResp);
}
