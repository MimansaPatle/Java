public class FinalExample { 
final int MAX_VALUE = 10; 
public final void display(int num) { 
System.out.println("MAX_VALUE: " + MAX_VALUE); 
} 
public static void main(String[] args) { 
FinalExample obj = new FinalExample();
obj.display(77); 
} 
}