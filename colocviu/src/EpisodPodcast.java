public class EpisodPodcast extends Melodie{
   private int numarSezon;
    private int numarEpisod;

    public EpisodPodcast( String titlu, Interpret interpret, double durata, Boolean esteDisponibil, int numarEpisod, int numarSezon) {
        super(titlu, interpret, durata, esteDisponibil);
        this.numarEpisod=numarEpisod;
        this.numarSezon=numarSezon;
    }

    public int getNumarSezon() {
        return numarSezon;
    }

    public void setNumarSezon(int numarSezon) {
        this.numarSezon = numarSezon;
    }

    public int getNumarEpisod() {
        return numarEpisod;
    }

    public void setNumarEpisod(int numarEpisod) {
        this.numarEpisod = numarEpisod;
    }
}
