package org.example.structural.facade.banas;

public class SecurityCodeCheck {
    private int securityCode = 1234;

    public int getSecurityCode() {
        return securityCode;
    }

    public boolean isPINCorrect(int pinToCheck) {
        return pinToCheck == securityCode;
    }
}
