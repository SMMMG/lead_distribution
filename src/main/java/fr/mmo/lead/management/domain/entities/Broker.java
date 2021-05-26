package fr.mmo.lead.management.domain.entities;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import fr.mmo.lead.management.domain.enmus.BrokerStatus;

@Entity
@Table(name = "broker")
public class Broker {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // GenerationType.AUTO
    private Long id;
    private String orias;
    private String companyName;
    private String siret;
    @OneToOne
    @JoinColumn(name = "person_fk")
    private Person person;

    @Enumerated(EnumType.ORDINAL)
    private BrokerStatus status;
    private float dailyBudget;
    private int maxNumLead;

    public Long getId() {
	return id;
    }

    public void setId(Long id) {
	this.id = id;
    }

    public String getOrias() {
	return orias;
    }

    public void setOrias(String orias) {
	this.orias = orias;
    }

    public String getCompanyName() {
	return companyName;
    }

    public void setCompanyName(String companyName) {
	this.companyName = companyName;
    }

    public String getSiret() {
	return siret;
    }

    public void setSiret(String siret) {
	this.siret = siret;
    }

    public Person getPerson() {
	return person;
    }

    public void setPerson(Person person) {
	this.person = person;
    }

    public BrokerStatus getStatus() {
	return status;
    }

    public void setStatus(BrokerStatus status) {
	this.status = status;
    }

    public float getDailyBudget() {
	return dailyBudget;
    }

    public void setDailyBudget(float dailyBudget) {
	this.dailyBudget = dailyBudget;
    }

    public int getMaxNumLead() {
	return maxNumLead;
    }

    public void setMaxNumLead(int maxNumLead) {
	this.maxNumLead = maxNumLead;
    }

    @Override
    public String toString() {
	return "Broker [orias=" + orias + ", companyName=" + companyName + ", siret=" + siret + ", person=" + person
		+ ", status=" + status + ", dailyBudget=" + dailyBudget + ", maxNumLead=" + maxNumLead + "]";
    }

}
