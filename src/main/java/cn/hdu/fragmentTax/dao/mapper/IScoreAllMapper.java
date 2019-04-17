package cn.hdu.fragmentTax.dao.mapper;

import cn.hdu.fragmentTax.dao.entity.ScoreAllEntity;
import org.apache.ibatis.annotations.*;

import java.util.List;


@Mapper
public interface IScoreAllMapper {
    @Select("SELECT `id`, `stu_id`, `engineering_mathematics`, `first_foreign_language`, `characteristic_socialism`, `numerical_analysis`, `state`, `created_time`, `changed_time` FROM `score_all`")
    @Results({
            @Result(property = "id", column = "id"),
            @Result(property = "stuId", column = "stu_id"),
            @Result(property = "engineeringMathematics", column = "engineering_mathematics"),
            @Result(property = "firstForeignLanguage", column = "first_foreign_language"),
            @Result(property = "characteristicSocialism", column = "characteristic_socialism"),
            @Result(property = "numericalAnalysis", column = "numerical_analysis"),
            @Result(property = "state", column = "state"),
            @Result(property = "createdTime", column = "created_time"),
            @Result(property = "changedTime", column = "changed_time")
    })
    List<ScoreAllEntity> queryAll();

    @Select("SELECT `id`, `stu_id`, `engineering_mathematics`, `first_foreign_language`, `characteristic_socialism`, `numerical_analysis`, `state`, `created_time`, `changed_time` FROM `score_all` WHERE `id` = #{id}")
    @Results({
            @Result(property = "id", column = "id"),
            @Result(property = "stuId", column = "stu_id"),
            @Result(property = "engineeringMathematics", column = "engineering_mathematics"),
            @Result(property = "firstForeignLanguage", column = "first_foreign_language"),
            @Result(property = "characteristicSocialism", column = "characteristic_socialism"),
            @Result(property = "numericalAnalysis", column = "numerical_analysis"),
            @Result(property = "state", column = "state"),
            @Result(property = "createdTime", column = "created_time"),
            @Result(property = "changedTime", column = "changed_time")
    })
    ScoreAllEntity queryByKey(@Param("id") Integer id);

    @Insert("INSERT INTO `score_all`(`id`, `stu_id`, `engineering_mathematics`, `first_foreign_language`, `characteristic_socialism`, `numerical_analysis`, `state`, `created_time`, `changed_time`) VALUES(#{id}, #{stuId}, #{engineeringMathematics}, #{firstForeignLanguage}, #{characteristicSocialism}, #{numericalAnalysis}, #{state}, #{createdTime}, #{changedTime})")
    void insert(ScoreAllEntity score_allEntity);

    @Update("UPDATE `score_all` SET id=#{id}, stu_id=#{stuId}, engineering_mathematics=#{engineeringMathematics}, first_foreign_language=#{firstForeignLanguage}, characteristic_socialism=#{characteristicSocialism}, numerical_analysis=#{numericalAnalysis}, state=#{state}, created_time=#{createdTime}, changed_time=#{changedTime} WHERE `id` = #{id}")
    void update(ScoreAllEntity score_allEntity);

    @Delete("DELETE FROM `score_all` WHERE `id` = #{id}")
    void delete(@Param("id") Integer id);

    @Select("SELECT `id`, `stu_id`, `engineering_mathematics`, `first_foreign_language`, `characteristic_socialism`, `numerical_analysis`, `state`, `created_time`, `changed_time` FROM `score_all` WHERE `stu_id` = #{stuId}")
    @Results({
            @Result(property = "id", column = "id"),
            @Result(property = "stuId", column = "stu_id"),
            @Result(property = "engineeringMathematics", column = "engineering_mathematics"),
            @Result(property = "firstForeignLanguage", column = "first_foreign_language"),
            @Result(property = "characteristicSocialism", column = "characteristic_socialism"),
            @Result(property = "numericalAnalysis", column = "numerical_analysis"),
            @Result(property = "state", column = "state"),
            @Result(property = "createdTime", column = "created_time"),
            @Result(property = "changedTime", column = "changed_time")
    })
    ScoreAllEntity queryByStuId(@Param("stuId") String stuId);


    @Insert("INSERT INTO `score_all`(`stu_id`, `engineering_mathematics`, `first_foreign_language`, `characteristic_socialism`, `numerical_analysis`) VALUES(#{stuId}, #{engineeringMathematics}, #{firstForeignLanguage}, #{characteristicSocialism}, #{numericalAnalysis}) ON DUPLICATE KEY UPDATE `engineering_mathematics` = #{engineeringMathematics}, `first_foreign_language`=#{firstForeignLanguage}, `characteristic_socialism`=#{characteristicSocialism}, `numerical_analysis`=#{numericalAnalysis}")
    void updateScore(ScoreAllEntity scoreAllEntity);
}