//Break:It was used to "jump out" of a switch statement,The 'break' statement can also be used to jump out of a loop.

public class Break {
  public static void main (String[] args) {
  	//Forloop:
    for (int i = 0; i < 10; i++) {
    	//If condition:
      if (i == 4) {
        break;//Break statement
      }
      System.out.println(i);
    }  
  }
}
