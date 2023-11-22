public class Ghiozdan {

    Rechizite[] lista= new Rechizite[105];


   static int elemLista=0;
    public void add(Caiet caietul){
        lista[elemLista]=caietul;
        elemLista++;
    }
    public void add(Manual manualul){
        lista[elemLista]=manualul;
        elemLista++;
    }
    public void listItems(){
        for(int i=0;i<elemLista;i++){
            if(lista[i] instanceof Manual){
                System.out.println("Manual "+lista[i].getNume());
            }
            else {
                System.out.println("Caiet "+lista[i].getNume());
            }

        }
    }

    public void listManual(){
        for(int i=0;i<elemLista;i++){
            if(lista[i] instanceof Manual){
                System.out.println("Manual "+lista[i].getNume());
            }
        }
    }

    public void listCaiet(){
        for(int i=0;i<elemLista;i++){
            if(lista[i] instanceof Caiet){
                System.out.println("Caiet "+lista[i].getNume());
            }

        }
    }

    public void getNrRechizite(){
        System.out.println(" nr de rechizite este "+ elemLista);
    }

    public void getNrManuale(){
        int k=0;
        for(int i=0;i<elemLista;i++){
            if(lista[i] instanceof Manual){
                k++;
            }
        }
        System.out.println("nr de manuale este "+ k);
    }
    public void getNrCaiete(){
        int k=0;
        for(int i=0;i<elemLista;i++){
            if(lista[i] instanceof Caiet){
                k++;
            }
        }
        System.out.println("nr de caiete este "+ k);
    }
}
