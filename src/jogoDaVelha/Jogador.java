package jogoDaVelha;

import java.util.Scanner;

public class Jogador {

	// M�todo para pegar os dados referente a jogado do Jogador Humano.
	// V�riavel P retorna os valores refente a Linha e Coluna.
	
	public static int[] jogadaHumana(Scanner sc, char simboloAtual) {
		int p[] = new int[2]; // Vari�vel tipo list.
		p[0] = 10; // Valor �nicial para o fun��o while.
		while (p[0] < 0 || p[0] > 2) {  // Fun��o criada para acegurar que o usu�rio vai digitar um valor entre 0 e 2.
			System.out.print("Informe a linha: ");
			p[0] = sc.nextInt();
		}
		
		// A partir daqui o c�digo se repete, salvando as devidas propor��es.
		p[1] = 10;
		while (p[1] < 0 || p[1] > 2) {
			System.out.print("Informe a coluna: ");
			p[1] = sc.nextInt();
		}
		return p;
	}
}