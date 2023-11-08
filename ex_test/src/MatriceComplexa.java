public class MatriceComplexa {
    NumarComplex[][] matrice;
    public MatriceComplexa(int linii, int coloane){
        matrice= new NumarComplex[linii][coloane];
    }
    public MatriceComplexa add(MatriceComplexa a){
        int linie=matrice.length;
        int coloana =matrice[0].length;
        MatriceComplexa rezultat=new MatriceComplexa(linie,coloana);
        for(int i=0;i<linie;i++){
            for(int j=0;j<coloana;j++){
                rezultat.matrice[i][j]=matrice[i][j].adunare(a.matrice[i][j]);
            }
        }
        return rezultat;
    }

    public MatriceComplexa substract(MatriceComplexa a){
        int linie=matrice.length;
        int coloana =matrice[0].length;
        MatriceComplexa rezultat=new MatriceComplexa(linie,coloana);
        for(int i=0;i<linie;i++){
            for(int j=0;j<coloana;j++){
                rezultat.matrice[i][j]=matrice[i][j].scadere(a.matrice[i][j]);
            }
        }
        return rezultat;
    }

    public MatriceComplexa multiply(int a){
        int linie=matrice.length;
        int coloana =matrice[0].length;
        MatriceComplexa rezultat=new MatriceComplexa(linie,coloana);
        for(int i=0;i<linie;i++){
            for(int j=0;j<coloana;j++){
                rezultat.matrice[i][j]=matrice[i][j].inmultire(a);
            }
        }
        return rezultat;
    }
}
