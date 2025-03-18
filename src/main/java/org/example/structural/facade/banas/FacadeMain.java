package org.example.structural.facade.banas;

public class FacadeMain {
    public static void main(String[] args) {
        BankAccountFacade accessingBank = new BankAccountFacade(12345678, 1234);

        accessingBank.withdrawCash(50);
        accessingBank.withdrawCash(900);
        accessingBank.depositCash(1200);
    }
}
