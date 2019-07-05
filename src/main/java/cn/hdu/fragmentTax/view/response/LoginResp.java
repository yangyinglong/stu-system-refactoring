package cn.hdu.fragmentTax.view.response;

public class LoginResp {
    private String stuId;
    private String name;
    private String phone;
    private Integer status;
    private Integer sex;
    private Integer state;

    public LoginResp() {
    }

    LoginResp(String stuId, String name, String phone, Integer status, Integer sex) {
        this.stuId = stuId;
        this.name = name;
        this.phone = phone;
        this.status = status;
        this.sex = sex;
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

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getSex() {
        return sex;
    }

    public void setSex(Integer sex) {
        this.sex = sex;
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }
}
