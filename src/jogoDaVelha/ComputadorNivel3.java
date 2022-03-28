package jogoDaVelha;

import java.util.Random;
import java.util.Scanner;
import java.util.Set;

import javax.management.remote.SubjectDelegationPermission;

public class ComputadorNivel3 extends Computador {
	
	private static long seed1 = System.currentTimeMillis();
	private static int seed2 = 2;
	private static int[] p = new int[2];
	
	public ComputadorNivel3(char simboloAtual) {
		super(p);
	}
	
	@Override
	public int[] jogadaComputador (char simboloAtual) {		
		p = new int[2];
		Random aleatorio = new Random();
		aleatorio.setSeed(seed1);
		p[0] = aleatorio.nextInt(3);
		seed1++;
		aleatorio.setSeed(seed2);
		p[1] = aleatorio.nextInt(3);
		seed2++;
		

		System.out.println("Linha esolhida: " + p[0]);
		System.out.println("Coluna esolhida: " + p[1]);
				
		return p;
		
}






}
