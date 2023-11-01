package lab5;

public class NumarComplex {
	private int parteReala;
	private int parteIm;
	public NumarComplex(int parteReala, int parteIm) {
		this.parteIm=parteIm;
		this.parteReala=parteReala;
	}
	public NumarComplex adunare(NumarComplex b) {
		NumarComplex rezultat=new NumarComplex(0,0);
		rezultat.parteReala=b.parteReala+parteReala;
		rezultat.parteIm=b.parteIm+parteIm;
		return rezultat;
	}
	@Override
	public String toString() {
		return parteReala + "+" + parteIm + "*i";
	}
	public NumarComplex scadere(NumarComplex b) {
		NumarComplex rezultat=new NumarComplex(0,0);
		rezultat.parteReala=parteReala-b.parteReala;
		rezultat.parteIm=parteIm-b.parteIm;
		return rezultat;
	}
	public NumarComplex inmultire(NumarComplex b) {
		NumarComplex rezultat=new NumarComplex(0,0);
		rezultat.parteReala=parteReala*b.parteReala-parteIm*b.parteIm;
		rezultat.parteIm=parteReala*b.parteIm+parteIm*b.parteReala;
		return rezultat;
	}
	public NumarComplex inmultireScalar(int b) {
		NumarComplex rezultat=new NumarComplex(0,0);
		rezultat.parteReala=parteReala*b;
		rezultat.parteIm=parteIm*b;
		return rezultat;
	}
	
	
}
