package cn.hdu.fragmentTax.model.response;

public class GetMasterPaperResp {
    private Integer id;
    private String stuId;
    private String name;
    private String paperName;
    private String paperAbstract;
    private String score1;
    private String sugg1;
    private String score2;
    private String sugg2;
    private String score3;
    private String sugg3;
    private String getDate;
    private String proofMaterialId;
    private String status;
    private Float score;
    private String score4;

    public GetMasterPaperResp() {
    }

    public GetMasterPaperResp(Integer id, String stuId, String name, String paperName, String paperAbstract, String score1, String sugg1, String score2, String sugg2, String score3, String sugg3, String getDate, String proofMaterialId, String status, Float score) {
        this.id = id;
        this.stuId = stuId;
        this.name = name;
        this.paperName = paperName;
        this.paperAbstract = paperAbstract;
        this.score1 = score1;
        this.sugg1 = sugg1;
        this.score2 = score2;
        this.sugg2 = sugg2;
        this.score3 = score3;
        this.sugg3 = sugg3;
        this.getDate = getDate;
        this.proofMaterialId = proofMaterialId;
        this.status = status;
        this.score = score;
    }

    public String getScore4() {
        return score4;
    }

    public void setScore4(String score4) {
        this.score4 = score4;
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

    public String getPaperName() {
        return paperName;
    }

    public void setPaperName(String paperName) {
        this.paperName = paperName;
    }

    public String getPaperAbstract() {
        return paperAbstract;
    }

    public void setPaperAbstract(String paperAbstract) {
        this.paperAbstract = paperAbstract;
    }

    public String getScore1() {
        return score1;
    }

    public void setScore1(String score1) {
        this.score1 = score1;
    }

    public String getSugg1() {
        return sugg1;
    }

    public void setSugg1(String sugg1) {
        this.sugg1 = sugg1;
    }

    public String getScore2() {
        return score2;
    }

    public void setScore2(String score2) {
        this.score2 = score2;
    }

    public String getSugg2() {
        return sugg2;
    }

    public void setSugg2(String sugg2) {
        this.sugg2 = sugg2;
    }

    public String getScore3() {
        return score3;
    }

    public void setScore3(String score3) {
        this.score3 = score3;
    }

    public String getSugg3() {
        return sugg3;
    }

    public void setSugg3(String sugg3) {
        this.sugg3 = sugg3;
    }

    public String getGetDate() {
        return getDate;
    }

    public void setGetDate(String getDate) {
        this.getDate = getDate;
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
