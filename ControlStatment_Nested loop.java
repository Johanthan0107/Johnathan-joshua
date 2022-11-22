//Nested loop:-It is also possible to place a loop inside another loop. This is called a nested loop.

public class Main {
	
	
  public static void main(String[] args) {
    
    // this is Outer loop:
    for (int i = 1; i <= 3; i++) {
      System.out.println("Outer: " + i); // Executes 3 times
   
   // Inner loop:The "inner loop" will be executed one time for each iteration of the "outer loop":
   //This is inner loop:
      for (int j = 1; j <= 4; j++) {
        System.out.println(" Inner: " + j); // Executes 12 times (3 * 4)
/*How it's displayed:- out put will be start out put 1,out put2,out put3,like this
 and input will be start input 1,input 2,input 3,input 4 like this.*/

      }
    } 
  }
}
/*Outer: 1
 Inner: 1
 Inner: 2
 Inner: 3
 Inner: 4
Outer: 2
 Inner: 1
 Inner: 2
 Inner: 3
 Inner: 4
Outer: 3
 Inner: 1
 Inner: 2
 Inner: 3
 Inner: 4*/
