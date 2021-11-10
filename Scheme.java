package com.example.nsplayer2;

import java.time.LocalDate;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "scheme")
public class Scheme {

	
@Id
@Column(name = "schid")
private int SchemeID;	

@Column(name = "schname")
private String SchemeName;

@Column(name = "lastappldate")
private LocalDate LastApplyDate;

@Column(name = "amt")
private int Amount;


public int getSchemeID() {
	return SchemeID;
}
public void setSchemeID(int schemeID) {
	SchemeID = schemeID;
}
public String getSchemeName() {
	return SchemeName;
}
public void setSchemeName(String schemeName) {
	SchemeName = schemeName;
}
public LocalDate getLastApplyDate() {
	return LastApplyDate;
}
public void setLastApplyDate(LocalDate lastApplyDate) {
	LastApplyDate = lastApplyDate;
}
public int getAmount() {
	return Amount;
}
public void setAmount(int amount) {
	Amount = amount;
}

}
