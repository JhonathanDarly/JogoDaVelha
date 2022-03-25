package jogoDaVelha;

import java.util.Random;
import java.util.Scanner;

public class ComputadorNivel3 extends Computador {
	private static long seed1 = System.currentTimeMillis();
	private static int seed2 = 2;

	public static int[] jogadaComputadorNivel3(Scanner scan, char simboloAtual) {

		Random aleatorio = new Random();
		int p[] = new int[2];
		aleatorio.setSeed(seed1);
		p[0] = aleatorio.nextInt(3);
		seed1++;
		aleatorio.setSeed(seed2);
		p[1] = aleatorio.nextInt(3);
		seed2++;

		System.out.println(seed1);
		System.out.println(seed2);
		System.out.println("Linha esolhida: " + p[0]);
		System.out.println("Coluna esolhida: " + p[1]);

		return p;

	}
}
