package cn.hdu.fragmentTax.dao.mapper;

import cn.hdu.fragmentTax.dao.entity.CompetitionEntity;
import org.apache.ibatis.annotations.*;

import java.util.List;


@Mapper
public interface ICompetitionMapper {
    @Select("SELECT `id`, `stu_id`, `competition_type`, `competition_name`, `ranking`, `total_number`, `competition_state`, `competition_prize`, `competition_level`, `teacher`, `proof_material_id`, `score`, `state`, `created_time` FROM `competition`")
    @Results({
            @Result(property = "id", column = "id"),
            @Result(property = "stuId", column = "stu_id"),
            @Result(property = "competitionType", column = "competition_type"),
            @Result(property = "competitionName", column = "competition_name"),
            @Result(property = "ranking", column = "ranking"),
            @Result(property = "totalNumber", column = "total_number"),
            @Result(property = "competitionState", column = "competition_state"),
            @Result(property = "competitionPrize", column = "competition_prize"),
            @Result(property = "competitionLevel", column = "competition_level"),
            @Result(property = "teacher", column = "teacher"),
            @Result(property = "proofMaterialId", column = "proof_material_id"),
            @Result(property = "score", column = "score"),
            @Result(property = "state", column = "state"),
            @Result(property = "createdTime", column = "created_time")
    })
    List<CompetitionEntity> queryAll();

    @Select("SELECT `id`, `stu_id`, `competition_type`, `competition_name`, `ranking`, `total_number`, `competition_state`, `competition_prize`, `competition_level`, `teacher`, `proof_material_id`, `score`, `state`, `created_time` FROM `competition` WHERE `id` = #{id}")
    @Results({
            @Result(property = "id", column = "id"),
            @Result(property = "stuId", column = "stu_id"),
            @Result(property = "competitionType", column = "competition_type"),
            @Result(property = "competitionName", column = "competition_name"),
            @Result(property = "ranking", column = "ranking"),
            @Result(property = "totalNumber", column = "total_number"),
            @Result(property = "competitionState", column = "competition_state"),
            @Result(property = "competitionPrize", column = "competition_prize"),
            @Result(property = "competitionLevel", column = "competition_level"),
            @Result(property = "teacher", column = "teacher"),
            @Result(property = "proofMaterialId", column = "proof_material_id"),
            @Result(property = "score", column = "score"),
            @Result(property = "state", column = "state"),
            @Result(property = "createdTime", column = "created_time")
    })
    CompetitionEntity queryByKey(@Param("id") Integer id);

    @Insert("INSERT INTO `competition`(`stu_id`, `competition_type`, `competition_name`, `ranking`, `total_number`, `competition_state`, `competition_prize`, `competition_level`, `teacher`, `proof_material_id`, `score`, `state`, `created_time`) VALUES(#{stuId}, #{competitionType}, #{competitionName}, #{ranking}, #{totalNumber}, #{competitionState}, #{competitionPrize}, #{competitionLevel}, #{teacher}, #{proofMaterialId}, #{score}, #{state}, #{createdTime})")
    void insert(CompetitionEntity competitionEntity);

    @Update("UPDATE `competition` SET stu_id=#{stuId}, competition_type=#{competitionType}, competition_name=#{competitionName}, ranking=#{ranking}, total_number=#{totalNumber}, competition_state=#{competitionState}, competition_prize=#{competitionPrize}, competition_level=#{competitionLevel}, teacher=#{teacher}, proof_material_id=#{proofMaterialId}, score=#{score}, state=#{state}, created_time=#{createdTime} WHERE `id` = #{id}")
    void update(CompetitionEntity competitionEntity);

    @Delete("DELETE FROM `competition` WHERE `id` = #{id}")
    void delete(@Param("id") Integer id);

    @Select("SELECT `id`, `stu_id`, `competition_type`, `competition_name`, `ranking`, `total_number`, `competition_state`, `competition_prize`, `competition_level`, `teacher`, `proof_material_id`, `score`, `state`, `created_time` FROM `competition` where `stu_id` = #{stuId} and `state` <> 0")
    @Results({
            @Result(property = "id", column = "id"),
            @Result(property = "stuId", column = "stu_id"),
            @Result(property = "competitionType", column = "competition_type"),
            @Result(property = "competitionName", column = "competition_name"),
            @Result(property = "ranking", column = "ranking"),
            @Result(property = "totalNumber", column = "total_number"),
            @Result(property = "competitionState", column = "competition_state"),
            @Result(property = "competitionPrize", column = "competition_prize"),
            @Result(property = "competitionLevel", column = "competition_level"),
            @Result(property = "teacher", column = "teacher"),
            @Result(property = "proofMaterialId", column = "proof_material_id"),
            @Result(property = "score", column = "score"),
            @Result(property = "state", column = "state"),
            @Result(property = "createdTime", column = "created_time")
    })
    List<CompetitionEntity> queryByStuId(@Param("stuId") String stuId);
}