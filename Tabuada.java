package loopsAndArrays;

import java.util.Scanner;

public class Tabuada {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int number;
		
		System.out.println("Informe um número: ");
		number = sc.nextInt();
				
		for (int i = 1; i < 11; i++) {
			System.out.printf("\n%d X %d = %d", number, i, number * i);
		}
		
		sc.close();

	}

}
