package ua.com.foxminded.carmanager;

public interface Servicable {
	public boolean isReadyToService();//все методы абстрактные
	public int getDistanceOnService();
	public void addDistance(int additionalDistance) throws Exception;
	public void addDistance(double additionalDistance) throws Exception;
	
}
