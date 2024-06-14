package factory;

public class FactoryPatternDemo {
	public static void main(String[] args) {
        VehicleFactory vehicleFactory = new VehicleFactory();

        // Get a car and drive it
        Vehicle car = vehicleFactory.createVehicle("car");
        car.drive();

        // Get a motorcycle and ride it
        Vehicle motorcycle = vehicleFactory.createVehicle("motorcycle");
        motorcycle.drive();
    }

}
