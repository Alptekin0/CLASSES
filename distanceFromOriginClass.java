package Hafta2;

public class distanceFromOriginClass {
	int a;
	int b;

	public double distanceFromOrigin() {
		return Math.sqrt(a * a + b * b);
	}

	public void translate(int dx, int dy) {
		a += dx;
		b += dy;

	}

}
