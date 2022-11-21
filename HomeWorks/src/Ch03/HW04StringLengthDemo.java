package Ch03;
import java.util.Scanner;
public class HW04StringLengthDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		String s1="",s2="",s3="";
		if(scan.hasNext()) {
			s1 = scan.next();
		}
		if(scan.hasNext()) {
			s2 = scan.next();
		}
		if(scan.hasNext()) {
			s3 = scan.next();
		}
		System.out.println("s1.length = " + s1.length());
		System.out.println("s2.length = " + s2.length());
		System.out.println("s3.length = " + s3.length());
		scan.close();
	}

}
