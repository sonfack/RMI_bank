package metier;

import java.io.Serializable;
import java.util.Date;

public class Compte implements Serializable {
	private int  code; 
	private double solde; 
	private Date dateCreation;
	public int getCode() {
		return code;
	}
	public void setCode(int code) {
		this.code = code;
	}
	public double getSolde() {
		return solde;
	}
	public void setSolde(double solde) {
		this.solde = solde;
	}
	public Date getDateCreation() {
		return dateCreation;
	}
	public void setDateCreation(Date dateCreation) {
		this.dateCreation = dateCreation;
	}
	public Compte() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Compte(int code, double solde, java.util.Date date) {
		// TODO Auto-generated constructor stub
		this.code = code; 
		this.solde = solde; 
		this.dateCreation = (Date) date; 
	} 
	
}
