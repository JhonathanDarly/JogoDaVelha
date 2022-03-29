package jogoDaVelha;

import java.security.SecureRandom;
import java.util.Random;
import java.util.Scanner;

public class ComputadorNivel2 extends Computador {
	
	
	private static int[] p = new int[2]; // Instanciando variável tipo lista.
	
	public ComputadorNivel2() { // Construtor padrão
		super(p);
	}

	// Método que subscreve os dados na classe computador
	// Aqui foi usado o método System.currentTimeMilliis que pega a hora atual do sistema em milessegundos, a partir de 1 de janeiro de 1970, à meia-noite.
	// Retorna na variével P os valores gerados para linha e coluna.
	
	@Override
	public int[] jogadaComputador (char simboloAtual) {
		
		// Variáveis convencionais.
		
		int lastChar;
		long currentTime;
		String timeString;
		
		// Método do-while, consiste em executar pelo menos uma vez a condição e depois entrar no laço de repetição.
		

		do {
			currentTime = System.currentTimeMillis();  // Pega o horário do sistem conforme explicado acima.
			timeString = String.valueOf(currentTime); // Conversão do tipo long para String, pois a próxima operação exige que seja String.
			timeString = timeString.substring(timeString.length() - 1); // Método substring retorna a parte da string, já o length informa o tamanho total da string, e o valor informado -1 retorna o último valor da String.
			lastChar = Integer.valueOf(timeString); // Conversão do tipo String para Inteiro.
				
			// Bloco try cath para tratamento de exceções 
			try {
				Thread.sleep(1);  // Método que paralisa a excução pelo tempo informado entre parênteses.
			} catch (InterruptedException e) { // Nome e apelido da exceção.
				e.printStackTrace(); // Print da exceção.
			}

		} while (lastChar > 2); // Laço de repetição que repete enquanto o valor gerado pelo ultimo digito do currentTimeMillis não for menor que 2
		p[0] = lastChar; // Ultimo digito própiamente dito.

		// A partir daqui a estrutura se repete para pegar o valor da coluna.
		
		do {
			currentTime = System.currentTimeMillis();
			timeString = String.valueOf(currentTime);
			timeString = timeString.substring(timeString.length() - 1);

			lastChar = Integer.valueOf(timeString);

			try {
				Thread.sleep(1);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

		} while (lastChar > 2);
		p[1] = lastChar;

		System.out.println("Linha esolhida: " + p[0]);
		System.out.println("Coluna esolhida: " + p[1]);

				
		return p;
	}
}
