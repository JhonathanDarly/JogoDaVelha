package jogoDaVelha;

import java.util.Random;
import java.util.Scanner;
import java.util.Random;

public class Computador {
	
	int []p;

	public Computador(int[] p) {
		this.p = p;
	}

	public int[] getP() {
		return p;
	}

	public void setP(int[] p) {
		this.p = p;
	}
	
	public int[] jogadaComputador (char simboloAtual) {
		
		p = new int[2];
		p[0] = 0;
		p[1] = 0;
				
		return p;
	}


}