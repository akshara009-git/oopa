package inheritance;

public class SingleInheritance {
    class Vehicle {
    	public static void move() {
    		System.out.println("moves with wheels");
    	}
    }
    class Car extends Vehicle{
    	public static void fuelType() {
    		System.out.println("car needs petrol and diesel");
    	}
    	
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Car.move();
      Car.fuelType();
	}
/*How does inheritance promote code reuse here?
 here as we see we used single inheritance, where one parent class (Vehicle) has only one child class which is Car instead of writing the 
 method move again in the child class we are accessing the move method from parent class through the child class using extends key word.
 This can help in reducing the code by a significant amount. */
}
