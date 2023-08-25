package Algoritma;

public class bankAcocountMain {

	public static void main(String[] args) {
		
		bankAccountClass a=new bankAccountClass();
		
		//System.out.println("account a :"+a.getId()+","+a.getName());
		
		String[] names = {"Mehmet" ,"Emin" ,"Alptekin","Zeynep"};
		
		bankAccountClass a2=new bankAccountClass("Ali");
		System.out.println("account a2  :"+a2.getId()+","+a2.getName());
		
		bankAccountClass[] accounts =new bankAccountClass[4];
		
		for (int counter = 0; counter < accounts.length; counter++) {
			
			accounts[counter]=new bankAccountClass(names[counter]);
			System.out.println(counter +". account : " + accounts[counter].getId()+", "+accounts[counter].getName());
			
		}
		System.out.println("Hesap Sayisi : "+bankAccountClass.numberOfAccount());
	}

}
