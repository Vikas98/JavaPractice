package Interface;

public class InterfaceImp implements Interface1,Interface2{
    @Override
    public void print() {
        //Interface1.super.print();
        System.out.println("InterfaceImp class print method overridden method");
    }

    public static void main(String[] args) {
        InterfaceImp interfaceImp = new InterfaceImp();
        interfaceImp.print();


    }
}
