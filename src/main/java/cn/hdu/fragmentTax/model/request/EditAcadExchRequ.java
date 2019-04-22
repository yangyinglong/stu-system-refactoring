package cn.hdu.fragmentTax.model.request;

public class EditAcadExchRequ {
    private Integer id;
    private String stuId;
    private String exchangeType;
    private String organization;
    private String conferenceName;
    private String startTime;
    private String endTime;
    private String level;
    private String result;
    private String proofMaterialId;

    public EditAcadExchRequ() {
    }

    public EditAcadExchRequ(Integer id, String stuId, String exchangeType, String organization, String conferenceName, String startTime, String endTime, String level, String result, String proofMaterialId) {
        this.id = id;
        this.stuId = stuId;
        this.exchangeType = exchangeType;
        this.organization = organization;
        this.conferenceName = conferenceName;
        this.startTime = startTime;
        this.endTime = endTime;
        this.level = level;
        this.result = result;
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

    public String getExchangeType() {
        return exchangeType;
    }

    public void setExchangeType(String exchangeType) {
        this.exchangeType = exchangeType;
    }

    public String getOrganization() {
        return organization;
    }

    public void setOrganization(String organization) {
        this.organization = organization;
    }

    public String getConferenceName() {
        return conferenceName;
    }

    public void setConferenceName(String conferenceName) {
        this.conferenceName = conferenceName;
    }

    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    public String getProofMaterialId() {
        return proofMaterialId;
    }

    public void setProofMaterialId(String proofMaterialId) {
        this.proofMaterialId = proofMaterialId;
    }
}
