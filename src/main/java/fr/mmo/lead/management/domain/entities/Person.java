package fr.mmo.lead.management.domain.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "person")
public class Person {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // GenerationType.AUTO
    private Long Id;
    @Column(name = "user_name", nullable = false, unique = false)
    private String firstName;
    @Column
    private String lastName;
    @Column(nullable = true)
    private String adress;
    @Column
    private String postalCode;
    @Column
    private String town;
    @Column
    private String tel;
    @Column
    private String email;

    public Long getId() {
	return Id;
    }

    public void setId(Long id) {
	Id = id;
    }

    public String getFirstName() {
	return firstName;
    }

    public void setFirstName(String firstName) {
	this.firstName = firstName;
    }

    public String getLastName() {
	return lastName;
    }

    public void setLastName(String lastName) {
	this.lastName = lastName;
    }

    public String getAdress() {
	return adress;
    }

    public void setAdress(String adress) {
	this.adress = adress;
    }

    public String getPostalCode() {
	return postalCode;
    }

    public void setPostalCode(String postalCode) {
	this.postalCode = postalCode;
    }

    public String getTown() {
	return town;
    }

    public void setTown(String town) {
	this.town = town;
    }

    public String getTel() {
	return tel;
    }

    public void setTel(String tel) {
	this.tel = tel;
    }

    public String getEmail() {
	return email;
    }

    public void setEmail(String email) {
	this.email = email;
    }

}
