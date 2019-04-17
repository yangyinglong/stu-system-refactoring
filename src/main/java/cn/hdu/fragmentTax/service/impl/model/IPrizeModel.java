package cn.hdu.fragmentTax.service.impl.model;

import cn.hdu.fragmentTax.dao.entity.AllPrizeEntity;
import cn.hdu.fragmentTax.dao.entity.HonorEntity;
import cn.hdu.fragmentTax.dao.entity.PaperEntity;
import cn.hdu.fragmentTax.model.request.EditHonorResp;
import cn.hdu.fragmentTax.model.request.EditPaperRequ;
import cn.hdu.fragmentTax.model.response.GetHonorResp;
import cn.hdu.fragmentTax.model.response.GetPaperResp;
import cn.hdu.fragmentTax.model.response.GetPrizesResp;

public interface IPrizeModel {
    HonorEntity createHonorEntity(EditHonorResp editHonorResp);

    GetHonorResp createGetHonorResp(HonorEntity honorEntity);

    GetPrizesResp createGetPrizesResp(AllPrizeEntity allPrizeEntity);

    PaperEntity createPaperEntity(EditPaperRequ editPaperRequ);

    GetPaperResp createGetPaperResp(PaperEntity paperEntity);
}
