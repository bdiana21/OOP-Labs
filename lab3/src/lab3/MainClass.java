package lab3;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	//	if((0.1+0.1+0.1)==0.3) 
		
		// problema 4
		/*String str1="Ana are ";
		String str2="mere";
		String str3=str1+str2;
		System.out.println(str3=="Ana are mere");
		System.out.println(str3.equals("Ana are mere"));*/
	
		//problema 2
	/*	
		int varsta=10,gen=1,inaltime=175;
		short wrap;
		wrap=(short)inaltime;
		wrap=(short)(wrap |(gen<<8));
		wrap=(short)(wrap|(varsta<<9));
		
		int varsta2,gen2,inaltime2;
		inaltime2=wrap&0xff;
		gen2=(wrap>>8)&1;
		varsta2=(wrap>>9)&0x7f;
		
		System.out.println(inaltime + "-" + inaltime2);
		System.out.println(gen + "-" + gen2);
		System.out.println(varsta + "-" + varsta2);*/
		
		// problema 1
		/*
		int n=4,m=20;
		if(n%2==1) n++;
		int ok=1;
		for(int i=n;i<=m;i=i+2) {
			int prim=0;
			int nr1=i-1;
			while(prim<2 && nr1>0)
			{
				int okPrim=1;
				for(int j=2;j<nr1/2;j++)
				{
					if(nr1%j!=0) okPrim=0;
				}
				if(okPrim==1) prim++;
				int nr2=i-nr1;
				 okPrim=1;
				for(int j=2;j<nr2/2;j++)
				{
					if(nr2%j!=0) okPrim=0;
				}
				if(okPrim==1) prim++;
				else {
					prim=0;
					nr1--;
				}
			}
			if(prim!=2) ok=0;
		}
		if(ok==1) System.out.println("conjectura lui Goldbach este adevarata");
		else System.out.println("conjectura lui Goldbach nu este adevarata");
		*/
		// problema 3
		String nume="Diana";
		int consoane=0,vocale=0;
		for(int i=0;i<nume.length();i++) {
			if((nume.charAt(i)=='a')||(nume.charAt(i)=='e')||(nume.charAt(i)=='i')||(nume.charAt(i)=='o')||(nume.charAt(i)=='u')) vocale++;
			else consoane++;
		}
		System.out.println("nr de consoane este="+consoane +" nr de vocale este="+vocale);
		

	}

}
 