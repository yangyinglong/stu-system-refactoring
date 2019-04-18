package cn.hdu.fragmentTax.model.request;

public class StuLoginRequ {
    private String stuId;
    private String password;
    private Integer state;

    public StuLoginRequ() {
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    public String getStuId() {
        return stuId;
    }

    public void setStuId(String stuId) {
        this.stuId = stuId;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public StuLoginRequ(String stuId, String password, Integer state) {
        this.stuId = stuId;
        this.password = password;
        this.state = state;
    }
}
