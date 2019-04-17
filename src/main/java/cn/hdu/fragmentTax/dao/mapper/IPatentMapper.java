package cn.hdu.fragmentTax.dao.mapper;

import cn.hdu.fragmentTax.dao.entity.PatentEntity;
import org.apache.ibatis.annotations.*;
import java.util.List;


@Mapper
public interface IPatentMapper {
@Select("SELECT `id`, `stu_id`, `patent_type`, `patent_name`, `patent_state`, `proof_material_id`, `score`, `state`, `created_time`, `changed_time` FROM `patent`")
@Results({
@Result(property = "id", column = "id"), 
@Result(property = "stuId", column = "stu_id"), 
@Result(property = "patentType", column = "patent_type"), 
@Result(property = "patentName", column = "patent_name"), 
@Result(property = "patentState", column = "patent_state"), 
@Result(property = "proofMaterialId", column = "proof_material_id"), 
@Result(property = "score", column = "score"), 
@Result(property = "state", column = "state"), 
@Result(property = "createdTime", column = "created_time"), 
@Result(property = "changedTime", column = "changed_time")
})
List<PatentEntity> queryAll();
@Select("SELECT `id`, `stu_id`, `patent_type`, `patent_name`, `patent_state`, `proof_material_id`, `score`, `state`, `created_time`, `changed_time` FROM `patent` WHERE `id` = #{id}")
@Results({
@Result(property = "id", column = "id"), 
@Result(property = "stuId", column = "stu_id"), 
@Result(property = "patentType", column = "patent_type"), 
@Result(property = "patentName", column = "patent_name"), 
@Result(property = "patentState", column = "patent_state"), 
@Result(property = "proofMaterialId", column = "proof_material_id"), 
@Result(property = "score", column = "score"), 
@Result(property = "state", column = "state"), 
@Result(property = "createdTime", column = "created_time"), 
@Result(property = "changedTime", column = "changed_time")
})
PatentEntity queryByKey(@Param("id") Integer id);

@Insert("INSERT INTO `patent`(`id`, `stu_id`, `patent_type`, `patent_name`, `patent_state`, `proof_material_id`, `score`, `state`, `created_time`, `changed_time`) VALUES(#{id}, #{stuId}, #{patentType}, #{patentName}, #{patentState}, #{proofMaterialId}, #{score}, #{state}, #{createdTime}, #{changedTime})")
void insert(PatentEntity patentEntity);

@Update("UPDATE `patent` SET id=#{id}, stu_id=#{stuId}, patent_type=#{patentType}, patent_name=#{patentName}, patent_state=#{patentState}, proof_material_id=#{proofMaterialId}, score=#{score}, state=#{state}, created_time=#{createdTime}, changed_time=#{changedTime} WHERE `id` = #{id}")
void update(PatentEntity patentEntity);

@Delete("DELETE FROM `patent` WHERE `id` = #{id}")
void delete(@Param("id") Integer id);

}