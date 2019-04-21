package cn.hdu.fragmentTax.dao.mapper;

import cn.hdu.fragmentTax.dao.entity.MasterPaperEntity;
import org.apache.ibatis.annotations.*;
import java.util.List;


@Mapper
public interface IMasterPaperMapper {
@Select("SELECT `id`, `stu_id`, `paper_name`, `paper_abstract`, `score1`, `sugg1`, `score2`, `sugg2`, `score3`, `sugg3`, `score`, `state`, `created_time` FROM `master_paper`")
@Results({
@Result(property = "id", column = "id"), 
@Result(property = "stuId", column = "stu_id"), 
@Result(property = "paperName", column = "paper_name"), 
@Result(property = "paperAbstract", column = "paper_abstract"), 
@Result(property = "score1", column = "score1"), 
@Result(property = "sugg1", column = "sugg1"), 
@Result(property = "score2", column = "score2"), 
@Result(property = "sugg2", column = "sugg2"), 
@Result(property = "score3", column = "score3"), 
@Result(property = "sugg3", column = "sugg3"), 
@Result(property = "score", column = "score"), 
@Result(property = "state", column = "state"), 
@Result(property = "createdTime", column = "created_time")
})
List<MasterPaperEntity> queryAll();
@Select("SELECT `id`, `stu_id`, `paper_name`, `paper_abstract`, `score1`, `sugg1`, `score2`, `sugg2`, `score3`, `sugg3`, `score`, `state`, `created_time` FROM `master_paper` WHERE `id` = #{id}")
@Results({
@Result(property = "id", column = "id"), 
@Result(property = "stuId", column = "stu_id"), 
@Result(property = "paperName", column = "paper_name"), 
@Result(property = "paperAbstract", column = "paper_abstract"), 
@Result(property = "score1", column = "score1"), 
@Result(property = "sugg1", column = "sugg1"), 
@Result(property = "score2", column = "score2"), 
@Result(property = "sugg2", column = "sugg2"), 
@Result(property = "score3", column = "score3"), 
@Result(property = "sugg3", column = "sugg3"), 
@Result(property = "score", column = "score"), 
@Result(property = "state", column = "state"), 
@Result(property = "createdTime", column = "created_time")
})
MasterPaperEntity queryByKey(@Param("id") Integer id);

@Insert("INSERT INTO `master_paper`(`id`, `stu_id`, `paper_name`, `paper_abstract`, `score1`, `sugg1`, `score2`, `sugg2`, `score3`, `sugg3`, `score`, `state`, `created_time`) VALUES(#{id}, #{stuId}, #{paperName}, #{paperAbstract}, #{score1}, #{sugg1}, #{score2}, #{sugg2}, #{score3}, #{sugg3}, #{score}, #{state}, #{createdTime})")
void insert(MasterPaperEntity master_paperEntity);

@Update("UPDATE `master_paper` SET id=#{id}, stu_id=#{stuId}, paper_name=#{paperName}, paper_abstract=#{paperAbstract}, score1=#{score1}, sugg1=#{sugg1}, score2=#{score2}, sugg2=#{sugg2}, score3=#{score3}, sugg3=#{sugg3}, score=#{score}, state=#{state}, created_time=#{createdTime} WHERE `id` = #{id}")
void update(MasterPaperEntity master_paperEntity);

@Delete("DELETE FROM `master_paper` WHERE `id` = #{id}")
void delete(@Param("id") Integer id);

}