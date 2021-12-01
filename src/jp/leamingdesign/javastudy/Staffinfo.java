package jp.leamingdesign.javastudy;

class Staff {
	String name;
	int staffid;
	String email;
	
	public void Sayhello(){
		System.out.println("Hello " + this.name);
	}
	
}

public class Staffinfo {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Staff yamada = new Staff();
		yamada.name = "Taro Yamada";
		
		// System.out.println(yamada.name);
		yamada.Sayhello();

	}

}
