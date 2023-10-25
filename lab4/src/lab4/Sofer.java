package lab4;

public class Sofer {
	private String nume;
	private int varsta;
	private int nrPermis;
	public String getNume() {
		return nume;
	}
	public void setMarca(String nume) {
		this.nume=nume;
	}
	public int getVarsta() {
		return varsta;
	}
	public void setMarca(int varsta) {
		this.varsta=varsta;
	}
	public int getNrPermis() {
		return nrPermis;
	}
	public void setNrPermis(int permis) {
		this.nrPermis=permis;
	}
	public Sofer(String nume,int varsta, int nrPermis) {
		this.nume=nume;
		this.varsta=varsta;
		this.nrPermis=nrPermis;
	}
}
