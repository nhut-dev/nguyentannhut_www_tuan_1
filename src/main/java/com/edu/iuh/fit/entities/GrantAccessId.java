package com.edu.iuh.fit.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import org.hibernate.Hibernate;

import java.util.Objects;

@Embeddable
public class GrantAccessId implements java.io.Serializable {
    private static final long serialVersionUID = 4539480981676420845L;
    @Column(name = "role_id", nullable = false, length = 50)
    private String roleId;

    @Column(name = "account_id", nullable = false, length = 50)
    private String accountId;

    public String getRoleId() {
        return roleId;
    }

    public void setRoleId(String roleId) {
        this.roleId = roleId;
    }

    public String getAccountId() {
        return accountId;
    }

    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        GrantAccessId entity = (GrantAccessId) o;
        return Objects.equals(this.accountId, entity.accountId) &&
                Objects.equals(this.roleId, entity.roleId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(accountId, roleId);
    }

}