package projMatriz;
import java.util.Scanner;
public class Diagonal {
	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		int matriz [] [] = new int [5][5];
		
		for (int linha=0; linha<5; linha++) {
			for (int coluna=0; coluna<5; coluna++) {
			System.out.println("Digite um número para a posição ["+linha+"] ["+coluna+"] ");
			matriz[linha][coluna] = in.nextInt();
			}
		}
		
		for (int linha=0; linha<5; linha++) {
			for (int coluna=0; coluna<5; coluna++) {
				System.out.print(matriz [linha][coluna]+ " ");
			}
				System.out.println();
		}
		
		for (int linha=0; linha<5; linha++) {
			for (int coluna=0; coluna<5; coluna++) {
				if (linha == coluna) {
					System.out.print(matriz [linha][coluna]+ " / ");
				}
			}
		}
		
		in.close();
	}
}
