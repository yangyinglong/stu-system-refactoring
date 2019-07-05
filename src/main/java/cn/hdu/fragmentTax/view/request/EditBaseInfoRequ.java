package cn.hdu.fragmentTax.view.request;

public class EditBaseInfoRequ {
    private String id;
    private String name;
    private String phone;
    private Integer sex;
    private String password;

    public EditBaseInfoRequ() {
    }

    public EditBaseInfoRequ(String id, String name, String phone, Integer sex, String password) {
        this.id = id;
        this.name = name;
        this.phone = phone;
        this.sex = sex;
        this.password = password;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
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

    public Integer getSex() {
        return sex;
    }

    public void setSex(Integer sex) {
        this.sex = sex;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
