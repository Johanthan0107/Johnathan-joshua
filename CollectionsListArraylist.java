//List interface:-List interface extends the Collection interface, and it is an ordered collection of objects. It contains duplicate elements. It also allows random access of elements.
//The ArrayList class:- implements the List interface. It uses a dynamic array to store the duplicate element of different data types. The ArrayList class maintains the insertion order and is non-synchronized. The elements stored in the ArrayList class can be randomly accessed.

import java.util.ArrayList; 
import java.util.Iterator; 
class CollectionTest{ 
public static void main(String args[]){ 
	
	//Creating arraylist 
ArrayList<String> list=new ArrayList<String>();
//List<String> l=new ArrayList<String>();//it's used in Java8.

//Adding object in arraylist
list.add("Innu"); 
list.add("Joshua"); 
list.add("John"); 
list.add("Innu");//Duplicate value.
//l.forEach(n->System.out.println(n)); }}//this is used in Java8.

//l.forEach(System.out::println);}}// it's a Stream method.

//Traversing list through Iterator
Iterator itr=list.iterator(); 

while(itr.hasNext()){ 
System.out.println(itr.next());
  } 
 }
}