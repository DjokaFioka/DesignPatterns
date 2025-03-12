package org.example.creational.factory.guru;

/**
 * Windows Dialog will produce Windows buttons.
 */
public class WindowsDialog extends Dialog {
    @Override
    public Button createButton() {
        return new WindowsButton();
    }
}
