public class OuterClass { 
private String message = "Hello from Outer Class!"; 
class InnerClass { 
public void displayMessage() { 
System.out.println(message); 
} 
} 
public static void main(String[] args) { 
OuterClass outer = new OuterClass(); 
OuterClass.InnerClass inner = outer.new InnerClass(); 
inner.displayMessage(); 
} 
}