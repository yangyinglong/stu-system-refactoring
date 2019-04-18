package cn.hdu.fragmentTax.model.response;

public class GetPatentResp {
    private Integer id;
    private String stuId;
    private String name;
    private String patentName;
    private String patentType;
    private String patentState;
    private Integer ranking;
    private Integer totalNumber;
    private String status;
    private String getDate;
    private Float score;

    public GetPatentResp() {
    }

    public GetPatentResp(Integer id, String stuId, String name, String patentName, String patentType, String patentState, Integer ranking, Integer totalNumber, String status, String getDate, Float score) {
        this.id = id;
        this.stuId = stuId;
        this.name = name;
        this.patentName = patentName;
        this.patentType = patentType;
        this.patentState = patentState;
        this.ranking = ranking;
        this.totalNumber = totalNumber;
        this.status = status;
        this.getDate = getDate;
        this.score = score;
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

    public String getPatentName() {
        return patentName;
    }

    public void setPatentName(String patentName) {
        this.patentName = patentName;
    }

    public String getPatentType() {
        return patentType;
    }

    public void setPatentType(String patentType) {
        this.patentType = patentType;
    }

    public String getPatentState() {
        return patentState;
    }

    public void setPatentState(String patentState) {
        this.patentState = patentState;
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

    public Float getScore() {
        return score;
    }

    public void setScore(Float score) {
        this.score = score;
    }
}
