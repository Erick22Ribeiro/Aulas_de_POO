package controle;

import java.util.Scanner;

public class Programa02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Digite um número: ");
		int n1 = input.nextInt();
		
		System.out.print("Digite outro número: ");
		int n2 = input.nextInt();
		
		try {
			System.out.println("Divisão: " + (n1 / n2));

		}
		catch(ArithmeticException e) {
			System.out.println("Erro: " + e.getMessage());

		}
					
		System.out.print("Fim do programa!");
		
		input.close();

	}
	
}		


