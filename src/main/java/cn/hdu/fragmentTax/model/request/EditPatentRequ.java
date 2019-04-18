package cn.hdu.fragmentTax.model.request;

public class EditPatentRequ {
    private Integer id;
    private String stuId;
    private String name;
    private String patentName;
    private Integer patentType;
    private Integer patentState;
    private Integer ranking;
    private Integer totalNumber;
    private String getDate;
    private Float score;

    public EditPatentRequ() {
    }

    public EditPatentRequ(Integer id, String stuId, String name, String patentName, Integer patentType, Integer patentState, Integer ranking, Integer totalNumber, String getDate, Float score) {
        this.id = id;
        this.stuId = stuId;
        this.name = name;
        this.patentName = patentName;
        this.patentType = patentType;
        this.patentState = patentState;
        this.ranking = ranking;
        this.totalNumber = totalNumber;
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

    public Integer getPatentType() {
        return patentType;
    }

    public void setPatentType(Integer patentType) {
        this.patentType = patentType;
    }

    public Integer getPatentState() {
        return patentState;
    }

    public void setPatentState(Integer patentState) {
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
