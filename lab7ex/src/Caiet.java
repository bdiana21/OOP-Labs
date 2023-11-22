public class Caiet extends Rechizite{
    public Caiet(String eticheta){
        super(eticheta);
    }
    @Override
    public String getNume(){
        return this.eticheta +"Caiet";
    }
}
