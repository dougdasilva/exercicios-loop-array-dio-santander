package loopsAndArrays;

import java.util.Scanner;

public class ParImpar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite a quantidade de números: ");
		int quantity = sc.nextInt();
		
		int impar = 0;
		int par = 0;
		int count = 0;
		do {
			
			System.out.println("Número: ");
			int number = sc.nextInt();
			if(number % 2 == 0) par++;
			if(number % 2 == 1) impar++;
					
			count++;
		}while(count < quantity);
		
		System.out.println("Quantidade de pares: " + par);
		System.out.println("Quantidade de ímpares: " + impar);
	}

}
