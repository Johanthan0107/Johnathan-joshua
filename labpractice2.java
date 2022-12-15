/*
1Develop a java class with a instance variable Country HashSet (H1) add a method 
storeCountryNames(String CountryName) , the method should add the passed country to 
a HashSet (H1) and return the added HashSet(H1).
2. Develop a method retrieveCountry(String CountryName) which iterates through the 
HashSet and returns the country if exist else return null.
NOTE: You can test the methods using a main method.*/

import java.util.*;
//import java.util.HashMap; 
public class Country {
public static void main(String args[]) {
	
HashSet<String> ht=new HashSet<String>();
Country contries=new Country ();

ht.add("India");
ht.add("Italy");
ht.add("Canada");
ht.add("Malta");
ht.add("USA");

System.out.println(ht);

System.out.println("USA: "+countries.getCountry("USA"));
}
private String getCountry(String String){
	return null; 
 }
}
