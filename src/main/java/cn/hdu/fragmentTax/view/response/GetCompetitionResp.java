package cn.hdu.fragmentTax.view.response;

public class GetCompetitionResp {
    private Integer id;
    private String stuId;
    private String competitionName;
    private String competitionType;
    private Integer ranking;
    private Integer totalNumber;
    private String competitionState;
    private String competitionPrize;
    private String competitionLevel;
    private String getDate;
    private String teacher;
    private String proofMaterialId;
    private String status;
    private Float score;
    private String name;

    public GetCompetitionResp() {
    }

    public GetCompetitionResp(Integer id, String stuId, String competitionName, String competitionType, Integer ranking, Integer totalNumber, String competitionState, String competitionPrize, String competitionLevel, String getDate, String teacher, String proofMaterialId, String status, Float score, String name) {
        this.id = id;
        this.stuId = stuId;
        this.competitionName = competitionName;
        this.competitionType = competitionType;
        this.ranking = ranking;
        this.totalNumber = totalNumber;
        this.competitionState = competitionState;
        this.competitionPrize = competitionPrize;
        this.competitionLevel = competitionLevel;
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

    public String getCompetitionName() {
        return competitionName;
    }

    public void setCompetitionName(String competitionName) {
        this.competitionName = competitionName;
    }

    public String getCompetitionType() {
        return competitionType;
    }

    public void setCompetitionType(String competitionType) {
        this.competitionType = competitionType;
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

    public String getCompetitionState() {
        return competitionState;
    }

    public void setCompetitionState(String competitionState) {
        this.competitionState = competitionState;
    }

    public String getCompetitionPrize() {
        return competitionPrize;
    }

    public void setCompetitionPrize(String competitionPrize) {
        this.competitionPrize = competitionPrize;
    }

    public String getCompetitionLevel() {
        return competitionLevel;
    }

    public void setCompetitionLevel(String competitionLevel) {
        this.competitionLevel = competitionLevel;
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
