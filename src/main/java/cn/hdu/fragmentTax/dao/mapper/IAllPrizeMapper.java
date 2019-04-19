package cn.hdu.fragmentTax.dao.mapper;

import cn.hdu.fragmentTax.dao.entity.AllPrizeEntity;
import org.apache.ibatis.annotations.*;

import java.util.List;


@Mapper
public interface IAllPrizeMapper {
    @Select("SELECT `id`, `stu_id`, `honor_score`, `honor_num`, `paper_socre`, `paper_num`, `patent_score`, `patent_num`, `state`, `created_time`, `changed_time` FROM `all_prize`")
    @Results({
            @Result(property = "id", column = "id"),
            @Result(property = "stuId", column = "stu_id"),
            @Result(property = "honorScore", column = "honor_score"),
            @Result(property = "honorNum", column = "honor_num"),
            @Result(property = "paperSocre", column = "paper_socre"),
            @Result(property = "paperNum", column = "paper_num"),
            @Result(property = "patentScore", column = "patent_score"),
            @Result(property = "patentNum", column = "patent_num"),
            @Result(property = "state", column = "state"),
            @Result(property = "createdTime", column = "created_time"),
            @Result(property = "changedTime", column = "changed_time")
    })
    List<AllPrizeEntity> queryAll();

    @Select("SELECT `id`, `stu_id`, `honor_score`, `honor_num`, `paper_socre`, `paper_num`, `patent_score`, `patent_num`, `state`, `created_time`, `changed_time` FROM `all_prize` WHERE `id` = #{id}")
    @Results({
            @Result(property = "id", column = "id"),
            @Result(property = "stuId", column = "stu_id"),
            @Result(property = "honorScore", column = "honor_score"),
            @Result(property = "honorNum", column = "honor_num"),
            @Result(property = "paperSocre", column = "paper_socre"),
            @Result(property = "paperNum", column = "paper_num"),
            @Result(property = "patentScore", column = "patent_score"),
            @Result(property = "patentNum", column = "patent_num"),
            @Result(property = "state", column = "state"),
            @Result(property = "createdTime", column = "created_time"),
            @Result(property = "changedTime", column = "changed_time")
    })
    AllPrizeEntity queryByKey(@Param("id") Integer id);

    @Insert("INSERT INTO `all_prize`(`id`, `stu_id`, `honor_score`, `honor_num`, `paper_socre`, `paper_num`, `patent_score`, `patent_num`, `state`, `created_time`, `changed_time`) VALUES(#{id}, #{stuId}, #{honorScore}, #{honorNum}, #{paperSocre}, #{paperNum}, #{patentScore}, #{patentNum}, #{state}, #{createdTime}, #{changedTime})")
    void insert(AllPrizeEntity all_prizeEntity);

    @Update("UPDATE `all_prize` SET id=#{id}, stu_id=#{stuId}, honor_score=#{honorScore}, honor_num=#{honorNum}, paper_socre=#{paperSocre}, paper_num=#{paperNum}, patent_score=#{patentScore}, patent_num=#{patentNum}, state=#{state}, created_time=#{createdTime}, changed_time=#{changedTime} WHERE `id` = #{id}")
    void update(AllPrizeEntity all_prizeEntity);

    @Delete("DELETE FROM `all_prize` WHERE `id` = #{id}")
    void delete(@Param("id") Integer id);

    @Select("SELECT `id`, `stu_id`, `honor_score`, `honor_num`, `paper_socre`, `paper_num`, `patent_score`, `patent_num`, `state`, `created_time`, `changed_time` FROM `all_prize` WHERE `stu_id` = #{stuId}")
    @Results({
            @Result(property = "id", column = "id"),
            @Result(property = "stuId", column = "stu_id"),
            @Result(property = "honorScore", column = "honor_score"),
            @Result(property = "honorNum", column = "honor_num"),
            @Result(property = "paperSocre", column = "paper_socre"),
            @Result(property = "paperNum", column = "paper_num"),
            @Result(property = "patentScore", column = "patent_score"),
            @Result(property = "patentNum", column = "patent_num"),
            @Result(property = "state", column = "state"),
            @Result(property = "createdTime", column = "created_time"),
            @Result(property = "changedTime", column = "changed_time")
    })
    AllPrizeEntity queryByStuId(@Param("stuId") String stuId);

    @Insert("INSERT INTO `all_prize`(`stu_id`, `created_time`) VALUES(#{stuId}, #{createdTime}) ON DUPLICATE KEY UPDATE `created_time` = #{createdTime}")
    void insertFirst(@Param("stuId") String stuId, @Param("createdTime") String currentDatetime);

    @Update("UPDATE `all_prize` SET honor_score=#{honorScore} WHERE `stu_id` = #{stuId}")
    void updateHonorScore(@Param("stuId") String stuId, @Param("honorScore") Float allHonorScore);

    @Select("SELECT `id`, `stu_id`, `honor_score`, `honor_num`, `paper_socre`, `paper_num`, `patent_score`, `patent_num`, `state`, `created_time`, `changed_time` FROM `all_prize` order by `honor_score` DESC")
    @Results({
            @Result(property = "id", column = "id"),
            @Result(property = "stuId", column = "stu_id"),
            @Result(property = "honorScore", column = "honor_score"),
            @Result(property = "honorNum", column = "honor_num"),
            @Result(property = "paperSocre", column = "paper_socre"),
            @Result(property = "paperNum", column = "paper_num"),
            @Result(property = "patentScore", column = "patent_score"),
            @Result(property = "patentNum", column = "patent_num"),
            @Result(property = "state", column = "state"),
            @Result(property = "createdTime", column = "created_time"),
            @Result(property = "changedTime", column = "changed_time")
    })
    List<AllPrizeEntity> orderByHonor();

    @Update("UPDATE `all_prize` SET honor_num=#{honorNum} WHERE `id` = #{id}")
    void updateHonorNum(@Param("id") Integer id, @Param("honorNum") Integer order);

//    @Select("select `rowno` from (select `stu_id`, `honor_score`,(@rowno:=@rowno+1) as `rowno` from `all_prize` ,(select (@rowno:=0)) b order by honor_score desc) c where stu_id=\"15200122\";")
//    @Results({
//            @Result(property = "rowno", column = "rowno"),
//    })
//    Integer orderHonor(@Param("stuId") Integer stuId);
}