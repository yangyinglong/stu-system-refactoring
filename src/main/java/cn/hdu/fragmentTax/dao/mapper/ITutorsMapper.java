package cn.hdu.fragmentTax.dao.mapper;

import cn.hdu.fragmentTax.dao.entity.TutorsEntity;
import org.apache.ibatis.annotations.*;

import java.util.List;


@Mapper
public interface ITutorsMapper {
    @Select("SELECT `id`, `tutorId`, `name`, `phone`, `state` FROM `tutors`")
    @Results({
            @Result(property = "id", column = "id"),
            @Result(property = "tutorId", column = "tutorId"),
            @Result(property = "name", column = "name"),
            @Result(property = "phone", column = "phone"),
            @Result(property = "state", column = "state")
    })
    List<TutorsEntity> queryAll();

    @Select("SELECT `id`, `tutorId`, `name`, `phone`, `state` FROM `tutors` WHERE `id` = #{id}")
    @Results({
            @Result(property = "id", column = "id"),
            @Result(property = "tutorId", column = "tutorId"),
            @Result(property = "name", column = "name"),
            @Result(property = "phone", column = "phone"),
            @Result(property = "state", column = "state")
    })
    TutorsEntity queryByKey(@Param("id") Integer id);

    @Insert("INSERT INTO `tutors`(`id`, `tutorId`, `name`, `phone`, `state`) VALUES(#{id}, #{tutorId}, #{name}, #{phone}, #{state})")
    void insert(TutorsEntity tutorsEntity);

    @Update("UPDATE `tutors` SET id=#{id}, tutorId=#{tutorId}, name=#{name}, phone=#{phone}, state=#{state} WHERE `id` = #{id}")
    void update(TutorsEntity tutorsEntity);

    @Delete("DELETE FROM `tutors` WHERE `id` = #{id}")
    void delete(@Param("id") Integer id);

    @Select("SELECT `id`, `tutorId`, `name`, `phone`, `state` FROM `tutors` WHERE `name` = #{name}")
    @Results({
            @Result(property = "id", column = "id"),
            @Result(property = "tutorId", column = "tutorId"),
            @Result(property = "name", column = "name"),
            @Result(property = "phone", column = "phone"),
            @Result(property = "state", column = "state")
    })
    TutorsEntity queryByTutorName(@Param("name") String name);

    @Select("SELECT `id`, `tutorId`, `name`, `phone`, `state` FROM `tutors` WHERE `tutorId` = #{tutorId}")
    @Results({
            @Result(property = "id", column = "id"),
            @Result(property = "tutorId", column = "tutorId"),
            @Result(property = "name", column = "name"),
            @Result(property = "phone", column = "phone"),
            @Result(property = "state", column = "state")
    })
    TutorsEntity queryByTuId(@Param("tutorId") String tutorId);
}