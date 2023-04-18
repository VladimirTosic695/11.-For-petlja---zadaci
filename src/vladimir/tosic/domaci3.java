package vladimir.tosic;

import java.text.DecimalFormat;
import java.util.Scanner;

public class domaci3 {

	public static void main(String[] args) {
		//Scanner sc = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat ("#.###");
		double s = 0;
		
		for (int i =1;i<=50;i++) {
			double p = 1;
			for(int j = 1; j<=i; j++) {
				if(j!=3)
					p = p*(j+2)/(j-3);
			}
			s = s+p;
		}
		System.out.println("suma proizvoda je " +df.format(s));
	}

}
