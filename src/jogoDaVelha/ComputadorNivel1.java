package jogoDaVelha;

import java.util.Random;
import java.util.Scanner;

public class ComputadorNivel1 extends Computador {

	private static int[] p = new int[2]; // Instanciando vari�vel tipo lista.
	
	public ComputadorNivel1() { // Construtor padr�o
		super(p);
	}

	// M�todo que subscreve os dados na classe computador
	// Aqui foi usado o m�todo Random para gerar numeros aleat�rios
	// �nica regra utilizada foi limitar o tamanho dos numeros gerados
	// Retorna na vari�vel P os valores gerados aleatoriamente para linha e coluna.
	
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
