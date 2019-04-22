package cn.hdu.fragmentTax.model.request;

public class EditInnoProRequ {
    private Integer id;
    private String stuId;
    private String proName;
    private String proType;
    private Integer ranking;
    private Integer totalNumber;
    private String proIntr;
    private String proState;
    private String proResult;
    private String getDate;
    private String teacher;
    private String proofMaterialId;
    private String proLevel;

    public EditInnoProRequ() {
    }

    public EditInnoProRequ(Integer id, String stuId, String proName, String proType, Integer ranking, Integer totalNumber, String proIntr, String proState, String proResult, String getDate, String teacher, String proofMaterialId, String proLevel) {
        this.id = id;
        this.stuId = stuId;
        this.proName = proName;
        this.proType = proType;
        this.ranking = ranking;
        this.totalNumber = totalNumber;
        this.proIntr = proIntr;
        this.proState = proState;
        this.proResult = proResult;
        this.getDate = getDate;
        this.teacher = teacher;
        this.proofMaterialId = proofMaterialId;
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

    public String getProIntr() {
        return proIntr;
    }

    public void setProIntr(String proIntr) {
        this.proIntr = proIntr;
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

    public String getProLevel() {
        return proLevel;
    }

    public void setProLevel(String proLevel) {
        this.proLevel = proLevel;
    }
}
