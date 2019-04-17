package cn.hdu.fragmentTax.model.request;

public class RegisterRequ {
    private String stuId;
    private String name;
    private Integer sex = 1;
    private String phone;
    private String password;

    public RegisterRequ() {
    }

    public RegisterRequ(String stuId, String name, Integer sex, String phone, String password) {
        this.stuId = stuId;
        this.name = name;
        this.sex = sex;
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

    public Integer getSex() {
        return sex;
    }

    public void setSex(Integer sex) {
        this.sex = sex;
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
