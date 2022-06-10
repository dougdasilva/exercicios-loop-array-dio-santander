package loopsAndArrays;

import java.util.Scanner;

public class OrdemInversa {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int[] vect = {5, -10, 8, 123, -54, 1};
		
		int count = 0;
		System.out.print("Vetor: ");
		while(count < vect.length) {
			System.out.print("[" + vect[count]+ "]"+ " ");
			count++;
		}

		System.out.print("\nOrdem Inversa: ");
		for (int i = (vect.length-1); i >= 0; i--) {
			System.out.print("[" + vect[i] + "]" + " ");
		}
		
		sc.close();
		
	}
}
