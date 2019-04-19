package cn.hdu.fragmentTax.model.request;

public class EditPaperRequ {
    private Integer id;
    private String stuId;
    private String name;
    private String paperTitle;
    private String journalTitle;
    private Integer paperGrade;
    private Integer paperState;
    private Integer ranking;
    private Integer totalNumber;
    private String getDate;
    private String proofMaterialId;

    public EditPaperRequ() {
    }

    public EditPaperRequ(Integer id, String stuId, String name, String paperTitle, String journalTitle, Integer paperGrade, Integer paperState, Integer ranking, Integer totalNumber, String getDate, String proofMaterialId) {
        this.id = id;
        this.stuId = stuId;
        this.name = name;
        this.paperTitle = paperTitle;
        this.journalTitle = journalTitle;
        this.paperGrade = paperGrade;
        this.paperState = paperState;
        this.ranking = ranking;
        this.totalNumber = totalNumber;
        this.getDate = getDate;
        this.proofMaterialId = proofMaterialId;
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

    public Integer getPaperGrade() {
        return paperGrade;
    }

    public void setPaperGrade(Integer paperGrade) {
        this.paperGrade = paperGrade;
    }

    public Integer getPaperState() {
        return paperState;
    }

    public void setPaperState(Integer paperState) {
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

    public String getGetDate() {
        return getDate;
    }

    public void setGetDate(String getDate) {
        this.getDate = getDate;
    }
}
