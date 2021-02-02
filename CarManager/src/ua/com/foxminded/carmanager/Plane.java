package ua.com.foxminded.carmanager;

public abstract class Plane implements Servicable {

	String name;
	int yearOfProduction;
	int price;
	int weight;
	Color color;
	private int distance = 0;
	protected int distanceOnService = 0;
	
	public Plane (String name, int yearOfProduction, int price, int weight, Color color) {
		this.name = name;
		this.yearOfProduction = yearOfProduction;
		this.price = price;
		this.weight = weight;
		this.color = color;
//		this.color = Color.valueOf(color);
	}
	
		public void addDistance(int additionalDistance) throws Exception {
			distance += additionalDistance;
			distanceOnService += additionalDistance;
			if(0 <= additionalDistance) {
		      }else {
		         throw new Exception();
		      }
		}
		
		public void addDistance(double additionalDistance) throws Exception {
			this.addDistance((int)additionalDistance);
			if(0 <= additionalDistance) {
		      }else {
		         throw new Exception();
		      }
		}
		
			
		public int getDistanceOnService() {
			return distanceOnService;
		}

		public int getDistance() {
			return distance;
		}


		@Override
		public String toString() {
			return "Plane [name=" + name + ", yearOfProduction=" + yearOfProduction + ", price=" + price + ", weight="
					+ weight + ", color=" + color + ", distance=" + distance + ", distanceOnService="
					+ distanceOnService + "]";
		}
		
}  

