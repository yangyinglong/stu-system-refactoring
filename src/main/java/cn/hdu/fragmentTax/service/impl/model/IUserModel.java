package cn.hdu.fragmentTax.service.impl.model;

import cn.hdu.fragmentTax.dao.entity.PasswordEntity;
import cn.hdu.fragmentTax.dao.entity.StuBaseEntity;
import cn.hdu.fragmentTax.model.request.RegisterRequ;
import cn.hdu.fragmentTax.model.response.LoginResp;

public interface IUserModel {

    StuBaseEntity createStuBaseEntity(RegisterRequ registerRequ);

    PasswordEntity createPasswordEntity(RegisterRequ registerRequ);

    LoginResp createLoginResp(StuBaseEntity stuBaseEntity);
}
