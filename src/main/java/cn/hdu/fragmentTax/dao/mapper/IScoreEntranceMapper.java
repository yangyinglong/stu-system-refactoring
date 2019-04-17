package cn.hdu.fragmentTax.dao.mapper;

import cn.hdu.fragmentTax.dao.entity.ScoreEntranceEntity;
import cn.hdu.fragmentTax.dao.entity.StuBaseEntity;
import org.apache.ibatis.annotations.*;

import java.util.List;


@Mapper
public interface IScoreEntranceMapper {
    @Select("SELECT `id`, `stu_id`, `english`, `political`, `math`, `specialized`, `state`, `created_time`, `changed_time` FROM `score_entrance`")
    @Results({
            @Result(property = "id", column = "id"),
            @Result(property = "stuId", column = "stu_id"),
            @Result(property = "english", column = "english"),
            @Result(property = "political", column = "political"),
            @Result(property = "math", column = "math"),
            @Result(property = "specialized", column = "specialized"),
            @Result(property = "state", column = "state"),
            @Result(property = "createdTime", column = "created_time"),
            @Result(property = "changedTime", column = "changed_time")
    })
    List<ScoreEntranceEntity> queryAll();

    @Select("SELECT `id`, `stu_id`, `english`, `political`, `math`, `specialized`, `state`, `created_time`, `changed_time` FROM `score_entrance` WHERE `id` = #{id}")
    @Results({
            @Result(property = "id", column = "id"),
            @Result(property = "stuId", column = "stu_id"),
            @Result(property = "english", column = "english"),
            @Result(property = "political", column = "political"),
            @Result(property = "math", column = "math"),
            @Result(property = "specialized", column = "specialized"),
            @Result(property = "state", column = "state"),
            @Result(property = "createdTime", column = "created_time"),
            @Result(property = "changedTime", column = "changed_time")
    })
    ScoreEntranceEntity queryByKey(@Param("id") Integer id);

    @Insert("INSERT INTO `score_entrance`(`id`, `stu_id`, `english`, `political`, `math`, `specialized`, `state`, `created_time`, `changed_time`) VALUES(#{id}, #{stuId}, #{english}, #{political}, #{math}, #{specialized}, #{state}, #{createdTime}, #{changedTime})")
    void insert(ScoreEntranceEntity score_entranceEntity);

    @Update("UPDATE `score_entrance` SET id=#{id}, stu_id=#{stuId}, english=#{english}, political=#{political}, math=#{math}, specialized=#{specialized}, state=#{state}, created_time=#{createdTime}, changed_time=#{changedTime} WHERE `id` = #{id}")
    void update(ScoreEntranceEntity score_entranceEntity);

    @Delete("DELETE FROM `score_entrance` WHERE `id` = #{id}")
    void delete(@Param("id") Integer id);

    @Insert("INSERT INTO `score_entrance`(`stu_id`, `english`, `political`, `math`, `specialized`, `created_time`) VALUES(#{stuId}, #{english}, #{political}, #{math}, #{specialized}, #{createdTime}) ON DUPLICATE KEY UPDATE `english` = #{english}, `political` = #{political}, `math` = #{math}, `specialized` = #{specialized}")
    void insertScore(ScoreEntranceEntity scoreEntranceEntity);

    @Select("SELECT `id`, `stu_id`, `english`, `political`, `math`, `specialized`, `state`, `created_time`, `changed_time` FROM `score_entrance` WHERE `stu_id` = #{stuId}")
    @Results({
            @Result(property = "id", column = "id"),
            @Result(property = "stuId", column = "stu_id"),
            @Result(property = "english", column = "english"),
            @Result(property = "political", column = "political"),
            @Result(property = "math", column = "math"),
            @Result(property = "specialized", column = "specialized"),
            @Result(property = "state", column = "state"),
            @Result(property = "createdTime", column = "created_time"),
            @Result(property = "changedTime", column = "changed_time")
    })
    ScoreEntranceEntity queryByStuId(@Param("stuId") String stuId);
}