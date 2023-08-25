package Algoritma;

public class AramaAlgoritmasi {

	public static void main(String[] args) {

		int sayilar[] = {21, 01, 02, 27, 44, 31, 63, 79, 80, 46};
		int sayilar2[] = {01, 02, 21, 27, 31, 44, 46, 63, 79, 80};
		
		
		

		int index = kontrol(sayilar, 63);

		if (index != -1) {
			System.out.println("Aranan eleman bulundu dizide " + index + ". sirada");
		} 
		else {
			System.out.println("Aranan eleman bulunamadi.");
		}
		
		
		
		
		int index2 = kontrol2(sayilar2 , 11);
		
		if (index2 != -1) {
			System.out.println("Aranan eleman bulundu dizide " + index2 + ". sirada");
		} 
		else {
			System.out.println("Aranan eleman bulunamadi.");
		}
		
		
		
		
        int index3 = binarySearch(sayilar2, 21);
		
		if (index3 != -1) {
			System.out.println("Aranan eleman bulundu dizide " + index3 + ". sirada");
		} 
		else {
			System.out.println("Aranan eleman bulunamadi.");
		}
		
		
		
		int sayilar3[] = {7, 18 ,24, 45, 64, 78, 92};

		int index4 = binarySearchR(sayilar3, 78, 0, sayilar3.length-1);
		
		if (index4 != -1) {
			System.out.println("Aranan eleman bulundu dizide " + index4 + ". sirada");
		} 
		else {
			System.out.println("Aranan eleman bulunamadi.");
		}


	}
	
	
	public static int binarySearchR(int[] sayilar, int hedef, int min, int max) {
		
		if (min > max) {
			return -1;
		}
		else {
			int mid =(min + max) /2;
			if (sayilar[mid] == hedef) {
				return mid;
			}
			else if (sayilar[mid] < hedef) {
				return binarySearchR(sayilar, hedef, mid+1, max);
			}
			else {
				return binarySearchR(sayilar, hedef, min, mid-1);
			}
		}
	}
	
	
	
	
	public static int binarySearch(int[] sayilar, int hedef) {
	
		int min =0;
		int max = sayilar.length-1;
		
		while (min <= max) {
			
			int mid = (min+max) / 2;
			
			if (sayilar[mid] == hedef) {
				return mid;
			}
			else if (sayilar[mid] < hedef) {
				min = mid + 1;
			}
			else {
				max = mid - 1;
			}
		}

		
		return -1;
	}

	
	
	public static int kontrol(int[] sayilar, int hedef) {

		for (int counter = 0; counter < sayilar.length; counter++) {

			if (sayilar[counter] == hedef) {
				return counter;
			}

		}
		return -1;
	}
	
	

	
	
	public static int kontrol2(int[] sayilar, int hedef) {
		
		int index = 0;
		
		while (index < sayilar.length && sayilar[index] <= hedef) {
			
			if (sayilar[index] == hedef) {
				return index;
			}
			else {
				index++;
			}
			
		}
		return -1;
	}

	
	
	

}
