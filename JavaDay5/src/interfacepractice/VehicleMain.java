package interfacepractice;

public class VehicleMain {

	public static void main(String[] args) {
		Vehicle obj;
		obj=new Car();
		obj.start();
		obj.stop();
		obj.noOfVehicles();
		
		obj=new Truck();
		obj.start();
		obj.stop();
		obj.noOfVehicles();
	}

}
