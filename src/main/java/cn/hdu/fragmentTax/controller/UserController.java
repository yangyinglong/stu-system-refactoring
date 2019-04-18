package cn.hdu.fragmentTax.controller;

import cn.hdu.fragmentTax.dao.entity.StuBaseEntity;
import cn.hdu.fragmentTax.dao.mapper.IStuBaseMapper;
import cn.hdu.fragmentTax.model.request.EditBaseInfoRequ;
import cn.hdu.fragmentTax.model.request.ForgetPassRequ;
import cn.hdu.fragmentTax.model.request.RegisterRequ;
import cn.hdu.fragmentTax.model.request.StuLoginRequ;
import cn.hdu.fragmentTax.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.CrossOrigin;

import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.Map;

@Component
@Path("/user")
@CrossOrigin
public class UserController {

    @Autowired
    private IUserService userService;

    /**
     * 学生注册
     * @param registerRequ
     * @return
     */
    @Path("/register")
    @POST
    @Produces(MediaType.APPLICATION_JSON)
    public Map<String, Object> register(RegisterRequ registerRequ){
        Map<String, Object> resp = userService.addUser(registerRequ);
        return resp;
    }

    /**
     * 学生登录
     */
    @Path("/login")
    @POST
    @Produces(MediaType.APPLICATION_JSON)
    public Map<String, Object> login(StuLoginRequ stuLoginRequ){
        Map<String, Object> resp = userService.stuLogin(stuLoginRequ);
        return resp;
    }

    /**
     * 修改个人基本信息
     * @param editBaseInfoRequ
     * @return
     */
    @Path("/editBaseInfo")
    @POST
    @Produces(MediaType.APPLICATION_JSON)
    public Map<String, Object> editBaseInfo(EditBaseInfoRequ editBaseInfoRequ){
        Map<String, Object> resp = userService.editBaseInfo(editBaseInfoRequ);
        return resp;
    }

    @Path("/forgetPass")
    @POST
    @Produces(MediaType.APPLICATION_JSON)
    public Map<String, Object> forgetPass(ForgetPassRequ forgetPassRequ){
        Map<String, Object> resp = userService.forgetPass(forgetPassRequ);
        return resp;
    }

    /**
     * 导师或者辅导员注册
     * @param registerRequ
     * @return
     */
    @Path("/registerTeacher")
    @POST
    @Produces(MediaType.APPLICATION_JSON)
    public Map<String, Object> registerTeacher(RegisterRequ registerRequ){
        Map<String, Object> resp = userService.registerTeacher(registerRequ);
        return resp;
    }

    @Path("/loginTeacher")
    @POST
    @Produces(MediaType.APPLICATION_JSON)
    public Map<String, Object> loginTeacher(StuLoginRequ loginRequ){
        Map<String, Object> resp = userService.loginTeacher(loginRequ);
        return resp;
    }

}
