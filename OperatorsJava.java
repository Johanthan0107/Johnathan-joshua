/*Operators:- it's used to perform operation on variable on variables and values.
in the below examples we use the operators*/
public class Operator{
public static void main (String args[]){
	
String Operators="They are Four Operators that's *Arithmatic Operator*Assignment Operator*Logical Operator*Comparison Operator*Bitwise Operator";

int sum1=100+50;
int sum2=sum1+250;
int sum3=sum2+sum2;

int sum4=100-50;
int sum5=sum4-250;
int sum6=sum5-sum5;
 
int sum7=10*2;
int sum8=sum7*2;
int sum9=sum8*sum8;

 int x =5;
	   x +=10;
 int y=10;
	   y -=5;	   
 int z=20;
     z *=5;
 int a=50;
     a /=2;
 int b=100;
     b %=20;
 int c=30;
     c &=3;
 int d=40;
     d |=2;
 int e =50;
     e ^=5;
 int f=7;
     f >>=80;
 int g=8;
     g <<=7;
     
     String Comparison="Comparison Operators is ==,!=,>,<,>=,<=:";
    int A=10;
    int B=5;
     
    String Logical="Logical Operators is &&,||,!:";
    int J=20;
    int K=10;
    
String Tk="Thank you";
    
System.out.println(Operators);
System.out.println("Arithmetic Operator +:" +sum3);
System.out.println("Arithmetic Operator -:" +sum6);
System.out.println("Arithmetic Operator *=:"+sum9);

System.out.println("Assignment Operator =:"+x);
System.out.println("Assignment Operator +=:"+x);
System.out.println("Assignment Operator -=:"+y);
System.out.println("Assignment Operator *=:"+z);
System.out.println("Assignment Operator /=:"+a);
System.out.println("Assignment Operator %=:"+b);
System.out.println("Assignment Operator &=:"+c);
System.out.println("Assignment Operator |=:"+d);
System.out.println("Assignment Operator ^=:"+e);
System.out.println("Assignment Operator >>=:"+f);
System.out.println("Assignment Operator <<=:"+g);

System.out.println(Comparison);
System.out.println(A == B);
System.out.println(A!=B);
System.out.println(A > B);
System.out.println(A < B);
System.out.println(A >= B);
System.out.println(A<=B);

System.out.println(Logical);
System.out.println(J<2 || K>4);
System.out.println(J>3 && K<2);
System.out.println(!(K>2 && K<5));

System.out.println(Tk);
 }
}

/*They are Four Operators that's *Arithmatic Operator*Assignment Operator*Logical Operator*Comparison Operator*Bitwise Operator
Arithmetic Operator +:800
Arithmetic Operator -:0
Arithmetic Operator *=:1600
Assignment Operator =:15
Assignment Operator +=:15
Assignment Operator -=:5
Assignment Operator *=:100
Assignment Operator /=:25
Assignment Operator %=:0
Assignment Operator &=:2
Assignment Operator |=:42
Assignment Operator ^=:55
Assignment Operator >>=:0
Assignment Operator <<=:1024
Comparison Operators is ==,!=,>,<,>=,<=:
false
true
true
false
true
false
Logical Operators is &&,||,!:
true
false
true
Thank you*/

