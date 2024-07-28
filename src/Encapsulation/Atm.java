package Encapsulation;

public class Atm implements AtmInter {
   // private Integer accountNo;
    private Integer atmPin;
    private Integer amount;

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    public Integer getAtmPin() {
        return atmPin;
    }

    public void setAtmPin(Integer atmPin) {
        this.atmPin = atmPin;
    }

    @Override
    public void deposit(Integer amount) {
        this.amount += amount;
        System.out.println("Successfully deposited amount = "+amount);
        System.out.println("Current balance = " +this.amount);
    }

    @Override
    public void debit(Integer amount) {
        System.out.println("Successfully withdrawal amount = "+amount);
        System.out.println("current balance = "+(this.amount-amount));
    }

    @Override
    public void checkBalance() {
        System.out.println("current balance = "+this.amount);
    }

//    public Integer getAccountNo() {
//        return accountNo;
//    }
//
//    public void setAccountNo(Integer accountNo) {
//        this.accountNo = accountNo;
//    }

//    public void deposit(Integer amount)
//    {
//        this.amount += amount;
//        System.out.println("Successfully deposited amount = "+amount);
//        System.out.println("Current balance = " +this.amount);
//    }
//    public void withDrawl(Integer amount)
//    {
//        System.out.println("Successfully withdrawal amount = "+amount);
//        System.out.println("current balance = "+(this.amount-amount));
//    }
}
class main
{
    public static void main(String[] args) {
        Atm atm = new Atm();
        atm.setAmount(1000);
        atm.setAtmPin(101);
//        atm.deposit(1000);
//        atm.debit(200);
       // atm.setAccountNo(1001);
//        atm.withDrawl(100);
//        atm.deposit(1500);
        atm.checkBalance();
    }
}
