//Vector:- it uses a dynamic array to store the data elements. It is similar to ArrayList. However, It is synchronized and contains many methods that are not the part of Collection framework.

import java.util.Vector;

public class VectorTest {
public static void main(String arg[]){
	
Vector<String> vt=new Vector<String>();

// adding using add method contains List
vt.add("Dog");
vt.add("Cat");
vt.add("lion");
vt.add("Fox");
vt.add("Tiger");

System.out.println(vt);

//will add another vector.
Vector<String> vt1=new Vector <String>();

vt1.add("Rat");
vt1.add("Elephant");
vt1.add("Ox");

System.out.println("Addition of all elements");
vt.addAll(vt1);
System.out.println(vt);

System.out.println("____Retrieve(get)the elements____");
System.out.println(vt.get(1));
System.out.println(vt.get(2));
System.out.println(vt.get(4));

System.out.println("___Remove (or) Delete the elements____");
vt.remove(0);
vt.remove(6);
//vt removeAll(vt);
System.out.println(vt);

System.out.println("___Clear enter list____");
//vt.clear();

System.out.println("____Verification of Elements in the list___");
System.out.println(vt.contains("Tiger"));
System.out.println(vt.contains("Cow"));

System.out.println("__Ubdation of elements__");
vt1.set(2,"Goat");

System.out.println("Element in vector:"+vt);
 }
}
