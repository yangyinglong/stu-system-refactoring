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

    @Insert("INSERT INTO `innovative_pro`(`id`, `stu_id`, `pro_type`, `pro_name`, `pro_intr`, `ranking`, `total_number`, `pro_state`, `pro_result`, `proof_material_id`, `teacher`, `score`, `state`, `created_time`, `pro_level`) VALUES(#{id}, #{stuId}, #{proType}, #{proName}, #{proIntr}, #{ranking}, #{totalNumber}, #{proState}, #{proResult}, #{proofMaterialId}, #{teacher}, #{score}, #{state}, #{createdTime}, #{proLevel})")
    void insert(InnovativeProEntity innovative_proEntity);

    @Update("UPDATE `innovative_pro` SET id=#{id}, stu_id=#{stuId}, pro_type=#{proType}, pro_name=#{proName}, pro_intr=#{proIntr}, ranking=#{ranking}, total_number=#{totalNumber}, pro_state=#{proState}, pro_result=#{proResult}, proof_material_id=#{proofMaterialId}, teacher=#{teacher}, score=#{score}, state=#{state}, created_time=#{createdTime}, pro_level=#{proLevel} WHERE `id` = #{id}")
    void update(InnovativeProEntity innovative_proEntity);

    @Delete("DELETE FROM `innovative_pro` WHERE `id` = #{id}")
    void delete(@Param("id") Integer id);

}