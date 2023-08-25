package Hafta2;

public class ogrenciMain {

	public static void main(String[] args) {

		  ogrenciClass[] array=new ogrenciClass[1];
		  
		  array[0]=new ogrenciClass();
		  array[0].ogrenciNo=20;
		  array[0].ogrenciAd="Mehmet Emin";
		  array[0].ogrenciSoyad="Alptekin";
		 System.out.println(array[0].ogrenciNo+ " , " + array[0].ogrenciAd + ", " + array[0].ogrenciSoyad);
		  
		 System.out.println(array[0].toString());
		 
		 System.out.println(array[0]); 
		
	}

}