package org.lesson.java.shop;

public class Smartphone extends Prodotto {
	
	private String imei;
	private int memoria;
	
	public Smartphone(String nome, String marca, double prezzo, int iva,String imei, int memoria) {
		super(nome, marca, prezzo, iva);
		this.imei = imei;
		this.memoria = memoria;
	}
	// get smartphone
	public String getImei() {
		return imei;
	}
	public int getMemoria() {
		return memoria;
	}
	
	//Set
	
	public void setImei(String imei) {
		this.imei = imei;
	}
	public void getMemoria(int memoria) {
		this.memoria = memoria;
	}
}
