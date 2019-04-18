package cn.hdu.fragmentTax.dao.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Timestamp;


@Entity
public class PatentEntity implements Serializable {

@Id
@GeneratedValue
private Integer id;
@Column
private String stuId;
@Column
private Integer patentType;  // 专利类型：1-实用新型专利,2-发明专利
@Column
private String patentName;  // 专利名称
@Column
private Integer patentState;  // 专利状态：1-申请,2-受理,3-审查中,4-一审,5-二审,6-三审,7-授权
@Column
private String proofMaterialId;  // 佐证材料的名称
@Column
private Integer ranking;
@Column
private Integer totalNumber;
@Column
private float score;  // 得分
@Column
private Integer state;  // 审核状态，0-以驳回，1-待审核，2-已通过
@Column
private String createdTime;
@Column
private String changedTime;

public PatentEntity(){}

public PatentEntity(Integer id,String stuId,Integer patentType,String patentName,Integer patentState,String proofMaterialId,Integer ranking,Integer totalNumber,float score,Integer state,String createdTime,String changedTime){
this.id = id;
this.stuId = stuId;
this.patentType = patentType;
this.patentName = patentName;
this.patentState = patentState;
this.proofMaterialId = proofMaterialId;
this.ranking = ranking;
this.totalNumber = totalNumber;
this.score = score;
this.state = state;
this.createdTime = createdTime;
this.changedTime = changedTime;
}

public Integer getId() {return id;}

public void setId(Integer id){this.id = id;}

public String getStuId() {return stuId;}

public void setStuId(String stuId){this.stuId = stuId;}

public Integer getPatentType() {return patentType;}

public void setPatentType(Integer patentType){this.patentType = patentType;}

public String getPatentName() {return patentName;}

public void setPatentName(String patentName){this.patentName = patentName;}

public Integer getPatentState() {return patentState;}

public void setPatentState(Integer patentState){this.patentState = patentState;}

public String getProofMaterialId() {return proofMaterialId;}

public void setProofMaterialId(String proofMaterialId){this.proofMaterialId = proofMaterialId;}

public Integer getRanking() {return ranking;}

public void setRanking(Integer ranking){this.ranking = ranking;}

public Integer getTotalNumber() {return totalNumber;}

public void setTotalNumber(Integer totalNumber){this.totalNumber = totalNumber;}

public float getScore() {return score;}

public void setScore(float score){this.score = score;}

public Integer getState() {return state;}

public void setState(Integer state){this.state = state;}

public String getCreatedTime() {return createdTime;}

public void setCreatedTime(String createdTime){this.createdTime = createdTime;}

public String getChangedTime() {return changedTime;}

public void setChangedTime(String changedTime){this.changedTime = changedTime;}

}