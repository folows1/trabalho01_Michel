package br.edu.univas.main;

import java.util.Scanner;

public class StartApp {
	public static void main(String[] args) {
		int m = 9;
		float x, y, z;
		Scanner leitura = new Scanner(System.in);
		do {
			System.out.println("*Digite o n�mero com a op��o desejada:*");
			System.out.println("1. Somar");
			System.out.println("2. Subtrair");
			System.out.println("3. Multiplicar");
			System.out.println("4. Dividir");
			System.out.println("9. Sair");
			m = leitura.nextInt();
			switch (m) {
			case 1:
				System.out.println("Digite um valor para X");
				x = leitura.nextFloat();
				System.out.println("Digite um valor para Y");
				y = leitura.nextFloat();
				z = x + y;
				System.out.println("Resultado da soma de " + x + " e " + y + " : " + z);
				System.out.println("");
				break;
			case 2:
				System.out.println("Digite um valor para X");
				x = leitura.nextFloat();
				System.out.println("Digite um valor para Y");
				y = leitura.nextFloat();
				z = x - y;
				System.out.println("Resultado da subtra��o de " + x + " por " + y + " : " + z);
				System.out.println("");
				break;
			case 3:
				System.out.println("Digite um valor para X");
				x = leitura.nextFloat();
				System.out.println("Digite um valor para Y");
				y = leitura.nextFloat();
				z = x * y;
				System.out.println("Resultado da multiplica��o de " + x + " por " + y + " : " + z);
				System.out.println("");
				break;
			case 4:
				System.out.println("Digite um valor para X");
				x = leitura.nextFloat();
				y = 0;
				while (y == 0) {
					System.out.println("Digite um valor para Y diferente de 0");
					y = leitura.nextFloat();
				}
				z = x / y;
				System.out.println("Resultado da divis�o de " + x + " por " + y + " : " + z);
				System.out.println("");
				break;
			case 9:
				m = 9;
				break;
			default:
				System.out.println("Op��o inv�lida! Por favor, digite uma op��o correta!");
				System.out.println("");
				break;
			}
		} while (m != 9);
		System.out.println("Voc� optou por sair!");
		leitura.close();
	}
}
