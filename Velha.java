package projMatriz;
import java.util.Scanner;
public class Velha {
	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		String matriz [][] = new String [3][3];
		

		for (int linha=0; linha<3; linha++) {
			for (int coluna=0; coluna<3; coluna++) {
				System.out.println("Digite X ou O para a posição ["+linha+"] ["+coluna+"] ");
				matriz [linha][coluna] = in.next();
				
			}	
		}
		for (int linha=0; linha<3; linha++) {
			for (int coluna=0; coluna<3; coluna++) {
				System.out.print(matriz [linha][coluna]+" ");
			}	
			System.out.println();
			
		}
			if (matriz [0][0].equalsIgnoreCase("X") && matriz [0][1].equalsIgnoreCase("X") && matriz[0][2].equalsIgnoreCase("X") || 
					matriz [1][0].equalsIgnoreCase("X") && matriz [1][1].equalsIgnoreCase("X") && matriz [1][2].equalsIgnoreCase("X") || 
					matriz [2][0].equalsIgnoreCase("X") && matriz [2][1].equalsIgnoreCase("X") && matriz [2][2].equalsIgnoreCase("X") || 
					matriz [0][0].equalsIgnoreCase("X") && matriz [1][0].equalsIgnoreCase("X") && matriz [2][0].equalsIgnoreCase("X") || 
					matriz [0][1].equalsIgnoreCase("X") && matriz [1][1].equalsIgnoreCase("X") && matriz [2][1].equalsIgnoreCase("X")|| 
					matriz [0][2].equalsIgnoreCase("X") && matriz [1][2].equalsIgnoreCase("X") && matriz [2][2].equalsIgnoreCase("X")|| 
					matriz [0][0].equalsIgnoreCase("X") && matriz [1][1].equalsIgnoreCase("X") && matriz [2][2].equalsIgnoreCase("X")) {
				System.out.println("Vencedor X");	
			}else if  (matriz [0][0].equalsIgnoreCase("O") && matriz [0][1].equalsIgnoreCase("O") && matriz[0][2].equalsIgnoreCase("O") || 
					matriz [1][0].equalsIgnoreCase("O") && matriz [1][1].equalsIgnoreCase("O") && matriz [1][2].equalsIgnoreCase("O") || 
					matriz [2][0].equalsIgnoreCase("O") && matriz [2][1].equalsIgnoreCase("O") && matriz [2][2].equalsIgnoreCase("O") || 
					matriz [0][0].equalsIgnoreCase("O") && matriz [1][0].equalsIgnoreCase("O") && matriz [2][0].equalsIgnoreCase("O") || 
					matriz [0][1].equalsIgnoreCase("O") && matriz [1][1].equalsIgnoreCase("O") && matriz [2][1].equalsIgnoreCase("O")|| 
					matriz [0][2].equalsIgnoreCase("O") && matriz [1][2].equalsIgnoreCase("O") && matriz [2][2].equalsIgnoreCase("O")|| 
					matriz [0][0].equalsIgnoreCase("O") && matriz [1][1].equalsIgnoreCase("O") && matriz [2][2].equalsIgnoreCase("O")) {
				System.out.println("Vencedor O");
			}else {
				System.out.println("Deu Velha");
			}
	in.close();
	}
}
