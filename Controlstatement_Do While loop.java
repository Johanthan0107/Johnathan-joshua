/*The loop will always be excuted at least once even,
If the condition is 'Fals',
bcz the code block is exicuted before the condition is tested.*/

public class Main {
  public static void main(String[] args) {
    int i = 0;
    do {
      System.out.println(i);//0/p is :-0 1 2 3 4
      i++;
    }
    while (i < 5);  
  }
}
