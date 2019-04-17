package cn.hdu.fragmentTax.dao.mapper;

import cn.hdu.fragmentTax.dao.entity.EvaluationCounsellorEntity;
import org.apache.ibatis.annotations.*;
import java.util.List;


@Mapper
public interface IEvaluationCounsellorMapper {
@Select("SELECT `id`, `stu_id`, `attendance`, `psychological_quality`, `activity_parti`, `relationship`, `counsellor_score` FROM `evaluation_counsellor`")
@Results({
@Result(property = "id", column = "id"), 
@Result(property = "stuId", column = "stu_id"), 
@Result(property = "attendance", column = "attendance"), 
@Result(property = "psychologicalQuality", column = "psychological_quality"), 
@Result(property = "activityParti", column = "activity_parti"), 
@Result(property = "relationship", column = "relationship"), 
@Result(property = "counsellorScore", column = "counsellor_score")
})
List<EvaluationCounsellorEntity> queryAll();
@Select("SELECT `id`, `stu_id`, `attendance`, `psychological_quality`, `activity_parti`, `relationship`, `counsellor_score` FROM `evaluation_counsellor` WHERE `id` = #{id}")
@Results({
@Result(property = "id", column = "id"), 
@Result(property = "stuId", column = "stu_id"), 
@Result(property = "attendance", column = "attendance"), 
@Result(property = "psychologicalQuality", column = "psychological_quality"), 
@Result(property = "activityParti", column = "activity_parti"), 
@Result(property = "relationship", column = "relationship"), 
@Result(property = "counsellorScore", column = "counsellor_score")
})
EvaluationCounsellorEntity queryByKey(@Param("id") Integer id);

@Insert("INSERT INTO `evaluation_counsellor`(`id`, `stu_id`, `attendance`, `psychological_quality`, `activity_parti`, `relationship`, `counsellor_score`) VALUES(#{id}, #{stuId}, #{attendance}, #{psychologicalQuality}, #{activityParti}, #{relationship}, #{counsellorScore})")
void insert(EvaluationCounsellorEntity evaluation_counsellorEntity);

@Update("UPDATE `evaluation_counsellor` SET id=#{id}, stu_id=#{stuId}, attendance=#{attendance}, psychological_quality=#{psychologicalQuality}, activity_parti=#{activityParti}, relationship=#{relationship}, counsellor_score=#{counsellorScore} WHERE `id` = #{id}")
void update(EvaluationCounsellorEntity evaluation_counsellorEntity);

@Delete("DELETE FROM `evaluation_counsellor` WHERE `id` = #{id}")
void delete(@Param("id") Integer id);

}