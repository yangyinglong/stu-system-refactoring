package cn.hdu.fragmentTax.service.impl.model;

import cn.hdu.fragmentTax.dao.entity.*;
import cn.hdu.fragmentTax.view.response.*;

public interface IAdminModel {
    GetHonorResp createGetHonorResp(HonorEntity honorEntity, StuBaseEntity stuBaseEntity);

    GetPaperResp createGetPaperResp(PaperEntity paperEntity, StuBaseEntity stuBaseEntity);

    GetPatentResp createGetPatentResp(PatentEntity patentEntity, StuBaseEntity stuBaseEntity);

    GetCompetitionResp createGetCompetitionResp(CompetitionEntity competitionEntity, StuBaseEntity stuBaseEntity);

    GetInnoProResp createGetInnoProResp(EntrepreneurialProEntity entrepreneurialProEntity, StuBaseEntity stuBaseEntity);

    GetInnoProResp createGetInnoProResp(InnovativeProEntity innovativeProEntity, StuBaseEntity stuBaseEntity);

    GetEngiProResp createGetEngiProResp(EngineeringProEntity engineeringProEntity, StuBaseEntity stuBaseEntity);

    GetAcadExchResp createGetAcadExchResp(AcademicExchangeEntity academicExchangeEntity, StuBaseEntity stuBaseEntity);

    GetMasterPaperResp createGetMasterPaperResp(MasterPaperEntity masterPaperEntity, StuBaseEntity stuBaseEntity);

    GetWorkResp createGetWorkResp(WorkEntity workEntity, StuBaseEntity stuBaseEntity);

    GetStuForTeacherResp createGetStuForTeacherResp(StuBaseEntity stuBaseEntity, TutorsEntity tutorsEntity, CounsellorsEntity counsellorsEntity, ScoreEntranceEntity scoreEntranceEntity, ScoreAverageEntity scoreAverageEntity);

    GetPrizeForTeacherResp createGetPrizeForTeacherResp(AllPrizeEntity allPrizeEntity, StuBaseEntity stuBaseEntity, int allStuNum);

    GetAllScoreResp createGetAllScoreResp(ScoreAllEntity scoreAllEntity);
}
