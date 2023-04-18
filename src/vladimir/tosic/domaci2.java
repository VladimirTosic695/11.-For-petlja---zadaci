package vladimir.tosic;

import java.util.Scanner;

public class domaci2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Unesite n.");
		double n = sc.nextDouble();
		double s= 0;
		for (double i = n; n<=1;n++) {
			if (n!=-1) 
				s = s+ n/(n+1);
			else 
				s= s+ (n-1);
			System.out.println("Suma = "+s);
		}
		System.out.println("Suma = "+s);
	}

}
