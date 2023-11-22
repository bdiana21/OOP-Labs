import java.awt.*;
import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Masina masina1=new Masina("audi", "negru",1);
        Student student=new Student("diana",1,masina1);
        Student student1;
        student1=student.clone();
        System.out.println(student);
        System.out.println(student1);

        student1.masina.vopseste("albastru");
        System.out.println(student);
        System.out.println(student1);

        Masina[] masini;
        masini=new Masina[3];
        Masina m1=new Masina("audi","rosu",3);
        Masina m2= new Masina("logan","albastru",2);
        Masina m3= new Masina("bmw","negru",1);
        masini[0]=m1;
        masini[1]=m2;
        masini[2]=m3;
        Arrays.sort(masini);
        for(int i=0;i<masini.length;i++){
            System.out.println(masini[i]);
        }

        String a1="ana are mere";
        String a2="bianca are mere";
        System.out.println(a1.compareTo(a2));

        String a3="ana are mere";
        String a4="antonia are mere";
        System.out.println(a3.compareTo(a4));
    }
}