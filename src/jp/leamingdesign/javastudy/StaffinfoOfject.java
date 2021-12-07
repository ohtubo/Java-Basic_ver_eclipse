package jp.leamingdesign.javastudy;

class info {
	String name;
	int staffid;
	String email;
	
	public void Sayhello(){
		System.out.println("Hello " + this.name);
	}

	public info(String name, int staffid, String email) {
		super();
		this.name = name;
		this.staffid = staffid;
		this.email = email;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getStaffid() {
		return staffid;
	}

	public void setStaffid(int staffid) {
		this.staffid = staffid;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
}

public class StaffinfoOfject {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
//		info yamada = new info("Taro Yamada",12345,"info@yahoo.co.jp");
//		yamada.name = "Taro Yamada";
		
		// System.out.println(yamada.name);
//		yamada.Sayhello();
		
		System.out.println("[社員情報]");
		System.out.println("氏名：" + yamada.getName());
		System.out.println("社員番号：" + yamada.getStaffid());
		System.out.println("Email：" + yamada.getEmail());
	}

}
