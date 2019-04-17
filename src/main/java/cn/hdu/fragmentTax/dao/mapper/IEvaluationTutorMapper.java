package cn.hdu.fragmentTax.dao.mapper;

import cn.hdu.fragmentTax.dao.entity.EvaluationTutorEntity;
import org.apache.ibatis.annotations.*;

import java.util.List;


@Mapper
public interface IEvaluationTutorMapper {
    @Select("SELECT `id`, `stu_id`, `attendance`, `auto_learn`, `auto_scientific`, `scientific_manag`, `tutor_score` FROM `evaluation_tutor`")
    @Results({
            @Result(property = "id", column = "id"),
            @Result(property = "stuId", column = "stu_id"),
            @Result(property = "attendance", column = "attendance"),
            @Result(property = "autoLearn", column = "auto_learn"),
            @Result(property = "autoScientific", column = "auto_scientific"),
            @Result(property = "scientificManag", column = "scientific_manag"),
            @Result(property = "tutorScore", column = "tutor_score")
    })
    List<EvaluationTutorEntity> queryAll();

    @Select("SELECT `id`, `stu_id`, `attendance`, `auto_learn`, `auto_scientific`, `scientific_manag`, `tutor_score` FROM `evaluation_tutor` WHERE `id` = #{id}")
    @Results({
            @Result(property = "id", column = "id"),
            @Result(property = "stuId", column = "stu_id"),
            @Result(property = "attendance", column = "attendance"),
            @Result(property = "autoLearn", column = "auto_learn"),
            @Result(property = "autoScientific", column = "auto_scientific"),
            @Result(property = "scientificManag", column = "scientific_manag"),
            @Result(property = "tutorScore", column = "tutor_score")
    })
    EvaluationTutorEntity queryByKey(@Param("id") Integer id);

    @Insert("INSERT INTO `evaluation_tutor`(`id`, `stu_id`, `attendance`, `auto_learn`, `auto_scientific`, `scientific_manag`, `tutor_score`) VALUES(#{id}, #{stuId}, #{attendance}, #{autoLearn}, #{autoScientific}, #{scientificManag}, #{tutorScore})")
    void insert(EvaluationTutorEntity evaluation_tutorEntity);

    @Update("UPDATE `evaluation_tutor` SET id=#{id}, stu_id=#{stuId}, attendance=#{attendance}, auto_learn=#{autoLearn}, auto_scientific=#{autoScientific}, scientific_manag=#{scientificManag}, tutor_score=#{tutorScore} WHERE `id` = #{id}")
    void update(EvaluationTutorEntity evaluation_tutorEntity);

    @Delete("DELETE FROM `evaluation_tutor` WHERE `id` = #{id}")
    void delete(@Param("id") Integer id);

}