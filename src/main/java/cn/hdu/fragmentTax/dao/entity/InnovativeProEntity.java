package cn.hdu.fragmentTax.dao.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Timestamp;


@Entity
public class InnovativeProEntity implements Serializable {

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
    private String proIntr;  // 简介
    @Column
    private Integer ranking;
    @Column
    private Integer totalNumber;
    @Column
    private String proState;
    @Column
    private String proResult;
    @Column
    private String proofMaterialId;
    @Column
    private String teacher;
    @Column
    private float score;
    @Column
    private Integer state;
    @Column
    private String createdTime;
    @Column
    private String proLevel;  // 项目级别

    public InnovativeProEntity() {
    }

    public InnovativeProEntity(Integer id, String stuId, String proType, String proName, String proIntr, Integer ranking, Integer totalNumber, String proState, String proResult, String proofMaterialId, String teacher, float score, Integer state, String createdTime, String proLevel) {
        this.id = id;
        this.stuId = stuId;
        this.proType = proType;
        this.proName = proName;
        this.proIntr = proIntr;
        this.ranking = ranking;
        this.totalNumber = totalNumber;
        this.proState = proState;
        this.proResult = proResult;
        this.proofMaterialId = proofMaterialId;
        this.teacher = teacher;
        this.score = score;
        this.state = state;
        this.createdTime = createdTime;
        this.proLevel = proLevel;
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

    public String getProType() {
        return proType;
    }

    public void setProType(String proType) {
        this.proType = proType;
    }

    public String getProName() {
        return proName;
    }

    public void setProName(String proName) {
        this.proName = proName;
    }

    public String getProIntr() {
        return proIntr;
    }

    public void setProIntr(String proIntr) {
        this.proIntr = proIntr;
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

    public String getProState() {
        return proState;
    }

    public void setProState(String proState) {
        this.proState = proState;
    }

    public String getProResult() {
        return proResult;
    }

    public void setProResult(String proResult) {
        this.proResult = proResult;
    }

    public String getProofMaterialId() {
        return proofMaterialId;
    }

    public void setProofMaterialId(String proofMaterialId) {
        this.proofMaterialId = proofMaterialId;
    }

    public String getTeacher() {
        return teacher;
    }

    public void setTeacher(String teacher) {
        this.teacher = teacher;
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

    public String getProLevel() {
        return proLevel;
    }

    public void setProLevel(String proLevel) {
        this.proLevel = proLevel;
    }

}