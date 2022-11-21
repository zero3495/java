package ch09;

import java.util.ArrayList;
import java.util.Collection;


public class ShoppingCart {

	public static void main(String[] args) {
		Collection<Beer> col1 = new ArrayList<>();
		Beer beer1 = new Beer();
		Beer beer2 = new Beer();
		Cat c1 = new Cat();
		Cat c2 = new Cat();
		Dog d1 = new Dog();
		col1.add(beer1);
		col1.add(beer2);
		
		Collection<Mammal> col2 = new ArrayList<>();
		col2.add(d1);
		col2.add(c1);
		col2.add(c2);
		
		Collection<Cat> col3= new ArrayList<>();
		//col3.add(d1); 不合法
		col3.add(c1);
		col3.add(c2);
		
		
		
		
		

	}

}
