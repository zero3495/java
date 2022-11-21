package Ch07;
abstract class Human{
	int weight = 50;
	abstract void smile() ;
}
class OrdinaryPeople extends Human{
	@Override
	void smile() {
		// TODO Auto-generated method stub
		System.out.println("Ha");
	}
}
class HappyMarry extends OrdinaryPeople{
	
} 
public class Q07_03 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HappyMarry hm = new HappyMarry();
		hm.smile();
	}
}
