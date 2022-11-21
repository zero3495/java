
public class Static_NonStaticB {
	int n =100;
	static int s = 1;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 100;
		s1();
		System.out.println(x);
		Static_NonStaticB ns2 = new Static_NonStaticB();
		ns2.n++;
		ns2.ns();
	}
	public static void s1() {
		// TODO Auto-generated method stub
		System.out.println("s1 is here.");
	}
	public void ns() {
		// TODO Auto-generated method stub
		System.out.println("ns is here.");
		ns2();
		s1();
		n++;
		s++;
	}
	public void ns2() {
		// TODO Auto-generated method stub
		System.out.println("ns2 is here.");
	}

}
