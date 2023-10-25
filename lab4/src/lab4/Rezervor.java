package lab4;

public class Rezervor {
	private float litriiMax;
	private float litriiCurent;
	public float getLitrii() {
		return litriiCurent;
	}
	public void setLitrii(float nrLitri) {
		litriiCurent=nrLitri;
	}
	public float getLitriiMax() {
		return litriiMax;
	}
	public void setLitriiMax(float nrLitri) {
		litriiMax=nrLitri;
	}
	public Rezervor(float litriiMax, float litriiCurent) {
		this.litriiCurent=litriiCurent;
		this.litriiMax=litriiMax;
	}
}
