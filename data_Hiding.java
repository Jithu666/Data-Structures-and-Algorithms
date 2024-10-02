package oop;

public class data_Hiding {

    private double balance = 1000;

    public void deposit(long amount){
        this.balance = balance + amount;
        System.out.println("You have deposited " + amount + " rs into your bank account!");
        System.out.println("Total balance is " + balance);
    } //  end of deposit ()

    public void withdraw(int amount){
        this.balance = balance - amount;

        if(amount > balance) {
            System.out.println("Insufficient Funds in your bank account");
        } else{
            System.out.println(amount + " rs withdrawn from your bank ac.");
            System.out.println("Your remaining account balance is " + balance);
        } // end of else condition
    } // end of withdraw ()


    public void showBalance(){
        System.out.println("Your Total account balance is " + balance);
        System.out.println();
    }

} // end of class data_Hiding
