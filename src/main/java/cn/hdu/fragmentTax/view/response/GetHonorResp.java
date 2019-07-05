package cn.hdu.fragmentTax.view.response;

public class GetHonorResp {
        private Integer id;
        private String stuId;
        private String honorType;
        private String honorLevel;
        private String honorGrade;
        private String getDate;
        private String status;
        private Float score;
        private String name;
        private String proofMaterialId;

    public GetHonorResp() {
    }

    public GetHonorResp(Integer id, String stuId, String honorType, String honorLevel, String honorGrade, String getDate, String status, Float score, String name, String proofMaterialId) {
        this.id = id;
        this.stuId = stuId;
        this.honorType = honorType;
        this.honorLevel = honorLevel;
        this.honorGrade = honorGrade;
        this.getDate = getDate;
        this.status = status;
        this.score = score;
        this.name = name;
        this.proofMaterialId = proofMaterialId;
    }

    public String getProofMaterialId() {
        return proofMaterialId;
    }

    public void setProofMaterialId(String proofMaterialId) {
        this.proofMaterialId = proofMaterialId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Float getScore() {
        return score;
    }

    public void setScore(Float score) {
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

    public String getHonorType() {
        return honorType;
    }

    public void setHonorType(String honorType) {
        this.honorType = honorType;
    }

    public String getHonorLevel() {
        return honorLevel;
    }

    public void setHonorLevel(String honorLevel) {
        this.honorLevel = honorLevel;
    }

    public String getHonorGrade() {
        return honorGrade;
    }

    public void setHonorGrade(String honorGrade) {
        this.honorGrade = honorGrade;
    }

    public String getGetDate() {
        return getDate;
    }

    public void setGetDate(String getDate) {
        this.getDate = getDate;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
