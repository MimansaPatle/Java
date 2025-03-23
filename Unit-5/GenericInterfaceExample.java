interface Data<T> {
    void setData(T data);

    T getData();
}

// Implementing a generic interface
class DataImpl<T> implements Data<T> {
    private T data;

    public void setData(T data) {
        this.data = data;
    }

    public T getData() {     
        return data;
    }
}

public class GenericInterfaceExample {
    public static void main(String[] args) {
        Data<String> stringData = new DataImpl<>();
        stringData.setData("Hello Generics");
        System.out.println("Data: " + stringData.getData());
    }
}