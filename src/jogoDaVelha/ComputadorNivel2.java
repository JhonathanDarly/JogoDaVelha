package jogoDaVelha;

import java.security.SecureRandom;
import java.util.Random;
import java.util.Scanner;

public class ComputadorNivel2 extends Computador {
	
	
	private static int[] p = new int[2]; // Instanciando vari�vel tipo lista.
	
	public ComputadorNivel2() { // Construtor padr�o
		super(p);
	}

	// M�todo que subscreve os dados na classe computador
	// Aqui foi usado o m�todo System.currentTimeMilliis que pega a hora atual do sistema em milessegundos, a partir de 1 de janeiro de 1970, � meia-noite.
	// Retorna na vari�vel P os valores gerados para linha e coluna.
	
	@Override
	public int[] jogadaComputador (char simboloAtual) {
		
		// Vari�veis convencionais.
		
		int lastChar;
		long currentTime;
		String timeString;
		
		// M�todo do-while, consiste em executar pelo menos uma vez a condi��o e depois entrar no la�o de repeti��o.
		

		do {
			currentTime = System.currentTimeMillis();  // Pega o hor�rio do sistem conforme explicado acima.
			timeString = String.valueOf(currentTime); // Convers�o do tipo long para String, pois a pr�xima opera��o exige que seja String.
			timeString = timeString.substring(timeString.length() - 1); // M�todo substring retorna a parte da string, j� o length informa o tamanho total da string, e o valor informado -1 retorna o �ltimo valor da String.
			lastChar = Integer.valueOf(timeString); // Convers�o do tipo String para Inteiro.
				
			// Bloco try cath para tratamento de exce��es 
			try {
				Thread.sleep(1);  // M�todo que paralisa a excu��o pelo tempo informado entre par�nteses.
			} catch (InterruptedException e) { // Nome e apelido da exce��o.
				e.printStackTrace(); // Print da exce��o.
			}

		} while (lastChar > 2); // La�o de repeti��o que repete enquanto o valor gerado pelo ultimo digito do currentTimeMillis n�o for menor que 2
		p[0] = lastChar; // Ultimo digito pr�piamente dito.

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
