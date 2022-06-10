package loopsAndArrays;

import java.util.Scanner;

public class NomeIdade {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner sc = new Scanner(System.in);
		
		String name;
		int age;
		
		while(true) {
		System.out.println("Nome: ");
		name = sc.next();
		if(name.equals("0")) break;
		System.out.println("Idade: ");
		age = sc.nextInt();
		}
		sc. close();
		System.out.println("FIM...");
	}
	

}
