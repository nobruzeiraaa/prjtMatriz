package projMatriz;
import java.util.Scanner;
public class Matriz {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int matriz [][]= new int [3][4];
		
		for(int i=0; i<3; i++) { // ESTE LAÇO CONTROLA AS LINHAS
			for (int j=0; j<4; j++) { //ESTE LAÇO CONTROLA AS COLUNAS
			System.out.println("Digite um número para a posição ["+i+"] ["+j+"] ");
			matriz[i][j] = in.nextInt();
		}
		
		}
			
		for (int i=0; i<3; i++) { //ESTE LAÇO CONTROLA AS LINHAS
			for (int j=0; j<4; j++) { //ESTE LAÇO CONTROLA AS COLUNAS
			System.out.print(matriz[i] [j] + " ");
		}
			System.out.println();
	}
		
		in.close();
	}
	
}
