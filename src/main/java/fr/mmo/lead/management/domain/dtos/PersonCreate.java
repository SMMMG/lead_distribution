package fr.mmo.lead.management.domain.dtos;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;

public class PersonCreate {
    @NotNull
    private String firstName;
    @NotNull
    private String lastName;
    @NotNull
    private String adress;
    @NotNull
    private String postalCode;
    @NotNull
    private String town;
    @NotNull
    private String tel;
    @NotNull
    @Email
    private String email;

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

    @Override
    public String toString() {
	return "PersonCreate [firstName=" + firstName + ", lastName=" + lastName + ", adress=" + adress
		+ ", postalCode=" + postalCode + ", town=" + town + ", tel=" + tel + ", email=" + email + "]";
    }

}
