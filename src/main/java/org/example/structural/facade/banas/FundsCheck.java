package org.example.structural.facade.banas;

public class FundsCheck {
    private double cashInAccount = 1000.0;

    public double getCashInAccount() {
        return cashInAccount;
    }

    public void decreaseCashInAccount(double cashWithdrawn) {
        cashInAccount -= cashWithdrawn;
    }

    public void increaseCashInAccount(double cashDeposited) {
        cashInAccount += cashDeposited;
    }

    public boolean hasEnoughMoney(double cashToWithdraw) {
        if (cashToWithdraw > getCashInAccount()) {
            System.out.println("Error: You don't have enough money");
            System.out.println("Current balance: " + getCashInAccount());
            return false;
        } else {
            decreaseCashInAccount(cashToWithdraw);
            System.out.println("Withdrawal complete.");
            System.out.println("Current balance: " + getCashInAccount());
            return true;
        }
    }

    public void makeDeposit(double cashToDeposit) {
        increaseCashInAccount(cashToDeposit);
        System.out.println("Deposit complete");
        System.out.println("Current balance: " + getCashInAccount());
    }
}
