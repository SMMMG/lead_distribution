package fr.mmo.lead.management.domain.dtos;

public class UserExistanceView {
    private boolean fullMatch;

    public boolean isFullMatch() {
	return fullMatch;
    }

    public void setFullMatch(boolean fullMatch) {
	this.fullMatch = fullMatch;
    }

    @Override
    public String toString() {
	return "UserExistanceView [fullMatch=" + fullMatch + "]";
    }

}
