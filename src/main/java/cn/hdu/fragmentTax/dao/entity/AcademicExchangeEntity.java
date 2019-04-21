package cn.hdu.fragmentTax.dao.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Timestamp;


@Entity
public class AcademicExchangeEntity implements Serializable {

@Id
@GeneratedValue
private Integer id;
@Column
private String stuId;
@Column
private String exchangeType;  // 交流类别
@Column
private String organization;
@Column
private String conferenceName;
@Column
private String startTime;
@Column
private String endTime;
@Column
private String level;  // 级别
@Column
private String result;
@Column
private String proofMaterialId;
@Column
private float score;
@Column
private Integer state;

public AcademicExchangeEntity(){}

public AcademicExchangeEntity(Integer id,String stuId,String exchangeType,String organization,String conferenceName,String startTime,String endTime,String level,String result,String proofMaterialId,float score,Integer state){
this.id = id;
this.stuId = stuId;
this.exchangeType = exchangeType;
this.organization = organization;
this.conferenceName = conferenceName;
this.startTime = startTime;
this.endTime = endTime;
this.level = level;
this.result = result;
this.proofMaterialId = proofMaterialId;
this.score = score;
this.state = state;
}

public Integer getId() {return id;}

public void setId(Integer id){this.id = id;}

public String getStuId() {return stuId;}

public void setStuId(String stuId){this.stuId = stuId;}

public String getExchangeType() {return exchangeType;}

public void setExchangeType(String exchangeType){this.exchangeType = exchangeType;}

public String getOrganization() {return organization;}

public void setOrganization(String organization){this.organization = organization;}

public String getConferenceName() {return conferenceName;}

public void setConferenceName(String conferenceName){this.conferenceName = conferenceName;}

public String getStartTime() {return startTime;}

public void setStartTime(String startTime){this.startTime = startTime;}

public String getEndTime() {return endTime;}

public void setEndTime(String endTime){this.endTime = endTime;}

public String getLevel() {return level;}

public void setLevel(String level){this.level = level;}

public String getResult() {return result;}

public void setResult(String result){this.result = result;}

public String getProofMaterialId() {return proofMaterialId;}

public void setProofMaterialId(String proofMaterialId){this.proofMaterialId = proofMaterialId;}

public float getScore() {return score;}

public void setScore(float score){this.score = score;}

public Integer getState() {return state;}

public void setState(Integer state){this.state = state;}

}