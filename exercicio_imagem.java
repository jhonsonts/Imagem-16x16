package jojopose;
import java.util.Scanner;
public class exercicio_imagem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
Scanner ler = new Scanner(System.in); // Nosso Scanner que fara a leitura do nosso codigo
		
		int i, j, m[][] = new int[16][16]; // Nossas variaveis e variavel de matriz com valor 16x16
		
		
		System.out.printf("Crie um desenho a partir de uma matriz 16x16\n"); // Interface que aparecera para nosso usuario imputar dados
		
		for (i = 0; i < 16; i++) { // Nossa estrutura de repeticao para o numero de linhas da matriz
			System.out.printf("Cores: Branco(0); Preto(1); Vermelho(2); e Bege(3).\nInforme as cores da %da. linha:\n", // Interface que aparecera para o usuario, informando as cores junto com a contagem 
					(i + 1));
			for (j = 0; j < 16; j++) {  // Nossa estrutura de repetição para numero de colunas da matriz
				System.out.printf("m[%d][%d] = ", i, j); // Interface que aparecera para o usuario imputar os dados/ coordenadas para a matriz
				m[i][j] = ler.nextInt(); // Fara a leitura e guardara o valor em uma coordenada na matriz
			}
			System.out.printf("\n"); // Ira pular uma linha 
		}
		System.out.printf("\n"); // Ira pular uma linha 
		for (i = 0; i < 16; i++) { // Nossa estrutura de repeticao para o numero de linhas da matriz
		
			for (j = 0; j < 16; j++) { // Nossa estrutura de repetição para numero de colunas da matriz
				// Exibir os valores referente a coordenada da matriz
				System.out.printf("%d ", m[i][j]); // Interface que aparecera ao usuario mostrando os valores da coordenada da matriz
			}
			System.out.printf("\n"); //  Ira pular uma linha 
		}
	}


	}


