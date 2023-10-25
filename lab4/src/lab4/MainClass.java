package lab4;

import java.awt.Color;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sofer sofer=new Sofer("Diana",20,2564);
		Rezervor rezervor=new Rezervor(2000,1320);
		Autovehicul auto=new Autovehicul(sofer,"audi",200,80,Color.BLACK,4,6,rezervor);
		System.out.println(auto);
		auto.accelerare(100);
		auto.schimbare(2);
		System.out.println(auto);
		auto.decelerare(30);
		auto.schimbare(-3);
		System.out.println(auto);
		auto.accelerare(500);
		System.out.println(auto);
		auto.oprire();
		System.out.println(auto);
	}

}
