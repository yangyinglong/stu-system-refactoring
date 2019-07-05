package cn.hdu.fragmentTax.view.request;

public class ForgetPassRequ {
    private String stuId;
    private String name;
    private String phone;
    private String password;

    public ForgetPassRequ() {
    }

    public ForgetPassRequ(String stuId, String name, String phone, String password) {
        this.stuId = stuId;
        this.name = name;
        this.phone = phone;
        this.password = password;
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

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
