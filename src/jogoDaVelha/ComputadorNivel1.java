package jogoDaVelha;

import java.util.Random;
import java.util.Scanner;

public class ComputadorNivel1 extends Computador {

	private static int[] p = new int[2];
	
	public ComputadorNivel1() {
		super(p);
	}

	@Override
	public int[] jogadaComputador(char simboloAtual) {
		Random aleatorio = new Random();
		int p[] = new int[2];
		p[0] = aleatorio.nextInt(3);
		p[1] = aleatorio.nextInt(3);

		System.out.println("Linha esolhida: " + p[0]);
		System.out.println("Coluna esolhida: " + p[1]);

		return p;
	}

}
