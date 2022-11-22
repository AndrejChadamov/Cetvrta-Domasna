package zadaca03;

public class Proizvod {
private String ImeNaProizvod;
private int Cena;
private String Proizvoditel;
private int Tezina;

public Proizvod () {
	this.ImeNaProizvod="Choco stobi flips";
	this.Cena=50;
    this.Proizvoditel="Vitaminka";
    this.Tezina=75;
}
public String getImeNaProizvod() {
	return ImeNaProizvod;
}
public void setImeNaProizvod(String ImeNaProizvod) {
	this.ImeNaProizvod=ImeNaProizvod;
}
public int getCena() {
	return Cena;
}
public void setCena(int Cena) {
	this.Cena=Cena;
}
public String getProizvoditel() {
	return Proizvoditel;
}
public void setProizvoditel(String Proizvoditel) {
	this.Proizvoditel=Proizvoditel;
}
public int getTezina() {
	return Tezina;
}
public void setTezina(int Tezina) {
	this.Tezina=Tezina;
}
}