package controle;

import java.util.Scanner;

public class Programa03 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		String[] nomes = {"Maria", "Mariana", "Gabriel", "Tainá", "Fernanda", "Ana"};
		
		System.out.print("Digite um número de 0 a 5: ");
		int num = input.nextInt();
		
		try {
			System.out.print("Pessoa consultada: " + nomes[num]);

		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Erro: " + e.getMessage());
			System.out.print("O número deve ser entre 0 e 5.");
		}
				
		
		input.close();
	}
}
