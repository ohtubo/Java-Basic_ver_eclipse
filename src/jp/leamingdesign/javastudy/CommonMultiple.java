package jp.leamingdesign.javastudy;

public class CommonMultiple {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		int i = 1;
//		1～50までで2か3の倍数の時表示
		while(i < 50) {
			if ((i % 2 == 0) || (i % 3 == 0)) {
				System.out.println(i);
			}
			i++;
		}

	}

}
