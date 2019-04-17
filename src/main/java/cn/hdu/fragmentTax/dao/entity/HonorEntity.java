package cn.hdu.fragmentTax.dao.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Timestamp;


@Entity
public class HonorEntity implements Serializable {

    @Id
    @GeneratedValue
    private Integer id;
    @Column
    private String stuId;
    @Column
    private Integer honorType;  // 荣誉类型：1-本科生奖学金,2-研究生奖学金,3-企业奖学金,4-优秀毕业生,5-三好学生,6-优秀班干部,7-优秀党支书,8-优秀团支书,9-十佳大学生,10-其他
    @Column
    private Integer honorLevel;  // 荣誉级别：1-国家级，2-省级，3-企业，4-校级
    @Column
    private Integer honorGrade;  // 荣誉等级：1-一等,2-二等,3-三等
    @Column
    private String proofMaterialId;  // 佐证材料的名称
    @Column
    private float score;  // 得分
    @Column
    private Integer state;  // 审核状态，0-以驳回，1-待审核，2-已通过
    @Column
    private String createdTime;
    @Column
    private String changedTime;

    public HonorEntity() {
    }

    public HonorEntity(Integer id, String stuId, Integer honorType, Integer honorLevel, Integer honorGrade, String proofMaterialId, float score, Integer state, String createdTime, String changedTime) {
        this.id = id;
        this.stuId = stuId;
        this.honorType = honorType;
        this.honorLevel = honorLevel;
        this.honorGrade = honorGrade;
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

    public Integer getHonorType() {
        return honorType;
    }

    public void setHonorType(Integer honorType) {
        this.honorType = honorType;
    }

    public Integer getHonorLevel() {
        return honorLevel;
    }

    public void setHonorLevel(Integer honorLevel) {
        this.honorLevel = honorLevel;
    }

    public Integer getHonorGrade() {
        return honorGrade;
    }

    public void setHonorGrade(Integer honorGrade) {
        this.honorGrade = honorGrade;
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