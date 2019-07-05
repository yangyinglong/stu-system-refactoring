package cn.hdu.fragmentTax.view.request;

public class EditEngiProRequ {
    private Integer id;
    private String stuId;
    private String proName;
    private String performance;
    private String work;
    private Integer ranking;
    private Integer totalNumber;
    private String proIntr;
    private String proState;
    private String enterpriseName;
    private String enterpriseTeacher;
    private String getDate;
    private String teacher;
    private String proofMaterialId;

    public EditEngiProRequ() {
    }

    public EditEngiProRequ(Integer id, String stuId, String proName, String performance, String work, Integer ranking, Integer totalNumber, String proIntr, String proState, String enterpriseName, String enterpriseTeacher, String getDate, String teacher, String proofMaterialId) {
        this.id = id;
        this.stuId = stuId;
        this.proName = proName;
        this.performance = performance;
        this.work = work;
        this.ranking = ranking;
        this.totalNumber = totalNumber;
        this.proIntr = proIntr;
        this.proState = proState;
        this.enterpriseName = enterpriseName;
        this.enterpriseTeacher = enterpriseTeacher;
        this.getDate = getDate;
        this.teacher = teacher;
        this.proofMaterialId = proofMaterialId;
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
}
