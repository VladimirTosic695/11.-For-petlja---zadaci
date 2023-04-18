package vladimir.tosic;

import java.io.*;

public class zadatak15 {

	public static void main(String[] args) throws Exception {
		// Inicijalizacija podataka o sumama pozitivnih i negativnih celih brojeva
		int sp = 0, sn = 0; 
		BufferedReader ulaz = new BufferedReader(new InputStreamReader(System.in)); 
		// Unos podatka o celim brojevima
		System.out.println("Unesite vrednost za n: "); 
		int n = Integer.parseInt(ulaz.readLine()); 
		
		for (int i = 1;i<=n;i++) {
			System.out.println("Unesite "+i+". broj.");
			int broj = Integer.parseInt(ulaz.readLine());
			
			if (broj>0)
				sp= sp+broj;
			else if (broj<0)
				sn+=broj;
		}
		System.out.println("suma pozitivnih je "+sp+" a suma negativnih "+sn);
	}

}
