package projMatriz;
import java.util.Scanner;
public class Matriz {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int matriz [][]= new int [3][4];
		
		for(int i=0; i<3; i++) { // ESTE LA�O CONTROLA AS LINHAS
			for (int j=0; j<4; j++) { //ESTE LA�O CONTROLA AS COLUNAS
			System.out.println("Digite um n�mero para a posi��o ["+i+"] ["+j+"] ");
			matriz[i][j] = in.nextInt();
		}
		
		}
			
		for (int i=0; i<3; i++) { //ESTE LA�O CONTROLA AS LINHAS
			for (int j=0; j<4; j++) { //ESTE LA�O CONTROLA AS COLUNAS
			System.out.print(matriz[i] [j] + " ");
		}
			System.out.println();
	}
		
		in.close();
	}
	
}
