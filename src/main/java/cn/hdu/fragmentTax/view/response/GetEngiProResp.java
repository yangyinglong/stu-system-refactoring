package cn.hdu.fragmentTax.view.response;

public class GetEngiProResp {
    private Integer id;
    private String stuId;
    private String proName;
    private String proIntr;
    private Integer ranking;
    private Integer totalNumber;
    private String proState;
    private String getDate;
    private String teacher;
    private String proofMaterialId;
    private String status;
    private Float score;
    private String performance;
    private String work;
    private String enterpriseName;
    private String enterpriseTeacher;
    private String name;

    public GetEngiProResp(Integer id, String stuId, String proName, String proIntr, Integer ranking, Integer totalNumber, String proState, String getDate, String teacher, String proofMaterialId, String status, Float score, String performance, String work, String enterpriseName, String enterpriseTeacher, String name) {
        this.id = id;
        this.stuId = stuId;
        this.proName = proName;
        this.proIntr = proIntr;
        this.ranking = ranking;
        this.totalNumber = totalNumber;
        this.proState = proState;
        this.getDate = getDate;
        this.teacher = teacher;
        this.proofMaterialId = proofMaterialId;
        this.status = status;
        this.score = score;
        this.performance = performance;
        this.work = work;
        this.enterpriseName = enterpriseName;
        this.enterpriseTeacher = enterpriseTeacher;
        this.name = name;
    }

    public GetEngiProResp() {
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

    public String getPerformance() {
        return performance;
    }

    public void setPerformance(String performance) {
        this.performance = performance;
    }

    public String getWork() {
        return work;
    }

    public void setWork(String work) {
        this.work = work;
    }

    public String getEnterpriseName() {
        return enterpriseName;
    }

    public void setEnterpriseName(String enterpriseName) {
        this.enterpriseName = enterpriseName;
    }

    public String getEnterpriseTeacher() {
        return enterpriseTeacher;
    }

    public void setEnterpriseTeacher(String enterpriseTeacher) {
        this.enterpriseTeacher = enterpriseTeacher;
    }
}
