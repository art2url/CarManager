package ua.com.foxminded.carmanager;

public class CivilAviation extends Plane {

	public CivilAviation(String name, int yearOfProduction, int price, int weight, Color color) {
		super(name, yearOfProduction, price, weight, color);
	}
		
	@Override
	public boolean isReadyToService() {
		if(distanceOnService > 500000) {
			return true;
		}
		return false;
		}
		
}
