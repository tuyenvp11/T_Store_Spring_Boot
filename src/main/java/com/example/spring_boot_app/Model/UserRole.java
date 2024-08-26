/*
package com.example.spring_boot_app.Model;

import jakarta.persistence.*;

@Entity
@Table(name = "users_roles")
public class UserRole { 
    @Id
    @Column(name = "user_role_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long user_role_id;

    @ManyToOne
    @JoinColumn(name = "user_id",referencedColumnName = "user_id")
    private User user;
    @ManyToOne
    @JoinColumn(name = "role_id",referencedColumnName = "role_id")
    private Role role;

    public UserRole() {
        super();
    }

    public UserRole(Long user_role_id, User user, Role role) {
        super();
        this.user_role_id = user_role_id;
        this.user = user;
        this.role = role;
    }

    public Long getUser_role_id() {
        return user_role_id;
    }

    public void setUser_role_id(Long user_role_id) {
        this.user_role_id = user_role_id;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }
}
*/
