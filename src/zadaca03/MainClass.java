package zadaca03;

public class MainClass {
public static void main(String [] args) {
	Proizvod proizvod1 = new Proizvod();
	System.out.println("Ime na proizvod: "+proizvod1.getImeNaProizvod());
	System.out.println("Cenata e: "+proizvod1.getCena());
	System.out.println("Proizvoditel e: "+proizvod1.getProizvoditel());
	System.out.println("Tezina na proizvodot: "+proizvod1.getTezina());
}
}
