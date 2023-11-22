
public class Masina implements Cloneable,Comparable{
    String marca;
    String culoare;
    int id;
    public Masina(String marca, String culoare, int id){
        this.marca=marca;
        this.culoare=culoare;
        this.id=id;
    }

    @Override
    public String toString() {
        return "marca "+ marca+ ", culoarea "+ culoare+", iar id este "+id;
    }

    public void vopseste(String culoare){
        this.culoare=culoare;
    }

    public Masina clone(){
        try {
            return  (Masina)(super.clone());
        } catch (CloneNotSupportedException e) {
            System.out.println("not clonable");
            return null;
        }
    }

    @Override
    public int compareTo(Object o) {
        Masina temp= (Masina) o;
        if(id<temp.id){
            return  -1;
        }
        else if(id==temp.id){
            return 0;
        }
        else{
            return 1;
        }

        // return(id-temp.id)
    }
}
