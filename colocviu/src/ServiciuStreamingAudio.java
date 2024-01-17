import java.util.ArrayList;
import java.util.List;

public class ServiciuStreamingAudio {
   private List<Melodie> listaMaterialeAudio = new ArrayList<>();
    private List<Abonat> listaAbonati = new ArrayList<>();
    private List<Interpret> listaInterpreti = new ArrayList<>();

    public List<Melodie> getListaMaterialeAudio() {
        return listaMaterialeAudio;
    }

    public List<Abonat> getListaAbonati() {
        return listaAbonati;
    }

    public List<Interpret> getListaInterpreti() {
        return listaInterpreti;
    }

    public ServiciuStreamingAudio() {
    }

    public void adaugaMaterial(Melodie m){
        listaMaterialeAudio.add(m);
    }
    public void stergeMaterial(Melodie m){
        listaMaterialeAudio.remove(m);
    }

    public void adaugaInterpret(Interpret i){
        listaInterpreti.add(i);
    }
    public  void stergeInterpret(Interpret i){
        listaInterpreti.remove(i);
    }

    public void adaugaAbonat(Abonat a){
        listaAbonati.add(a);
    }

    public void afiseazaMateriale(){
        for(Melodie m:listaMaterialeAudio){
            System.out.println(m.getTitlu());
        }
    }

    public void stregeAbonat(Abonat a){
        listaAbonati.remove(a);
    }
}
