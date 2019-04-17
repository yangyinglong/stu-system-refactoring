package cn.hdu.fragmentTax.model.response;

public class GetPrizesResp {
    private float honorScore;  // 荣誉总分
    private Integer honorNum;  // 荣誉数量
    private float paperScore;  // 论文总分
    private Integer paperNum;  // 论文数量
    private float patentScore;  // 专利总分
    private Integer patentNum;  // 专利数量

    public GetPrizesResp(float honorScore, Integer honorNum, float paperScore, Integer paperNum, float patentScore, Integer patentNum) {
        this.honorScore = honorScore;
        this.honorNum = honorNum;
        this.paperScore = paperScore;
        this.paperNum = paperNum;
        this.patentScore = patentScore;
        this.patentNum = patentNum;
    }

    public GetPrizesResp() {
    }

    public float getHonorScore() {
        return honorScore;
    }

    public void setHonorScore(float honorScore) {
        this.honorScore = honorScore;
    }

    public Integer getHonorNum() {
        return honorNum;
    }

    public void setHonorNum(Integer honorNum) {
        this.honorNum = honorNum;
    }

    public float getPaperScore() {
        return paperScore;
    }

    public void setPaperScore(float paperScore) {
        this.paperScore = paperScore;
    }

    public Integer getPaperNum() {
        return paperNum;
    }

    public void setPaperNum(Integer paperNum) {
        this.paperNum = paperNum;
    }

    public float getPatentScore() {
        return patentScore;
    }

    public void setPatentScore(float patentScore) {
        this.patentScore = patentScore;
    }

    public Integer getPatentNum() {
        return patentNum;
    }

    public void setPatentNum(Integer patentNum) {
        this.patentNum = patentNum;
    }
}
