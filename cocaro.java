package caro;

import java.util.Scanner;

public class cocaro {
	static char[] spt = new char[9];
	static int k = 0;
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	for(int i = 0; i < spt.length; i++) {
		spt[i] = ' ' ;
		
	}
	\\tic-tac-toe game with one-dimensional array
	cocaro.caroMap();
	do {
		int n = sc.nextInt();
		if(spt[n-1] != ' ' ) {
			k--;
		}
		else{
		spt[n-1]  = cocaro.turn();
		}
		cocaro.checkWinorTie();
		if(cocaro.checkWinorTie() == 1) {
			
		}
		cocaro.caroMap();
		cocaro.checkWinorTie();
		if(checkWinorTie() == 1) {
			break;
		}
		k++;
	}while(k<9);
	cocaro.displayWinOrTie();
}
	public static void caroMap() {
	for(int i = 0; i < 9; i = i+3) {
		System.out.println(spt[i] + "|"+  spt[i+1] +  "|" + spt[i+2]  );
	}
	
	
}
	public static char turn() {
		if(k%2 == 0) {
			return 'x';
		}
		else{
			return 'o';
		}
	}
	public static void displayWinOrTie() {
		if(spt[0] == spt[1] && spt[0] == spt[2]  || spt[0] == spt[3] && spt[0] == spt[6] || spt[3] == spt[4] && spt[3] == spt[5] || spt[6] == spt[8] && spt[6] == spt[7] || spt[8] == spt[5] && spt[8] == spt[2] || spt[0] == spt[4] && spt[0] == spt[8] ||  spt[2] == spt[4] && spt[2] == spt[6]) {
			System.out.print(spt[0] + " chien thang");
		}
		else {
			System.out.print("tran dau hoa");
		}
	}
	public static int checkWinorTie() {
		if(spt[0] == spt[1] && spt[0] == spt[2] && spt[0] != ' '  || spt[0] == spt[3] && spt[0] == spt[6] && spt[0] != ' ' || spt[3] == spt[4] && spt[3] == spt[5] && spt[3] != ' ' || spt[6] == spt[8] && spt[6] == spt[7] && spt[6] != ' ' || spt[8] == spt[5] && spt[8] == spt[2] && spt[8] != ' ' || spt[0] == spt[4] && spt[0] == spt[8] && spt[0] != ' ' ||  spt[2] == spt[4] && spt[2] == spt[6] && spt[2] != ' ') {
		return 1;
		}
		else {
			return 0;
		}
	}
	
}
