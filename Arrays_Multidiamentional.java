/*Multidimensional:- A multidimensional array is an array of arrays.

 Multidimensional arrays are useful when you want to store data as a tabular form, like a table with rows and columns.

 To create a two-dimensional array, add each array within its own set of curly braces:*/

public class Multidiamentional_Array {
public static void main (String []args){

int[][] myNumbers={{1,2,3,4,5},{5,6,7}};
myNumbers[1][2]=8;//it's changes elements.

System.out.println(myNumbers[1][2]);//8
 }
}
//Note:- Array indexes start with 0: [0] is the first element. [1] is the second element, etc
