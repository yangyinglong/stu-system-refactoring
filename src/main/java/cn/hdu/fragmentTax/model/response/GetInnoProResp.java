package cn.hdu.fragmentTax.model.response;

public class GetInnoProResp {
    private Integer id;
    private String stuId;
    private String proName;
    private String proType;
    private String proIntr;
    private Integer ranking;
    private Integer totalNumber;
    private String proState;
    private String proResult;
    private String proLevel;
    private String getDate;
    private String teacher;
    private String proofMaterialId;
    private String status;
    private Float score;
    private String name;

    public GetInnoProResp() {
    }

    public GetInnoProResp(Integer id, String stuId, String proName, String proType, String proIntr, Integer ranking, Integer totalNumber, String proState, String proResult, String proLevel, String getDate, String teacher, String proofMaterialId, String status, Float score, String name) {
        this.id = id;
        this.stuId = stuId;
        this.proName = proName;
        this.proType = proType;
        this.proIntr = proIntr;
        this.ranking = ranking;
        this.totalNumber = totalNumber;
        this.proState = proState;
        this.proResult = proResult;
        this.proLevel = proLevel;
        this.getDate = getDate;
        this.teacher = teacher;
        this.proofMaterialId = proofMaterialId;
        this.status = status;
        this.score = score;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    public String getProName() {
        return proName;
    }

    public void setProName(String proName) {
        this.proName = proName;
    }

    public String getProType() {
        return proType;
    }

    public void setProType(String proType) {
        this.proType = proType;
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

    public String getProLevel() {
        return proLevel;
    }

    public void setProLevel(String proLevel) {
        this.proLevel = proLevel;
    }

    public String getGetDate() {
        return getDate;
    }

    public void setGetDate(String getDate) {
        this.getDate = getDate;
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

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Float getScore() {
        return score;
    }

    public void setScore(Float score) {
        this.score = score;
    }
}
