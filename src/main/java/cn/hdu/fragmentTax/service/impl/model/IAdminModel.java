package cn.hdu.fragmentTax.service.impl.model;

import cn.hdu.fragmentTax.dao.entity.HonorEntity;
import cn.hdu.fragmentTax.dao.entity.StuBaseEntity;
import cn.hdu.fragmentTax.model.response.GetHonorResp;

public interface IAdminModel {
    GetHonorResp createGetHonorResp(HonorEntity honorEntity, StuBaseEntity stuBaseEntity);
}
