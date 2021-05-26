package fr.mmo.lead.management.domain.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import fr.mmo.lead.management.domain.enmus.UserRole;

@Entity
@Table(name = "USER")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // GenerationType.AUTO
    private Long Id;

    @Column(name = "user_login", nullable = false, unique = true)
    private String userName;
    @Column(name = "user_password", nullable = false, unique = false)
    private String password;
    @Column(name = "user_role")
    private UserRole role;

    public String getUserName() {
	return userName;
    }

    public void setUserName(String userName) {
	this.userName = userName;
    }

    public String getPassword() {
	return password;
    }

    public void setPassword(String password) {
	this.password = password;
    }

    public Long getId() {
	return Id;
    }

    public void setId(Long id) {
	Id = id;
    }

    public UserRole getRole() {
	return role;
    }

    public void setRole(UserRole role) {
	this.role = role;
    }

    @Override
    public String toString() {
	return "UserView [userName=" + userName + ", password=" + password + "]";
    }
}
