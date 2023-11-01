package lab5;

public class MatriceComplex {
	NumarComplex[][] matrice;
	
	public MatriceComplex(int rows, int col) {
		matrice=new NumarComplex[rows][col];
	}
	
	public MatriceComplex add(MatriceComplex b) {
		int rows=matrice.length;
		int col=matrice[0].length;
		MatriceComplex rezultat=new MatriceComplex(rows,col);
		for(int i=0;i<rows;i++) {
			for(int j=0;j<col;j++) {
				rezultat.matrice[i][j]=matrice[i][j].adunare(b.matrice[i][j]);
			}
		}
		return rezultat;
	}
	public MatriceComplex substract(MatriceComplex b) {
		int rows=matrice.length;
		int col=matrice[0].length;
		MatriceComplex rezultat=new MatriceComplex(rows,col);
		for(int i=0;i<rows;i++) {
			for(int j=0;j<col;j++) {
				rezultat.matrice[i][j]=matrice[i][j].scadere(b.matrice[i][j]);
			}
		}
		return rezultat;
	}
	
	public MatriceComplex multiplyBy(int b) {
		int rows=matrice.length;
		int col=matrice[0].length;
		MatriceComplex rezultat=new MatriceComplex(rows,col);
		for(int i=0;i<rows;i++) {
			for(int j=0;j<col;j++) {
				rezultat.matrice[i][j]=matrice[i][j].inmultireScalar(b);
			}
		}
		return rezultat;
	}
}
