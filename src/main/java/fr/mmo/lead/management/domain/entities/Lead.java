package fr.mmo.lead.management.domain.entities;

import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.annotations.CreationTimestamp;

@Entity
@Table(name = "lead")
public class Lead {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;

    @CreationTimestamp
    private LocalDateTime createDateTime;

    // @UpdateTimestamp
    // private LocalDateTime updateDateTime;

    @OneToOne
    @JoinColumn(name = "person_fk")
    private Person person;

    private int nombreEmprunteur;
    private int nombrPersonneDuFoyer;;
    private float montantRevenuMensuel; // montant total des revenu du foyer
    private float totalCreditImmo;// le montant total crédit immobilier restant
    private float totalCreditConso; // le montant total crédit conso restant
    private float totalMensualiteImmo; // le montant total des mensulités des crédits immoboliers
    private float totalMensualiteConso; // le montant total des mensulités des crédits conso

    private float TotalChargesHorsCredit;
    private float NouveauCreditImmo;
    private float NouveauCreditConso;
    private float Prix;

    public Long getId() {
	return Id;
    }

    public void setId(Long id) {
	Id = id;
    }

    public LocalDateTime getCreateDateTime() {
	return createDateTime;
    }

    public void setCreateDateTime(LocalDateTime createDateTime) {
	this.createDateTime = createDateTime;
    }

    public Person getPerson() {
	return person;
    }

    public void setPerson(Person person) {
	this.person = person;
    }

    public int getNombreEmprunteur() {
	return nombreEmprunteur;
    }

    public void setNombreEmprunteur(int nombreEmprunteur) {
	this.nombreEmprunteur = nombreEmprunteur;
    }

    public int getNombrPersonneDuFoyer() {
	return nombrPersonneDuFoyer;
    }

    public void setNombrPersonneDuFoyer(int nombrPersonneDuFoyer) {
	this.nombrPersonneDuFoyer = nombrPersonneDuFoyer;
    }

    public float getMontantRevenuMensuel() {
	return montantRevenuMensuel;
    }

    public void setMontantRevenuMensuel(float montantRevenuMensuel) {
	this.montantRevenuMensuel = montantRevenuMensuel;
    }

    public float getTotalCreditImmo() {
	return totalCreditImmo;
    }

    public void setTotalCreditImmo(float totalCreditImmo) {
	this.totalCreditImmo = totalCreditImmo;
    }

    public float getTotalCreditConso() {
	return totalCreditConso;
    }

    public void setTotalCreditConso(float totalCreditConso) {
	this.totalCreditConso = totalCreditConso;
    }

    public float getTotalMensualiteImmo() {
	return totalMensualiteImmo;
    }

    public void setTotalMensualiteImmo(float totalMensualiteImmo) {
	this.totalMensualiteImmo = totalMensualiteImmo;
    }

    public float getTotalMensualiteConso() {
	return totalMensualiteConso;
    }

    public void setTotalMensualiteConso(float totalMensualiteConso) {
	this.totalMensualiteConso = totalMensualiteConso;
    }

    public float getTotalChargesHorsCredit() {
	return TotalChargesHorsCredit;
    }

    public void setTotalChargesHorsCredit(float totalChargesHorsCredit) {
	TotalChargesHorsCredit = totalChargesHorsCredit;
    }

    public float getNouveauCreditImmo() {
	return NouveauCreditImmo;
    }

    public void setNouveauCreditImmo(float nouveauCreditImmo) {
	NouveauCreditImmo = nouveauCreditImmo;
    }

    public float getNouveauCreditConso() {
	return NouveauCreditConso;
    }

    public void setNouveauCreditConso(float nouveauCreditConso) {
	NouveauCreditConso = nouveauCreditConso;
    }

    public float getPrix() {
	return Prix;
    }

    public void setPrix(float prix) {
	Prix = prix;
    }
}
