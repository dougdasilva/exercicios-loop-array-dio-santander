package loopsAndArrays;

import java.util.Scanner;

public class Consoantes {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String[] consoantes = new String[6];
		
		int qtdConsoantes = 0;
		
		int count = 0;
		do {
			System.out.println("Digite uma letra: ");
			String letra = sc.next();
			
			if( !(letra.equalsIgnoreCase("a") |
			    letra.equalsIgnoreCase("e") |
			    letra.equalsIgnoreCase("i") |
			    letra.equalsIgnoreCase("o") |
			    letra.equalsIgnoreCase("u")))	
			{
				consoantes[count] = letra;
				qtdConsoantes++;
			}
			
			count++;
			
		}while(count < consoantes.length);
		
		for (String s : consoantes) {
			if(s != null) {
				System.out.println(s);
			}
			
		}
		
		System.out.print("Quantida de consoantes: " + qtdConsoantes);
		
		sc.close();
	}
}
