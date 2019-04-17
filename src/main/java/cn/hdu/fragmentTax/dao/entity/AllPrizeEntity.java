package cn.hdu.fragmentTax.dao.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Timestamp;


@Entity
public class AllPrizeEntity implements Serializable {

    @Id
    @GeneratedValue
    private Integer id;
    @Column
    private String stuId;
    @Column
    private float honorScore;  // 荣誉总分
    @Column
    private Integer honorNum;  // 荣誉数量
    @Column
    private float paperSocre;  // 论文总分
    @Column
    private Integer paperNum;  // 论文数量
    @Column
    private float patentScore;  // 专利总分
    @Column
    private Integer patentNum;  // 专利数量
    @Column
    private Integer state;  // 1-有效，0-无效
    @Column
    private String createdTime;
    @Column
    private String changedTime;

    public AllPrizeEntity() {
    }

    public AllPrizeEntity(Integer id, String stuId, float honorScore, Integer honorNum, float paperSocre, Integer paperNum, float patentScore, Integer patentNum, Integer state, String createdTime, String changedTime) {
        this.id = id;
        this.stuId = stuId;
        this.honorScore = honorScore;
        this.honorNum = honorNum;
        this.paperSocre = paperSocre;
        this.paperNum = paperNum;
        this.patentScore = patentScore;
        this.patentNum = patentNum;
        this.state = state;
        this.createdTime = createdTime;
        this.changedTime = changedTime;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getStuId() {
        return stuId;
    }

    public void setStuId(String stuId) {
        this.stuId = stuId;
    }

    public float getHonorScore() {
        return honorScore;
    }

    public void setHonorScore(float honorScore) {
        this.honorScore = honorScore;
    }

    public Integer getHonorNum() {
        return honorNum;
    }

    public void setHonorNum(Integer honorNum) {
        this.honorNum = honorNum;
    }

    public float getPaperSocre() {
        return paperSocre;
    }

    public void setPaperSocre(float paperSocre) {
        this.paperSocre = paperSocre;
    }

    public Integer getPaperNum() {
        return paperNum;
    }

    public void setPaperNum(Integer paperNum) {
        this.paperNum = paperNum;
    }

    public float getPatentScore() {
        return patentScore;
    }

    public void setPatentScore(float patentScore) {
        this.patentScore = patentScore;
    }

    public Integer getPatentNum() {
        return patentNum;
    }

    public void setPatentNum(Integer patentNum) {
        this.patentNum = patentNum;
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    public String getCreatedTime() {
        return createdTime;
    }

    public void setCreatedTime(String createdTime) {
        this.createdTime = createdTime;
    }

    public String getChangedTime() {
        return changedTime;
    }

    public void setChangedTime(String changedTime) {
        this.changedTime = changedTime;
    }

}