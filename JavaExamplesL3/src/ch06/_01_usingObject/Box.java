package ch06._01_usingObject;

//modifiers class classname
public class Box {

	// 變數型態 變數名稱 = 初值 ;
	
	int depth;
	int height;
	private int width;
	
	public int getWidth() {
		return width;
	}
	public void setWidth(int width) {
		if(width<0) {
			System.out.println("值不可為負。");
		}else {
		this.width = width;
		}
	}
	public int getDepth() {
		return depth;
	}
	public void setDepth(int depth) {
		this.depth = depth;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	// 傳回值的型態 方法名稱(參數列) {
	// type local-variable1 ;
	// type local-variable2 ;
	// statements ;
	// }
	
	public double getSurfaceArea() {
		return 2 * (width * depth + depth * height + width * height);
	}
	public double getVolume() {
		return width * depth * height;
	}
	
}
