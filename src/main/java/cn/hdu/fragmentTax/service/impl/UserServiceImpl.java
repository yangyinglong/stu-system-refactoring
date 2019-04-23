package cn.hdu.fragmentTax.service.impl;

import cn.hdu.fragmentTax.dao.entity.CounsellorsEntity;
import cn.hdu.fragmentTax.dao.entity.PasswordEntity;
import cn.hdu.fragmentTax.dao.entity.StuBaseEntity;
import cn.hdu.fragmentTax.dao.entity.TutorsEntity;
import cn.hdu.fragmentTax.dao.mapper.*;
import cn.hdu.fragmentTax.model.request.EditBaseInfoRequ;
import cn.hdu.fragmentTax.model.request.ForgetPassRequ;
import cn.hdu.fragmentTax.model.request.RegisterRequ;
import cn.hdu.fragmentTax.model.request.StuLoginRequ;
import cn.hdu.fragmentTax.model.response.LoginResp;
import cn.hdu.fragmentTax.service.IUserService;
import cn.hdu.fragmentTax.service.impl.model.IUserModel;
import cn.hdu.fragmentTax.utils.DateUtil;
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
    private ITutorsMapper tutorsMapper;
    @Autowired
    private ICounsellorsMapper counsellorsMapper;
    @Autowired
    private IAllPrizeMapper allPrizeMapper;

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
//            在综合素质里面插入一条数据
            allPrizeMapper.insertFirst(registerRequ.getStuId(), DateUtil.getCurrentDatetime());
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

    @Override
    public Map<String, Object> registerTeacher(RegisterRequ registerRequ) {
        Map<String, Object> resp = new HashMap<>();
        try {
            if (1 == registerRequ.getSex()) {
                CounsellorsEntity counsellorsEntity1 = counsellorsMapper.queryByCoId(registerRequ.getStuId());
                if (!FormatUtil.isEmpty(counsellorsEntity1)) {
                    resp.put("c", 301);
                    resp.put("r", "账号已经存在");
                    return resp;
                }
                CounsellorsEntity counsellorsEntity = userModel.createCounsellor(registerRequ);
                PasswordEntity passwordEntity = userModel.createPasswordEntity(registerRequ);
                counsellorsMapper.insert(counsellorsEntity);
                passwordMapper.insertAccPass(passwordEntity);
            } else if (2 == registerRequ.getSex()) {
                TutorsEntity tutorsEntity1 = tutorsMapper.queryByTuId(registerRequ.getStuId());
                if (!FormatUtil.isEmpty(tutorsEntity1)) {
                    resp.put("c", 301);
                    resp.put("r", "账号已经存在");
                    return resp;
                }
                TutorsEntity tutorsEntity = userModel.createTutor(registerRequ);
                PasswordEntity passwordEntity = userModel.createPasswordEntity(registerRequ);
                tutorsMapper.insert(tutorsEntity);
                passwordMapper.insertAccPass(passwordEntity);
            } else {
                resp.put("c", 308);
                resp.put("r", "身份信息错误");
            }
            resp.put("c", 200);
            resp.put("r", "注册成功");
        } catch (Exception e) {
            resp.put("c", 401);
            resp.put("r", "数据库错误");
        }
        return resp;
    }

    @Override
    public Map<String, Object> loginTeacher(StuLoginRequ loginRequ) {
        Map<String, Object> resp = new HashMap<>();
        PasswordEntity passwordEntity = passwordMapper.queryByAccount(loginRequ.getStuId());
        if (FormatUtil.isEmpty(passwordEntity)) {
            resp.put("c", 302);
            resp.put("r", "账号不存在");
            return resp;
        } else if (!passwordEntity.getPassword().equals(loginRequ.getPassword())) {
            resp.put("c", 303);
            resp.put("r", "密码错误");
            return resp;
        }

        LoginResp loginResp = new LoginResp();
        if (1 == loginRequ.getState()) {
//            辅导员登录
            CounsellorsEntity counsellorsEntity = counsellorsMapper.queryByCoId(loginRequ.getStuId());
            if (FormatUtil.isEmpty(counsellorsEntity)) {
                resp.put("c", 302);
                resp.put("r", "账号不存在");
                return resp;
            }
            loginResp.setState(1);
            loginResp.setStuId(counsellorsEntity.getCounsellorId());
            loginResp.setName(counsellorsEntity.getName());
            loginResp.setStatus(1);
            loginResp.setPhone(counsellorsEntity.getPhone());
            resp.put("c", 200);
            resp.put("r", loginResp);
        } else if (2 == loginRequ.getState()) {
            // 导师登录
            TutorsEntity tutorsEntity = tutorsMapper.queryByTuId(loginRequ.getStuId());
            if (FormatUtil.isEmpty(tutorsEntity)) {
                resp.put("c", 302);
                resp.put("r", "账号不存在");
                return resp;
            }
            loginResp.setPhone(tutorsEntity.getPhone());
            loginResp.setStatus(1);
            loginResp.setName(tutorsEntity.getName());
            loginResp.setStuId(tutorsEntity.getTutorId());
            loginResp.setState(2);
            resp.put("c", 200);
            resp.put("r", loginResp);
        } else {
            resp.put("c", 309);
            resp.put("r", "登录失败");
        }
        return resp;
    }
}
