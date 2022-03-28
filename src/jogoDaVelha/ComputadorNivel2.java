package jogoDaVelha;

import java.security.SecureRandom;
import java.util.Random;
import java.util.Scanner;

public class ComputadorNivel2 extends Computador {
	
	
	private static int[] p = new int[2];
	
	public ComputadorNivel2() {
		super(p);
	}

	@Override
	public int[] jogadaComputador (char simboloAtual) {
		
		int p[] = new int[2];
		int lastChar;
		long currentTime;
		String timeString;

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
		p[0] = lastChar;

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
