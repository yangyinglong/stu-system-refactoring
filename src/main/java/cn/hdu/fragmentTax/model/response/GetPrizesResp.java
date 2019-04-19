package cn.hdu.fragmentTax.model.response;

public class GetPrizesResp {
    private float honorScore;  // 荣誉总分
    private String honorNum;  // 荣誉数量
    private float paperScore;  // 论文总分
    private String paperNum;  // 论文数量
    private float patentScore;  // 专利总分
    private String patentNum;  // 专利数量

    public GetPrizesResp() {
    }

    public GetPrizesResp(float honorScore, String honorNum, float paperScore, String paperNum, float patentScore, String patentNum) {
        this.honorScore = honorScore;
        this.honorNum = honorNum;
        this.paperScore = paperScore;
        this.paperNum = paperNum;
        this.patentScore = patentScore;
        this.patentNum = patentNum;
    }

    public float getHonorScore() {
        return honorScore;
    }

    public void setHonorScore(float honorScore) {
        this.honorScore = honorScore;
    }

    public String getHonorNum() {
        return honorNum;
    }

    public void setHonorNum(String honorNum) {
        this.honorNum = honorNum;
    }

    public float getPaperScore() {
        return paperScore;
    }

    public void setPaperScore(float paperScore) {
        this.paperScore = paperScore;
    }

    public String getPaperNum() {
        return paperNum;
    }

    public void setPaperNum(String paperNum) {
        this.paperNum = paperNum;
    }

    public float getPatentScore() {
        return patentScore;
    }

    public void setPatentScore(float patentScore) {
        this.patentScore = patentScore;
    }

    public String getPatentNum() {
        return patentNum;
    }

    public void setPatentNum(String patentNum) {
        this.patentNum = patentNum;
    }
}
