package jogoDaVelha;

import java.util.Scanner;

public class Jogador {

	public static int[] jogadaHumana(Scanner sc, char simboloAtual) {
		int p[] = new int[2];
		System.out.print("Informe a linha: ");
		p[0] = sc.nextInt();
		System.out.print("Informe a coluna: ");
		p[1] = sc.nextInt();
		return p;
	}
}
