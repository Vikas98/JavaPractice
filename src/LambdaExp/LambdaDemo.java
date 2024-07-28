package LambdaExp;

public class LambdaDemo  {
    public static void main(String[] args) {
        Interface1 interface1 = new Interface1() {
            @Override
            public int sum(int a, int b) {
                return a+b;
            }
        };
        System.out.println(interface1.sum(1,5));

        Interface1 interface11 = (a,b)-> a+b;
        System.out.println(interface11.sum(5,2));
    }
}
