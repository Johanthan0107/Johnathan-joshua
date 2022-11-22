//For each loop:-There is also a "for-each" loop, which is used exclusively to loop through elements in an array

public class Cars{
  public static void main(String[] args) {
  	
    String Benz_cars[] = {"Volvo", "BMW", "Ford", "Mazda"};
    
    for (String i : Benz_cars) {
      System.out.println(i);/*Volvo
BMW
Ford
Mazda*/
    }    
  }
}
