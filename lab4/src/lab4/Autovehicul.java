package lab4;

import java.awt.Color;

public class Autovehicul {
	
	private String marca;
	private float vitezaMax;
	private float vitezaCurenta;
	private Color culoare;
	private int treaptaCurenta;
	private int treaptaMax;
	private Sofer sofer;
	private Rezervor rezervor;

	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca=marca;
	}
	public Color getColor() {
		return culoare;
	}
	public void setColor(Color culoare) {
		this.culoare=culoare;
	}
	public float getViteza() {
		return vitezaCurenta;
	}
	public void setViteza(float viteza) {
		vitezaCurenta=viteza;
	}
	public int getTreapta() {
		return treaptaCurenta;
	}
	public void setTreapta(int treapta) {
		treaptaCurenta=treapta;
	}
	
	public Autovehicul(Sofer sofer,String marca,float vitezaMax,float vitezaCurenta,Color culoare,int treaptaCurenta,int treaptaMax, Rezervor rezervor) {
		this.sofer=sofer;
		this.marca=marca;
		this.vitezaMax=vitezaMax;
		this.vitezaCurenta=vitezaCurenta;
		this.culoare=culoare;
		this.treaptaCurenta=treaptaCurenta;
		this.treaptaMax=treaptaMax;
		this.rezervor=rezervor;
	}
	
	public void accelerare(float delta) {
		if(vitezaCurenta+delta>vitezaMax) vitezaCurenta=vitezaMax;
		else vitezaCurenta=vitezaCurenta+delta;
	}
	
	public void decelerare(float delta) {
		if(vitezaCurenta-delta<0) vitezaCurenta=0;
		else vitezaCurenta=vitezaCurenta-delta;
	}
	public void schimbare(int trepte) {
		if(treaptaCurenta+trepte>treaptaMax) treaptaCurenta=treaptaMax;
		else if(treaptaCurenta+trepte<0) treaptaCurenta=0;
		else treaptaCurenta=treaptaCurenta+trepte;
	}
	public void oprire() {
		vitezaCurenta=0;
		treaptaCurenta=0;
	}
	@Override
	public String toString() {
		return "soferul este " + sofer.getNume() +" si are "+sofer.getVarsta()+" ani si permisul cu nr " +sofer.getNrPermis() + ", iar marca "+ marca +", viteza curenta de " + vitezaCurenta+" si se afla in treapta de viteza "+ treaptaCurenta+ "nr maxim de litri al rezervorului este de "+rezervor.getLitriiMax()+", iar nr de litrii curent este de "+rezervor.getLitrii();
	}
}

