package cn.hdu.fragmentTax.dao.mapper;

import cn.hdu.fragmentTax.dao.entity.EngineeringProEntity;
import org.apache.ibatis.annotations.*;
import java.util.List;


@Mapper
public interface IEngineeringProMapper {
@Select("SELECT `id`, `stu_id`, `pro_name`, `pro_intr`, `performance`, `work`, `ranking`, `total_number`, `pro_state`, `enterprise_name`, `enterprise_teacher`, `teacher`, `proof_material_id`, `score`, `state`, `created_time` FROM `engineering_pro`")
@Results({
@Result(property = "id", column = "id"), 
@Result(property = "stuId", column = "stu_id"), 
@Result(property = "proName", column = "pro_name"), 
@Result(property = "proIntr", column = "pro_intr"), 
@Result(property = "performance", column = "performance"), 
@Result(property = "work", column = "work"), 
@Result(property = "ranking", column = "ranking"), 
@Result(property = "totalNumber", column = "total_number"), 
@Result(property = "proState", column = "pro_state"), 
@Result(property = "enterpriseName", column = "enterprise_name"), 
@Result(property = "enterpriseTeacher", column = "enterprise_teacher"), 
@Result(property = "teacher", column = "teacher"), 
@Result(property = "proofMaterialId", column = "proof_material_id"), 
@Result(property = "score", column = "score"), 
@Result(property = "state", column = "state"), 
@Result(property = "createdTime", column = "created_time")
})
List<EngineeringProEntity> queryAll();
@Select("SELECT `id`, `stu_id`, `pro_name`, `pro_intr`, `performance`, `work`, `ranking`, `total_number`, `pro_state`, `enterprise_name`, `enterprise_teacher`, `teacher`, `proof_material_id`, `score`, `state`, `created_time` FROM `engineering_pro` WHERE `id` = #{id}")
@Results({
@Result(property = "id", column = "id"), 
@Result(property = "stuId", column = "stu_id"), 
@Result(property = "proName", column = "pro_name"), 
@Result(property = "proIntr", column = "pro_intr"), 
@Result(property = "performance", column = "performance"), 
@Result(property = "work", column = "work"), 
@Result(property = "ranking", column = "ranking"), 
@Result(property = "totalNumber", column = "total_number"), 
@Result(property = "proState", column = "pro_state"), 
@Result(property = "enterpriseName", column = "enterprise_name"), 
@Result(property = "enterpriseTeacher", column = "enterprise_teacher"), 
@Result(property = "teacher", column = "teacher"), 
@Result(property = "proofMaterialId", column = "proof_material_id"), 
@Result(property = "score", column = "score"), 
@Result(property = "state", column = "state"), 
@Result(property = "createdTime", column = "created_time")
})
EngineeringProEntity queryByKey(@Param("id") Integer id);

@Insert("INSERT INTO `engineering_pro`(`stu_id`, `pro_name`, `pro_intr`, `performance`, `work`, `ranking`, `total_number`, `pro_state`, `enterprise_name`, `enterprise_teacher`, `teacher`, `proof_material_id`, `score`, `state`, `created_time`) VALUES(#{stuId}, #{proName}, #{proIntr}, #{performance}, #{work}, #{ranking}, #{totalNumber}, #{proState}, #{enterpriseName}, #{enterpriseTeacher}, #{teacher}, #{proofMaterialId}, #{score}, #{state}, #{createdTime})")
void insert(EngineeringProEntity engineering_proEntity);

@Update("UPDATE `engineering_pro` SET stu_id=#{stuId}, pro_name=#{proName}, pro_intr=#{proIntr}, performance=#{performance}, work=#{work}, ranking=#{ranking}, total_number=#{totalNumber}, pro_state=#{proState}, enterprise_name=#{enterpriseName}, enterprise_teacher=#{enterpriseTeacher}, teacher=#{teacher}, proof_material_id=#{proofMaterialId}, score=#{score}, state=#{state}, created_time=#{createdTime} WHERE `id` = #{id}")
void update(EngineeringProEntity engineering_proEntity);

@Delete("DELETE FROM `engineering_pro` WHERE `id` = #{id}")
void delete(@Param("id") Integer id);

    @Select("SELECT `id`, `stu_id`, `pro_name`, `pro_intr`, `performance`, `work`, `ranking`, `total_number`, `pro_state`, `enterprise_name`, `enterprise_teacher`, `teacher`, `proof_material_id`, `score`, `state`, `created_time` FROM `engineering_pro` WHERE `stu_id` = #{stuId}")
    @Results({
            @Result(property = "id", column = "id"),
            @Result(property = "stuId", column = "stu_id"),
            @Result(property = "proName", column = "pro_name"),
            @Result(property = "proIntr", column = "pro_intr"),
            @Result(property = "performance", column = "performance"),
            @Result(property = "work", column = "work"),
            @Result(property = "ranking", column = "ranking"),
            @Result(property = "totalNumber", column = "total_number"),
            @Result(property = "proState", column = "pro_state"),
            @Result(property = "enterpriseName", column = "enterprise_name"),
            @Result(property = "enterpriseTeacher", column = "enterprise_teacher"),
            @Result(property = "teacher", column = "teacher"),
            @Result(property = "proofMaterialId", column = "proof_material_id"),
            @Result(property = "score", column = "score"),
            @Result(property = "state", column = "state"),
            @Result(property = "createdTime", column = "created_time")
    })
    List<EngineeringProEntity> queryByStuId(@Param("stuId") String stuId);
}