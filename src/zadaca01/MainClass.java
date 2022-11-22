package zadaca01;

public class MainClass {
	public static void main (String[] args) {
Covek covek1 = new Covek();
covek1.SetIme("Nikola");
covek1.setPrezime("Karev");
covek1.setMaticenBr("121200344005");

System.out.println("Ime: "+covek1.getIme());
System.out.println("Prezime: "+covek1.getPrezime());
System.out.println("Maticen Broj: "+covek1.getMaticenBr());
}	
}