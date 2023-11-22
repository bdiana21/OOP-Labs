// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Inventar inventar=new Inventar(5);
        Furnizor furnizor1=new Furnizor("Apidava","info123",5600);
        Furnizor furnizor2=new Furnizor("Lavazza","info23",10000);
        Furnizor furnizor3=new Furnizor("Lidl","info345",15200);
        Furnizor furnizor4=new Furnizor("Penny","info4",200);
        Furnizor furnizor5=new Furnizor("Profi","info5",300);
        Produs produs1=new Produs("miere",furnizor1,50,180);
        Produs produs2=new Produs("cafea",furnizor2,26,3000);
        Produs produs3=new Produs("lapte",furnizor3,5,37);
        Produs produs4=new Produs("paine",furnizor4,20,1809);
        Produs produs5=new Produs("ceai",furnizor5,2,694);


        inventar.adaugaProdus(produs1);
        inventar.adaugaProdus(produs2);
        inventar.adaugaProdus(produs3);
        inventar.adaugaProdus(produs4);
        inventar.adaugaProdus(produs5);

        inventar.listeazaProduse();

        String cafea="cafea";
        Produs produsCautat= inventar.gasesteProdusDupaNume(cafea);
        System.out.println("produsul cautat este: "+produsCautat);

        String salam="salam";
        produsCautat= inventar.gasesteProdusDupaNume(salam);
        System.out.println("produsul cautat este: "+produsCautat);

    }
}