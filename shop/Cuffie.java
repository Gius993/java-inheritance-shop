package org.lesson.java.shop;

public class Cuffie extends Prodotto{
	private String colore;
	private boolean wirless;
	public Cuffie(String nome, String marca, double prezzo, int iva, String colore, boolean wirless) {
		super(nome, marca, prezzo, iva);
		this.colore = colore;
		this.wirless = wirless;
	}
	
	public String getColore() {
		return colore;
	}
	public boolean getWirless() {
		return wirless;
	}
	
	public void setColore(String colore) {
		this.colore = colore;
	}
	public void setWirless(boolean wirless) {
		this.wirless = wirless;
	}
	private String cablateWireless() {
	    if (wirless) {
	    return "wireless";
	    } 
	    else {
	    return "cablate";
	     }
	}
}
