package cn.hdu.fragmentTax.service;

import cn.hdu.fragmentTax.view.request.EditBaseInfoRequ;
import cn.hdu.fragmentTax.view.request.ForgetPassRequ;
import cn.hdu.fragmentTax.view.request.RegisterRequ;
import cn.hdu.fragmentTax.view.request.StuLoginRequ;

import java.util.Map;

public interface IUserService {
    Map<String, Object> addUser(RegisterRequ registerRequ);

    Map<String,Object> stuLogin(StuLoginRequ stuLoginRequ);

    Map<String,Object> editBaseInfo(EditBaseInfoRequ editBaseInfoRequ);

    Map<String,Object> forgetPass(ForgetPassRequ forgetPassRequ);

    Map<String,Object> registerTeacher(RegisterRequ registerRequ);

    Map<String,Object> loginTeacher(StuLoginRequ loginRequ);
}
