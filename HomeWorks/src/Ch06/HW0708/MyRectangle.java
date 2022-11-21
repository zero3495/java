package Ch06.HW0708;

import java.util.Objects;

public class MyRectangle {
	double width = 0;
	double depth = 0;
	public MyRectangle(double width, double depth){
		this.width = width;
		this.depth = depth;
	}
	public MyRectangle(){
		this(0,0);
	}
	public void setWidth(double width) {
		this.width = width;
	}
	public void setDepth(double depth) {
		this.depth = depth;
	}
	public double getArea() {
		return depth*width;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		MyRectangle other = (MyRectangle) obj;
		return Double.doubleToLongBits(depth) == Double.doubleToLongBits(other.depth)
				&& Double.doubleToLongBits(width) == Double.doubleToLongBits(other.width);
	}
	@Override
	public int hashCode() {
		return Objects.hash(depth, width);
	}
	
	

}
