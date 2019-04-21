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
    @Column
    private float competitionScore;  // 学科竞赛
    @Column
    private Integer competitionNum;
    @Column
    private float engiScore;  // 工程项目
    @Column
    private Integer engiNum;
    @Column
    private float entrScore;  // 创业项目
    @Column
    private Integer entrNum;
    @Column
    private float innoScore;  // 创新项目
    @Column
    private Integer innoNum;
    @Column
    private float exchScore;  // 学术交流
    @Column
    private Integer exchNum;
    @Column
    private float workScore;  // 就业深造
    @Column
    private Integer workNum;
    @Column
    private float masterScore;  // 硕士论文
    @Column
    private Integer masterNum;
    @Column
    private float allScore;
    @Column
    private Integer allNum;
    @Column
    private Integer totalCount;

    public AllPrizeEntity() {
    }

    public AllPrizeEntity(Integer id, String stuId, float honorScore, Integer honorNum, float paperSocre, Integer paperNum, float patentScore, Integer patentNum, Integer state, String createdTime, String changedTime, float competitionScore, Integer competitionNum, float engiScore, Integer engiNum, float entrScore, Integer entrNum, float innoScore, Integer innoNum, float exchScore, Integer exchNum, float workScore, Integer workNum, float masterScore, Integer masterNum, float allScore, Integer allNum, Integer totalCount) {
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
        this.competitionScore = competitionScore;
        this.competitionNum = competitionNum;
        this.engiScore = engiScore;
        this.engiNum = engiNum;
        this.entrScore = entrScore;
        this.entrNum = entrNum;
        this.innoScore = innoScore;
        this.innoNum = innoNum;
        this.exchScore = exchScore;
        this.exchNum = exchNum;
        this.workScore = workScore;
        this.workNum = workNum;
        this.masterScore = masterScore;
        this.masterNum = masterNum;
        this.allScore = allScore;
        this.allNum = allNum;
        this.totalCount = totalCount;
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

    public float getCompetitionScore() {
        return competitionScore;
    }

    public void setCompetitionScore(float competitionScore) {
        this.competitionScore = competitionScore;
    }

    public Integer getCompetitionNum() {
        return competitionNum;
    }

    public void setCompetitionNum(Integer competitionNum) {
        this.competitionNum = competitionNum;
    }

    public float getEngiScore() {
        return engiScore;
    }

    public void setEngiScore(float engiScore) {
        this.engiScore = engiScore;
    }

    public Integer getEngiNum() {
        return engiNum;
    }

    public void setEngiNum(Integer engiNum) {
        this.engiNum = engiNum;
    }

    public float getEntrScore() {
        return entrScore;
    }

    public void setEntrScore(float entrScore) {
        this.entrScore = entrScore;
    }

    public Integer getEntrNum() {
        return entrNum;
    }

    public void setEntrNum(Integer entrNum) {
        this.entrNum = entrNum;
    }

    public float getInnoScore() {
        return innoScore;
    }

    public void setInnoScore(float innoScore) {
        this.innoScore = innoScore;
    }

    public Integer getInnoNum() {
        return innoNum;
    }

    public void setInnoNum(Integer innoNum) {
        this.innoNum = innoNum;
    }

    public float getExchScore() {
        return exchScore;
    }

    public void setExchScore(float exchScore) {
        this.exchScore = exchScore;
    }

    public Integer getExchNum() {
        return exchNum;
    }

    public void setExchNum(Integer exchNum) {
        this.exchNum = exchNum;
    }

    public float getWorkScore() {
        return workScore;
    }

    public void setWorkScore(float workScore) {
        this.workScore = workScore;
    }

    public Integer getWorkNum() {
        return workNum;
    }

    public void setWorkNum(Integer workNum) {
        this.workNum = workNum;
    }

    public float getMasterScore() {
        return masterScore;
    }

    public void setMasterScore(float masterScore) {
        this.masterScore = masterScore;
    }

    public Integer getMasterNum() {
        return masterNum;
    }

    public void setMasterNum(Integer masterNum) {
        this.masterNum = masterNum;
    }

    public float getAllScore() {
        return allScore;
    }

    public void setAllScore(float allScore) {
        this.allScore = allScore;
    }

    public Integer getAllNum() {
        return allNum;
    }

    public void setAllNum(Integer allNum) {
        this.allNum = allNum;
    }

    public Integer getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
    }

}