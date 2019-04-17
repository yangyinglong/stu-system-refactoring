package cn.hdu.fragmentTax.service.impl;

import cn.hdu.fragmentTax.dao.entity.PasswordEntity;
import cn.hdu.fragmentTax.dao.entity.StuBaseEntity;
import cn.hdu.fragmentTax.dao.mapper.IPasswordMapper;
import cn.hdu.fragmentTax.dao.mapper.IStuBaseMapper;
import cn.hdu.fragmentTax.model.request.EditBaseInfoRequ;
import cn.hdu.fragmentTax.model.request.ForgetPassRequ;
import cn.hdu.fragmentTax.model.request.RegisterRequ;
import cn.hdu.fragmentTax.model.request.StuLoginRequ;
import cn.hdu.fragmentTax.model.response.LoginResp;
import cn.hdu.fragmentTax.service.IUserService;
import cn.hdu.fragmentTax.service.impl.model.IUserModel;
import cn.hdu.fragmentTax.utils.FormatUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.text.Format;
import java.util.HashMap;
import java.util.Map;

@Service
public class UserServiceImpl implements IUserService {

    @Autowired
    private IStuBaseMapper stuBaseMapper;
    @Autowired
    private IPasswordMapper passwordMapper;

    @Autowired
    private IUserModel userModel;

    @Override
    public Map<String, Object> addUser(RegisterRequ registerRequ) {
        Map<String, Object> resp = new HashMap<>();
        //1. 查找学号是否已经存在
        StuBaseEntity stuBaseEntity = stuBaseMapper.queryByStuId(registerRequ.getStuId());
        if (!FormatUtil.isEmpty(stuBaseEntity)) {
            resp.put("c", 301);
            resp.put("r", "账号已经存在");
            return resp;
        }
        //2. 注册
        StuBaseEntity baseEntity = userModel.createStuBaseEntity(registerRequ);
        PasswordEntity passwordEntity = userModel.createPasswordEntity(registerRequ);
        try {
            stuBaseMapper.insertBaseInfo(baseEntity);
            passwordMapper.insertAccPass(passwordEntity);
            resp.put("c", 200);
            resp.put("r", "注册成功");
        } catch (Exception e) {
            resp.put("c", 401);
            resp.put("r", "数据库错误");
            return resp;
        }
        return resp;
    }

    @Override
    public Map<String, Object> stuLogin(StuLoginRequ stuLoginRequ) {
        Map<String, Object> resp = new HashMap<>();
        StuBaseEntity stuBaseEntity = stuBaseMapper.queryByStuId(stuLoginRequ.getStuId());
        if (FormatUtil.isEmpty(stuBaseEntity)) {
            resp.put("c", 302);
            resp.put("r", "账号不存在");
            return resp;
        }
        PasswordEntity passwordEntity = passwordMapper.queryByAccount(stuLoginRequ.getStuId());
        if (!stuLoginRequ.getPassword().equals(passwordEntity.getPassword())) {
            resp.put("c", 303);
            resp.put("r", "密码错误");
            return resp;
        }
        LoginResp loginResp = userModel.createLoginResp(stuBaseEntity);
        resp.put("c", 200);
        resp.put("r", loginResp);
        return resp;
    }

    @Override
    public Map<String, Object> editBaseInfo(EditBaseInfoRequ editBaseInfoRequ) {
        Map<String, Object> resp = new HashMap<>();
        try {
            stuBaseMapper.editBaseInfo(editBaseInfoRequ.getId(), editBaseInfoRequ.getName(), editBaseInfoRequ.getPhone(), editBaseInfoRequ.getSex());
            if (!FormatUtil.isEmpty(editBaseInfoRequ.getPassword())) {
                passwordMapper.updatePassword(editBaseInfoRequ.getId(), editBaseInfoRequ.getPassword());
            }
            resp.put("c", 200);
            resp.put("r", "修改成功");
        } catch (Exception e) {
            resp.put("c", 401);
            resp.put("r", "数据库错误");
        }
        return resp;
    }

    @Override
    public Map<String, Object> forgetPass(ForgetPassRequ forgetPassRequ) {
        Map<String, Object> resp = new HashMap<>();
        StuBaseEntity stuBaseEntity = stuBaseMapper.queryByStuId(forgetPassRequ.getStuId());
        if (FormatUtil.isEmpty(stuBaseEntity)) {
            resp.put("c", 302);
            resp.put("r", "账号不存在");
            return resp;
        }
        if (forgetPassRequ.getName().equals(stuBaseEntity.getName())
                && forgetPassRequ.getPhone().equals(stuBaseEntity.getPhone())) {
            try {
                passwordMapper.updatePassword(forgetPassRequ.getStuId(), forgetPassRequ.getPassword());
                resp.put("c", 200);
                resp.put("r", userModel.createLoginResp(stuBaseEntity));
            } catch (Exception e) {
                resp.put("c", 401);
                resp.put("r", "数据库错误");
            }
        }else {
            resp.put("c", 301);
            resp.put("r", "信息与账号不符合，修改失败");
        }
        return resp;
    }
}
