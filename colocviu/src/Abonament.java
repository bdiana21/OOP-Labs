public class Abonament implements Cloneable{
    private int idAbonament;
    private String tipAbonament;

    public Abonament(int idAbonament, String tipAbonament) {
        this.idAbonament = idAbonament;
        this.tipAbonament = tipAbonament;
    }

    public int getIdAbonament() {
        return idAbonament;
    }

    public void setIdAbonament(int idAbonament) {
        this.idAbonament = idAbonament;
    }

    public String getTipAbonament() {
        return tipAbonament;
    }

    public void setTipAbonament(String tipAbonament) {
        this.tipAbonament = tipAbonament;
    }

    public void clonare(Abonament abonament1) throws CloneNotSupportedException {
        Abonament abon= (Abonament) abonament1.clone();
        idAbonament=abon.getIdAbonament();
        tipAbonament=getTipAbonament();

    }
}
