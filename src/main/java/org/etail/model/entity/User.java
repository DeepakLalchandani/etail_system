package org.etail.model.entity;

import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "usr", schema = "etail_trn")
public class User {
    @Column(name = "usr_id")
    @Id
    private String userId;

    @Column(name = "eml")
    private String email;

    @Column(name = "frst_nm")
    private String firstName;

    @Column(name = "lst_nm")
    private String lastName;

    @Column(name = "usr_role_typ")
    private String userRoleType;

    @Column(name = "pswrd")
    private String password;

    @Column(name = "crtd_ts")
    private LocalDateTime createdTs;

    @Column(name = "updtd_ts")
    private LocalDateTime updatedTs;

    public String getUserId() {
        return userId;
    }

    public String getEmail() {
        return email;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getUserRoleType() {
        return userRoleType;
    }

    public String getPassword() {
        return password;
    }

    public LocalDateTime getCreatedTs() {
        return createdTs;
    }

    public LocalDateTime getUpdatedTs() {
        return updatedTs;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setUserRoleType(String userRoleType) {
        this.userRoleType = userRoleType;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setCreatedTs(LocalDateTime createdTs) {
        this.createdTs = createdTs;
    }

    public void setUpdatedTs(LocalDateTime updatedTs) {
        this.updatedTs = updatedTs;
    }

}
