package cn.hdu.fragmentTax.controller;

import cn.hdu.fragmentTax.model.request.EditHonorResp;
import cn.hdu.fragmentTax.model.request.EditPaperRequ;
import cn.hdu.fragmentTax.model.request.EditPatentRequ;
import cn.hdu.fragmentTax.service.IPrizeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.CrossOrigin;

import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.text.ParseException;
import java.util.Map;

@Component
@Path("/prize")
@CrossOrigin
public class PrizeController {

    @Autowired
    private IPrizeService prizeService;

    /**
     * 修改或者增加荣誉和称号
     * @param editHonorResp
     * @return
     */
    @Path("/editHonor")
    @POST
    @Produces(MediaType.APPLICATION_JSON)
    public Map<String, Object> editHonor(EditHonorResp editHonorResp){
        Map<String, Object> resp = prizeService.editHonor(editHonorResp);
        return resp;
    }

    /**
     * 根据学号获取所有的荣誉和奖项
     * @param stuId
     * @return
     */
    @Path("/getHonors")
    @POST
    @Produces(MediaType.APPLICATION_JSON)
    public Map<String, Object> getHonors(String stuId){
        Map<String, Object> resp = prizeService.getHonors(stuId);
        return resp;
    }

    /**
     * 获取所有证书的总分
     * @param stuId
     * @return
     */
    @Path("/getPrizes")
    @POST
    @Produces(MediaType.APPLICATION_JSON)
    public Map<String, Object> getPrizes(String stuId){
        Map<String, Object> resp = prizeService.getPrizes(stuId);
        return resp;
    }

    /**
     * 添加或者修改学术文论
     * @param editPaperRequ
     * @return
     */
    @Path("/editPaper")
    @POST
    @Produces(MediaType.APPLICATION_JSON)
    public Map<String, Object> editPaper(EditPaperRequ editPaperRequ) {
        Map<String, Object> resp = prizeService.editPaper(editPaperRequ);
        return resp;
    }

    /**
     * 根据学号获取所有的论文信息
     * @param stuId
     * @return
     */
    @Path("/getPapers")
    @POST
    @Produces(MediaType.APPLICATION_JSON)
    public Map<String, Object> getPapers(String stuId){
        Map<String, Object> resp = prizeService.getPapers(stuId);
        return resp;
    }

    /**
     * 修改或者增加发明专利
     * @param editPatentRequ
     * @return
     */
    @Path("/editPatent")
    @POST
    @Produces(MediaType.APPLICATION_JSON)
    public Map<String, Object> editPatent(EditPatentRequ editPatentRequ){
        Map<String, Object> resp = prizeService.editPatent(editPatentRequ);
        return resp;
    }

    @Path("/getPatents")
    @POST
    @Produces(MediaType.APPLICATION_JSON)
    public Map<String, Object> getPatents(String stuId){
        Map<String, Object> resp = prizeService.getPatents(stuId);
        return resp;
    }

}
