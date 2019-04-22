package cn.hdu.fragmentTax.dao.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Timestamp;


@Entity
public class MasterPaperEntity implements Serializable {

@Id
@GeneratedValue
private Integer id;
@Column
private String stuId;
@Column
private String paperName;
@Column
private String paperAbstract;  // 摘要
@Column
private String score1;
@Column
private String sugg1;
@Column
private String score2;
@Column
private String sugg2;
@Column
private String score3;
@Column
private String sugg3;
@Column
private float score;
@Column
private Integer state;
@Column
private String createdTime;
@Column
private String proofMaterialId;

public MasterPaperEntity(){}

public MasterPaperEntity(Integer id,String stuId,String paperName,String paperAbstract,String score1,String sugg1,String score2,String sugg2,String score3,String sugg3,float score,Integer state,String createdTime,String proofMaterialId){
this.id = id;
this.stuId = stuId;
this.paperName = paperName;
this.paperAbstract = paperAbstract;
this.score1 = score1;
this.sugg1 = sugg1;
this.score2 = score2;
this.sugg2 = sugg2;
this.score3 = score3;
this.sugg3 = sugg3;
this.score = score;
this.state = state;
this.createdTime = createdTime;
this.proofMaterialId = proofMaterialId;
}

public Integer getId() {return id;}

public void setId(Integer id){this.id = id;}

public String getStuId() {return stuId;}

public void setStuId(String stuId){this.stuId = stuId;}

public String getPaperName() {return paperName;}

public void setPaperName(String paperName){this.paperName = paperName;}

public String getPaperAbstract() {return paperAbstract;}

public void setPaperAbstract(String paperAbstract){this.paperAbstract = paperAbstract;}

public String getScore1() {return score1;}

public void setScore1(String score1){this.score1 = score1;}

public String getSugg1() {return sugg1;}

public void setSugg1(String sugg1){this.sugg1 = sugg1;}

public String getScore2() {return score2;}

public void setScore2(String score2){this.score2 = score2;}

public String getSugg2() {return sugg2;}

public void setSugg2(String sugg2){this.sugg2 = sugg2;}

public String getScore3() {return score3;}

public void setScore3(String score3){this.score3 = score3;}

public String getSugg3() {return sugg3;}

public void setSugg3(String sugg3){this.sugg3 = sugg3;}

public float getScore() {return score;}

public void setScore(float score){this.score = score;}

public Integer getState() {return state;}

public void setState(Integer state){this.state = state;}

public String getCreatedTime() {return createdTime;}

public void setCreatedTime(String createdTime){this.createdTime = createdTime;}

public String getProofMaterialId() {return proofMaterialId;}

public void setProofMaterialId(String proofMaterialId){this.proofMaterialId = proofMaterialId;}

}