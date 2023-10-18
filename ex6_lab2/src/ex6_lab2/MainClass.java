package ex6_lab2;
import java.math.BigInteger;

public class MainClass {

	public static void main(String[] args) {
		BigInteger total=BigInteger.ZERO;
		int tabla_sah=64;
		for(int i=1;i<=tabla_sah;i++) {
			BigInteger s=BigInteger.ONE;
			for(int j=1;j<=i-1;j++ ) {
				 //s=s*2;
				s= s.multiply(BigInteger.valueOf(2));
			}
			total=total.add(s);
			//total=total+s;
			
		}
		System.out.println("total boabe de grau " + total );
		
	}
}
