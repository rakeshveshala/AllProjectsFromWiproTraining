package interfacepractice;

public interface Vehicle {
	public void start();
	public void stop();
	public void noOfVehicles();
	public default void hello() {
		System.out.println("hihihi");
    };
}