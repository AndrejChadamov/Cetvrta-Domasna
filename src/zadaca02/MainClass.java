package zadaca02;

public class MainClass {
public static void main(String[] args) {
Restoran restoran1 = new Restoran();
restoran1.setImeNaRestoran("Aleksandrija");
restoran1.setLokacija("Centar");
restoran1.setTelefonskiBr("075555444");
restoran1.setBrNaSedista(100);

System.out.println("Imeto na restoranot e: "+restoran1.getImeNaRestoran()+" I se naoga na lokacja: "+restoran1.getLokacija());
System.out.println("Telefonski broj: "+restoran1.getTelefonskiBr()+" Broj na sedista: "+restoran1.getBrNaSedista());

}
}
