public class Fictiune extends Carte{
    public Fictiune(String titlu, int nrPagini, String autor, int popularitate, int gradUzura, int ID) {
        super(titlu, nrPagini, autor, popularitate, gradUzura, ID);
    }

    @Override
    public String detaliiCarte() {
        return "Fictiune, avand titlul "+ getTitlu()+" si autorul "+getAutor();
    }
}
