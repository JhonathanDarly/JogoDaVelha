package jogoDaVelha;

import java.util.Scanner;

import javax.swing.text.AbstractDocument.Content;

public class Tabuleiro {

	private static int cont;

	public static void limparTela() {
		for (int cont = 0; cont < 20; cont++) {
			System.out.println("");
		}
	}

	public static void iniciarJogo(CampoJogada[][] velha) {
		for (int linha = 0; linha < 3; linha++) {
			for (int coluna = 0; coluna < 3; coluna++) {
				velha[linha][coluna] = new CampoJogada();
			}
		}

	}

	public static void desenhaJogo(CampoJogada[][] velha) {
		limparTela();
		System.out.println("    0   1    2");
		System.out.println();
		System.out.printf("0   %c | %c | %c %n", velha[0][0].getSimbolo(), velha[0][1].getSimbolo(),
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
			resultado = Empate(velha, resultado);
		}
		return resultado;

	}

	public static String Empate(CampoJogada[][] velha, String resultado) {
		cont = 0;
		for (int linha = 0; linha < 3; linha++) {
			for (int coluna = 0; coluna < 3; coluna++) {
				if (velha[linha][coluna].getSimbolo() != ' ') {
					System.out.println("Entrou no if (cont +1)");
					cont++;
					System.out.println("contador=" + cont);
				}
				System.out.println("Linha: " + linha + " Coluna:" + coluna);
			}

		}
		if (cont == 9) {
			System.out.println("Entrou no IF (cont == 9)");
			resultado = "Deu velha, jogo empatado! ";
		} else {
			resultado = "";
		}

		return resultado;
	}

	public static int[] jogar1(char simboloAtual) {

		int p[] = new int[2];
		Scanner sc = new Scanner(System.in);

		System.out.printf(" %s %c %n", "Sua vez: ", simboloAtual);
		if (simboloAtual == 'X') {
			Jogador jogadorHumano = new Jogador();
			p = jogadorHumano.jogadaHumana(sc, simboloAtual);

		} else {
			ComputadorNivel1 comp = new ComputadorNivel1();
			p = comp.jogadaComputadorNivel1(sc, simboloAtual);
		}

		return p;

	}

	public static int[] jogar2(char simboloAtual) {

		int p[] = new int[2];
		Scanner sc = new Scanner(System.in);

		System.out.printf(" %s %c %n", "Sua vez: ", simboloAtual);
		if (simboloAtual == 'X') {
			Jogador jogadorHumano = new Jogador();
			p = jogadorHumano.jogadaHumana(sc, simboloAtual);

		} else {
			ComputadorNivel2 comp = new ComputadorNivel2();
			p = comp.jogadaComputadorNivel2(sc, simboloAtual);
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
			ComputadorNivel3 comp = new ComputadorNivel3();
			p = comp.jogadaComputadorNivel3(sc, simboloAtual);
		}

		return p;

	}

	public static Boolean verificarJogada(CampoJogada[][] velha, int p[], char simboloAtual) {
		if (velha[p[0]][p[1]].getSimbolo() == ' ') {
			velha[p[0]][p[1]].setSimbolo(simboloAtual);
			return true;
		} else {
			return false;
		}
	}
}