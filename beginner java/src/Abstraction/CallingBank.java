
package Abstraction;


public class CallingBank {
    public static void main(String[] args) {
        BankA objBankA = new BankA();
         BankB objBankB = new BankB();
          BankC objBankC = new BankC();
          objBankA.getBalance();
           objBankB.getBalance();
            objBankC.getBalance();
    }
    
}
