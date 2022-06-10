package loopsAndArrays;

import java.util.Scanner;

public class MaiorMedia {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		int number;
		int major = 0;
		int count = 0;
		int sum = 0;
		do {
			System.out.println("Numero: ");
			number = sc.nextInt();
			
			sum = sum + number;
			
			if(number > major) major = number;
			
			count++;
		}while(count < 5);
		
		int media = sum / count;
		
		System.out.println("Maior: " + major);
		System.out.println("Soma: " + sum);
		System.out.println("Media: " + media);
	
		sc.close();

	}

}
