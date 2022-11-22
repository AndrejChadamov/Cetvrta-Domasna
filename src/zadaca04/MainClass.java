package zadaca04;

public class MainClass {
public static void main(String[] args) {
	Avtomobil avtomobil = new Avtomobil("Pezo", "307", 25000, "Zelena");
	
	System.out.println("Marka: "+avtomobil.getMarka());
	System.out.println("Model: "+avtomobil.getModel());
	System.out.println("Pominati km pred mnozenje: "+avtomobil.getPominatiKm());
	System.out.println("Pominati km posle mnozenje: "+avtomobil.KM(10));
	System.out.println("Boja: "+avtomobil.getBoja());
}
}