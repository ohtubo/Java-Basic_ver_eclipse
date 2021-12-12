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

class RemoteStaff extends info{
	
	public String location;
	public RemoteStaff(String name, int staffid, String email) {
		super(name, staffid, email);
		// TODO 自動生成されたコンストラクター・スタブ
	}
	
}

public class StaffinfoOfject {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		RemoteStaff tanaka = new RemoteStaff("Hanako tanaka",67890,"RemoteStaff@yahoo.co.jp");
		tanaka.location = "大阪";
		
		info yamada = new info("Taro Yamada",12345,"info@yahoo.co.jp");
//		yamada.name = "Taro Yamada";
		
		// System.out.println(yamada.name);
//		yamada.Sayhello();
		
		System.out.println("[社員情報]");
		System.out.println("氏名：" + yamada.getName());
		System.out.println("社員番号：" + yamada.getStaffid());
		System.out.println("Email：" + yamada.getEmail());
		
		System.out.println("[Remote社員情報]");
		System.out.println("氏名：" + tanaka.getName());
		System.out.println("社員番号：" + tanaka.getStaffid());
		System.out.println("Email：" + tanaka.getEmail());
		System.out.println("勤務地：" + tanaka.location);
	}

}
