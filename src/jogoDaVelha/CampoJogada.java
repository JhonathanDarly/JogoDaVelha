package jogoDaVelha;

public class CampoJogada {
	private char simbolo;

	// Construtor padrão.
	public CampoJogada() {
		this.simbolo = ' ';
	}

	// Função get para pegar informação.
	public char getSimbolo() {
		return simbolo;
	}

	// Aqui a variavel simbulo inicia recebendo um espaço vazio, assim validando o campo para uma jogada. 
	public void setSimbolo(char simbulo) {
		this.simbolo = ' ';
		this.simbolo = simbulo;
		}
	}


