package cn.hdu.fragmentTax.dao.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Timestamp;


@Entity
public class EvaluationTutorEntity implements Serializable {

@Id
@GeneratedValue
private Integer id;
@Column
private String stuId;
@Column
private float attendance;  // 出勤0-10
@Column
private float autoLearn;  // 自主学习能力0-30
@Column
private float autoScientific;  // 自主科研能力
@Column
private float scientificManag;  // 科研管理能力0-30
@Column
private float tutorScore;

public EvaluationTutorEntity(){}

public EvaluationTutorEntity(Integer id,String stuId,float attendance,float autoLearn,float autoScientific,float scientificManag,float tutorScore){
this.id = id;
this.stuId = stuId;
this.attendance = attendance;
this.autoLearn = autoLearn;
this.autoScientific = autoScientific;
this.scientificManag = scientificManag;
this.tutorScore = tutorScore;
}

public Integer getId() {return id;}

public void setId(Integer id){this.id = id;}

public String getStuId() {return stuId;}

public void setStuId(String stuId){this.stuId = stuId;}

public float getAttendance() {return attendance;}

public void setAttendance(float attendance){this.attendance = attendance;}

public float getAutoLearn() {return autoLearn;}

public void setAutoLearn(float autoLearn){this.autoLearn = autoLearn;}

public float getAutoScientific() {return autoScientific;}

public void setAutoScientific(float autoScientific){this.autoScientific = autoScientific;}

public float getScientificManag() {return scientificManag;}

public void setScientificManag(float scientificManag){this.scientificManag = scientificManag;}

public float getTutorScore() {return tutorScore;}

public void setTutorScore(float tutorScore){this.tutorScore = tutorScore;}

}