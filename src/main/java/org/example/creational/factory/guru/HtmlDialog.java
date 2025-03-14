package org.example.creational.factory.guru;

/**
 * HTML Dialog will produce HTML buttons.
 */
public class HtmlDialog extends Dialog{
    @Override
    public Button createButton() {
        return new HtmlButton();
    }
}
