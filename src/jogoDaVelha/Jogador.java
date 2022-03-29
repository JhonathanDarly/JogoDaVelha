package jogoDaVelha;

import java.util.Scanner;

public class Jogador {

	// Método para pegar os dados referente a jogado do Jogador Humano.
	// Váriavel P retorna os valores refente a Linha e Coluna.
	
	public static int[] jogadaHumana(Scanner sc, char simboloAtual) {
		int p[] = new int[2]; // Variável tipo list.
		p[0] = 10; // Valor ínicial para o função while.
		while (p[0] < 0 || p[0] > 2) {  // Função criada para acegurar que o usuário vai digitar um valor entre 0 e 2.
			System.out.print("Informe a linha: ");
			p[0] = sc.nextInt();
		}
		
		// A partir daqui o código se repete, salvando as devidas proporções.
		p[1] = 10;
		while (p[1] < 0 || p[1] > 2) {
			System.out.print("Informe a coluna: ");
			p[1] = sc.nextInt();
		}
		return p;
	}
}