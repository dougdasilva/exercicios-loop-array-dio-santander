package loopsAndArrays;

import java.util.Random;

public class NumerosAleatorios {

	public static void main(String[] args) {
		
		Random random = new Random();
		int number = random.nextInt(101);
		
		int[] numerosAleatorios = new int[20];
		
		for (int i = 0; i < numerosAleatorios.length; i++) {
			numerosAleatorios[i] = number;
			number++;
		}
		System.out.println("Números Aleatórios: ");
		for (int i : numerosAleatorios) {
			System.out.print(i + " ");
		}
		System.out.println("\nSucessores:");
		for (int i : numerosAleatorios) {
			System.out.print((i + 1) + " ");
		}
	}
}
