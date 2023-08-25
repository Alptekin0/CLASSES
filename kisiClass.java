package Algoritma;

public class kisiClass {
	
	private String isim;
	private int yas;
	
	public kisiClass(String isim , int yas) {
		this.setIsim(isim);
		this.setYas(yas);
	}
	
	public String getIsim() {
		return isim;
	}
	
	public int getYas() {
		return yas;
	}
	
	public void setIsim(String isim) {
		this.isim = isim;
	}
	
	public void setYas(int yas) {
		this.yas = yas;
	}
	
	public String toString() {
		return this.isim+" , "+this.yas;
	}

}
