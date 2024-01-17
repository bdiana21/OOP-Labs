public class Mamifer extends Animal{
    public Mamifer(String nume, int greutate, int varsta, int popularitate, String sanatate) {
        super(nume, greutate, varsta, popularitate, sanatate);
    }

    @Override
    public String sunet() {

        return "sunet1";
    }
}
