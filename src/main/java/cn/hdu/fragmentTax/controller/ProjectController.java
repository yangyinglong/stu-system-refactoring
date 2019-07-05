package cn.hdu.fragmentTax.controller;


import cn.hdu.fragmentTax.controller.converter.ProjectConverter;
import cn.hdu.fragmentTax.dao.entity.InnovativeProEntity;
import cn.hdu.fragmentTax.error.BusinessException;
import cn.hdu.fragmentTax.error.EmBusinessError;
import cn.hdu.fragmentTax.service.IProjectService;
import cn.hdu.fragmentTax.validator.ValidationResult;
import cn.hdu.fragmentTax.validator.ValidatorImpl;
import cn.hdu.fragmentTax.view.request.EditInnoProRequ;
import cn.hdu.fragmentTax.view.request.StuLoginRequ;
import cn.hdu.fragmentTax.view.response.CommonReturnType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.text.ParseException;
import java.util.Map;


/**
 * 工程项目
 */
@Controller("project")
@RequestMapping("/project")
@CrossOrigin(allowCredentials="true",allowedHeaders="*")
public class ProjectController extends BaseController {



    @Autowired
    private ProjectConverter projectConverter;

    @Autowired
    private IProjectService projectService;

    /**
     * 插入或者修改创新项目
     * @param editInnoProRequ
     * @return
     * @throws BusinessException
     */
    @RequestMapping(value = "/editInnoPro", method = {RequestMethod.POST}, consumes = {CONTENT_TYPE_FORMED})
    @ResponseBody
    @Produces(MediaType.APPLICATION_JSON)
    public CommonReturnType editInnoPro(EditInnoProRequ editInnoProRequ) throws BusinessException, ParseException {
        // 1. viewToEntity
        InnovativeProEntity innovativeProEntity = projectConverter.innoRequToEntity(editInnoProRequ);
        // 2. 写入数据库
        return CommonReturnType.create(innovativeProEntity);
    }


    /**
     * 表单数据传输测试
     * @param stuLoginRequ
     * @return
     * @throws BusinessException
     */
    @RequestMapping(value = "/create", method = {RequestMethod.POST}, consumes = {CONTENT_TYPE_FORMED})
    @ResponseBody
    @Produces(MediaType.APPLICATION_JSON)
    public CommonReturnType createOrder(StuLoginRequ stuLoginRequ) throws BusinessException {
        if ("100001".equals(stuLoginRequ.getStuId())) {
            throw new BusinessException(EmBusinessError.UNKNOWN_ERROR, "error");
        }
        return CommonReturnType.create(stuLoginRequ);
    }

    @Path("/testget")
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public String test(){
        return "helloworld";
    }
}
