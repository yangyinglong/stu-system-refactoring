package cn.hdu.fragmentTax.dao.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Timestamp;


@Entity
public class PasswordEntity implements Serializable {

    @Id
    @GeneratedValue
    private Integer id;
    @Column
    private String account;
    @Column
    private String password;

    public PasswordEntity() {
    }

    public PasswordEntity(Integer id, String account, String password) {
        this.id = id;
        this.account = account;
        this.password = password;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

}