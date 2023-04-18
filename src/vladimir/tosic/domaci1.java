package vladimir.tosic;

import java.util.Scanner;

public class domaci1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		System.out.println("Unesite broj n.");
		int n = sc.nextInt();
		sc.close();
		double p = 1;
		for (int i =1; i<=n; i++) {
			p = p*(1-1/((double)i+1));
		}
		System.out.println("Vrednost proizvoda p za n = "+n+" je "+ p);
	}

}
