package jogoDaVelha;

import java.util.Scanner;

public class Aplication {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String resultado = "";

		System.out.println("******** Jogo da velha ********");
		System.out.println();
		System.out.println("Você é o jogador X");
		System.err.println();
		int nivel = 0;
		while (nivel <= 0 || nivel > 3) {
			System.out.print("Escolha a dificuldade (1, 2 ou 3):");
			nivel = sc.nextInt();
		}
		Computador comp;
		Tabuleiro tab = new Tabuleiro();

		CampoJogada[][] velha = new CampoJogada[3][3];
		char simboloAtual = 'X';
		Boolean game = true;
		String vitoria = "";

		tab.iniciarJogo(velha);

		while (game) {
			tab.desenhaJogo(velha);
			vitoria = tab.verificaVitoria(velha, resultado);
			if (!vitoria.equals("")) {
				System.out.printf(vitoria);
				break;
			}
			try {
				if (nivel == 1) {
					if (tab.verificarJogada(velha, tab.jogar1(simboloAtual), simboloAtual)) {
						if (simboloAtual == 'X') {
							simboloAtual = 'O';
						} else {
							simboloAtual = 'X';
						}
					}
				} else if (nivel == 2) {
					if (tab.verificarJogada(velha, tab.jogar2(simboloAtual), simboloAtual)) {
						if (simboloAtual == 'X') {
							simboloAtual = 'O';
						} else {
							simboloAtual = 'X';
						}
					}
				} else {
					if (tab.verificarJogada(velha, tab.jogar3(simboloAtual), simboloAtual)) {
						if (simboloAtual == 'X') {
							simboloAtual = 'O';
						} else {
							simboloAtual = 'X';
						}
					}
				}

			} catch (Exception e) {
				System.out.print("Erro! " + e.getMessage());
				break;
			}

		}

	}

}
