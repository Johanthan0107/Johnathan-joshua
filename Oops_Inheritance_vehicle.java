//Inheritance:- lets us inherit attributes and methods from another
//subclass (child) - the class that inherits from another class
//superclass (parent) - the class being inherited from
//To inherit from a class, use the extends keyword.

class Vehicle {
  protected String brand = "BMW";        // Vehicle attribute
  public void Jaguar() {                    // Vehicle method
    System.out.println("Tuut, tuut!");
  }
}

class Car extends Vehicle {
  private String modelName = "Mustang";    // Car attribute
  public static void main(String[] args) {

    // Create a myCar object
    Car myCar = new Car();

    // Call the honk() method (from the Vehicle class) on the myCar object
    myCar.Jaguar();

    // Display the value of the brand attribute (from the Vehicle class) and the value of the modelName from the Car class
    System.out.println(myCar.brand + " " + myCar.modelName);
  }
}
