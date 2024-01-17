import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Abonat {

    private static int subscriberId=0;
    private String  nume;
    Abonament abonament;
    private List<Melodie> favoritesList= new ArrayList<>();

    public Abonat( String nume, Abonament abonament) {
        subscriberId = subscriberId+1;
        this.nume = nume;
        this.abonament = abonament;
    }

    public int getSubscriberId() {
        return subscriberId;
    }

    public void setSubscriberId(int subscriberId) {
        this.subscriberId = subscriberId;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public Abonament getAbonament() {
        return abonament;
    }

    public void setAbonament(Abonament abonament) {
        this.abonament = abonament;
    }

    public List<Melodie> getFavoritesList() {
        return favoritesList;
    }

    public void setFavoritesList(List<Melodie> favoritesList) {
        this.favoritesList = favoritesList;
    }

    public void modificaAbonament(Abonament abonamentNou){
        abonament=abonamentNou;
    }

    public void adaugaInListaFavoriteMelodii(Melodie m) throws PremiumNotEnabledException {
        if (abonament.getTipAbonament().equals("Premium")) {
            if (m.getEsteDisponibil()) {
                favoritesList.add(m);
            }
        }
            else {
               throw new PremiumNotEnabledException("abonatul "+ nume+" nu detine un abonament de tip premium si nu are lista de favorite");
           }

    }

    public void adaugaInListaFavoritePodcast(EpisodPodcast podcast) throws PremiumNotEnabledException {
        if (abonament.getTipAbonament().equals("Premium")) {
            if (podcast.getEsteDisponibil()) {
                favoritesList.add(podcast);
            }
        }
        else {
            throw new PremiumNotEnabledException("abonatul "+ nume+ " nu detine un abonament de tip premium si nu are lista de favorite");
        }
    }

    public void sorteazaListaFavorite(){
        if(abonament.getTipAbonament().equals("Premium")){
           // favoritesList.sort(Comparator.comparing(favoritesList.get()));
            favoritesList.sort(Comparator.comparing(Melodie::getTitlu));
        }
    }

    public void afiseazaListaFavorite(){
        if(abonament.getTipAbonament().equals("Premium")){
            for (Melodie m:favoritesList){
                System.out.println( m.getTitlu());
            }
        }
    }

    public boolean ascultaMateriale(Melodie m){
            if(m.getEsteDisponibil()) return true;
            else return false;
    }
}
