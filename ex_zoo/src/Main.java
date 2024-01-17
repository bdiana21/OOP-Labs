
public class Main {
    public static void main(String[] args) {
        Zoo zoo1=new Zoo();
        Vizitator viz1=new Vizitator("Diana",1,20);

        Mamifer animal1=new Mamifer("leu",360,3,2,"sanatos");
        Mamifer animal2=new Mamifer("pui",200,3,2,"sanatos");
        Pasare pasare1=new Pasare("randunica",3,2,5,"nesanatos");
        Reptila reptila1=new Reptila("croco",60,4,0,"sanatos");

        zoo1.adaugareAnimal(animal1);
        zoo1.adaugareAnimal(animal2);
        zoo1.adaugareAnimal(pasare1);
        zoo1.adaugareAnimal(reptila1);

        zoo1.afisareAnimale();
        for(Animal animal: zoo1.listaAnimale){
            try{
                zoo1.verificareGreutate(animal.getNume(),animal.getGreutate());
            }catch (ExceptieGreutate e){
                System.out.println(e.getMessage());
            }
        }

        for(Animal animal: zoo1.listaAnimale){
            System.out.println(animal.sunet());
        }

        zoo1.stergereAnimal(animal1);

        zoo1.afisareAnimale();



        for(Animal animal: zoo1.listaAnimale){
            try{
                viz1.vizita(animal);

          }catch (ExceptieAnimalNesanatos e){
            System.out.println(e.getMessage());
         }
        }
    }
}