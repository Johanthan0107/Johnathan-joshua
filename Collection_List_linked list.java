//LinkedList implements the Collection interface. It uses a doubly linked list internally to store the elements. It can store the duplicate elements. It maintains the insertion order and is not synchronized.

import java.util.*; 
public class LinkedListTest{ 
public static void main(String args[]){ 
 LinkedList<String> al=new LinkedList<String>(); 
 al.add("Zion"); 
 al.add("Rishi"); 
 al.add("Varnika"); 
 al.add("Hannanya");
 al.add("Zion");
 /*Iterator<String> itr=al.iterator(); 
 while(itr.hasNext()){ 
 System.out.println(itr.next());}*//(or)
  //al.forEach(names->System.out.println(names));//(Or)
 //al.forEach(System.out::println);//(Or)
 al.stream().forEachOrdered(System.out::println);
 }}
