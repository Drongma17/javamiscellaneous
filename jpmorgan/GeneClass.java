package jpmorgan;

public class GeneClass<T> {
    private T obj;

    public GeneClass(T obj) {
        this.obj = obj;
    }

    public String showGen() {
        System.out.println("The generic type is: " + obj.getClass().getSimpleName());
        return "Generic type: " + obj.getClass().getSimpleName();
    }

    public static void main(String[] args) {
        GeneClass<String> stringObject = new GeneClass<>("Hello, Generics!");
        stringObject.showGen();

        GeneClass<Integer> intObject = new GeneClass<>(42);
        intObject.showGen();
    }
}