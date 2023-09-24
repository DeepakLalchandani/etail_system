package org.etail.model.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import java.time.LocalDateTime;

@Entity
@Table(name = "usr", schema = "etail_trn")
public class User {
    @Column(name = "usr_id")
    @Id
    private String userId;

    @Column(name = "eml")
    private String email;

    @Column(name = "frst_nm")
    private String first_name;

    @Column(name = "lst_nm")
    private String last_name;

    @Column(name = "usr_role_typ")
    private String user_role_type;

    @Column(name = "pswrd")
    private String password;

    @Column(name = "crtd_ts")
    private LocalDateTime created_ts;

    @Column(name = "updtd_ts")
    private LocalDateTime updated_ts;

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public String getUser_role_type() {
        return user_role_type;
    }

    public void setUser_role_type(String user_role_type) {
        this.user_role_type = user_role_type;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public LocalDateTime getCreated_ts() {
        return created_ts;
    }

    public void setCreated_ts(LocalDateTime created_ts) {
        this.created_ts = created_ts;
    }

    public LocalDateTime getUpdated_ts() {
        return updated_ts;
    }

    public void setUpdated_ts(LocalDateTime updated_ts) {
        this.updated_ts = updated_ts;
    }

}
