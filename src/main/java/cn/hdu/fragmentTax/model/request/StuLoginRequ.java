package cn.hdu.fragmentTax.model.request;

public class StuLoginRequ {
    private String stuId;
    private String password;

    public StuLoginRequ() {
    }

    public StuLoginRequ(String stuId, String password) {
        this.stuId = stuId;
        this.password = password;
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
}
