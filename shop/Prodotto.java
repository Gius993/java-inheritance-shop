package org.lesson.java.shop;

import java.util.Random;

public class Prodotto {
	//Attributi prodotto
	
	private int codice;
	private String nome;
	private String marca;
	private double prezzo;
	private int iva;
	 	
	 
	//Costruttori
	 
	 public Prodotto (String nome, String marca, double prezzo, int iva) {
		 super();
		 this.nome = nome;
		 this.marca = marca;
		 this.prezzo = prezzo;
		 this.iva = iva;
		 this.codice = codiceCasuale();
	 }
	 //Metodi get

	 public int getCodice() {
		 return codice;
	 }
		public String getNome() {
			return nome;
		}

		public String getMarca() {
			return marca;
		}
		public double getPrezzo() {
			return prezzo;
		}
		public int getIva() {
			return iva;
		}

		
		public void setIva(int iva) {
			this.iva = iva;
		}
		
		public void setPrezzo(double prezzo) {
			this.prezzo = prezzo;
		}
		
		public void setMarca(String marca) {
			this.marca = marca;
		}
		
		public void setNome(String nome) {
			this.nome = nome;
		}
		

		// Metodo
		
		public double prezzoTotale() {
			double prezzoIva = (prezzo / 100) * iva + prezzo;
			return prezzoIva;
		}
		// per codice
		int codiceCasuale() {
			Random r = new Random();
			return r.nextInt(500);
		}
		
		
		//per nome esteso
		String nomeEsteso() {
			return nome + " il codice prodotto:  " + codice;
		}
}
