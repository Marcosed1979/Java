package controle;

import java.util.Scanner;

public class Exercicio5 {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite um número para verificar se é primo:");
		
		String resultado = "";
		int numero = scanner.nextInt();
		int i = 2;
		int contadorDeDivisores = 0;
		
		for (i = 2; i < numero; i++) {
			if (numero % i == 0) {
				contadorDeDivisores++;
			}
			
			switch (contadorDeDivisores) {
			case 0:
				resultado = "é primo";
				break;
			default:
				resultado = "não é primo";
				break;
				
			}
		}
		
		scanner.close();
		
		System.out.println("O número " + numero + " " + resultado + ".");
		
		
		
	}

}
