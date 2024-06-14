package factory;

class VehicleFactory {
 // Factory method to get Vehicle object by type
 public Vehicle createVehicle(String type) {
     if (type.equalsIgnoreCase("car")) {
         return new Car();
     } else if (type.equalsIgnoreCase("motorcycle")) {
         return new MotorCycle();
     }
     return null;
 }
}
