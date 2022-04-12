package collectionsWorks1;

import java.util.ArrayList;

public class ArrayListExample {

	public static void main(String[] args) {

		ArrayList<Object> cars = new ArrayList<Object>();
		cars.add("Volvo");
		cars.add("Maruti");
		cars.add("Benz");
		cars.add("BMW");
		cars.add("Mustang");
		
		System.out.println(cars);
		
		ArrayList<Object> speed = new ArrayList<Object>();
		speed.add("150");
		speed.add("120");
		speed.add("200");
		speed.add("180");
		speed.add("240");
		
		System.out.println(speed);

		System.out.println(cars.addAll(speed));
		
		System.out.println(cars);
		
		System.out.println(cars.get(5));
		
		cars.set(5, "Porsche");
		System.out.println(cars);
		
		cars.remove(6);
		
		System.out.println(cars);
		System.out.println(cars.size());
		
		System.out.println(cars.clone());
	
		
		ArrayList<Object> myCar = new ArrayList<Object>();
		myCar.add("Volvo");
		myCar.add("Benz");
		
		cars.retainAll(myCar);
		System.out.println(cars);
		
		System.out.println(cars.removeAll(cars));
		System.out.println(cars.size());
		System.out.println(cars.isEmpty());
		
		
	}

}
