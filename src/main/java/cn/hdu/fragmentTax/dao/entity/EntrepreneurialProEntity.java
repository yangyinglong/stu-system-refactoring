package cn.hdu.fragmentTax.dao.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Timestamp;


@Entity
public class EntrepreneurialProEntity implements Serializable {

@Id
@GeneratedValue
private Integer id;
@Column
private String stuId;
@Column
private String proType;
@Column
private String proName;
@Column
private Integer ranking;
@Column
private Integer totalNumber;
@Column
private String proState;
@Column
private String proLevel;
@Column
private String proResult;
@Column
private float score;
@Column
private String teacher;
@Column
private String proofMaterialId;
@Column
private Integer state;
@Column
private String createdTime;

public EntrepreneurialProEntity(){}

public EntrepreneurialProEntity(Integer id,String stuId,String proType,String proName,Integer ranking,Integer totalNumber,String proState,String proLevel,String proResult,float score,String teacher,String proofMaterialId,Integer state,String createdTime){
this.id = id;
this.stuId = stuId;
this.proType = proType;
this.proName = proName;
this.ranking = ranking;
this.totalNumber = totalNumber;
this.proState = proState;
this.proLevel = proLevel;
this.proResult = proResult;
this.score = score;
this.teacher = teacher;
this.proofMaterialId = proofMaterialId;
this.state = state;
this.createdTime = createdTime;
}

public Integer getId() {return id;}

public void setId(Integer id){this.id = id;}

public String getStuId() {return stuId;}

public void setStuId(String stuId){this.stuId = stuId;}

public String getProType() {return proType;}

public void setProType(String proType){this.proType = proType;}

public String getProName() {return proName;}

public void setProName(String proName){this.proName = proName;}

public Integer getRanking() {return ranking;}

public void setRanking(Integer ranking){this.ranking = ranking;}

public Integer getTotalNumber() {return totalNumber;}

public void setTotalNumber(Integer totalNumber){this.totalNumber = totalNumber;}

public String getProState() {return proState;}

public void setProState(String proState){this.proState = proState;}

public String getProLevel() {return proLevel;}

public void setProLevel(String proLevel){this.proLevel = proLevel;}

public String getProResult() {return proResult;}

public void setProResult(String proResult){this.proResult = proResult;}

public float getScore() {return score;}

public void setScore(float score){this.score = score;}

public String getTeacher() {return teacher;}

public void setTeacher(String teacher){this.teacher = teacher;}

public String getProofMaterialId() {return proofMaterialId;}

public void setProofMaterialId(String proofMaterialId){this.proofMaterialId = proofMaterialId;}

public Integer getState() {return state;}

public void setState(Integer state){this.state = state;}

public String getCreatedTime() {return createdTime;}

public void setCreatedTime(String createdTime){this.createdTime = createdTime;}

}