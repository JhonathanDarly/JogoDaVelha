package jogoDaVelha;

import java.util.Random;
import java.util.Scanner;
import java.util.Random;

public class Computador {
	
	int []p; // Variável tipo list

	public Computador(int[] p) { //Construtor padrão
		this.p = p;
	}

	public int[] getP() {  // Método Get para pegar os dados informados.
		return p;
	}

	public void setP(int[] p) { // Método Set para colocar os dados informados.
		this.p = p;
	}
	
	// Método que pega a jogada do computador.
	
	public int[] jogadaComputador (char simboloAtual) {
		
		p = new int[2];
		p[0] = 0;
		p[1] = 0;
				
		return p;
	}


}