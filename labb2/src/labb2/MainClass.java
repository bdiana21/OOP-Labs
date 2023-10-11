package labb2;
import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		int inputValue=input.nextInt();
		System.out.println("valoarea citita de la tastatura este " +inputValue);
		
		int maxInt=Integer.MAX_VALUE;
		System.out.println(maxInt +1);
		
		int minInt=Integer.MIN_VALUE;
		System.out.println(minInt -1);
		
		try {
		System.out.println(maxInt/inputValue);
		}
		catch(ArithmeticException exception) {
			System.out.println("introdu o alta valoare");
			inputValue=input.nextInt();
		}
		System.out.println("noua valoare " +inputValue);
		
		//boolean a=5;
		//int a=1.4;
		
		
		float maxFloat=Float.MAX_VALUE;
		System.out.println(maxFloat*3);
	}

}
