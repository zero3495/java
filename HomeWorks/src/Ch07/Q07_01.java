package Ch07;

public class Q07_01 {
	static {System.out.println("static code block A");}
	Q07_01(){
		 //System.out.println("static code block f");
	}
	static {System.out.println("static code block b");}
	@SuppressWarnings("unused")
	public static void main (String[] args) {
		//System.out.println("static code block d");
		Q07_01 con = new Q07_01();
		System.out.println("HaHaHa");
	}
	static {System.out.println("static code block c");}
}
