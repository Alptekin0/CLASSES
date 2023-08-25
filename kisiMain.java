package Algoritma;

import java.util.ArrayList;

public class kisiMain {

	public static void main(String[] args) {
		
		ArrayList<kisiClass> birey = new ArrayList<>();
		kisiClass tmp = new kisiClass("Mehmet", 21);
		birey.add(tmp);
		
		birey.add(new kisiClass("Ali", 15));
		birey.add(new kisiClass("Zeynep", 10));
		
		//System.out.println(birey);
		
		for (kisiClass kisi : birey) {
			System.out.println(kisi);
			System.out.println("isim : "+kisi.getIsim()+" , yas: "+kisi.getYas());
		}

	}

}
