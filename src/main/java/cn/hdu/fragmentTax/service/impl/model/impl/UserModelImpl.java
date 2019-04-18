package cn.hdu.fragmentTax.service.impl.model.impl;

import cn.hdu.fragmentTax.dao.entity.CounsellorsEntity;
import cn.hdu.fragmentTax.dao.entity.PasswordEntity;
import cn.hdu.fragmentTax.dao.entity.StuBaseEntity;
import cn.hdu.fragmentTax.dao.entity.TutorsEntity;
import cn.hdu.fragmentTax.model.request.RegisterRequ;
import cn.hdu.fragmentTax.model.response.LoginResp;
import cn.hdu.fragmentTax.service.impl.model.IUserModel;
import cn.hdu.fragmentTax.utils.DateUtil;
import org.springframework.stereotype.Service;

@Service
public class UserModelImpl implements IUserModel {
    @Override
    public StuBaseEntity createStuBaseEntity(RegisterRequ registerRequ) {
        StuBaseEntity stuBaseEntity = new StuBaseEntity();
        stuBaseEntity.setStuId(registerRequ.getStuId());
        stuBaseEntity.setName(registerRequ.getName());
        stuBaseEntity.setSex(registerRequ.getSex());
        stuBaseEntity.setPhone(registerRequ.getPhone());
        stuBaseEntity.setCreatedTime(DateUtil.getCurrentDatetime());
        return stuBaseEntity;
    }

    @Override
    public PasswordEntity createPasswordEntity(RegisterRequ registerRequ) {
        PasswordEntity passwordEntity = new PasswordEntity();
        passwordEntity.setAccount(registerRequ.getStuId());
        passwordEntity.setPassword(registerRequ.getPassword());
        return passwordEntity;
    }

    @Override
    public LoginResp createLoginResp(StuBaseEntity stuBaseEntity) {
        LoginResp loginResp = new LoginResp();
        loginResp.setStuId(stuBaseEntity.getStuId());
        loginResp.setName(stuBaseEntity.getName());
        loginResp.setPhone(stuBaseEntity.getPhone());
        loginResp.setSex(stuBaseEntity.getSex());
        loginResp.setStatus(stuBaseEntity.getState());
        return loginResp;
    }

    @Override
    public CounsellorsEntity createCounsellor(RegisterRequ registerRequ) {
        CounsellorsEntity counsellorsEntity = new CounsellorsEntity();
        counsellorsEntity.setCounsellorId(registerRequ.getStuId());
        counsellorsEntity.setName(registerRequ.getName());
        counsellorsEntity.setPhone(registerRequ.getPhone());
        counsellorsEntity.setState(1);
        return counsellorsEntity;
    }

    @Override
    public TutorsEntity createTutor(RegisterRequ registerRequ) {
        TutorsEntity tutorsEntity = new TutorsEntity();
        tutorsEntity.setTutorId(registerRequ.getStuId());
        tutorsEntity.setName(registerRequ.getName());
        tutorsEntity.setPhone(registerRequ.getPhone());
        tutorsEntity.setState(1);
        return tutorsEntity;
    }
}
