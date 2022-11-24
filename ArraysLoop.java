//loop:- we can loop through the array elements with the for loop, and use the length property to specify how many times the loop should run

public class loops{
public static void main (String[] args){

String [] names={"JHON","JOSHUA","DAVID","ABHRAHAM","YOHOSHUA"};

//Forloop:

/*for(int i=0;i< names.length;i++){	System.out.println(names[i]);
	*/
		
//For each loop:- There is also a "for-each" loop, which is used exclusively to loop through elements in arrays

for(String i:names){	System.out.println(i);
	}
 }
}

//Note:- for each String element (called i - as in index) in cars, print out the value of i.

//If you compare the for loop and for-each loop, you will see that the for-each method is easier to write, it does not require a counter (using the length property), and it is more readable.