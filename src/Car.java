
public class Car {

	int price;
	String color;
	String model;
	
	public static void main(String[] args) {
		Car maruthi=new Car();
		maruthi.price=450000;
		maruthi.color="Red";
		maruthi.model="Alto";
		
		System.out.println(maruthi.price);
		System.out.println(maruthi.color);
		System.out.println(maruthi.model);
		
		Car honda=new Car();
		honda.price=1450000;
		honda.color="Blue";
		honda.model="Amaze";
		
		System.out.println(honda.price);
		System.out.println(honda.color);
		System.out.println(honda.model);
		
		Car tata=new Car();
		tata.price=750000;
		tata.color="Orange";
		tata.model="Tigor";
		
		System.out.println(tata.price);
		System.out.println(tata.color);
		System.out.println(tata.model);
	}
	
	
}
