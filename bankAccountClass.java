package Algoritma;

public class bankAccountClass {
	
	private static int objectCount=0;
	
	private int id;
	private String name;

	public bankAccountClass() {
		objectCount++;
		id = objectCount;
	}
	
	public bankAccountClass(String name) {
		objectCount++;
		id = objectCount;
		this.name = name;
	}
	
	public int getId() {
		return id;
	}
	
	public String getName() {
		return name;
	}
	
	public static int numberOfAccount() {
		return objectCount;
	}
	
	

}
