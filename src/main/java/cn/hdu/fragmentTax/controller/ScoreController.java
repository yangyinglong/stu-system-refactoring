package cn.hdu.fragmentTax.controller;

import cn.hdu.fragmentTax.model.request.EditAllScoreRequ;
import cn.hdu.fragmentTax.model.request.EditEntranceInfoRequ;
import cn.hdu.fragmentTax.model.request.EditTutorCoerRequ;
import cn.hdu.fragmentTax.service.IScoreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.CrossOrigin;

import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.Map;

@Component
@Path("/score")
@CrossOrigin
public class ScoreController {

    @Autowired
    private IScoreService scoreService;

    /**
     * 修改入学考试的成绩
     * @param editEntranceInfoRequ
     * @return
     */
    @Path("/editEntrScore")
    @POST
    @Produces(MediaType.APPLICATION_JSON)
    public Map<String, Object> editEntrScore(EditEntranceInfoRequ editEntranceInfoRequ){
        Map<String, Object> resp = scoreService.editEntrScore(editEntranceInfoRequ);
        return resp;
    }

    /**
     * 修改入学考试的成绩
     * @param stuId
     * @return
     */
    @Path("/getEntrScore")
    @POST
    @Produces(MediaType.APPLICATION_JSON)
    public Map<String, Object> getEntrScore(String stuId){
        Map<String, Object> resp = scoreService.getEntrScore(stuId);
        return resp;
    }

    /**
     * 修改导师和辅导员
     * @param editTutorCoerRequ
     * @return
     */
    @Path("/editTuCoer")
    @POST
    @Produces(MediaType.APPLICATION_JSON)
    public Map<String, Object> editTuCoer(EditTutorCoerRequ editTutorCoerRequ){
        Map<String, Object> resp = scoreService.editTuCoer(editTutorCoerRequ);
        return resp;
    }

    /**
     * 获取导师和辅导员信息
     * @param stuId
     * @return
     */
    @Path("/getTuCoer")
    @POST
    @Produces(MediaType.APPLICATION_JSON)
    public Map<String, Object> getTuCoer(String stuId){
        Map<String, Object> resp = scoreService.getTuCoer(stuId);
        return resp;
    }

    /**
     * 获取各门成绩和平均分
     * @param stuId
     * @return
     */
    @Path("/getAllScore")
    @POST
    @Produces(MediaType.APPLICATION_JSON)
    public Map<String, Object> getAllScore(String stuId){
        Map<String, Object> resp = scoreService.getAllScore(stuId);
        return resp;
    }

    /**
     * 修改各门成绩
     * @param editAllScoreResp
     * @return
     */
    @Path("/editAllScore")
    @POST
    @Produces(MediaType.APPLICATION_JSON)
    public Map<String, Object> editAllScore(EditAllScoreRequ editAllScoreResp){
        Map<String, Object> resp = scoreService.editAllScore(editAllScoreResp);
        return resp;
    }


}
