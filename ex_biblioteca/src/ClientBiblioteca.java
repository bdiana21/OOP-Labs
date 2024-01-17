public class ClientBiblioteca {
    private  String nume;
    private int ID;
    private int varsta;

    public ClientBiblioteca(String nume, int ID, int varsta) {
        this.nume = nume;
        this.ID = ID;
        this.varsta = varsta;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public int getVarsta() {
        return varsta;
    }

    public void setVarsta(int varsta) {
        this.varsta = varsta;
    }

    public void imprumut(Carte carte) throws ExceptieCarteDeteriorata {
        if(carte.getGradUzura()>8){
            throw new ExceptieCarteDeteriorata("carte intr o stare rea");
        }
        else{
            System.out.println("Clientul "+ nume+ " a imprumutat "+ carte.detaliiCarte());
            carte.setPopularitate(carte.getPopularitate()+1);
        }
    }
}
