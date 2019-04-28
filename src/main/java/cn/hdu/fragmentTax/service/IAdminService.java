package cn.hdu.fragmentTax.service;

import cn.hdu.fragmentTax.model.request.AdminExamRequ;
import cn.hdu.fragmentTax.model.request.AdminQueryRequ;

import java.util.Map;

public interface IAdminService {
    Map<String,Object> showHonorsForTeacher(AdminQueryRequ adminQueryRequ);

    Map<String,Object> examHonor(AdminExamRequ adminExamRequ);

    Map<String,Object> showPapersForTeacher(AdminQueryRequ adminQueryRequ);

    Map<String,Object> examPaper(AdminExamRequ adminExamRequ);

    Map<String,Object> showPatentsForTeacher(AdminQueryRequ adminQueryRequ);

    Map<String,Object> examPatent(AdminExamRequ adminExamRequ);

    Map<String,Object> showCompetitionsForTeacher(AdminQueryRequ adminQueryRequ);

    Map<String,Object> examCompetition(AdminExamRequ adminExamRequ);

    Map<String,Object> showEntrProsForTeacher(AdminQueryRequ adminQueryRequ);

    Map<String,Object> examEntrPro(AdminExamRequ adminExamRequ);

    Map<String,Object> showInnoProsForTeacher(AdminQueryRequ adminQueryRequ);

    Map<String,Object> examInnoPro(AdminExamRequ adminExamRequ);

    Map<String,Object> showEngiProsForTeacher(AdminQueryRequ adminQueryRequ);

    Map<String,Object> examEngiPro(AdminExamRequ adminExamRequ);

    Map<String,Object> showAcadExchsForTeacher(AdminQueryRequ adminQueryRequ);

    Map<String,Object> examAcadExch(AdminExamRequ adminExamRequ);

    Map<String,Object> showMasterPapersForTeacher(AdminQueryRequ adminQueryRequ);

    Map<String,Object> examMasterPaper(AdminExamRequ adminExamRequ);

    Map<String,Object> showWorksForTeacher(AdminQueryRequ adminQueryRequ);

    Map<String,Object> examWork(AdminExamRequ adminExamRequ);

    Map<String,Object> showStusForTeacher(AdminQueryRequ adminQueryRequ);

    Map<String,Object> showAllPrizeForTeacher(AdminQueryRequ adminQueryRequ);

    Map<String,Object> showScoresForTeacher(AdminQueryRequ adminQueryRequ);
}
