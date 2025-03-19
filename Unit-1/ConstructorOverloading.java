public class ConstructorOverloading { 
int number; 
// Default Constructor 
public ConstructorOverloading() { 
number = 0; 
} 
// Parameterized Constructor 
public ConstructorOverloading(int num) { 
number = num; 
} 
public static void main(String[] args) { 
ConstructorOverloading obj1 = new ConstructorOverloading(); 
ConstructorOverloading obj2 = new ConstructorOverloading(50); 
System.out.println("Default Constructor: " + obj1.number); 
System.out.println("Parameterized Constructor: " + obj2.number); 
} 
}