package Polymorphism;

public class Bank {

    public void BankAccount (){

        System.out.println("Bank creates an account");


        }
    }
     class SBI extends Bank {
    public void BankAccount (){
        System.out.println("SBI creates an account");
    }

     }
     class ICICI extends Bank {

    public void BankAccount(){
        System.out.println("ICICI creates an account");
    }
}

    class main{

        public static void main (String []args){
          Bank myBank = new Bank();
          Bank mySBI = new SBI();
          Bank myICICI = new ICICI();
          myBank.BankAccount();
          mySBI.BankAccount();
          myICICI.BankAccount();


        }
    }


