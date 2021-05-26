package fr.mmo.lead.management.domain.dtos;

public class UserView {
    private String userName;
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
