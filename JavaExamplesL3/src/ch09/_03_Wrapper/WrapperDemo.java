package ch09._03_Wrapper;

public class WrapperDemo {
	public static void main(String[] args) {
		/*Object[] oa0 = { new Integer(100), new Double(3.14), 
				new Float(10.0F), 	"Kitty", 
				new Object(), new Long(250), 
				new Short("20")
		};*/
		Object[] oa = { 
				Integer.valueOf(100), 
				Double.valueOf(3.14), 
				Float.valueOf(10.0F), 	
				"Kitty", 
				new Object(),  
				Long.valueOf(250L), 
				Short.valueOf("20")
				};
		double total = 0;
		for (int n = 0; n < oa.length; n++) {
			Object o = oa[n];
			//變更後
			if(o instanceof Number) {
				Number num = (Number)o;
				System.out.println(num.getClass().getName());
				total += num.doubleValue();
			}
			/*原程式碼
			 * if (o instanceof Integer) {
				Integer num = (Integer) o;
				total += num.intValue();
			} else if (o instanceof Double) {
				Double num = (Double) o;
				total += num.doubleValue();
			} else if (o instanceof Float) {
				Float num = (Float) o;
				total += num.floatValue();
			} else if (o instanceof Byte) {
				Byte num = (Byte) o;
				total += num.byteValue();
			} else if (o instanceof Short) {
				Short num = (Short) o;
				total += num.shortValue();
			} else if (o instanceof Long) {
				Long num = (Long) o;
				total += num.longValue();
			}*/
			
		}
		System.out.println("總和=" + total);
	}
}
