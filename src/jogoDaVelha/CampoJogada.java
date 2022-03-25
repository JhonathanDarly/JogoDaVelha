package jogoDaVelha;

public class CampoJogada {
	private char simbolo;

	public CampoJogada() {
		this.simbolo = ' ';
	}

	public char getSimbolo() {
		return simbolo;
	}

	public void setSimbolo(char simbulo) {
		if (this.simbolo == ' ') {
			this.simbolo = simbulo;
		}
		else {
			System.out.println("Campo ja utilizado!");
		}
	}

}
