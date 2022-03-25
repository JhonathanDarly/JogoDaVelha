package jogoDaVelha;

import java.util.Random;
import java.util.Scanner;
import java.util.Random;

public class Computador {

	public static int[] jogadaComputador(Scanner scan, char simboloAtual) {
		Random aleatorio = new Random();
		int p[] = new int[2];
		System.out.println("Linha escolhida: ");
		p[0] = aleatorio.nextInt();
		System.out.println("Coluna escolhida: ");
		p[1] = aleatorio.nextInt();
		return p;
	}
}
