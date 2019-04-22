package cn.hdu.fragmentTax.dao.mapper;

import cn.hdu.fragmentTax.dao.entity.WorkEntity;
import org.apache.ibatis.annotations.*;

import java.util.List;


@Mapper
public interface IWorkMapper {
    @Select("SELECT `id`, `stu_id`, `company_name`, `company_type`, `work_type`, `score`, `state`, `created_time` FROM `work`")
    @Results({
            @Result(property = "id", column = "id"),
            @Result(property = "stuId", column = "stu_id"),
            @Result(property = "companyName", column = "company_name"),
            @Result(property = "companyType", column = "company_type"),
            @Result(property = "workType", column = "work_type"),
            @Result(property = "score", column = "score"),
            @Result(property = "state", column = "state"),
            @Result(property = "createdTime", column = "created_time")
    })
    List<WorkEntity> queryAll();

    @Select("SELECT `id`, `stu_id`, `company_name`, `company_type`, `work_type`, `score`, `state`, `created_time` FROM `work` WHERE `id` = #{id}")
    @Results({
            @Result(property = "id", column = "id"),
            @Result(property = "stuId", column = "stu_id"),
            @Result(property = "companyName", column = "company_name"),
            @Result(property = "companyType", column = "company_type"),
            @Result(property = "workType", column = "work_type"),
            @Result(property = "score", column = "score"),
            @Result(property = "state", column = "state"),
            @Result(property = "createdTime", column = "created_time")
    })
    WorkEntity queryByKey(@Param("id") Integer id);

    @Insert("INSERT INTO `work`(`stu_id`, `company_name`, `company_type`, `work_type`, `score`, `state`, `created_time`) VALUES(#{stuId}, #{companyName}, #{companyType}, #{workType}, #{score}, #{state}, #{createdTime})")
    void insert(WorkEntity workEntity);

    @Update("UPDATE `work` SET stu_id=#{stuId}, company_name=#{companyName}, company_type=#{companyType}, work_type=#{workType}, score=#{score}, state=#{state}, created_time=#{createdTime} WHERE `id` = #{id}")
    void update(WorkEntity workEntity);

    @Delete("DELETE FROM `work` WHERE `id` = #{id}")
    void delete(@Param("id") Integer id);

    @Select("SELECT `id`, `stu_id`, `company_name`, `company_type`, `work_type`, `score`, `state`, `created_time` FROM `work` WHERE `stu_id` = #{stuId}")
    @Results({
            @Result(property = "id", column = "id"),
            @Result(property = "stuId", column = "stu_id"),
            @Result(property = "companyName", column = "company_name"),
            @Result(property = "companyType", column = "company_type"),
            @Result(property = "workType", column = "work_type"),
            @Result(property = "score", column = "score"),
            @Result(property = "state", column = "state"),
            @Result(property = "createdTime", column = "created_time")
    })
    List<WorkEntity> queryByStuId(@Param("stuId") String stuId);
}