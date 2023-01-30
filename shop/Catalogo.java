package org.lesson.java.shop;

import java.util.Scanner;


public class Catalogo {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
   
	System.out.println("Quanti prodotti?");
	int numeroProdotti = Integer.parseInt(scan.nextLine());
	
	Prodotto[] listaProdotti = new Prodotto[numeroProdotti];
	// ciclo per interazione
	
	for(int i = 0; i < listaProdotti.length; i++) {
		int count= i+1;
		System.out.println("Prodotto " + count + ": che prodotto vuoi inserire? smartphone - televisione - cuffie");
		String prodotto = scan.nextLine();
		//variabili primarie
		
		System.out.println("Nome: ");
		String nome = scan.nextLine();
		System.out.println("Marca: ");
		String marca = scan.nextLine();
		System.out.println("Prezzo: ");
		double prezzo = Double.parseDouble(scan.nextLine());
		System.out.println("Percentuale iva: ");
		int iva = Integer.parseInt(scan.nextLine());
		// condizioni
		if(prodotto.equalsIgnoreCase("smartphone")) {
			System.out.println("Imei: ");
			String imei = scan.nextLine();
			System.out.println("Memoria: ");
			int memoria = Integer.parseInt(scan.nextLine());
			listaProdotti[i] = new Smartphone(nome, marca,  prezzo, iva, imei, memoria);
			
		}else if(prodotto.equalsIgnoreCase("televisione")) {
			System.out.println("Pollici: ");
			int dimensioni = Integer.parseInt(scan.nextLine());
			System.out.println("Smart? si / no");
			String answer = scan.nextLine();
			boolean tvSmart = false;
			if(answer.equalsIgnoreCase("si")) {
				tvSmart = true;
			}
			
			listaProdotti[i] = new Televisori(nome, marca,  prezzo, iva, dimensioni, tvSmart);
		}else if(prodotto.equalsIgnoreCase("cuffie")) {
			System.out.println("Colore: ");
			String colore = scan.nextLine();
			System.out.println("Wirless?  si / no");
			String answer = scan.nextLine();
			boolean wireless = false;
			if(answer.equalsIgnoreCase("si")) {
				wireless = true;
			}
			
			listaProdotti[i] = new Cuffie(nome, marca, prezzo, iva, colore, wireless);
		}else {
			System.out.println("il prodotto non esiste");
			listaProdotti[i] = new Prodotto(null, null, 0, 0);
		}
	}
	
	for(int i = 0; i < listaProdotti.length; i++) {
		int counter = i+1;
		System.out.println("Prodotto " + counter + ": " + listaProdotti[i].getNome() + listaProdotti[i].getMarca() + listaProdotti[i].getPrezzo());
	}
	scan.close();
}


}
