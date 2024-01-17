public abstract class Carte {
    private String titlu;
    private int nrPagini;
    private String autor;
    private int popularitate;
    private int gradUzura;
    private int ID;
    public abstract String detaliiCarte();

    public Carte(String titlu, int nrPagini, String autor, int popularitate, int gradUzura, int ID) {
        this.titlu = titlu;
        this.nrPagini = nrPagini;
        this.autor = autor;
        this.popularitate = popularitate;
        this.gradUzura = gradUzura;
        this.ID = ID;
    }

    public void setTitlu(String titlu) {
        this.titlu = titlu;
    }

    public void setNrPagini(int nrPagini) {
        this.nrPagini = nrPagini;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setPopularitate(int popularitate) {
        this.popularitate = popularitate;
    }

    public void setGradUzura(int gradUzura) {
        this.gradUzura = gradUzura;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getTitlu() {
        return titlu;
    }

    public int getNrPagini() {
        return nrPagini;
    }

    public String getAutor() {
        return autor;
    }

    public int getPopularitate() {
        return popularitate;
    }

    public int getGradUzura() {
        return gradUzura;
    }

    public int getID() {
        return ID;
    }
}
