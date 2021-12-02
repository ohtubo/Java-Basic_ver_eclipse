package jp.leamingdesign.javaalgorithm;

public class AsteriskPyramid02 {
	//アスタリスクで三角形を作成する
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		for (int Totale = 0; Totale < 5; Totale++) {
			
			for(int Blank = 0; Blank < Totale; Blank++) {
				System.out.print(" ");
			}
			for(int Asterisk = 0; Asterisk < (5 - Totale )*2-1; Asterisk++) {
				System.out.print("*");
			}
			System.out.println("");
		}

	}

}
