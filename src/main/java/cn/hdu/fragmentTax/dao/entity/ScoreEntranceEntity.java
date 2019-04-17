package cn.hdu.fragmentTax.dao.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Timestamp;


@Entity
public class ScoreEntranceEntity implements Serializable {

    @Id
    @GeneratedValue
    private Integer id;
    @Column
    private String stuId;
    @Column
    private float english;
    @Column
    private float political;
    @Column
    private float math;
    @Column
    private float specialized;  // 专业课成绩
    @Column
    private Integer state;  // 0-已删除，1-待审核，2-已审核通过
    @Column
    private String createdTime;
    @Column
    private String changedTime;

    public ScoreEntranceEntity() {
    }

    public ScoreEntranceEntity(Integer id, String stuId, float english, float political, float math, float specialized, Integer state, String createdTime, String changedTime) {
        this.id = id;
        this.stuId = stuId;
        this.english = english;
        this.political = political;
        this.math = math;
        this.specialized = specialized;
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

    public float getEnglish() {
        return english;
    }

    public void setEnglish(float english) {
        this.english = english;
    }

    public float getPolitical() {
        return political;
    }

    public void setPolitical(float political) {
        this.political = political;
    }

    public float getMath() {
        return math;
    }

    public void setMath(float math) {
        this.math = math;
    }

    public float getSpecialized() {
        return specialized;
    }

    public void setSpecialized(float specialized) {
        this.specialized = specialized;
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