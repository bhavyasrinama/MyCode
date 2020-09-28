
public class Prog {

	static{
		System.out.println("static block");
	}
	
	static void test(){
		System.out.println("static method");
	}
	
	public void exe(){
		System.out.println("method");
	}
	
	Prog(){
		System.out.println("constructor");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Prog p = new Prog();
		p.exe();
		Prog.test();
	}

}
