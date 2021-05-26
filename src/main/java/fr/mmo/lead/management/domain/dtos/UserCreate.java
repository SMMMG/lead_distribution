package fr.mmo.lead.management.domain.dtos;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class UserCreate {
    @NotNull
    @Size(min = 10, max = 25)
    @Size(min = 10, max = 25, message = "Le nom d'utilisateur doit posséder entre 10 et 25 caractères")
    private String userName;
    @NotNull
    @Size(min = 10, max = 10, message = "Le mot de passe doit posséder entre 10 et 25 caractères")
    private String password;

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

    @Override
    public String toString() {
	return "UserView [userName=" + userName + ", password=" + password + "]";
    }

}
