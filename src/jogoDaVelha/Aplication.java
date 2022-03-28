package jogoDaVelha;

import java.util.Scanner;

public class Aplication {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in); // Estanciando o obejeto scanner que faz a leitura das entradas do usuario.

		String resultado = ""; // Variavel de controle do jodo.

		System.out.println("******** Jogo da velha ********");
		System.out.println();
		System.out.println("Voc� � o jogador X");
		System.err.println();
		int nivel = 0;
		
		// while foi utilizado para tratar um erro, erro esse onde o usuario digita um numero menor que 0 ou maior que 3, 
		// se for digitado esses valores ele repete at� ser um valor v�lido.
		
		while (nivel <= 0 || nivel > 3) { 
			System.out.print("Escolha a dificuldade (1, 2 ou 3):");
			nivel = sc.nextInt();
		}
		
		// Iniciando a Classe Tabuleiro.
		
		Tabuleiro tab = new Tabuleiro();

		// Instanciando a Matriz Campo Jogada com 
		CampoJogada[][] velha = new CampoJogada[3][3];
		
		char simboloAtual = 'X';
		Boolean game = true;
		String vitoria = "";
		
		// Instanciando fun��o iniciar jogo da classe tabuleiro.
		
		tab.iniciarJogo(velha);
		
		// La�o de repeti��o criado para repetir o jogo at� o jogo finalizar.

		while (game) {
			tab.desenhaJogo(velha); // Instanciando a fun��o desenha jogo da classe tabuleiro.
			vitoria = tab.verificaVitoria(velha, resultado); // Instanciando fun��o verifica vitoria da classe tabuleiro.
			if (!vitoria.equals("")) {  //Condi��o para verifica se a variavel vitoria est� vazia, se n�o etiver ele imprime o resultado obtido na fun��o verifica vitoria e finaliza o c�digo.
				System.out.print(vitoria);
				break;
			}
			
			// Bloco try cath para tratar as exce��es.
			// Basedo no n�vel informado pelo usuario na variavel nivel, � instanciado as fun��es verifica jogada e jogar1, jogar2 ou jogar3 atrav�s do polimorfismo.
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
				} else {					if (tab.verificarJogada(velha, tab.jogar3(simboloAtual), simboloAtual)) {
						if (simboloAtual == 'X') {
							simboloAtual = 'O';
						} else {
							simboloAtual = 'X';
						}
					}
				}

				// Mensagem informando o erro quando ocorrido.
			} catch (Exception e) {
				System.out.print("Erro! " + e.getMessage());
				break;
			}

		}

	}

}
