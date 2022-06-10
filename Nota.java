package loopsAndArrays;

import java.util.Scanner;

public class Nota {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Nota: ");
		int nota = sc.nextInt();
		
		while(nota < 0 || nota > 10) {
			System.out.println("Nota inválida! Digite novamente: ");
			nota = sc.nextInt();
		}
		
		
		/*while(true) {
		System.out.println("Digite uma nota entre 0 e 10");
		int nota = sc.nextInt();
		
		if(nota < 0 || nota > 10) {
			System.out.println("Valor inválido.Digite novamente");
		}else {
			System.out.println("OK");
			break;
		}
		}*/
		
		sc.close();

	}

}
