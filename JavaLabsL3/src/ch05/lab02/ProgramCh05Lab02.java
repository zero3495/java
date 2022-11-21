package ch05.lab02;

/*
 * 請編寫程式ch05.lab02.ProgramCh05Lab02，
 * 在main()之內定義:整數陣列 ar，其內含有下列元素：
 * 100, 35, 46, 75, 56, 69，請計算並印出這些
 * 元素的總和，平均，最大的元素與最小的元素。
 */
public class ProgramCh05Lab02 {
	public static void main(String[] args) {
		int ar[] = {100, 35, 46, 75, 56, 69};
		int sum = 0;
		double avg = 0.0;
		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;
		for(int i : ar) {
			sum += i;
			if(max < i) {
				max = i;
			}
			if(min>i) {
				min = i;
			}
		}
		avg = (double)sum / ar.length;
		System.out.println("sum = " + sum);
		System.out.println("avg = " + avg);
		System.out.println("max = " + max);
		System.out.println("min = " + min);
		
	}
}
