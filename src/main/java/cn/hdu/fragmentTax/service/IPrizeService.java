package cn.hdu.fragmentTax.service;

import cn.hdu.fragmentTax.model.request.EditCompetitionRequ;
import cn.hdu.fragmentTax.model.request.EditHonorResp;
import cn.hdu.fragmentTax.model.request.EditPaperRequ;
import cn.hdu.fragmentTax.model.request.EditPatentRequ;

import java.text.ParseException;
import java.util.Map;

public interface IPrizeService {
    Map<String,Object> editHonor(EditHonorResp editHonorResp);

    Map<String,Object> getHonors(String stuId);

    Map<String,Object> getPrizes(String stuId);

    Map<String,Object> editPaper(EditPaperRequ editPaperRequ);

    Map<String,Object> getPapers(String stuId);

    Map<String,Object> editPatent(EditPatentRequ editPatentRequ);

    Map<String,Object> getPatents(String stuId);

    Map<String,Object> editCompetition(EditCompetitionRequ editCompetitionRequ);

    Map<String,Object> getCompetitions(String stuId);
}
