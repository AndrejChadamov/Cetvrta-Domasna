package zadaca04;

public class Avtomobil {
private String Marka;
private String Model;
private double PominatiKm;
private String Boja;

public Avtomobil(String Marka, String Model, double PominatiKm, String Boja) {
	this.Marka=Marka;
	this.Model=Model;
	this.PominatiKm=PominatiKm;
	this.Boja=Boja;
}
public double KM(double pomnoziKm) {
double vkupniKm=PominatiKm * pomnoziKm;
return vkupniKm;
}
public String getMarka() {
	return Marka;
}
public void setMarka(String Marka) {
	this.Marka=Marka;
}
public String getModel() {
	return Model;
}
public void setModel(String Model) {
	this.Model=Model;
}
public double getPominatiKm() {
	return PominatiKm;
}
public void setPominatiKm(double PominatiKm) {
	this.PominatiKm=PominatiKm;
}
public String getBoja() {
	return Boja;
}
public void setBoja(String Boja) {
	this.Boja=Boja;
}
}
