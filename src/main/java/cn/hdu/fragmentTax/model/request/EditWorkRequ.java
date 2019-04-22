package cn.hdu.fragmentTax.model.request;

public class EditWorkRequ {
    private Integer id;
    private String stuId;
    private String companyName;
    private String companyType;
    private String workType;
    private String getDate;
    private String proofMaterialId;

    public EditWorkRequ() {
    }

    public EditWorkRequ(Integer id, String stuId, String companyName, String companyType, String workType, String getDate, String proofMaterialId) {
        this.id = id;
        this.stuId = stuId;
        this.companyName = companyName;
        this.companyType = companyType;
        this.workType = workType;
        this.getDate = getDate;
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

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getCompanyType() {
        return companyType;
    }

    public void setCompanyType(String companyType) {
        this.companyType = companyType;
    }

    public String getWorkType() {
        return workType;
    }

    public void setWorkType(String workType) {
        this.workType = workType;
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
}
