package Hafta2;

public class distanceFromOriginMain {

	public static void main(String[] args) {

		distanceFromOriginClass p1 = new distanceFromOriginClass();
		p1.a = 3;
		p1.b = 4;

		System.out.println("orijine olan uzaklik : " + p1.distanceFromOrigin());

		p1.translate(2, 8);
		System.out.println("orijine olan uzaklik : " + p1.distanceFromOrigin());

	}
 
}
