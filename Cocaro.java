package caro;

import java.util.Scanner;

public class Cocaro {
	static char[] spt = new char[9];
	static int k = 0;
public static void main(String[] args) {
	char  p;
	Scanner sc = new Scanner(System.in);
	for(int i = 0; i < spt.length; i++) {
		spt[i] = ' ' ;
		
	}
	//tic-tac-toe game with one-dimensional array
	Cocaro.caroMap();
	do {
		int n = sc.nextInt();
		if(spt[n-1] != ' ' ) {
			k--;
		}
		else{
		spt[n-1]  = Cocaro.turn();
		}
		
		Cocaro.caroMap();
		p = spt[n-1];
		Cocaro.checkWinorTie();
		if(checkWinorTie() == 1) {
			break;
		}
		k++;
	}while(k<9);
	if(checkWinorTie() == 1) {
	System.out.print(p + " chien thang");
	}
	if(checkWinorTie() != 1) {
		System.out.print("tran dau hoa");
	}
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
	public static int checkWinorTie() {
		if(spt[0] == spt[1] && spt[0] == spt[2] && spt[0] != ' '  || spt[0] == spt[3] && spt[0] == spt[6] && spt[0] != ' ' || spt[3] == spt[4] && spt[3] == spt[5] && spt[3] != ' ' || spt[6] == spt[8] && spt[6] == spt[7] && spt[6] != ' ' || spt[8] == spt[5] && spt[8] == spt[2] && spt[8] != ' ' || spt[0] == spt[4] && spt[0] == spt[8] && spt[0] != ' ' ||  spt[2] == spt[4] && spt[2] == spt[6] && spt[2] != ' ' ||  spt[1] == spt[4] && spt[1] == spt[7] && spt[1] != ' ') {
		return 1;
		}
		else {
			return 0;
		}
	}
	
}
