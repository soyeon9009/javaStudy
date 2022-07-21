package Mento.클래스;

public class Account {
    private int balance;
    static final int MIN_BALANCE =0;
    static final int MAX_BALANCE = 1000000;

    public int getBalance(){
        return balance;
    }

    public int setBalance(int balance){
        if(balance<MIN_BALANCE | balance>MAX_BALANCE){
            return balance;
        } else  {
            return this.balance = balance;
        }
    }
}
