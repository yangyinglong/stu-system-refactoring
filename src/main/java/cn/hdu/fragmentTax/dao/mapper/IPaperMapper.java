package cn.hdu.fragmentTax.dao.mapper;

import cn.hdu.fragmentTax.dao.entity.PaperEntity;
import org.apache.ibatis.annotations.*;

import java.util.List;


@Mapper
public interface IPaperMapper {
    @Select("SELECT `id`, `stu_id`, `paper_grade`, `paper_title`, `journal_title`, `ranking`, `total_number`, `paper_state`, `proof_material_id`, `score`, `state`, `created_time`, `changed_time` FROM `paper`")
    @Results({
            @Result(property = "id", column = "id"),
            @Result(property = "stuId", column = "stu_id"),
            @Result(property = "paperGrade", column = "paper_grade"),
            @Result(property = "paperTitle", column = "paper_title"),
            @Result(property = "journalTitle", column = "journal_title"),
            @Result(property = "ranking", column = "ranking"),
            @Result(property = "totalNumber", column = "total_number"),
            @Result(property = "paperState", column = "paper_state"),
            @Result(property = "proofMaterialId", column = "proof_material_id"),
            @Result(property = "score", column = "score"),
            @Result(property = "state", column = "state"),
            @Result(property = "createdTime", column = "created_time"),
            @Result(property = "changedTime", column = "changed_time")
    })
    List<PaperEntity> queryAll();

    @Select("SELECT `id`, `stu_id`, `paper_grade`, `paper_title`, `journal_title`, `ranking`, `total_number`, `paper_state`, `proof_material_id`, `score`, `state`, `created_time`, `changed_time` FROM `paper` WHERE `id` = #{id}")
    @Results({
            @Result(property = "id", column = "id"),
            @Result(property = "stuId", column = "stu_id"),
            @Result(property = "paperGrade", column = "paper_grade"),
            @Result(property = "paperTitle", column = "paper_title"),
            @Result(property = "journalTitle", column = "journal_title"),
            @Result(property = "ranking", column = "ranking"),
            @Result(property = "totalNumber", column = "total_number"),
            @Result(property = "paperState", column = "paper_state"),
            @Result(property = "proofMaterialId", column = "proof_material_id"),
            @Result(property = "score", column = "score"),
            @Result(property = "state", column = "state"),
            @Result(property = "createdTime", column = "created_time"),
            @Result(property = "changedTime", column = "changed_time")
    })
    PaperEntity queryByKey(@Param("id") Integer id);

    @Insert("INSERT INTO `paper`(`stu_id`, `paper_grade`, `paper_title`, `journal_title`, `ranking`, `total_number`, `paper_state`, `score`, `state`, `created_time`, `proof_material_id`) VALUES(#{stuId}, #{paperGrade}, #{paperTitle}, #{journalTitle}, #{ranking}, #{totalNumber}, #{paperState}, #{score}, #{state}, #{createdTime}, #{proofMaterialId})")
    void insert(PaperEntity paperEntity);

    @Update("UPDATE `paper` SET stu_id=#{stuId}, paper_grade=#{paperGrade}, paper_title=#{paperTitle}, journal_title=#{journalTitle}, ranking=#{ranking}, total_number=#{totalNumber}, paper_state=#{paperState}, score=#{score}, state=#{state}, proof_material_id=#{proofMaterialId} WHERE `id` = #{id}")
    void update(PaperEntity paperEntity);

    @Delete("DELETE FROM `paper` WHERE `id` = #{id}")
    void delete(@Param("id") Integer id);

    @Select("SELECT `id`, `stu_id`, `paper_grade`, `paper_title`, `journal_title`, `ranking`, `total_number`, `paper_state`, `proof_material_id`, `score`, `state`, `created_time`, `changed_time` FROM `paper` where `stu_id` = #{stuId}")
    @Results({
            @Result(property = "id", column = "id"),
            @Result(property = "stuId", column = "stu_id"),
            @Result(property = "paperGrade", column = "paper_grade"),
            @Result(property = "paperTitle", column = "paper_title"),
            @Result(property = "journalTitle", column = "journal_title"),
            @Result(property = "ranking", column = "ranking"),
            @Result(property = "totalNumber", column = "total_number"),
            @Result(property = "paperState", column = "paper_state"),
            @Result(property = "proofMaterialId", column = "proof_material_id"),
            @Result(property = "score", column = "score"),
            @Result(property = "state", column = "state"),
            @Result(property = "createdTime", column = "created_time"),
            @Result(property = "changedTime", column = "changed_time")
    })
    List<PaperEntity> queryStuId(@Param("stuId") String stuId);
}