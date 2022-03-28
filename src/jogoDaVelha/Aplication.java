package jogoDaVelha;

import java.util.Scanner;

public class Aplication {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in); // Estanciando o obejeto scanner que faz a leitura das entradas do usuario.

		String resultado = ""; // Variavel de controle do jodo.

		System.out.println("******** Jogo da velha ********");
		System.out.println();
		System.out.println("Você é o jogador X");
		System.err.println();
		int nivel = 0;
		
		// while foi utilizado para tratar um erro, erro esse onde o usuario digita um numero menor que 0 ou maior que 3, 
		// se for digitado esses valores ele repete até ser um valor válido.
		
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
		
		// Instanciando função iniciar jogo da classe tabuleiro.
		
		tab.iniciarJogo(velha);
		
		// Laço de repetição criado para repetir o jogo até o jogo finalizar.

		while (game) {
			tab.desenhaJogo(velha); // Instanciando a função desenha jogo da classe tabuleiro.
			vitoria = tab.verificaVitoria(velha, resultado); // Instanciando função verifica vitoria da classe tabuleiro.
			if (!vitoria.equals("")) {  //Condição para verifica se a variavel vitoria está vazia, se não etiver ele imprime o resultado obtido na função verifica vitoria e finaliza o código.
				System.out.print(vitoria);
				break;
			}
			
			// Bloco try cath para tratar as exceções.
			// Basedo no nível informado pelo usuario na variavel nivel, é instanciado as funções verifica jogada e jogar1, jogar2 ou jogar3 através do polimorfismo.
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
