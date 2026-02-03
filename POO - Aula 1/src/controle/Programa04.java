package controle;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Programa04 {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		try {
			
			System.out.print("Digite um número: ");
			int n1 = input.nextInt();
			
			System.out.print("Digite outro número: ");
			int n2 = input.nextInt();
			
			System.out.println("Divisão: " + (n1 / n2));

		}
		catch(ArithmeticException e) {
			System.out.println("Não é possível dividir por 0");

		}
		catch(InputMismatchException e) {
			System.out.println("A entrada deve ser um número inteiro");
			
		}
					
		System.out.print("Fim do programa!");
		
		input.close();
	}
}
