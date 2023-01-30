package org.lesson.java.shop;

public class Televisori extends Prodotto{
	private int dimensioni;
	private boolean tvSmart;
	
	public Televisori(String nome, String marca, double prezzo, int iva,int dimensioni, boolean tvSmart) {
		super(nome, marca, prezzo, iva);
		this.dimensioni = dimensioni;
		this.tvSmart = tvSmart;
	}
	
	public double getDimensioni() {
		return dimensioni;
	}
	public boolean getTv() {
		return tvSmart;
	}
	
	public void setDimensioni(int dimensioni) {
		this.dimensioni = dimensioni;
	}
	public void setSmart(boolean tvSmart) {
		this.tvSmart = tvSmart;
	}
	
	// Condizione in cui e smart
	
	private String sTv() {
		if(tvSmart) {
			return "smart tv";
		}else {
			return "tv normale";
		}
	}
}
