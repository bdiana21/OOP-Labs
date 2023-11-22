

public class Main {
    public static void main(String[] args) {
        Autobuz a1=new Autobuz(35);
        Motocicleta m1=new Motocicleta();
        Autovehicul[] parcare;
        Autovehicul auto;


        auto=new Autobuz(30); //polimorfism= in acelasi timp si autobuz si autovehicul
        auto.accelereaza(5); // din autobuz ia


    }
}