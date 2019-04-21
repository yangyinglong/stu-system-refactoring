package cn.hdu.fragmentTax.dao.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Timestamp;


@Entity
public class EngineeringProEntity implements Serializable {

@Id
@GeneratedValue
private Integer id;
@Column
private String stuId;
@Column
private String proName;
@Column
private String proIntr;  // 简介
@Column
private String performance;  // 性能指标
@Column
private String work;  // 个人所做工作
@Column
private Integer ranking;
@Column
private Integer totalNumber;
@Column
private String proState;
@Column
private String enterpriseName;
@Column
private String enterpriseTeacher;
@Column
private String teacher;
@Column
private String proofMaterialId;
@Column
private float score;
@Column
private Integer state;
@Column
private String createdTime;

public EngineeringProEntity(){}

public EngineeringProEntity(Integer id,String stuId,String proName,String proIntr,String performance,String work,Integer ranking,Integer totalNumber,String proState,String enterpriseName,String enterpriseTeacher,String teacher,String proofMaterialId,float score,Integer state,String createdTime){
this.id = id;
this.stuId = stuId;
this.proName = proName;
this.proIntr = proIntr;
this.performance = performance;
this.work = work;
this.ranking = ranking;
this.totalNumber = totalNumber;
this.proState = proState;
this.enterpriseName = enterpriseName;
this.enterpriseTeacher = enterpriseTeacher;
this.teacher = teacher;
this.proofMaterialId = proofMaterialId;
this.score = score;
this.state = state;
this.createdTime = createdTime;
}

public Integer getId() {return id;}

public void setId(Integer id){this.id = id;}

public String getStuId() {return stuId;}

public void setStuId(String stuId){this.stuId = stuId;}

public String getProName() {return proName;}

public void setProName(String proName){this.proName = proName;}

public String getProIntr() {return proIntr;}

public void setProIntr(String proIntr){this.proIntr = proIntr;}

public String getPerformance() {return performance;}

public void setPerformance(String performance){this.performance = performance;}

public String getWork() {return work;}

public void setWork(String work){this.work = work;}

public Integer getRanking() {return ranking;}

public void setRanking(Integer ranking){this.ranking = ranking;}

public Integer getTotalNumber() {return totalNumber;}

public void setTotalNumber(Integer totalNumber){this.totalNumber = totalNumber;}

public String getProState() {return proState;}

public void setProState(String proState){this.proState = proState;}

public String getEnterpriseName() {return enterpriseName;}

public void setEnterpriseName(String enterpriseName){this.enterpriseName = enterpriseName;}

public String getEnterpriseTeacher() {return enterpriseTeacher;}

public void setEnterpriseTeacher(String enterpriseTeacher){this.enterpriseTeacher = enterpriseTeacher;}

public String getTeacher() {return teacher;}

public void setTeacher(String teacher){this.teacher = teacher;}

public String getProofMaterialId() {return proofMaterialId;}

public void setProofMaterialId(String proofMaterialId){this.proofMaterialId = proofMaterialId;}

public float getScore() {return score;}

public void setScore(float score){this.score = score;}

public Integer getState() {return state;}

public void setState(Integer state){this.state = state;}

public String getCreatedTime() {return createdTime;}

public void setCreatedTime(String createdTime){this.createdTime = createdTime;}

}