package Ch05;

public class HW02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean isRepeat[] = new boolean[43]; 
		/*for(int x = 0; x<isRepeat.length; x++) {
			System.out.println("isRepeat[" + x + "]" +(isRepeat[x]) );
		}  知道此陣列初值為false */
		int hasSixNumber = 0;
		int x = 0;
		while(hasSixNumber<6) {
			x = (int)(Math.random() * 42) + 1;
			if(!isRepeat[x]) {
				System.out.print( x + "  ");
				isRepeat[x] = true;
				hasSixNumber++;
			}/*else {
				System.out.print(" isRepeat "); //測試重複情形是否有出現。
			}*/
		}
		
	}

}
