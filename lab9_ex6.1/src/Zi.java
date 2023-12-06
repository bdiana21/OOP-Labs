public class Zi {
    String nume;
    boolean propZi;

    public Zi(String nume, boolean propZi){
        this.nume=nume;
        this.propZi=propZi;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public String getNume() {
        return nume;
    }
    public void setLucratoare(){
        propZi=true;
    }

    public void setNelucratoare(){
        propZi=false;
    }

    public boolean esteLucratoare(){
        return propZi;
    }
}
