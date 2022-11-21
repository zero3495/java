package exer05;

import exer05.Mammals;


public class ReferenceDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cat cat = new Cat(); 
		Dog dog = new Dog();
		Mammals mammal = new Mammals();
		
		mammal = cat;//子類別給資料到父類別 相容 合法。
		mammal = dog;//子類別給資料到父類別 相容 合法。
		/*cat = dog; //子類別給父類別的另一個子類別 不相容 不合法。*/
	}

}
