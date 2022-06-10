package loopsAndArrays;

import java.util.Scanner;

public class Fatorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Numero: ");
		int fatorial = sc.nextInt();
		
		int mult = 1;
		
		for (int i = fatorial; i >= 1; i--) {
			mult = mult * i;
		}
		
		System.out.println(mult);
		sc.close();
	}

}
