package cn.hdu.fragmentTax.dao.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Timestamp;


@Entity
public class CompetitionEntity implements Serializable {

    @Id
    @GeneratedValue
    private Integer id;
    @Column
    private String stuId;
    @Column
    private String competitionType;
    @Column
    private String competitionName;
    @Column
    private Integer ranking;
    @Column
    private Integer totalNumber;
    @Column
    private String competitionState;
    @Column
    private String competitionPrize;
    @Column
    private String competitionLevel;
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

    public CompetitionEntity() {
    }

    public CompetitionEntity(Integer id, String stuId, String competitionType, String competitionName, Integer ranking, Integer totalNumber, String competitionState, String competitionPrize, String competitionLevel, String teacher, String proofMaterialId, float score, Integer state, String createdTime) {
        this.id = id;
        this.stuId = stuId;
        this.competitionType = competitionType;
        this.competitionName = competitionName;
        this.ranking = ranking;
        this.totalNumber = totalNumber;
        this.competitionState = competitionState;
        this.competitionPrize = competitionPrize;
        this.competitionLevel = competitionLevel;
        this.teacher = teacher;
        this.proofMaterialId = proofMaterialId;
        this.score = score;
        this.state = state;
        this.createdTime = createdTime;
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

    public String getCompetitionType() {
        return competitionType;
    }

    public void setCompetitionType(String competitionType) {
        this.competitionType = competitionType;
    }

    public String getCompetitionName() {
        return competitionName;
    }

    public void setCompetitionName(String competitionName) {
        this.competitionName = competitionName;
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

    public String getCompetitionState() {
        return competitionState;
    }

    public void setCompetitionState(String competitionState) {
        this.competitionState = competitionState;
    }

    public String getCompetitionPrize() {
        return competitionPrize;
    }

    public void setCompetitionPrize(String competitionPrize) {
        this.competitionPrize = competitionPrize;
    }

    public String getCompetitionLevel() {
        return competitionLevel;
    }

    public void setCompetitionLevel(String competitionLevel) {
        this.competitionLevel = competitionLevel;
    }

    public String getTeacher() {
        return teacher;
    }

    public void setTeacher(String teacher) {
        this.teacher = teacher;
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

}