package cn.hdu.fragmentTax.dao.mapper;

import cn.hdu.fragmentTax.dao.entity.EntrepreneurialProEntity;
import org.apache.ibatis.annotations.*;
import java.util.List;


@Mapper
public interface IEntrepreneurialProMapper {
@Select("SELECT `id`, `stu_id`, `pro_type`, `pro_name`, `ranking`, `total_number`, `pro_state`, `pro_level`, `pro_result`, `score`, `teacher`, `proof_material_id`, `state`, `created_time` FROM `entrepreneurial_pro`")
@Results({
@Result(property = "id", column = "id"), 
@Result(property = "stuId", column = "stu_id"), 
@Result(property = "proType", column = "pro_type"), 
@Result(property = "proName", column = "pro_name"), 
@Result(property = "ranking", column = "ranking"), 
@Result(property = "totalNumber", column = "total_number"), 
@Result(property = "proState", column = "pro_state"), 
@Result(property = "proLevel", column = "pro_level"), 
@Result(property = "proResult", column = "pro_result"), 
@Result(property = "score", column = "score"), 
@Result(property = "teacher", column = "teacher"), 
@Result(property = "proofMaterialId", column = "proof_material_id"), 
@Result(property = "state", column = "state"), 
@Result(property = "createdTime", column = "created_time")
})
List<EntrepreneurialProEntity> queryAll();
@Select("SELECT `id`, `stu_id`, `pro_type`, `pro_name`, `ranking`, `total_number`, `pro_state`, `pro_level`, `pro_result`, `score`, `teacher`, `proof_material_id`, `state`, `created_time` FROM `entrepreneurial_pro` WHERE `id` = #{id}")
@Results({
@Result(property = "id", column = "id"), 
@Result(property = "stuId", column = "stu_id"), 
@Result(property = "proType", column = "pro_type"), 
@Result(property = "proName", column = "pro_name"), 
@Result(property = "ranking", column = "ranking"), 
@Result(property = "totalNumber", column = "total_number"), 
@Result(property = "proState", column = "pro_state"), 
@Result(property = "proLevel", column = "pro_level"), 
@Result(property = "proResult", column = "pro_result"), 
@Result(property = "score", column = "score"), 
@Result(property = "teacher", column = "teacher"), 
@Result(property = "proofMaterialId", column = "proof_material_id"), 
@Result(property = "state", column = "state"), 
@Result(property = "createdTime", column = "created_time")
})
EntrepreneurialProEntity queryByKey(@Param("id") Integer id);

@Insert("INSERT INTO `entrepreneurial_pro`(`stu_id`, `pro_type`, `pro_name`, `ranking`, `total_number`, `pro_state`, `pro_level`, `pro_result`, `score`, `teacher`, `proof_material_id`, `state`, `created_time`) VALUES(#{stuId}, #{proType}, #{proName}, #{ranking}, #{totalNumber}, #{proState}, #{proLevel}, #{proResult}, #{score}, #{teacher}, #{proofMaterialId}, #{state}, #{createdTime})")
void insert(EntrepreneurialProEntity entrepreneurial_proEntity);

@Update("UPDATE `entrepreneurial_pro` SET stu_id=#{stuId}, pro_type=#{proType}, pro_name=#{proName}, ranking=#{ranking}, total_number=#{totalNumber}, pro_state=#{proState}, pro_level=#{proLevel}, pro_result=#{proResult}, score=#{score}, teacher=#{teacher}, proof_material_id=#{proofMaterialId}, state=#{state}, created_time=#{createdTime} WHERE `id` = #{id}")
void update(EntrepreneurialProEntity entrepreneurial_proEntity);

@Delete("DELETE FROM `entrepreneurial_pro` WHERE `id` = #{id}")
void delete(@Param("id") Integer id);

    @Select("SELECT `id`, `stu_id`, `pro_type`, `pro_name`, `ranking`, `total_number`, `pro_state`, `pro_level`, `pro_result`, `score`, `teacher`, `proof_material_id`, `state`, `created_time` FROM `entrepreneurial_pro` WHERE `stu_id` = #{stuId}")
    @Results({
            @Result(property = "id", column = "id"),
            @Result(property = "stuId", column = "stu_id"),
            @Result(property = "proType", column = "pro_type"),
            @Result(property = "proName", column = "pro_name"),
            @Result(property = "ranking", column = "ranking"),
            @Result(property = "totalNumber", column = "total_number"),
            @Result(property = "proState", column = "pro_state"),
            @Result(property = "proLevel", column = "pro_level"),
            @Result(property = "proResult", column = "pro_result"),
            @Result(property = "score", column = "score"),
            @Result(property = "teacher", column = "teacher"),
            @Result(property = "proofMaterialId", column = "proof_material_id"),
            @Result(property = "state", column = "state"),
            @Result(property = "createdTime", column = "created_time")
    })
    List<EntrepreneurialProEntity> queryStuId(@Param("stuId") String stuId);

    @Select("SELECT `id`, `stu_id`, `pro_type`, `pro_name`, `ranking`, `total_number`, `pro_state`, `pro_level`, `pro_result`, `score`, `teacher`, `proof_material_id`, `state`, `created_time` FROM `entrepreneurial_pro` WHERE `state` in (${state})")
    @Results({
            @Result(property = "id", column = "id"),
            @Result(property = "stuId", column = "stu_id"),
            @Result(property = "proType", column = "pro_type"),
            @Result(property = "proName", column = "pro_name"),
            @Result(property = "ranking", column = "ranking"),
            @Result(property = "totalNumber", column = "total_number"),
            @Result(property = "proState", column = "pro_state"),
            @Result(property = "proLevel", column = "pro_level"),
            @Result(property = "proResult", column = "pro_result"),
            @Result(property = "score", column = "score"),
            @Result(property = "teacher", column = "teacher"),
            @Result(property = "proofMaterialId", column = "proof_material_id"),
            @Result(property = "state", column = "state"),
            @Result(property = "createdTime", column = "created_time")
    })
    List<EntrepreneurialProEntity> queryForAdmin(@Param("state") String status);

    @Select("SELECT `id`, `stu_id`, `pro_type`, `pro_name`, `ranking`, `total_number`, `pro_state`, `pro_level`, `pro_result`, `score`, `teacher`, `proof_material_id`, `state`, `created_time` FROM `entrepreneurial_pro` WHERE `state` in (${states}) and `stu_id` in (${stuIds})")
    @Results({
            @Result(property = "id", column = "id"),
            @Result(property = "stuId", column = "stu_id"),
            @Result(property = "proType", column = "pro_type"),
            @Result(property = "proName", column = "pro_name"),
            @Result(property = "ranking", column = "ranking"),
            @Result(property = "totalNumber", column = "total_number"),
            @Result(property = "proState", column = "pro_state"),
            @Result(property = "proLevel", column = "pro_level"),
            @Result(property = "proResult", column = "pro_result"),
            @Result(property = "score", column = "score"),
            @Result(property = "teacher", column = "teacher"),
            @Result(property = "proofMaterialId", column = "proof_material_id"),
            @Result(property = "state", column = "state"),
            @Result(property = "createdTime", column = "created_time")
    })
    List<EntrepreneurialProEntity> queryForTutor(@Param("states") String status, @Param("stuIds") String stuIds);

    @Update("UPDATE `entrepreneurial_pro` SET score=#{score}, state=#{state} WHERE `id` = #{id}")
    void updateScore(@Param("id") String id, @Param("score") Float score, @Param("state") Integer state);

    @Select("SELECT `id`, `stu_id`, `pro_type`, `pro_name`, `ranking`, `total_number`, `pro_state`, `pro_level`, `pro_result`, `score`, `teacher`, `proof_material_id`, `state`, `created_time` FROM `entrepreneurial_pro` WHERE `stu_id` = #{stuId} and `state` = #{state}")
    @Results({
            @Result(property = "id", column = "id"),
            @Result(property = "stuId", column = "stu_id"),
            @Result(property = "proType", column = "pro_type"),
            @Result(property = "proName", column = "pro_name"),
            @Result(property = "ranking", column = "ranking"),
            @Result(property = "totalNumber", column = "total_number"),
            @Result(property = "proState", column = "pro_state"),
            @Result(property = "proLevel", column = "pro_level"),
            @Result(property = "proResult", column = "pro_result"),
            @Result(property = "score", column = "score"),
            @Result(property = "teacher", column = "teacher"),
            @Result(property = "proofMaterialId", column = "proof_material_id"),
            @Result(property = "state", column = "state"),
            @Result(property = "createdTime", column = "created_time")
    })
    List<EntrepreneurialProEntity> queryByStuId(@Param("stuId") String stuId, @Param("state") Integer state);
}