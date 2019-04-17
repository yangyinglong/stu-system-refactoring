package cn.hdu.fragmentTax.dao.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Timestamp;


@Entity
public class EvaluationCounsellorEntity implements Serializable {

    @Id
    @GeneratedValue
    private Integer id;
    @Column
    private String stuId;
    @Column
    private float attendance;  // 会议出勤0-20
    @Column
    private float psychologicalQuality;  // 心理素质0-30
    @Column
    private float activityParti;  // 社团活动参与率0-30
    @Column
    private float relationship;  // 师生关系0-20
    @Column
    private float counsellorScore;  // 辅导员总分

    public EvaluationCounsellorEntity() {
    }

    public EvaluationCounsellorEntity(Integer id, String stuId, float attendance, float psychologicalQuality, float activityParti, float relationship, float counsellorScore) {
        this.id = id;
        this.stuId = stuId;
        this.attendance = attendance;
        this.psychologicalQuality = psychologicalQuality;
        this.activityParti = activityParti;
        this.relationship = relationship;
        this.counsellorScore = counsellorScore;
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

    public float getAttendance() {
        return attendance;
    }

    public void setAttendance(float attendance) {
        this.attendance = attendance;
    }

    public float getPsychologicalQuality() {
        return psychologicalQuality;
    }

    public void setPsychologicalQuality(float psychologicalQuality) {
        this.psychologicalQuality = psychologicalQuality;
    }

    public float getActivityParti() {
        return activityParti;
    }

    public void setActivityParti(float activityParti) {
        this.activityParti = activityParti;
    }

    public float getRelationship() {
        return relationship;
    }

    public void setRelationship(float relationship) {
        this.relationship = relationship;
    }

    public float getCounsellorScore() {
        return counsellorScore;
    }

    public void setCounsellorScore(float counsellorScore) {
        this.counsellorScore = counsellorScore;
    }

}