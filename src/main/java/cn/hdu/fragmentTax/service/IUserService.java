package cn.hdu.fragmentTax.service;

import cn.hdu.fragmentTax.model.request.EditBaseInfoRequ;
import cn.hdu.fragmentTax.model.request.ForgetPassRequ;
import cn.hdu.fragmentTax.model.request.RegisterRequ;
import cn.hdu.fragmentTax.model.request.StuLoginRequ;

import java.util.Map;

public interface IUserService {
    Map<String, Object> addUser(RegisterRequ registerRequ);

    Map<String,Object> stuLogin(StuLoginRequ stuLoginRequ);

    Map<String,Object> editBaseInfo(EditBaseInfoRequ editBaseInfoRequ);

    Map<String,Object> forgetPass(ForgetPassRequ forgetPassRequ);
}
