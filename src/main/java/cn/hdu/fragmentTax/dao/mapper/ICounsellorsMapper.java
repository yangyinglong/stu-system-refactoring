package cn.hdu.fragmentTax.dao.mapper;

import cn.hdu.fragmentTax.dao.entity.CounsellorsEntity;
import org.apache.ibatis.annotations.*;

import java.util.List;


@Mapper
public interface ICounsellorsMapper {
    @Select("SELECT `id`, `counsellorId`, `name`, `phone`, `state` FROM `counsellors`")
    @Results({
            @Result(property = "id", column = "id"),
            @Result(property = "counsellorId", column = "counsellorId"),
            @Result(property = "name", column = "name"),
            @Result(property = "phone", column = "phone"),
            @Result(property = "state", column = "state")
    })
    List<CounsellorsEntity> queryAll();

    @Select("SELECT `id`, `counsellorId`, `name`, `phone`, `state` FROM `counsellors` WHERE `id` = #{id}")
    @Results({
            @Result(property = "id", column = "id"),
            @Result(property = "counsellorId", column = "counsellorId"),
            @Result(property = "name", column = "name"),
            @Result(property = "phone", column = "phone"),
            @Result(property = "state", column = "state")
    })
    CounsellorsEntity queryByKey(@Param("id") Integer id);

    @Insert("INSERT INTO `counsellors`(`id`, `counsellorId`, `name`, `phone`, `state`) VALUES(#{id}, #{counsellorId}, #{name}, #{phone}, #{state})")
    void insert(CounsellorsEntity counsellorsEntity);

    @Update("UPDATE `counsellors` SET id=#{id}, counsellorId=#{counsellorId}, name=#{name}, phone=#{phone}, state=#{state} WHERE `id` = #{id}")
    void update(CounsellorsEntity counsellorsEntity);

    @Delete("DELETE FROM `counsellors` WHERE `id` = #{id}")
    void delete(@Param("id") Integer id);

    @Select("SELECT `id`, `counsellorId`, `name`, `phone`, `state` FROM `counsellors` WHERE `name` = #{name}")
    @Results({
            @Result(property = "id", column = "id"),
            @Result(property = "counsellorId", column = "counsellorId"),
            @Result(property = "name", column = "name"),
            @Result(property = "phone", column = "phone"),
            @Result(property = "state", column = "state")
    })
    CounsellorsEntity queryByCoerName(@Param("name") String name);

    @Select("SELECT `id`, `counsellorId`, `name`, `phone`, `state` FROM `counsellors` WHERE `counsellorId` = #{counsellorId}")
    @Results({
            @Result(property = "id", column = "id"),
            @Result(property = "counsellorId", column = "counsellorId"),
            @Result(property = "name", column = "name"),
            @Result(property = "phone", column = "phone"),
            @Result(property = "state", column = "state")
    })
    CounsellorsEntity queryByCoId(@Param("counsellorId") String counsellorId);
}