package jogoDaVelha;

import java.util.Random;
import java.util.Scanner;
import java.util.Set;

import javax.management.remote.SubjectDelegationPermission;

public class ComputadorNivel3 extends Computador {
	
	private static long seed1 = System.currentTimeMillis(); // Váriavel recebendo system.currentMillis (método explicado na variável ComputadorNivel2).
	private static int seed2 = 2; // Váriavel instânciada.
	private static int[] p = new int[2]; // Váriavel instânciada tipo list.
	
	public ComputadorNivel3(char simboloAtual) { // Contrutor padrão.
		super(p);
	}
	
	// Método que subscreve os dados na classe computador
	// Aqui foi usado o método Random para gerar numeros aleatórios, com auxilio de sementes personalizadas.	
	// Retorna na variável P os valores gerados aleatoriamente para linha e coluna.
	
	@Override
	public int[] jogadaComputador (char simboloAtual) {		
		Random aleatorio = new Random(); // Método Random, para gerar números aleatórios
		aleatorio.setSeed(seed1); // Método Random com a semente de parâmetro.
		p[0] = aleatorio.nextInt(3); // Parâmetro limitador, ou seja configurado para não gerar numero maior que 2.
		seed1++; // Após a execução do código acrescenta + 1 na semente para mudar o padrão.
		
		// A partir daqui o código é repetido, salvando as devidas proporções.
		
		aleatorio.setSeed(seed2); 
		p[1] = aleatorio.nextInt(3);
		seed2++;
		

		System.out.println("Linha esolhida: " + p[0]);
		System.out.println("Coluna esolhida: " + p[1]);
				
		return p;
		
}






}
