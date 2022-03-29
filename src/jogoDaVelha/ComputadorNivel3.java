package jogoDaVelha;

import java.util.Random;
import java.util.Scanner;
import java.util.Set;

import javax.management.remote.SubjectDelegationPermission;

public class ComputadorNivel3 extends Computador {
	
	private static long seed1 = System.currentTimeMillis(); // V�riavel recebendo system.currentMillis (m�todo explicado na vari�vel ComputadorNivel2).
	private static int seed2 = 2; // V�riavel inst�nciada.
	private static int[] p = new int[2]; // V�riavel inst�nciada tipo list.
	
	public ComputadorNivel3(char simboloAtual) { // Contrutor padr�o.
		super(p);
	}
	
	// M�todo que subscreve os dados na classe computador
	// Aqui foi usado o m�todo Random para gerar numeros aleat�rios, com auxilio de sementes personalizadas.	
	// Retorna na vari�vel P os valores gerados aleatoriamente para linha e coluna.
	
	@Override
	public int[] jogadaComputador (char simboloAtual) {		
		Random aleatorio = new Random(); // M�todo Random, para gerar n�meros aleat�rios
		aleatorio.setSeed(seed1); // M�todo Random com a semente de par�metro.
		p[0] = aleatorio.nextInt(3); // Par�metro limitador, ou seja configurado para n�o gerar numero maior que 2.
		seed1++; // Ap�s a execu��o do c�digo acrescenta + 1 na semente para mudar o padr�o.
		
		// A partir daqui o c�digo � repetido, salvando as devidas propor��es.
		
		aleatorio.setSeed(seed2); 
		p[1] = aleatorio.nextInt(3);
		seed2++;
		

		System.out.println("Linha esolhida: " + p[0]);
		System.out.println("Coluna esolhida: " + p[1]);
				
		return p;
		
}






}
