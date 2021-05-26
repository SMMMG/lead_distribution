package fr.mmo.lead.management.domain.dtos;

import javax.validation.Valid;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

public class LeadCreate {
    @NotNull
    @Valid
    private PersonCreate person;
    @Min(1)
    private int nombreEmprunteur;
    private int nombrPersonneDuFoyer;
    private float montantRevenuMensuel; // montant total des revenu du foyer
    private float totalCreditImmo;// le montant total crédit immobilier restant
    private float totalCreditConso; // le montant total crédit conso restant
    private float totalMensualiteImmo; // le montant total des mensulités des crédits immoboliers
    private float totalMensualiteConso; // le montant total des mensulités des crédits conso

    private float TotalChargesHorsCredit;
    private float NouveauCreditImmo;
    private float NouveauCreditConso;

    public PersonCreate getPerson() {
	return person;
    }

    public void setPerson(PersonCreate person) {
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

}
