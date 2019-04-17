package cn.hdu.fragmentTax.dao.mapper;

import cn.hdu.fragmentTax.dao.entity.PasswordEntity;
import org.apache.ibatis.annotations.*;

import java.util.List;


@Mapper
public interface IPasswordMapper {
    @Select("SELECT `id`, `account`, `password` FROM `password`")
    @Results({
            @Result(property = "id", column = "id"),
            @Result(property = "account", column = "account"),
            @Result(property = "password", column = "password")
    })
    List<PasswordEntity> queryAll();

    @Select("SELECT `id`, `account`, `password` FROM `password` WHERE `id` = #{id}")
    @Results({
            @Result(property = "id", column = "id"),
            @Result(property = "account", column = "account"),
            @Result(property = "password", column = "password")
    })
    PasswordEntity queryByKey(@Param("id") Integer id);

    @Insert("INSERT INTO `password`(`id`, `account`, `password`) VALUES(#{id}, #{account}, #{password})")
    void insert(PasswordEntity passwordEntity);

    @Update("UPDATE `password` SET id=#{id}, account=#{account}, password=#{password} WHERE `id` = #{id}")
    void update(PasswordEntity passwordEntity);

    @Delete("DELETE FROM `password` WHERE `id` = #{id}")
    void delete(@Param("id") Integer id);

    @Insert("INSERT INTO `password`(`account`, `password`) VALUES(#{account}, #{password}) ON DUPLICATE KEY UPDATE `password` = #{password}")
    void insertAccPass(PasswordEntity passwordEntity);

    @Select("SELECT `id`, `account`, `password` FROM `password` WHERE `account` = #{account}")
    @Results({
            @Result(property = "id", column = "id"),
            @Result(property = "account", column = "account"),
            @Result(property = "password", column = "password")
    })
    PasswordEntity queryByAccount(@Param("account") String account);

    @Update("UPDATE `password` SET password=#{password} WHERE `account` = #{account}")
    void updatePassword(@Param("account") String id, @Param("password") String password);
}