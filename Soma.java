package projMatriz;
import java.util.Scanner;
public class Soma {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int matriz [][] = new int [4][2];
		int soma = 0;
		
			for (int linha=0; linha<4; linha++) {
				for(int coluna=0; coluna<2; coluna++) {
			System.out.println("Digite um número para a posição ["+linha+"] ["+coluna+"] ");
			matriz[linha][coluna] = in.nextInt();
				}
			}
			
			for (int linha=0; linha<4; linha++) {
				for (int coluna=0; coluna<2; coluna++) {
					System.out.print(matriz [linha] [coluna] + " ");
				}
				System.out.println();
			}
			
			for (int linha=0; linha<4; linha++) {
				for (int coluna=0; coluna<2; coluna++) {
					soma = soma + matriz [linha][coluna];
				
				}
				System.out.println();
				System.out.print("A soma da "+(linha+1)+"ª Linha é = "+soma);
				soma = 0;
			}

			in.close();
		}
}