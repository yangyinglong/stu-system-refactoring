package cn.hdu.fragmentTax.dao.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Timestamp;


@Entity
public class PaperEntity implements Serializable {

    @Id
    @GeneratedValue
    private Integer id;
    @Column
    private String stuId;
    @Column
    private Integer paperGrade;  // 论文级别：1-一般,2-核心,3-一级,4-EI,5-SCI一区,6-SCI二区,7-SCI三区,8-SCI四区
    @Column
    private String paperTitle;  // 论文题目
    @Column
    private String journalTitle;  // 期刊名称
    @Column
    private Integer ranking;  // 在所有作者中排名
    @Column
    private Integer totalNumber;  // 总作者数
    @Column
    private Integer paperState;  // 论文状态：1-投稿,2-初审,3-外审,4-复审,5-录用,6-在线,7-出版
    @Column
    private String proofMaterialId;  // 佐证材料编号
    @Column
    private float score;
    @Column
    private Integer state;  // 1-待审核，2-已通过
    @Column
    private String createdTime;
    @Column
    private String changedTime;

    public PaperEntity() {
    }

    public PaperEntity(Integer id, String stuId, Integer paperGrade, String paperTitle, String journalTitle, Integer ranking, Integer totalNumber, Integer paperState, String proofMaterialId, float score, Integer state, String createdTime, String changedTime) {
        this.id = id;
        this.stuId = stuId;
        this.paperGrade = paperGrade;
        this.paperTitle = paperTitle;
        this.journalTitle = journalTitle;
        this.ranking = ranking;
        this.totalNumber = totalNumber;
        this.paperState = paperState;
        this.proofMaterialId = proofMaterialId;
        this.score = score;
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

    public Integer getPaperGrade() {
        return paperGrade;
    }

    public void setPaperGrade(Integer paperGrade) {
        this.paperGrade = paperGrade;
    }

    public String getPaperTitle() {
        return paperTitle;
    }

    public void setPaperTitle(String paperTitle) {
        this.paperTitle = paperTitle;
    }

    public String getJournalTitle() {
        return journalTitle;
    }

    public void setJournalTitle(String journalTitle) {
        this.journalTitle = journalTitle;
    }

    public Integer getRanking() {
        return ranking;
    }

    public void setRanking(Integer ranking) {
        this.ranking = ranking;
    }

    public Integer getTotalNumber() {
        return totalNumber;
    }

    public void setTotalNumber(Integer totalNumber) {
        this.totalNumber = totalNumber;
    }

    public Integer getPaperState() {
        return paperState;
    }

    public void setPaperState(Integer paperState) {
        this.paperState = paperState;
    }

    public String getProofMaterialId() {
        return proofMaterialId;
    }

    public void setProofMaterialId(String proofMaterialId) {
        this.proofMaterialId = proofMaterialId;
    }

    public float getScore() {
        return score;
    }

    public void setScore(float score) {
        this.score = score;
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