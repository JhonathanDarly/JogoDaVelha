package jogoDaVelha;

public class CampoJogada {
	private char simbolo;

	// Contrutores padr�o.
	public CampoJogada() {
		this.simbolo = ' ';
	}

	public char getSimbolo() {
		return simbolo;
	}

	// Aqui a variavel simbulo inicia recebendo um espa�o vazio, assim validando o campo para uma jogada. 
	public void setSimbolo(char simbulo) {
		this.simbolo = ' ';
		this.simbolo = simbulo;
		}
	}


