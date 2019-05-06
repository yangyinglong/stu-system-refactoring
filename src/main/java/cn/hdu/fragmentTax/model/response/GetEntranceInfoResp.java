package cn.hdu.fragmentTax.model.response;

public class GetEntranceInfoResp {
    private String stuId;
    private String uSchool;
    private String uMajor;
    private Float english;
    private Float political;
    private Float math;
    private Float specialized;
    private String languagesTypes;
    private Float languagesScore;

    private String idCard;
    private String masterMajor;
    private String politicalOutlook;
    private String biogenicLand;  // 生源地
    private String masterDirection;  // 研究方向
    private String eMail;
    private String emergencyContact;
    private String emergencyPhone;


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

    public String geteMail() {
        return eMail;
    }

    public void seteMail(String eMail) {
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

    public GetEntranceInfoResp() {
    }

    public GetEntranceInfoResp(String stuId, String uSchool, String uMajor, Float english, Float political, Float math, Float specialized, String languagesTypes, Float languagesScore) {
        this.stuId = stuId;
        this.uSchool = uSchool;
        this.uMajor = uMajor;
        this.english = english;
        this.political = political;
        this.math = math;
        this.specialized = specialized;
        this.languagesTypes = languagesTypes;
        this.languagesScore = languagesScore;
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
}
