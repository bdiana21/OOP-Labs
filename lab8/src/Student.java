public class Student implements Cloneable {
    String nume;
    int id;
    Masina masina;
    public Student(String nume, int id, Masina masina){
        this.nume=nume;
        this.id=id;
        this.masina=masina;
    }
    public Student clone(){
        Student copieStudent;
        try {
            copieStudent = (Student)(super.clone());
        } catch (CloneNotSupportedException e) {
            System.out.println("not clonable");
            return null;
        }
    //    copieStudent.masina=masina.clone();
        copieStudent.masina=new Masina(masina.marca,masina.culoare, masina.id);
        return copieStudent;
    }
    @Override
    public String toString() {
        return "numele este "+ nume + ", id este "+id+", iar masina este " +masina;
    }
}
