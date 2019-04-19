package cn.hdu.fragmentTax.controller;


import cn.hdu.fragmentTax.model.request.AdminExamRequ;
import cn.hdu.fragmentTax.model.request.AdminQueryRequ;
import cn.hdu.fragmentTax.service.IAdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.CrossOrigin;

import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.Map;

@Component
@Path("/admin")
@CrossOrigin
public class AdminController {

    @Autowired
    private IAdminService adminService;

    /**
     * 查看所有预约单
     * @param adminQueryRequ
     * @return
     */
    @Path("/showHonorsForTeacher")
    @POST
    @Produces(MediaType.APPLICATION_JSON)
    public Map<String, Object> showHonorsForTeacher(AdminQueryRequ adminQueryRequ){
        Map<String, Object> resp = adminService.showHonorsForTeacher(adminQueryRequ);
        return resp;
    }

    /**
     * 管理员审核预约单
     * @param adminExamRequ
     * @return
     */
    @Path("/examHonor")
    @POST
    @Produces(MediaType.APPLICATION_JSON)
    public Map<String, Object> examHonor(AdminExamRequ adminExamRequ){
        Map<String, Object> resp = adminService.examHonor(adminExamRequ);
        return resp;
    }

}
