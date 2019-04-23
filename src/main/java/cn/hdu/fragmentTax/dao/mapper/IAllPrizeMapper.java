package cn.hdu.fragmentTax.dao.mapper;

import cn.hdu.fragmentTax.dao.entity.AllPrizeEntity;
import org.apache.ibatis.annotations.*;

import java.util.List;


@Mapper
public interface IAllPrizeMapper {
    @Select("SELECT `id`, `stu_id`, `honor_score`, `honor_num`, `paper_socre`, `paper_num`, `patent_score`, `patent_num`, `state`, `created_time`, `changed_time`, `competition_score`, `competition_num`, `engi_score`, `engi_num`, `entr_score`, `entr_num`, `inno_score`, `inno_num`, `exch_score`, `exch_num`, `work_score`, `work_num`, `master_score`, `master_num`, `all_score`, `all_num`, `total_count` FROM `all_prize`")
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
            @Result(property = "changedTime", column = "changed_time"),
            @Result(property = "competitionScore", column = "competition_score"),
            @Result(property = "competitionNum", column = "competition_num"),
            @Result(property = "engiScore", column = "engi_score"),
            @Result(property = "engiNum", column = "engi_num"),
            @Result(property = "entrScore", column = "entr_score"),
            @Result(property = "entrNum", column = "entr_num"),
            @Result(property = "innoScore", column = "inno_score"),
            @Result(property = "innoNum", column = "inno_num"),
            @Result(property = "exchScore", column = "exch_score"),
            @Result(property = "exchNum", column = "exch_num"),
            @Result(property = "workScore", column = "work_score"),
            @Result(property = "workNum", column = "work_num"),
            @Result(property = "masterScore", column = "master_score"),
            @Result(property = "masterNum", column = "master_num"),
            @Result(property = "allScore", column = "all_score"),
            @Result(property = "allNum", column = "all_num"),
            @Result(property = "totalCount", column = "total_count")
    })
    List<AllPrizeEntity> queryAll();

    @Select("SELECT `id`, `stu_id`, `honor_score`, `honor_num`, `paper_socre`, `paper_num`, `patent_score`, `patent_num`, `state`, `created_time`, `changed_time`, `competition_score`, `competition_num`, `engi_score`, `engi_num`, `entr_score`, `entr_num`, `inno_score`, `inno_num`, `exch_score`, `exch_num`, `work_score`, `work_num`, `master_score`, `master_num`, `all_score`, `all_num`, `total_count` FROM `all_prize` WHERE `id` = #{id}")
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
            @Result(property = "changedTime", column = "changed_time"),
            @Result(property = "competitionScore", column = "competition_score"),
            @Result(property = "competitionNum", column = "competition_num"),
            @Result(property = "engiScore", column = "engi_score"),
            @Result(property = "engiNum", column = "engi_num"),
            @Result(property = "entrScore", column = "entr_score"),
            @Result(property = "entrNum", column = "entr_num"),
            @Result(property = "innoScore", column = "inno_score"),
            @Result(property = "innoNum", column = "inno_num"),
            @Result(property = "exchScore", column = "exch_score"),
            @Result(property = "exchNum", column = "exch_num"),
            @Result(property = "workScore", column = "work_score"),
            @Result(property = "workNum", column = "work_num"),
            @Result(property = "masterScore", column = "master_score"),
            @Result(property = "masterNum", column = "master_num"),
            @Result(property = "allScore", column = "all_score"),
            @Result(property = "allNum", column = "all_num"),
            @Result(property = "totalCount", column = "total_count")
    })
    AllPrizeEntity queryByKey(@Param("id") Integer id);

    @Insert("INSERT INTO `all_prize`(`id`, `stu_id`, `honor_score`, `honor_num`, `paper_socre`, `paper_num`, `patent_score`, `patent_num`, `state`, `created_time`, `changed_time`, `competition_score`, `competition_num`, `engi_score`, `engi_num`, `entr_score`, `entr_num`, `inno_score`, `inno_num`, `exch_score`, `exch_num`, `work_score`, `work_num`, `master_score`, `master_num`, `all_score`, `all_num`, `total_count`) VALUES(#{id}, #{stuId}, #{honorScore}, #{honorNum}, #{paperSocre}, #{paperNum}, #{patentScore}, #{patentNum}, #{state}, #{createdTime}, #{changedTime}, #{competitionScore}, #{competitionNum}, #{engiScore}, #{engiNum}, #{entrScore}, #{entrNum}, #{innoScore}, #{innoNum}, #{exchScore}, #{exchNum}, #{workScore}, #{workNum}, #{masterScore}, #{masterNum}, #{allScore}, #{allNum}, #{totalCount})")
    void insert(AllPrizeEntity all_prizeEntity);

    @Update("UPDATE `all_prize` SET id=#{id}, stu_id=#{stuId}, honor_score=#{honorScore}, honor_num=#{honorNum}, paper_socre=#{paperSocre}, paper_num=#{paperNum}, patent_score=#{patentScore}, patent_num=#{patentNum}, state=#{state}, created_time=#{createdTime}, changed_time=#{changedTime}, competition_score=#{competitionScore}, competition_num=#{competitionNum}, engi_score=#{engiScore}, engi_num=#{engiNum}, entr_score=#{entrScore}, entr_num=#{entrNum}, inno_score=#{innoScore}, inno_num=#{innoNum}, exch_score=#{exchScore}, exch_num=#{exchNum}, work_score=#{workScore}, work_num=#{workNum}, master_score=#{masterScore}, master_num=#{masterNum}, all_score=#{allScore}, all_num=#{allNum}, total_count=#{totalCount} WHERE `id` = #{id}")
    void update(AllPrizeEntity all_prizeEntity);

    @Delete("DELETE FROM `all_prize` WHERE `id` = #{id}")
    void delete(@Param("id") Integer id);



    @Select("SELECT `id`, `stu_id`, `honor_score`, `honor_num`, `paper_socre`, `paper_num`, `patent_score`, `patent_num`, `state`, `created_time`, `changed_time`, `competition_score`, `competition_num`, `engi_score`, `engi_num`, `entr_score`, `entr_num`, `inno_score`, `inno_num`, `exch_score`, `exch_num`, `work_score`, `work_num`, `master_score`, `master_num`, `all_score`, `all_num`, `total_count` FROM `all_prize` WHERE `stu_id` = #{stuId}")
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
            @Result(property = "changedTime", column = "changed_time"),
            @Result(property = "competitionScore", column = "competition_score"),
            @Result(property = "competitionNum", column = "competition_num"),
            @Result(property = "engiScore", column = "engi_score"),
            @Result(property = "engiNum", column = "engi_num"),
            @Result(property = "entrScore", column = "entr_score"),
            @Result(property = "entrNum", column = "entr_num"),
            @Result(property = "innoScore", column = "inno_score"),
            @Result(property = "innoNum", column = "inno_num"),
            @Result(property = "exchScore", column = "exch_score"),
            @Result(property = "exchNum", column = "exch_num"),
            @Result(property = "workScore", column = "work_score"),
            @Result(property = "workNum", column = "work_num"),
            @Result(property = "masterScore", column = "master_score"),
            @Result(property = "masterNum", column = "master_num"),
            @Result(property = "allScore", column = "all_score"),
            @Result(property = "allNum", column = "all_num"),
            @Result(property = "totalCount", column = "total_count")
    })
    AllPrizeEntity queryByStuId(@Param("stuId") String stuId);

    @Insert("INSERT INTO `all_prize`(`stu_id`, `created_time`) VALUES(#{stuId}, #{createdTime}) ON DUPLICATE KEY UPDATE `created_time` = #{createdTime}")
    void insertFirst(@Param("stuId") String stuId, @Param("createdTime") String currentDatetime);

    @Update("UPDATE `all_prize` SET honor_score=#{honorScore} WHERE `stu_id` = #{stuId}")
    void updateHonorScore(@Param("stuId") String stuId, @Param("honorScore") Float allHonorScore);

    @Select("SELECT `id`, `stu_id`, `honor_score`, `honor_num`, `paper_socre`, `paper_num`, `patent_score`, `patent_num`, `state`, `created_time`, `changed_time`, `competition_score`, `competition_num`, `engi_score`, `engi_num`, `entr_score`, `entr_num`, `inno_score`, `inno_num`, `exch_score`, `exch_num`, `work_score`, `work_num`, `master_score`, `master_num`, `all_score`, `all_num`, `total_count` FROM `all_prize` order by `honor_score` DESC")
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
            @Result(property = "changedTime", column = "changed_time"),
            @Result(property = "competitionScore", column = "competition_score"),
            @Result(property = "competitionNum", column = "competition_num"),
            @Result(property = "engiScore", column = "engi_score"),
            @Result(property = "engiNum", column = "engi_num"),
            @Result(property = "entrScore", column = "entr_score"),
            @Result(property = "entrNum", column = "entr_num"),
            @Result(property = "innoScore", column = "inno_score"),
            @Result(property = "innoNum", column = "inno_num"),
            @Result(property = "exchScore", column = "exch_score"),
            @Result(property = "exchNum", column = "exch_num"),
            @Result(property = "workScore", column = "work_score"),
            @Result(property = "workNum", column = "work_num"),
            @Result(property = "masterScore", column = "master_score"),
            @Result(property = "masterNum", column = "master_num"),
            @Result(property = "allScore", column = "all_score"),
            @Result(property = "allNum", column = "all_num"),
            @Result(property = "totalCount", column = "total_count")
    })
    List<AllPrizeEntity> orderByHonor();

    @Update("UPDATE `all_prize` SET honor_num=#{honorNum} WHERE `id` = #{id}")
    void updateHonorNum(@Param("id") Integer id, @Param("honorNum") Integer order);

    @Update("UPDATE `all_prize` SET paper_socre=#{paperScore} WHERE `stu_id` = #{stuId}")
    void updatePaperScore(@Param("stuId") String stuId, @Param("paperScore") Float allPaperScore);

    @Select("SELECT `id`, `stu_id`, `honor_score`, `honor_num`, `paper_socre`, `paper_num`, `patent_score`, `patent_num`, `state`, `created_time`, `changed_time`, `competition_score`, `competition_num`, `engi_score`, `engi_num`, `entr_score`, `entr_num`, `inno_score`, `inno_num`, `exch_score`, `exch_num`, `work_score`, `work_num`, `master_score`, `master_num`, `all_score`, `all_num`, `total_count` FROM `all_prize` order by `paper_socre` DESC")
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
            @Result(property = "changedTime", column = "changed_time"),
            @Result(property = "competitionScore", column = "competition_score"),
            @Result(property = "competitionNum", column = "competition_num"),
            @Result(property = "engiScore", column = "engi_score"),
            @Result(property = "engiNum", column = "engi_num"),
            @Result(property = "entrScore", column = "entr_score"),
            @Result(property = "entrNum", column = "entr_num"),
            @Result(property = "innoScore", column = "inno_score"),
            @Result(property = "innoNum", column = "inno_num"),
            @Result(property = "exchScore", column = "exch_score"),
            @Result(property = "exchNum", column = "exch_num"),
            @Result(property = "workScore", column = "work_score"),
            @Result(property = "workNum", column = "work_num"),
            @Result(property = "masterScore", column = "master_score"),
            @Result(property = "masterNum", column = "master_num"),
            @Result(property = "allScore", column = "all_score"),
            @Result(property = "allNum", column = "all_num"),
            @Result(property = "totalCount", column = "total_count")
    })
    List<AllPrizeEntity> orderByPaper();

    @Update("UPDATE `all_prize` SET paper_num=#{paperNum} WHERE `id` = #{id}")
    void updatePaperNum(@Param("id") Integer id, @Param("paperNum") Integer order);
}