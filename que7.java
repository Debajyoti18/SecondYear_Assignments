public class que7 {
    public static void main(String[] args) {
        SavingAccount sv=new SavingAccount(87726,79870.89, 4);
        sv.Deposit();
        sv.Withdral();
        CurrentAccount ca=new CurrentAccount(233345, 5, 234005);
        ca.Deposit();
        ca.Withdral();
    }
}
 abstract class Account {
private int accNo;
private double balance;
Account(int x,double y){
    this.accNo=x;
    this.balance=y;
}
int getAccNo(){
  return this.accNo;
}
double getBalance(){
    return this.balance;
}
abstract void Deposit();
abstract void Withdral();
}
class SavingAccount extends Account{
    int intrestRate;
    SavingAccount(int x,double y,int z){
        super(x,y);
        this.intrestRate=z;
    }
    int getintrest(){
        return this.intrestRate;
    }
    @Override
    void Deposit() {
       System.out.println("Account number is"+getAccNo()+"\n"+"Intrestrate: "+intrestRate+"\n"+"Total :"+calc());
    } double calc(){
       return (this.intrestRate*getBalance())/100;
    }

    @Override
    void Withdral() {
        System.out.println("Total Available balance :"+(getBalance()+calc()));
    }
}
class CurrentAccount extends Account{
    int draftlimit;
    CurrentAccount(int x, double y,int z) {
        super(x, y);
       this.draftlimit=z;
        
        
    }

    @Override
    void Deposit() {
        System.out.println("Account number is"+getAccNo());
    }

    @Override
    void Withdral() {
       System.out.println("Balance is:"+getBalance()+"Draftlimit is :"+draftlimit);
    }
    
}