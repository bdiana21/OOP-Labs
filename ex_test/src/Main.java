import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    MatriceComplexa mat1=new MatriceComplexa(2,2);
    MatriceComplexa mat2=new MatriceComplexa(2,2);

    int linie=mat1.matrice.length;
    int coloana=mat1.matrice[0].length;

    for(int i=0;i<linie;i++){
        for(int j=0;j<coloana;j++){
            NumarComplex nr=new NumarComplex(i+1,j+1);
            mat1.matrice[i][j]=nr;
        }
    }
    mat2.matrice=mat1.matrice;
    mat2=mat2.add(mat1);
    for(int i=0;i<linie;i++){
        for(int j=0;j<coloana;j++){
            System.out.print(mat1.matrice[i][j]+" ");
        }
        System.out.print("\n");
    }
    for(int i=0;i<linie;i++){
        for(int j=0;j<coloana;j++){
            System.out.print(mat2.matrice[i][j]+" ");
        }
        System.out.print("\n");
    }
    mat2=mat2.substract(mat1);
    for(int i=0;i<linie;i++){
        for(int j=0;j<coloana;j++){
            System.out.print(mat2.matrice[i][j]+" ");
        }
        System.out.print("\n");
    }
    mat2=mat2.multiply(2);
    for(int i=0;i<linie;i++){
        for(int j=0;j<coloana;j++){
            System.out.print(mat2.matrice[i][j]+" ");
        }
        System.out.print("\n");
    }
        Scanner input=new Scanner(System.in);
        String value= input.nextLine();

}}