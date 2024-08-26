/*
package com.example.spring_boot_app.Model;

import jakarta.persistence.*;

import java.util.Set;

@Entity
@Table(name="roles")
public class Role {
    @Id
    @Column(name = "role_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "role_name")
    private String role_name;

    @OneToMany(mappedBy = "users", fetch = FetchType.EAGER)
    private Set<UserRole> userRoles;

    public Role(){
        super();
    }

    public Role(Long id, String name, Set<UserRole> userRoles) {
        super();
        this.id = id;
        this.role_name = role_name;
        this.userRoles = userRoles;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return role_name;
    }

    public void setName(String role_name) {
        this.role_name = role_name;
    }

    public Set<UserRole> getUserRoles() {
        return userRoles;
    }

    public void setUserRoles(Set<UserRole> userRoles) {
        this.userRoles = userRoles;
    }
}
*/
