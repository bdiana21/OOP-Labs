public class Vizitator {
    private  String nume;
    private int ID;
    private int varsta;

    public Vizitator(String nume, int ID, int varsta) {
        this.nume = nume;
        this.ID = ID;
        this.varsta = varsta;
    }

    public void vizita(Animal animal) throws ExceptieAnimalNesanatos{

        if(animal.getSanatate().equals("nesanatos")){
            throw new ExceptieAnimalNesanatos("Animalul " +  animal.getNume() + " nu e sanatos");
        }
        else{
            System.out.println("Vizitatorul este "+nume+" ce are id= "+ID+
                    "si varsta "+varsta+", iar animalul vizitat este "+animal.getNume()+
                    "avand varsta "+animal.getVarsta()+", greutatea "+animal.getGreutate()+" si sanatatea "+animal.getSanatate()+
                    ", iar sunetul scos este "+animal.sunet());
            animal.setPopularitate(animal.getPopularitate()+1);
        }
    }
}
