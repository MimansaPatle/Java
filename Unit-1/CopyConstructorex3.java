public class CopyConstructorex3 { 
int number; 
// Default Constructor 
public CopyConstructorex3() { 
number = 0; 
} 
// Parameterized Constructor 
public CopyConstructorex3(int num) { 
number = num; 
} 
public static void main(String[] args) { 
CopyConstructorex3 obj1 = new CopyConstructorex3(); 
CopyConstructorex3 obj2 = new CopyConstructorex3(50); 
System.out.println("Default Constructor: " + obj1.number); 


System.out.println("Parameterized Constructor: " + obj2.number); 
} 
}