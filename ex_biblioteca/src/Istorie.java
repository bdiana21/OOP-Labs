public class Istorie extends Carte{
    public Istorie(String titlu, int nrPagini, String autor, int popularitate, int gradUzura, int ID) {
        super(titlu, nrPagini, autor, popularitate, gradUzura, ID);
    }

    @Override
    public String detaliiCarte() {
        return "Istorie, avand titlul "+ getTitlu()+" si autorul "+getAutor();
    }
}
