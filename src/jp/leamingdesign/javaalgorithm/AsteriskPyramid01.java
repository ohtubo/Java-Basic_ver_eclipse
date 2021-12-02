package jp.leamingdesign.javaalgorithm;

public class AsteriskPyramid01 {
	//アスタリスクで三角形を作成する
	public static void main(String[] args) {
		
		for (int Totale = 0; Totale < 5; Totale++) {
			for(int Blank = 0; Blank < 5 - (Totale + 1); Blank++) {
				System.out.print(" ");
			}
			for(int Asterisk = 0; Asterisk < (Totale + 1)*2 -1; Asterisk++) {
				System.out.print("*");
			}
		System.out.println("");			
		}

	}

}
