package controle;

import java.util.Scanner;

import excecoes.RaizQuadradaException;

public class Programa02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int n = input.nextInt(); 

            System.out.println("A raiz quadrada é: " + Operacoes.calcularRaiz(n));
        
        input.close();
    }
}
