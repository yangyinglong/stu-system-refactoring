package cn.hdu.fragmentTax.model.request;

public class EditHonorResp {
    private Integer id;
    private String stuId;
    private String name;
    private Integer honorType;
    private Integer honorLevel;
    private Integer honorGrade;
    private String getDate;

    public EditHonorResp() {
    }

    public EditHonorResp(Integer id, String stuId, String name, Integer honorType, Integer honorLevel, Integer honorGrade, String getDate) {
        this.id = id;
        this.stuId = stuId;
        this.name = name;
        this.honorType = honorType;
        this.honorLevel = honorLevel;
        this.honorGrade = honorGrade;
        this.getDate = getDate;
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

    public Integer getHonorType() {
        return honorType;
    }

    public void setHonorType(Integer honorType) {
        this.honorType = honorType;
    }

    public Integer getHonorLevel() {
        return honorLevel;
    }

    public void setHonorLevel(Integer honorLevel) {
        this.honorLevel = honorLevel;
    }

    public Integer getHonorGrade() {
        return honorGrade;
    }

    public void setHonorGrade(Integer honorGrade) {
        this.honorGrade = honorGrade;
    }

    public String getGetDate() {
        return getDate;
    }

    public void setGetDate(String getDate) {
        this.getDate = getDate;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}
