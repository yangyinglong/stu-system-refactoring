package cn.hdu.fragmentTax.service;

import cn.hdu.fragmentTax.model.request.AdminExamRequ;
import cn.hdu.fragmentTax.model.request.AdminQueryRequ;

import java.util.Map;

public interface IAdminService {
    Map<String,Object> showHonorsForTeacher(AdminQueryRequ adminQueryRequ);

    Map<String,Object> examHonor(AdminExamRequ adminExamRequ);

    Map<String,Object> showPapersForTeacher(AdminQueryRequ adminQueryRequ);

    Map<String,Object> examPaper(AdminExamRequ adminExamRequ);
}
