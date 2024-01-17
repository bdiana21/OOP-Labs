import java.util.ArrayList;
import java.util.List;

public class Zoo implements ZooManagement{
    List<Animal> listaAnimale = new ArrayList<>();;
    int k=0;
    @Override
    public void adaugareAnimal(Animal animal) {
        listaAnimale.add(animal);
    }

    @Override
    public void stergereAnimal(Animal animal) {
        listaAnimale.remove(animal);
    }

    @Override
    public void afisareAnimale() {
        for(Animal animal: listaAnimale){
            System.out.println(animal.getNume());
        }
    }

    public void verificareGreutate(String numeAnimal, int greutateAnimal) throws ExceptieGreutate{
        if (greutateAnimal>300){
            int depaseste=greutateAnimal-300;
            throw new ExceptieGreutate("Animalul "+ numeAnimal+" depaseste greutatea cu "+ depaseste);
        }
    }
}
