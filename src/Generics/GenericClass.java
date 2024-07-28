package Generics;

public class GenericClass <K,V>{
    K key;
    V value;

    @Override
    public String toString() {
        return "Generic{" +
                "key=" + key +
                ", value=" + value +
                '}';
    }

    public static void main(String[] args) {
        GenericClass<Integer,String> obj = new GenericClass<>();
        obj.key = 101;
        obj.value = "vikas";
        System.out.println(obj);
    }
}
