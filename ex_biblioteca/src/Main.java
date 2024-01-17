// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Fictiune f1=new Fictiune("f1",200,"diana",2,9,1);
        Fictiune f2=new Fictiune("f2",500,"diana2",2,4,1);
        Fictiune f3=new Fictiune("f3",500,"diana3",2,4,1);
        Istorie i1=new Istorie("i1",400,"ana",8,5,2);
        Istorie i2=new Istorie("i2",100,"ana",8,9,2);
        Filozofie filo=new Filozofie("filo",250,"lu",4,3,4);

        Biblioteca b=new Biblioteca();
        b.adaugareCarte(f1);
        b.adaugareCarte(f2);
        b.adaugareCarte(f3);
        b.adaugareCarte(i1);
        b.adaugareCarte(i2);
        b.adaugareCarte(filo);

        b.afisareCarti();

        b.stergereCarte(f3);
        b.afisareCarti();

        for (Carte c:b.listaCarti){
            try {
                b.verificarePagini(c.getTitlu(),c.getNrPagini());
               // c.detaliiCarte();
            }catch(ExceptieNumarPagini e){
                System.out.println(e.getMessage());
            }
        }

        ClientBiblioteca client=new ClientBiblioteca("diana",1,20);
        for (Carte c:b.listaCarti){
            try {
                client.imprumut(c);
            }catch (ExceptieCarteDeteriorata e){
                System.out.println(e.getMessage());
            }
        }
    }

}