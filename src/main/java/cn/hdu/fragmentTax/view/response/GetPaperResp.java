package cn.hdu.fragmentTax.view.response;

public class GetPaperResp {
    private Integer id;
    private String stuId;
    private String name;
    private String paperTitle;
    private String journalTitle;
    private String paperGrade;
    private String paperState;
    private Integer ranking;
    private Integer totalNumber;
    private String status;
    private String getDate;
    private Float score;
    private String proofMaterialId;

    public GetPaperResp(Integer id, String stuId, String name, String paperTitle, String journalTitle, String paperGrade, String paperState, Integer ranking, Integer totalNumber, String status, String getDate, Float score, String proofMaterialId) {
        this.id = id;
        this.stuId = stuId;
        this.name = name;
        this.paperTitle = paperTitle;
        this.journalTitle = journalTitle;
        this.paperGrade = paperGrade;
        this.paperState = paperState;
        this.ranking = ranking;
        this.totalNumber = totalNumber;
        this.status = status;
        this.getDate = getDate;
        this.score = score;
        this.proofMaterialId = proofMaterialId;
    }

    public GetPaperResp() {
    }

    public Float getScore() {
        return score;
    }

    public void setScore(Float score) {
        this.score = score;
    }

    public String getProofMaterialId() {
        return proofMaterialId;
    }

    public void setProofMaterialId(String proofMaterialId) {
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPaperTitle() {
        return paperTitle;
    }

    public void setPaperTitle(String paperTitle) {
        this.paperTitle = paperTitle;
    }

    public String getJournalTitle() {
        return journalTitle;
    }

    public void setJournalTitle(String journalTitle) {
        this.journalTitle = journalTitle;
    }

    public String getPaperGrade() {
        return paperGrade;
    }

    public void setPaperGrade(String paperGrade) {
        this.paperGrade = paperGrade;
    }

    public String getPaperState() {
        return paperState;
    }

    public void setPaperState(String paperState) {
        this.paperState = paperState;
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

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getGetDate() {
        return getDate;
    }

    public void setGetDate(String getDate) {
        this.getDate = getDate;
    }
}
