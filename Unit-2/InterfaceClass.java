interface drawable{
    void draw();
}
     class circle implements drawable{
       public void draw(){
            System.out.println("circle");
        }
     }

     public class InterfaceClass{
        public static void main(String[] args){
            drawable obj= new circle();
            obj.draw();
        }
     }