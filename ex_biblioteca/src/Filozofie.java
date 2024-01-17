public class Filozofie extends Carte {
    public Filozofie(String titlu, int nrPagini, String autor, int popularitate, int gradUzura, int ID) {
        super(titlu, nrPagini, autor, popularitate, gradUzura, ID);
    }

    @Override
    public String detaliiCarte() {
        return "Filozofie, avand titlul "+ getTitlu()+" si autorul "+getAutor();
    }
}
