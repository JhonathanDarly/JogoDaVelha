package jogoDaVelha;

public class CampoJogada {
	private char simbolo;

	// Contrutores padrão.
	public CampoJogada() {
		this.simbolo = ' ';
	}

	public char getSimbolo() {
		return simbolo;
	}

	// Aqui a variavel simbulo inicia recebendo um espaço vazio, assim validando o campo para uma jogada. 
	public void setSimbolo(char simbulo) {
		this.simbolo = ' ';
		this.simbolo = simbulo;
		}
	}


