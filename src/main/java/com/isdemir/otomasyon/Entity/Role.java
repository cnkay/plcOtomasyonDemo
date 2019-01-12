package com.isdemir.otomasyon.Entity;

/*import javax.persistence.*;*/

/*@Entity
@Table(name="user")*/
public class Role {
    /*@Column(name="role")*/
    private String role;

    public Role(String role) {
        this.role = role;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) { this.role = role; }
}
