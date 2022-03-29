package jogoDaVelha;

import java.util.Scanner;

import javax.swing.text.AbstractDocument.Content;

public class Tabuleiro {

	private static int cont; // V�riavel utilizada no m�todo empate.

	
	// M�todo consiste em imprimir 20 linhas vazias para limpar a tela do usu�rio.
	
	public static void limparTela() {
		for (int cont = 0; cont < 20; cont++) {
			System.out.println("");
		}
	}

	// M�todo int�ncia a lista criada.
	
	public static void iniciarJogo(CampoJogada[][] velha) {
		for (int linha = 0; linha < 3; linha++) {
			for (int coluna = 0; coluna < 3; coluna++) {
				velha[linha][coluna] = new CampoJogada();
			}
		}

	}

	// M�todo desenha no console a estrutura do jogo, levando em conta o s�mbolo em cada campo.
	
	public static void desenhaJogo(CampoJogada[][] velha) {
		
		limparTela(); // Antes de desenhar ele chama o m�todo para limpar a tela do usu�rio.
		
		System.out.println("    0   1    2");
		System.out.println();
		System.out.printf("0   %c | %c | %c %n", velha[0][0].getSimbolo(), velha[0][1].getSimbolo(), // Get.Simbolo pega o s�mbolo informado nos campos correspondentes.
				velha[0][2].getSimbolo());
		System.out.println("   ___|___|____ ");
		System.out.println("      |   |");
		System.out.printf("1   %c | %c | %c %n", velha[1][0].getSimbolo(), velha[1][1].getSimbolo(),
				velha[1][2].getSimbolo());
		System.out.println("   ___|___|____ ");
		System.out.println("      |   |");
		System.out.printf("2   %c | %c | %c %n", velha[2][0].getSimbolo(), velha[2][1].getSimbolo(),
				velha[2][2].getSimbolo());
		System.out.println();
	}

	// M�todo verifica os s�mbolos informados nas posi��es deu jogo ganho ou empate.
	// Retornando o valor encontrado na vari�vel "resultado".
	
	public static String verificaVitoria(CampoJogada[][] velha, String resultado) {

		if (velha[0][0].getSimbolo() == 'X' && velha[0][1].getSimbolo() == 'X' && velha[0][2].getSimbolo() == 'X') {
			resultado = "Jogador X Venceu!";
		} else if (velha[0][0].getSimbolo() == 'X' && velha[1][1].getSimbolo() == 'X'
				&& velha[2][2].getSimbolo() == 'X') {
			resultado = "Jogador X Venceu!";
		} else if (velha[0][1].getSimbolo() == 'X' && velha[1][1].getSimbolo() == 'X'
				&& velha[2][1].getSimbolo() == 'X') {
			resultado = "Jogador X Venceu!";
		} else if (velha[0][0].getSimbolo() == 'X' && velha[1][0].getSimbolo() == 'X'
				&& velha[2][0].getSimbolo() == 'X') {
			resultado = "Jogador X Venceu!";
		} else if (velha[1][0].getSimbolo() == 'X' && velha[1][1].getSimbolo() == 'X'
				&& velha[1][2].getSimbolo() == 'X') {
			resultado = "Jogador X Venceu!";
		} else if (velha[2][0].getSimbolo() == 'X' && velha[2][1].getSimbolo() == 'X'
				&& velha[2][2].getSimbolo() == 'X') {
			resultado = "Jogador X Venceu!";
		} else if (velha[0][2].getSimbolo() == 'X' && velha[1][2].getSimbolo() == 'X'
				&& velha[2][2].getSimbolo() == 'X') {
			resultado = "Jogador X Venceu!";
		} else if (velha[2][0].getSimbolo() == 'X' && velha[1][1].getSimbolo() == 'X'
				&& velha[0][2].getSimbolo() == 'X') {
			resultado = "Jogador X Venceu!";
		}

		else if (velha[0][0].getSimbolo() == 'O' && velha[1][1].getSimbolo() == 'O'
				&& velha[2][2].getSimbolo() == 'O') {
			resultado = "Jogador O Venceu!";
		} else if (velha[0][1].getSimbolo() == 'O' && velha[1][1].getSimbolo() == 'O'
				&& velha[2][1].getSimbolo() == 'O') {
			resultado = "Jogador O Venceu!";
		} else if (velha[0][0].getSimbolo() == 'O' && velha[1][0].getSimbolo() == 'O'
				&& velha[2][0].getSimbolo() == 'O') {
			resultado = "Jogador O Venceu!";
		} else if (velha[1][0].getSimbolo() == 'O' && velha[1][1].getSimbolo() == 'O'
				&& velha[1][2].getSimbolo() == 'O') {
			resultado = "Jogador O Venceu!";
		} else if (velha[2][0].getSimbolo() == 'O' && velha[2][1].getSimbolo() == 'O'
				&& velha[2][2].getSimbolo() == 'O') {
			resultado = "Jogador O Venceu!";
		} else if (velha[0][2].getSimbolo() == 'O' && velha[1][2].getSimbolo() == 'O'
				&& velha[2][2].getSimbolo() == 'O') {
			resultado = "Jogador O Venceu!";
		} else if (velha[2][0].getSimbolo() == 'O' && velha[1][1].getSimbolo() == 'O'
				&& velha[0][2].getSimbolo() == 'O') {
			resultado = "Jogador O Venceu!";
		}

		else {
			resultado = Empate(velha, resultado); // Chamada do m�todo Empate que � explicado abaixo.
		}
		return resultado;

	}
	
	// M�todo consiste em percorrer toda a matriz, encontrando um campo com um s�mbolo o marcador vari�vel acrescenta +1
	// O marcador "cont" chegando em 9 que � o n�mero de campos o sistema pula para o if e retorna o valor correspondente.

	public static String Empate(CampoJogada[][] velha, String resultado) { 
		cont = 0;
		for (int linha = 0; linha < 3; linha++) {
			for (int coluna = 0; coluna < 3; coluna++) {
				if (velha[linha][coluna].getSimbolo() != ' ') {
					cont++;
				}
			}

		}
		if (cont == 9) {
			resultado = "Deu velha, jogo empatado! ";
		} else {
			resultado = "";
		}

		return resultado;
	}

	// M�todo Jogar (1,2,3) � acionado mediante a n�vel informado pelo usu�rio na classe Aplication
	// O mesmo aciona os m�todos de jogadas, sendo uma delas o Jogador - jogadorHumano e Computador e ComputadorNivel(1, 2 ou 3).
	
	public static int[] jogar1(char simboloAtual) {

		int p[] = new int[2]; // Vari�vel tipo list.
		
		Scanner sc = new Scanner(System.in); 

		System.out.printf(" %s %c %n", "Sua vez: ", simboloAtual); // Indica��o de quem esta jogando.
		
		// Se o S�mbolo for igual a X, ele entra no if e inst�ncia o m�todo jodadorHumano.
		
		if (simboloAtual == 'X') {
			Jogador jogadorHumano = new Jogador();
			p = jogadorHumano.jogadaHumana(sc, simboloAtual);

		}
		
		// Se o S�mbolo for igual a O, ele entra no if e inst�ncia o m�todo jodadaComputador.
		
		else {
			Computador comp = new ComputadorNivel1();
			p = comp.jogadaComputador(simboloAtual);
		}

		return p;

	}
	
	// A partir daqui o c�digo se repete levando em considera��o o n�vel informado na classe Aplication.

	public static int[] jogar2(char simboloAtual) {

		int p[] = new int[2];
		Scanner sc = new Scanner(System.in);

		System.out.printf(" %s %c %n", "Sua vez: ", simboloAtual);
		if (simboloAtual == 'X') {
			Jogador jogadorHumano = new Jogador();
			p = jogadorHumano.jogadaHumana(sc, simboloAtual);

		} else {
			Computador comp = new ComputadorNivel2();
			p = comp.jogadaComputador(simboloAtual);
		}

		return p;

	}

	public static int[] jogar3(char simboloAtual) {

		int p[] = new int[2];
		Scanner sc = new Scanner(System.in);

		System.out.printf(" %s %c %n", "Sua vez: ", simboloAtual);
		if (simboloAtual == 'X') {
			Jogador jogadorHumano = new Jogador();
			p = jogadorHumano.jogadaHumana(sc, simboloAtual);

		} else {
			Computador comp = new ComputadorNivel3(simboloAtual);
			p = comp.jogadaComputador(simboloAtual);
		}

		return p;

	}

	// O m�todo percorre todos os campos da matriz e verifica se o espa�o informado esta vazio,
	// Se sim retorna verdadeiro, se n�o retorna falso.
	
	public static Boolean verificarJogada(CampoJogada[][] velha, int p[], char simboloAtual) {
		if (velha[p[0]][p[1]].getSimbolo() == ' ') {
			velha[p[0]][p[1]].setSimbolo(simboloAtual);
			return true;
		} else {
			return false;
		}
	}
}