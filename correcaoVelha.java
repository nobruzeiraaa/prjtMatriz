package projMatriz;
import java.util.Scanner;
public class correcaoVelha {

	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		String matriz [][] = new String [3][3];
		int jogada=0, linha=0, coluna=0;
		
		while (jogada<9) {

			for (linha=0; linha<3; linha++) {
				for (coluna=0; coluna<3; coluna++) {
					System.out.println("Digite a posição da linha: ");
					linha=in.nextInt();
					System.out.println("Digite a posição da coluna: ");
					coluna = in.nextInt();
					
					if(jogada %2==0) {
						matriz [linha][coluna]="O";
					}else {
						matriz [linha][coluna]="X";
					}
					jogada++;
					System.out.println("Vez do "+matriz[linha][coluna]);
					matriz [linha][coluna]=in.next();
				}		
			}
			
				for (linha=0; linha<3; linha++) {
					for (coluna=0; coluna<3; coluna++) {
					System.out.print(matriz[linha][coluna]+" ");
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
}	

