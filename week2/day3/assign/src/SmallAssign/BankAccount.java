package SmallAssign;

public class BankAccount {
    String accountHolder;
    int accountNumber;
    double balance;
    BankAccount(String accountHolder,int accountNumber,double balance){
        this.accountHolder=accountHolder;
        this.accountNumber=accountNumber;
        this.balance=balance;
    }
    void getter(){
        System.out.println(" Acount details: \n Account No: "+accountNumber+"\n Holder: "+accountHolder+" \n Balance: "+balance);
    }
}
