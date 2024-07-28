package Generics;

public class GenericMethod<K>{
    <K extends  Number> double add(K a,K b)
    {
         return a.doubleValue()+b.doubleValue();
    }
    public static void main(String[] args) {
        GenericMethod<String> obj = new GenericMethod<>();
        System.out.println( obj.add(1,2.5));
        System.out.println( obj.add(2.5,2.5f));
        System.out.println( obj.add(1f,2.5));
        System.out.println( obj.add(2.5,1.5f));
    }
}
