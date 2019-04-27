package cn.hdu.fragmentTax.dao.mapper;

import cn.hdu.fragmentTax.dao.entity.InnovativeProEntity;
import org.apache.ibatis.annotations.*;

import java.util.List;


@Mapper
public interface IInnovativeProMapper {
    @Select("SELECT `id`, `stu_id`, `pro_type`, `pro_name`, `pro_intr`, `ranking`, `total_number`, `pro_state`, `pro_result`, `proof_material_id`, `teacher`, `score`, `state`, `created_time`, `pro_level` FROM `innovative_pro`")
    @Results({
            @Result(property = "id", column = "id"),
            @Result(property = "stuId", column = "stu_id"),
            @Result(property = "proType", column = "pro_type"),
            @Result(property = "proName", column = "pro_name"),
            @Result(property = "proIntr", column = "pro_intr"),
            @Result(property = "ranking", column = "ranking"),
            @Result(property = "totalNumber", column = "total_number"),
            @Result(property = "proState", column = "pro_state"),
            @Result(property = "proResult", column = "pro_result"),
            @Result(property = "proofMaterialId", column = "proof_material_id"),
            @Result(property = "teacher", column = "teacher"),
            @Result(property = "score", column = "score"),
            @Result(property = "state", column = "state"),
            @Result(property = "createdTime", column = "created_time"),
            @Result(property = "proLevel", column = "pro_level")
    })
    List<InnovativeProEntity> queryAll();

    @Select("SELECT `id`, `stu_id`, `pro_type`, `pro_name`, `pro_intr`, `ranking`, `total_number`, `pro_state`, `pro_result`, `proof_material_id`, `teacher`, `score`, `state`, `created_time`, `pro_level` FROM `innovative_pro` WHERE `id` = #{id}")
    @Results({
            @Result(property = "id", column = "id"),
            @Result(property = "stuId", column = "stu_id"),
            @Result(property = "proType", column = "pro_type"),
            @Result(property = "proName", column = "pro_name"),
            @Result(property = "proIntr", column = "pro_intr"),
            @Result(property = "ranking", column = "ranking"),
            @Result(property = "totalNumber", column = "total_number"),
            @Result(property = "proState", column = "pro_state"),
            @Result(property = "proResult", column = "pro_result"),
            @Result(property = "proofMaterialId", column = "proof_material_id"),
            @Result(property = "teacher", column = "teacher"),
            @Result(property = "score", column = "score"),
            @Result(property = "state", column = "state"),
            @Result(property = "createdTime", column = "created_time"),
            @Result(property = "proLevel", column = "pro_level")
    })
    InnovativeProEntity queryByKey(@Param("id") Integer id);

    @Insert("INSERT INTO `innovative_pro`(`stu_id`, `pro_type`, `pro_name`, `pro_intr`, `ranking`, `total_number`, `pro_state`, `pro_result`, `proof_material_id`, `teacher`, `score`, `state`, `created_time`, `pro_level`) VALUES(#{stuId}, #{proType}, #{proName}, #{proIntr}, #{ranking}, #{totalNumber}, #{proState}, #{proResult}, #{proofMaterialId}, #{teacher}, #{score}, #{state}, #{createdTime}, #{proLevel})")
    void insert(InnovativeProEntity innovative_proEntity);

    @Update("UPDATE `innovative_pro` SET stu_id=#{stuId}, pro_type=#{proType}, pro_name=#{proName}, pro_intr=#{proIntr}, ranking=#{ranking}, total_number=#{totalNumber}, pro_state=#{proState}, pro_result=#{proResult}, proof_material_id=#{proofMaterialId}, teacher=#{teacher}, score=#{score}, state=#{state}, created_time=#{createdTime}, pro_level=#{proLevel} WHERE `id` = #{id}")
    void update(InnovativeProEntity innovative_proEntity);

    @Update("UPDATE `innovative_pro` SET state=0 WHERE `id` = #{id}")
    void delete(@Param("id") Integer id);

    @Select("SELECT `id`, `stu_id`, `pro_type`, `pro_name`, `pro_intr`, `ranking`, `total_number`, `pro_state`, `pro_result`, `proof_material_id`, `teacher`, `score`, `state`, `created_time`, `pro_level` FROM `innovative_pro` WHERE `stu_id` = #{stuId} and `state` <> 0")
    @Results({
            @Result(property = "id", column = "id"),
            @Result(property = "stuId", column = "stu_id"),
            @Result(property = "proType", column = "pro_type"),
            @Result(property = "proName", column = "pro_name"),
            @Result(property = "proIntr", column = "pro_intr"),
            @Result(property = "ranking", column = "ranking"),
            @Result(property = "totalNumber", column = "total_number"),
            @Result(property = "proState", column = "pro_state"),
            @Result(property = "proResult", column = "pro_result"),
            @Result(property = "proofMaterialId", column = "proof_material_id"),
            @Result(property = "teacher", column = "teacher"),
            @Result(property = "score", column = "score"),
            @Result(property = "state", column = "state"),
            @Result(property = "createdTime", column = "created_time"),
            @Result(property = "proLevel", column = "pro_level")
    })
    List<InnovativeProEntity> queryStuId(@Param("stuId") String stuId);

    @Select("SELECT `id`, `stu_id`, `pro_type`, `pro_name`, `pro_intr`, `ranking`, `total_number`, `pro_state`, `pro_result`, `proof_material_id`, `teacher`, `score`, `state`, `created_time`, `pro_level` FROM `innovative_pro` WHERE `state` in (${states})")
    @Results({
            @Result(property = "id", column = "id"),
            @Result(property = "stuId", column = "stu_id"),
            @Result(property = "proType", column = "pro_type"),
            @Result(property = "proName", column = "pro_name"),
            @Result(property = "proIntr", column = "pro_intr"),
            @Result(property = "ranking", column = "ranking"),
            @Result(property = "totalNumber", column = "total_number"),
            @Result(property = "proState", column = "pro_state"),
            @Result(property = "proResult", column = "pro_result"),
            @Result(property = "proofMaterialId", column = "proof_material_id"),
            @Result(property = "teacher", column = "teacher"),
            @Result(property = "score", column = "score"),
            @Result(property = "state", column = "state"),
            @Result(property = "createdTime", column = "created_time"),
            @Result(property = "proLevel", column = "pro_level")
    })
    List<InnovativeProEntity> queryForAdmin(@Param("states") String status);

    @Select("SELECT `id`, `stu_id`, `pro_type`, `pro_name`, `pro_intr`, `ranking`, `total_number`, `pro_state`, `pro_result`, `proof_material_id`, `teacher`, `score`, `state`, `created_time`, `pro_level` FROM `innovative_pro` WHERE `state` in (${states}) and `stu_id` in (${stuIds})")
    @Results({
            @Result(property = "id", column = "id"),
            @Result(property = "stuId", column = "stu_id"),
            @Result(property = "proType", column = "pro_type"),
            @Result(property = "proName", column = "pro_name"),
            @Result(property = "proIntr", column = "pro_intr"),
            @Result(property = "ranking", column = "ranking"),
            @Result(property = "totalNumber", column = "total_number"),
            @Result(property = "proState", column = "pro_state"),
            @Result(property = "proResult", column = "pro_result"),
            @Result(property = "proofMaterialId", column = "proof_material_id"),
            @Result(property = "teacher", column = "teacher"),
            @Result(property = "score", column = "score"),
            @Result(property = "state", column = "state"),
            @Result(property = "createdTime", column = "created_time"),
            @Result(property = "proLevel", column = "pro_level")
    })
    List<InnovativeProEntity> queryForTutor(@Param("states") String status, @Param("stuIds")  String stuIds);

    @Update("UPDATE `innovative_pro` SET score=#{score}, state=#{state} WHERE `id` = #{id}")
    void updateScore(@Param("id") String id, @Param("score") Float score, @Param("state") Integer state);

    @Select("SELECT `id`, `stu_id`, `pro_type`, `pro_name`, `pro_intr`, `ranking`, `total_number`, `pro_state`, `pro_result`, `proof_material_id`, `teacher`, `score`, `state`, `created_time`, `pro_level` FROM `innovative_pro` WHERE `state` = #{state} and `stu_id` = #{stuId}")
    @Results({
            @Result(property = "id", column = "id"),
            @Result(property = "stuId", column = "stu_id"),
            @Result(property = "proType", column = "pro_type"),
            @Result(property = "proName", column = "pro_name"),
            @Result(property = "proIntr", column = "pro_intr"),
            @Result(property = "ranking", column = "ranking"),
            @Result(property = "totalNumber", column = "total_number"),
            @Result(property = "proState", column = "pro_state"),
            @Result(property = "proResult", column = "pro_result"),
            @Result(property = "proofMaterialId", column = "proof_material_id"),
            @Result(property = "teacher", column = "teacher"),
            @Result(property = "score", column = "score"),
            @Result(property = "state", column = "state"),
            @Result(property = "createdTime", column = "created_time"),
            @Result(property = "proLevel", column = "pro_level")
    })
    List<InnovativeProEntity> queryByStuId(@Param("stuId") String stuId, @Param("state") Integer state);
}