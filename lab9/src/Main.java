import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       /*
        Scanner input =new Scanner(System.in);
        System.out.println("introduceti pin");
        do {
            try {
                int pin = input.nextInt();
                float i=1/pin;
                break;
            } catch (InputMismatchException e) {
                System.out.println("Caractere invalide");
                input.next();
            }
            catch (ArithmeticException ex)
            {
                System.out.println("pin nu se poate 0000");

            }

        }while(true);*/

        BankAccount cont=new BankAccount(8000);
        try{
            cont.retrageNumerar(9000);
        } catch (FondInsuficientException e) {
          // System.out.println("exceptie "+ e.getMessage());
        }
    }
}