package cn.hdu.fragmentTax.controller.converter;

import cn.hdu.fragmentTax.dao.entity.InnovativeProEntity;
import cn.hdu.fragmentTax.error.BusinessException;
import cn.hdu.fragmentTax.error.EmBusinessError;
import cn.hdu.fragmentTax.utils.DateUtil;
import cn.hdu.fragmentTax.validator.ValidationResult;
import cn.hdu.fragmentTax.validator.ValidatorImpl;
import cn.hdu.fragmentTax.view.request.EditInnoProRequ;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.ParseException;

@Service
public class ProjectConverter {
    @Autowired
    private ValidatorImpl validator;


    public InnovativeProEntity innoRequToEntity(EditInnoProRequ editInnoProRequ) throws BusinessException, ParseException {
        if (editInnoProRequ == null) {
            return null;
        }
        // 第一步：数据校验
        ValidationResult result = validator.validate(editInnoProRequ);
        if (result.isHasErrors()) {
            throw new BusinessException(EmBusinessError.PARAMETER_VALIDATION_ERROR, result.getErrMsg());
        }
        InnovativeProEntity innovativeProEntity = new InnovativeProEntity();
        BeanUtils.copyProperties(editInnoProRequ, innovativeProEntity);
        innovativeProEntity.setCreatedTime(DateUtil.getChinaDateTime(editInnoProRequ.getGetDate()));
        innovativeProEntity.setScore(0);
        innovativeProEntity.setState(1);
        return innovativeProEntity;
    }
}
