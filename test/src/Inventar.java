public class Inventar {
    Produs[] lista;
   public Inventar(int nrElemente){
       lista=new Produs[nrElemente];
    }
/*
    public void adaugaProdus(Produs p){
        if(p.getCantitateInStoc()<0) System.out.println("Eroare-nu se poate adauga");
        else {
            int ok = 1;
            int j=0;
            Produs[] lista2=new Produs[lista.length+1];
            lista2=lista;
            if (lista2 == null) {
                lista2[0] = p;
            }
            else{
                for(int i=0;i< lista.length;i++){
                    if(lista2[i]!=null){
                        if (p.getNume().equals(lista2[i].getNume())) ok = 0;
                    }
                    else j=i;

                }
                if(ok==1){
                    lista2[j]=p;
                }
            }
            lista=new Produs[lista2.length];
            lista=lista2;


            else {
                for (int i = 0; i < lista.length; i++) {
                    if (p.getNume().equals(lista[i].getNume())) ok = 0;
                }
                if (ok == 1) {
                    for (int i = 0; i <= lista.length; i++) {
                        if (lista[i] == null) lista[i] = p;
                    }
                }
            }
        }


    }*/

    public void adaugaProdus(Produs p){
        if(p.getCantitateInStoc()<0) System.out.println("Eroare-nu se poate adauga");
        else{

                int ok=1;
                int j=0;
                for(int i=0;i< lista.length;i++){
                    if(lista[i]!=null){
                        if (p.getNume().equals(lista[i].getNume())) ok = 0;
                    }

                }
                if(ok==1){
                    for(int i=0;i< lista.length;i++){
                        if(lista[i]==null){
                            j=i;
                            break;
                        }
                    }
                    lista[j]=p;
                }


        }
    }

    public void listeazaProduse(){
        for(int i=0;i< lista.length;i++){
            System.out.println(lista[i]);
        }
    }
    public Produs gasesteProdusDupaNume(String numeCautat){
        int ok=0;
        for(int i=0;i< lista.length;i++){
            if(numeCautat.equals(lista[i].getNume())){
                ok=1;
                return lista[i];
            }
        }
        if(ok==0){
           System.out.println(" produsul nu a fost gasit");
        }
        return null;
    }
}
