public class Produs {
    private String nume;
    private Furnizor furnizor;
    private int pret;
    private int cantitateInStoc;
    public Produs(){
        nume="-";
        furnizor=new Furnizor();
        pret=0;
        cantitateInStoc=0;
    }
    public Produs(String nume,Furnizor furnizor,int pret,int cantitateInStoc){
        this.nume=nume;
        this.furnizor=furnizor;
        this.pret=pret;
        this.cantitateInStoc=cantitateInStoc;
    }

    public String getNume() {
        return nume;
    }

    public int getPret() {
        return pret;
    }

    public void setCantitateInStoc(int cantitateInStoc) {
        this.cantitateInStoc = cantitateInStoc;
    }

    public int getCantitateInStoc() {
        return cantitateInStoc;
    }

    public void setFurnizor(Furnizor furnizor) {
        this.furnizor = furnizor;
    }
    public Furnizor getFurnizor() {
        return furnizor;
    }

    @Override
    public String toString() {
        return "numele produsului "+nume+ ", furnizorul este "+furnizor.getNumeSRL()+", pretul este "+pret+ " si cantitatea in stoc este "+cantitateInStoc;
    }
}
