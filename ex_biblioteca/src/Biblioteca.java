import java.util.ArrayList;
import java.util.List;

public class Biblioteca implements ManagementBiblioteca{
    List<Carte> listaCarti= new ArrayList<>();

    @Override
    public void adaugareCarte(Carte carte) {
        listaCarti.add(carte);
    }

    @Override
    public void stergereCarte(Carte carte) {
        listaCarti.remove(carte);
    }

    @Override
    public void afisareCarti() {
        for(Carte carte:listaCarti){
            System.out.println(carte.detaliiCarte());
        }
    }
    public void verificarePagini(String nume, int nrPag) throws ExceptieNumarPagini {

        if(nrPag>300) {
            int depaseste=nrPag-300;
            throw new ExceptieNumarPagini("cartea "+ nume +" depaseste cu "+ depaseste+" de pagini");
        }
    }
}
