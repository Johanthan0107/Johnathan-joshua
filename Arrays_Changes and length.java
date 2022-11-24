//Arrays:- Arrays are used to store multiple values in a single variable, instead of declaring separate variables for each value.
//Change arrays elements:- to change the values of a specific elements refer to the index number.
//Length:- to find out how many elements on arrays ,use the "length" property

public class Array{
public static void main (String[] args){
	
String[] cars={"BMW","ODI","VOLVO","FORD"};
cars[3]="JAGUAR";//Now O/P JAGUAR instead of FORD

int[] carsNumbers={101,202,303,404,505};
carsNumbers[3]=302;//Now O/P 302 instead of 303

System.out.println(carsNumbers[3]);
System.out.println(cars.length);

System.out.println(cars[3]);
 }
}
//NOTE:- Arrays indexs starts with0:[0] is the first element.[1] is the second elements,etc
