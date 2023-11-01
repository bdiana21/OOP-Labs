package lab5;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NumarComplex a= new NumarComplex(5,2);
		NumarComplex b= new NumarComplex(1,-1);
	/*	System.out.println(a);
		System.out.println(b);
		System.out.println(a.adunare(b));
		System.out.println(a.scadere(b));
		System.out.println(a.inmultireScalar(2));
		System.out.println(a.inmultire(b));*/
		
		int[] arr = new int[] {1,2,3};
		int[] arr2=arr;//shalowCopy
	//	arr2=System.arrayCopy(arr); // deepCopy
		arr2[1]=5;
		//System.out.println(arr[1]);
		for(int i=0;i<arr.length;i++) {
			arr[i]=i;
		}
		for(int element:arr) {
			//System.out.println(element);
		}
		int i=0;
		int j=arr.length-1;
		while(i<j) {
			int aux=arr[i];
			arr[i]=arr[j];
			arr[j]=arr[i];
			i++;
			j--;
		}
		
		NumarComplex[][] matrice= new NumarComplex[3][3];
		int rows=matrice.length;
		int col=matrice[0].length;
		
		MatriceComplex mat1=new MatriceComplex(3,3);
		MatriceComplex mat2=new MatriceComplex(3,3);
		
		for( i=0;i<rows;i++) {
			for(j=0;j<col;j++) {
				NumarComplex numar= new NumarComplex(i+1,j+1);
				matrice[i][j]=numar;
			}
		}
		mat1.matrice=matrice;
		mat2=mat1.add(mat1);
		for( i=0;i<rows;i++) {
			for(j=0;j<col;j++) {
				System.out.print(mat1.matrice[i][j]);
				System.out.print(" ");
			}
			System.out.println("\n");
		}
		for( i=0;i<rows;i++) {
			for(j=0;j<col;j++) {
				System.out.print(mat2.matrice[i][j]);
				System.out.print(" ");
			}
			System.out.println("\n");
		}
		mat2=mat2.substract(mat1);
		for( i=0;i<rows;i++) {
			for(j=0;j<col;j++) {
				System.out.print(mat2.matrice[i][j]);
				System.out.print(" ");
			}
			System.out.println("\n");
		}
		mat2=mat2.multiplyBy(2);
		for( i=0;i<rows;i++) {
			for(j=0;j<col;j++) {
				System.out.print(mat2.matrice[i][j]);
				System.out.print(" ");
			}
			System.out.println("\n");
		}
	}

}
