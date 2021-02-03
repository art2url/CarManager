package ua.com.foxminded.carmanager;

import java.util.ArrayList;
import java.util.List;

public class Carmanager {

	public static void main(String[] args) throws Exception {
		
//		Car prius = new Car("Toyota Prius", 2008, 15000, 1200, Color.valueOf("WHITE"));
		
		
		Car prius = new PassengerCar("Toyota Prius", 2008, 15000, 1200, Color.GREEN);
		Car renault = new Bus("Renaut Laguna", 2000, 9700, 1600, Color.WHITE);
		//Car renault2 = new Bus("Renaut Laguna", 2000, 9700, 1600, Color.WHITE);
		Plane bombardier = new CivilAviation("Bombardier", 2010, 10000000, 300000, Color.BLACK);
		
		List<Car> cars = new ArrayList<>();
		List<Plane> planes = new ArrayList<>();
		
		cars.add(prius);
		cars.add(renault);
		planes.add(bombardier);
		
		System.out.println(cars);
		System.out.println(planes);

		prius.addDistance(15000);
		prius.addDistance(15000);
		renault.addDistance(15000);
		bombardier.addDistance(600000);

		prius.addDistance(20.9);

		
//		Car renault = new Car(null, 0, 0, 0, null);
//		renault.name = "Renaut Laguna";
//		renault.color = Color.valueOf("WHITE");
//		renault.yearOfProduction = 2000;
//		renault.price = 9700;
//		renault.weight = 1600;
		
		System.out.println(prius);
		System.out.println(renault);
		System.out.println(bombardier);
		
//		System.out.println(prius.equals(renault2));
//		System.out.println(renault.equals(renault2));
		
		System.out.println(prius.isReadyToService());
		System.out.println(renault.isReadyToService());
		System.out.println(bombardier.isReadyToService());

		
		
	}

}
