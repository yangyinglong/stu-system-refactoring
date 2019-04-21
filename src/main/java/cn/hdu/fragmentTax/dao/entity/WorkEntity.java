package cn.hdu.fragmentTax.dao.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Timestamp;


@Entity
public class WorkEntity implements Serializable {

@Id
@GeneratedValue
private Integer id;
@Column
private String stuId;
@Column
private String companyName;
@Column
private String companyType;
@Column
private String workType;
@Column
private float score;
@Column
private Integer state;
@Column
private String createdTime;

public WorkEntity(){}

public WorkEntity(Integer id,String stuId,String companyName,String companyType,String workType,float score,Integer state,String createdTime){
this.id = id;
this.stuId = stuId;
this.companyName = companyName;
this.companyType = companyType;
this.workType = workType;
this.score = score;
this.state = state;
this.createdTime = createdTime;
}

public Integer getId() {return id;}

public void setId(Integer id){this.id = id;}

public String getStuId() {return stuId;}

public void setStuId(String stuId){this.stuId = stuId;}

public String getCompanyName() {return companyName;}

public void setCompanyName(String companyName){this.companyName = companyName;}

public String getCompanyType() {return companyType;}

public void setCompanyType(String companyType){this.companyType = companyType;}

public String getWorkType() {return workType;}

public void setWorkType(String workType){this.workType = workType;}

public float getScore() {return score;}

public void setScore(float score){this.score = score;}

public Integer getState() {return state;}

public void setState(Integer state){this.state = state;}

public String getCreatedTime() {return createdTime;}

public void setCreatedTime(String createdTime){this.createdTime = createdTime;}

}