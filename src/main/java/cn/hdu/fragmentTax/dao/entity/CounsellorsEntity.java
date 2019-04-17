package cn.hdu.fragmentTax.dao.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Timestamp;


@Entity
public class CounsellorsEntity implements Serializable {

    @Id
    @GeneratedValue
    private Integer id;
    @Column
    private String counsellorId;
    @Column
    private String name;
    @Column
    private String phone;
    @Column
    private Integer state;

    public CounsellorsEntity() {
    }

    public CounsellorsEntity(Integer id, String counsellorId, String name, String phone, Integer state) {
        this.id = id;
        this.counsellorId = counsellorId;
        this.name = name;
        this.phone = phone;
        this.state = state;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCounsellorId() {
        return counsellorId;
    }

    public void setCounsellorId(String counsellorId) {
        this.counsellorId = counsellorId;
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

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

}