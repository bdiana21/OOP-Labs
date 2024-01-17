public abstract class Animal {
    private String nume;
    private int greutate;
    private int varsta;
    private int popularitate;
    private String sanatate;
    public abstract String sunet();

    public String getNume() {
        return nume;
    }

    public int getGreutate() {
        return greutate;
    }

    public int getVarsta() {
        return varsta;
    }

    public int getPopularitate() {
        return popularitate;
    }

    public String getSanatate() {
        return sanatate;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public void setGreutate(int greutate) {
        this.greutate = greutate;
    }

    public void setVarsta(int varsta) {
        this.varsta = varsta;
    }

    public void setPopularitate(int popularitate) {
        this.popularitate = popularitate;
    }

    public void setSanatate(String sanatate) {
        this.sanatate = sanatate;
    }

    public Animal(String nume, int greutate, int varsta, int popularitate, String sanatate) {
        this.nume = nume;
        this.greutate = greutate;
        this.varsta = varsta;
        this.popularitate = popularitate;
        this.sanatate = sanatate;
    }


}
