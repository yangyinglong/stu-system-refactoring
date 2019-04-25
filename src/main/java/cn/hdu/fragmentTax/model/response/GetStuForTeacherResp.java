package cn.hdu.fragmentTax.model.response;

public class GetStuForTeacherResp {
    private String stuId;
    private String name;
    private String uSchool;
    private String uMajor;
    private Float english;
    private Float political;
    private Float math;
    private Float specialized;
    private String languagesTypes;
    private Float languagesScore;
    private String tutorId;
    private String counsellorId;
    private String sex;
    private String phone;
    private String tuturName;
    private String counsellorName;

    public GetStuForTeacherResp() {
    }

    public GetStuForTeacherResp(String stuId, String uSchool, String uMajor, Float english, Float political, Float math, Float specialized, String languagesTypes, Float languagesScore, String tutorId, String counsellorId, String sex, String tuturName, String counsellorName) {
        this.stuId = stuId;
        this.uSchool = uSchool;
        this.uMajor = uMajor;
        this.english = english;
        this.political = political;
        this.math = math;
        this.specialized = specialized;
        this.languagesTypes = languagesTypes;
        this.languagesScore = languagesScore;
        this.tutorId = tutorId;
        this.counsellorId = counsellorId;
        this.sex = sex;
        this.tuturName = tuturName;
        this.counsellorName = counsellorName;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStuId() {
        return stuId;
    }

    public void setStuId(String stuId) {
        this.stuId = stuId;
    }

    public String getuSchool() {
        return uSchool;
    }

    public void setuSchool(String uSchool) {
        this.uSchool = uSchool;
    }

    public String getuMajor() {
        return uMajor;
    }

    public void setuMajor(String uMajor) {
        this.uMajor = uMajor;
    }

    public Float getEnglish() {
        return english;
    }

    public void setEnglish(Float english) {
        this.english = english;
    }

    public Float getPolitical() {
        return political;
    }

    public void setPolitical(Float political) {
        this.political = political;
    }

    public Float getMath() {
        return math;
    }

    public void setMath(Float math) {
        this.math = math;
    }

    public Float getSpecialized() {
        return specialized;
    }

    public void setSpecialized(Float specialized) {
        this.specialized = specialized;
    }

    public String getLanguagesTypes() {
        return languagesTypes;
    }

    public void setLanguagesTypes(String languagesTypes) {
        this.languagesTypes = languagesTypes;
    }

    public Float getLanguagesScore() {
        return languagesScore;
    }

    public void setLanguagesScore(Float languagesScore) {
        this.languagesScore = languagesScore;
    }

    public String getTutorId() {
        return tutorId;
    }

    public void setTutorId(String tutorId) {
        this.tutorId = tutorId;
    }

    public String getCounsellorId() {
        return counsellorId;
    }

    public void setCounsellorId(String counsellorId) {
        this.counsellorId = counsellorId;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getTuturName() {
        return tuturName;
    }

    public void setTuturName(String tuturName) {
        this.tuturName = tuturName;
    }

    public String getCounsellorName() {
        return counsellorName;
    }

    public void setCounsellorName(String counsellorName) {
        this.counsellorName = counsellorName;
    }
}
