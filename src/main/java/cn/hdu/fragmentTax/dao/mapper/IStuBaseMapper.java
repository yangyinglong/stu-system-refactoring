package cn.hdu.fragmentTax.dao.mapper;

import cn.hdu.fragmentTax.dao.entity.StuBaseEntity;
import cn.hdu.fragmentTax.model.request.EditBaseInfoRequ;
import org.apache.ibatis.annotations.*;

import java.util.List;


@Mapper
public interface IStuBaseMapper {
    @Select("SELECT `id`, `stu_id`, `name`, `phone`, `sex`, `u_school`, `u_major`, `counsellor_id`, `tutor_id`, `state`, `created_time`, `changed_time` FROM `stu_base`")
    @Results({
            @Result(property = "id", column = "id"),
            @Result(property = "stuId", column = "stu_id"),
            @Result(property = "name", column = "name"),
            @Result(property = "phone", column = "phone"),
            @Result(property = "sex", column = "sex"),
            @Result(property = "uSchool", column = "u_school"),
            @Result(property = "uMajor", column = "u_major"),
            @Result(property = "counsellorId", column = "counsellor_id"),
            @Result(property = "tutorId", column = "tutor_id"),
            @Result(property = "state", column = "state"),
            @Result(property = "createdTime", column = "created_time"),
            @Result(property = "changedTime", column = "changed_time")
    })
    List<StuBaseEntity> queryAll();

    @Select("SELECT `id`, `stu_id`, `name`, `phone`, `sex`, `u_school`, `u_major`, `counsellor_id`, `tutor_id`, `state`, `created_time`, `changed_time` FROM `stu_base` WHERE `id` = #{id}")
    @Results({
            @Result(property = "id", column = "id"),
            @Result(property = "stuId", column = "stu_id"),
            @Result(property = "name", column = "name"),
            @Result(property = "phone", column = "phone"),
            @Result(property = "sex", column = "sex"),
            @Result(property = "uSchool", column = "u_school"),
            @Result(property = "uMajor", column = "u_major"),
            @Result(property = "counsellorId", column = "counsellor_id"),
            @Result(property = "tutorId", column = "tutor_id"),
            @Result(property = "state", column = "state"),
            @Result(property = "createdTime", column = "created_time"),
            @Result(property = "changedTime", column = "changed_time")
    })
    StuBaseEntity queryByKey(@Param("id") Integer id);

    @Insert("INSERT INTO `stu_base`(`id`, `stu_id`, `name`, `phone`, `sex`, `u_school`, `u_major`, `counsellor_id`, `tutor_id`, `state`, `created_time`, `changed_time`) VALUES(#{id}, #{stuId}, #{name}, #{phone}, #{sex}, #{uSchool}, #{uMajor}, #{counsellorId}, #{tutorId}, #{state}, #{createdTime}, #{changedTime})")
    void insert(StuBaseEntity stu_baseEntity);

    @Update("UPDATE `stu_base` SET id=#{id}, stu_id=#{stuId}, name=#{name}, phone=#{phone}, sex=#{sex}, u_school=#{uSchool}, u_major=#{uMajor}, counsellor_id=#{counsellorId}, tutor_id=#{tutorId}, state=#{state}, created_time=#{createdTime}, changed_time=#{changedTime} WHERE `id` = #{id}")
    void update(StuBaseEntity stu_baseEntity);

    @Delete("DELETE FROM `stu_base` WHERE `id` = #{id}")
    void delete(@Param("id") Integer id);

    @Select("SELECT `id`, `stu_id`, `name`, `phone`, `sex`, `u_school`, `u_major`, `counsellor_id`, `tutor_id`, `state`, `created_time`, `changed_time` FROM `stu_base` WHERE `stu_id` = #{stuId} and `state` = 1")
    @Results({
            @Result(property = "id", column = "id"),
            @Result(property = "stuId", column = "stu_id"),
            @Result(property = "name", column = "name"),
            @Result(property = "phone", column = "phone"),
            @Result(property = "sex", column = "sex"),
            @Result(property = "uSchool", column = "u_school"),
            @Result(property = "uMajor", column = "u_major"),
            @Result(property = "counsellorId", column = "counsellor_id"),
            @Result(property = "tutorId", column = "tutor_id"),
            @Result(property = "state", column = "state"),
            @Result(property = "createdTime", column = "created_time"),
            @Result(property = "changedTime", column = "changed_time")
    })
    StuBaseEntity queryByStuId(@Param("stuId") String stuId);

    @Insert("INSERT INTO `stu_base`(`stu_id`, `name`, `phone`, `sex`, `created_time`) VALUES(#{stuId}, #{name}, #{phone}, #{sex}, #{createdTime})")
    void insertBaseInfo(StuBaseEntity stuBaseEntity);

    @Update("UPDATE `stu_base` SET name=#{name}, phone=#{phone}, sex=#{sex} WHERE `stu_id` = #{stuId}")
    void editBaseInfo(@Param("stuId") String stuId, @Param("name") String name, @Param("phone") String phone, @Param("sex") Integer sex);

    @Update("UPDATE `stu_base` SET u_school=#{uSchool}, u_major=#{uMajor} WHERE `stu_id` = #{stuId}")
    void updateUSchool(@Param("stuId") String stuId, @Param("uSchool") String uSchool, @Param("uMajor") String uMajor);

    @Update("UPDATE `stu_base` SET counsellor_id=#{counsellorId}, tutor_id=#{tutorId} WHERE `stu_id` = #{stuId}")
    void updateTuCoer(@Param("stuId") String stuId, @Param("tutorId") String tutorId, @Param("counsellorId") String counsellorId);
}