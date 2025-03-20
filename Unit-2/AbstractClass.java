abstract class Animal{
    abstract void sound();
    void sleep(){
        System.out.println("animal is sleeping");
    }
}
 class dog extends Animal{
    void sound(){
        System.out.println("vuffffffffffff");
    }
}
public class AbstractClass{
public static void main(String[] args){
Animal obj= new dog();
obj.sound();
obj.sleep();
}
}