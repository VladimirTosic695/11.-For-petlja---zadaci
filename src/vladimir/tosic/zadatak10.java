package vladimir.tosic;

import java.util.Scanner;

public class zadatak10 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double a, y;
		System.out.println("Unesite vrednost za n: ");
		int n = input.nextInt();
		for (int i = 1; i <= n; i++) {
			System.out.println("Unesite vrednost a.");
			a = input.nextDouble();
			if (a>0)
				y= Math.sqrt(a);
			else
				y = a*a;
			System.out.println("Vrednost y = " +y);
		}
		input.close();
	}

}
