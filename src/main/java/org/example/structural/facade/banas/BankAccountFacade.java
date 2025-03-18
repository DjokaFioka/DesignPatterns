package org.example.structural.facade.banas;

public class BankAccountFacade {
    private int accountNumber;
    private int securityCode;

    AccountNumberCheck acctChecker;
    SecurityCodeCheck codeChecker;
    FundsCheck fundsChecker;

    WelcomeToBank bankWelcome;

    public BankAccountFacade(int accountNumber, int securityCode) {
        this.accountNumber = accountNumber;
        this.securityCode = securityCode;

        bankWelcome = new WelcomeToBank();
        acctChecker = new AccountNumberCheck();
        codeChecker = new SecurityCodeCheck();
        fundsChecker = new FundsCheck();
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public int getSecurityCode() {
        return securityCode;
    }

    public void withdrawCash(double cashToGet) {
        if (acctChecker.accountActive(getAccountNumber())
                && codeChecker.isPINCorrect(getSecurityCode())
                && fundsChecker.hasEnoughMoney(cashToGet)
        ) {

            System.out.println("Transaction complete\n");
        } else {
            System.out.println("Transaction failed\n");
        }
    }

    public void depositCash(double cashToDeposit) {
        if (acctChecker.accountActive(getAccountNumber())
                && codeChecker.isPINCorrect(getSecurityCode())
        ) {
            fundsChecker.makeDeposit(cashToDeposit);
            System.out.println("Transaction complete\n");
        } else {
            System.out.println("Transaction failed\n");
        }
    }
}
