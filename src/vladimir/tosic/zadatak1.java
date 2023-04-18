package vladimir.tosic;

import java.text.DecimalFormat;
import java.util.Scanner;

public class zadatak1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat ("#.##");
		double n;
		System.out.println("Unesite broj n");
		n = sc.nextDouble();
		double s = 0;
		double i = n;
		
		sc.close();
		for(n= i; n<=2; n++) {
			s+= (n+2.5)/(n*n+1.2);
		}
		System.out.println("Vrednost sume s je " + df.format(s));
		
	}

}
