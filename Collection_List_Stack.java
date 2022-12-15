/*stack:- it is a linear data   structure that is used to store the collection of objects. It is based on Last-In-
First-Out (LIFO). Java collection framework provides many interfaces and classes to store the collection 
of objects. One of them is the Stack class that provides different operations such as push, pop, search*/

import java.util.*;
import java.lang.*;
import java.io.*;

class StackDemo
{
	public static void main (String[] args) 
	{
		Stack<String> books=new Stack<String>();
		
		books.add("Red");
		books.add("Black");
		books.add("Wight");
		
		System.out.println("it's like same ArrayList");
		System.out.println(books);
		
		books.set(2,"yellow");
		System.out.println(books);
		
		books.remove(1);
		System.out.println(books);
		
		//books.clear();
		
System.out.println(books.get(1));
		System.out.println(books.contains("Red"));
		System.out.println(books);
		
		System.out.println("Special methods is Available in Stack that's --->push,pop,peek, search<---");

System.out.println("Push: it's used for elements adding or pushing.");
System.out.println(books.push("Green"));
System.out.println(books);

System.out.println("Pop: it's used for elements poping or removing.");

System.out.println(books.pop());
System.out.println(books);


System.out.println("Peek: it's used for show the last element.(but it's doesn't delate the element.");
System.out.println(books.peek());
System.out.println(books);

System.out.println("Search: it's used for searching the particular elements.");

System.out.println(books.search("Red"));
//System.out.println(books.IndexOf("Black"));
System.out.println(books);

 }
}
