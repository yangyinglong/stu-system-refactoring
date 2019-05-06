package cn.hdu.fragmentTax.dao.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Timestamp;


@Entity
public class StuBaseEntity implements Serializable {

    @Id
    @GeneratedValue
    private Integer id;
    @Column
    private String stuId;
    @Column
    private String name;
    @Column
    private String phone;
    @Column
    private Integer sex;  // 1-男性，2-女性
    @Column
    private String uSchool;
    @Column
    private String uMajor;
    @Column
    private String counsellorId;  // 辅导员id
    @Column
    private String tutorId;  // 导师id
    @Column
    private Integer state;  // 1-有效，2-无效
    @Column
    private String createdTime;
    @Column
    private String changedTime;
    @Column
    private String idCard;
    @Column
    private String masterMajor;
    @Column
    private String politicalOutlook;
    @Column
    private String biogenicLand;  // 生源地
    @Column
    private String masterDirection;  // 研究方向
    @Column
    private String eMail;
    @Column
    private String emergencyContact;
    @Column
    private String emergencyPhone;
    @Column
    private String secretary;  // 研究生秘书

    public StuBaseEntity() {
    }

    public StuBaseEntity(Integer id, String stuId, String name, String phone, Integer sex, String uSchool, String uMajor, String counsellorId, String tutorId, Integer state, String createdTime, String changedTime, String idCard, String masterMajor, String politicalOutlook, String biogenicLand, String masterDirection, String eMail, String emergencyContact, String emergencyPhone, String secretary) {
        this.id = id;
        this.stuId = stuId;
        this.name = name;
        this.phone = phone;
        this.sex = sex;
        this.uSchool = uSchool;
        this.uMajor = uMajor;
        this.counsellorId = counsellorId;
        this.tutorId = tutorId;
        this.state = state;
        this.createdTime = createdTime;
        this.changedTime = changedTime;
        this.idCard = idCard;
        this.masterMajor = masterMajor;
        this.politicalOutlook = politicalOutlook;
        this.biogenicLand = biogenicLand;
        this.masterDirection = masterDirection;
        this.eMail = eMail;
        this.emergencyContact = emergencyContact;
        this.emergencyPhone = emergencyPhone;
        this.secretary = secretary;
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Integer getSex() {
        return sex;
    }

    public void setSex(Integer sex) {
        this.sex = sex;
    }

    public String getUSchool() {
        return uSchool;
    }

    public void setUSchool(String uSchool) {
        this.uSchool = uSchool;
    }

    public String getUMajor() {
        return uMajor;
    }

    public void setUMajor(String uMajor) {
        this.uMajor = uMajor;
    }

    public String getCounsellorId() {
        return counsellorId;
    }

    public void setCounsellorId(String counsellorId) {
        this.counsellorId = counsellorId;
    }

    public String getTutorId() {
        return tutorId;
    }

    public void setTutorId(String tutorId) {
        this.tutorId = tutorId;
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

    public String getIdCard() {
        return idCard;
    }

    public void setIdCard(String idCard) {
        this.idCard = idCard;
    }

    public String getMasterMajor() {
        return masterMajor;
    }

    public void setMasterMajor(String masterMajor) {
        this.masterMajor = masterMajor;
    }

    public String getPoliticalOutlook() {
        return politicalOutlook;
    }

    public void setPoliticalOutlook(String politicalOutlook) {
        this.politicalOutlook = politicalOutlook;
    }

    public String getBiogenicLand() {
        return biogenicLand;
    }

    public void setBiogenicLand(String biogenicLand) {
        this.biogenicLand = biogenicLand;
    }

    public String getMasterDirection() {
        return masterDirection;
    }

    public void setMasterDirection(String masterDirection) {
        this.masterDirection = masterDirection;
    }

    public String getEMail() {
        return eMail;
    }

    public void setEMail(String eMail) {
        this.eMail = eMail;
    }

    public String getEmergencyContact() {
        return emergencyContact;
    }

    public void setEmergencyContact(String emergencyContact) {
        this.emergencyContact = emergencyContact;
    }

    public String getEmergencyPhone() {
        return emergencyPhone;
    }

    public void setEmergencyPhone(String emergencyPhone) {
        this.emergencyPhone = emergencyPhone;
    }

    public String getSecretary() {
        return secretary;
    }

    public void setSecretary(String secretary) {
        this.secretary = secretary;
    }

}