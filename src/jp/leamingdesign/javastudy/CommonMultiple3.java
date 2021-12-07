package jp.leamingdesign.javastudy;

public class CommonMultiple3 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		int i = 1;
//		2と3の公倍数以外を表示
		while(i < 20) {
			if (!((i % 2 == 0) && (i % 3 == 0))) {
				System.out.println(i);
			}
			i++;
		}

	}

}
