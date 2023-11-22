public class Autobuz extends Autovehicul{
    int ruta;
    public Autobuz(int ruta){
        //daca avem constructor gol nu avem nevoie de super
        //super() se apeleaza automat si merge la constructorul clasei de deasupra
        super(new Sofer()); // pentru constructor cu parametrii
        this.ruta=ruta;
    }
    @Override
    void accelereaza(double delta){
        if(vitezaCurenta<vitezaMaxima)
            vitezaCurenta=vitezaCurenta+delta;
    }

}
