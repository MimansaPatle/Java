public class FinalizeExample {
    protected void finalize() {
        System.out.println("Finalize method called");
    }

    public static void main(String[] args) {
        FinalizeExample obj = new FinalizeExample();
        System.out.println("Object created: " + obj);
        obj = null; // Dereferencing the object
        System.out.println("Object dereferenced: " + obj);
        System.gc();
    }
}