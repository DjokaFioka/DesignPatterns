package org.example.abstract_factory.guru;

/**
 The client code works with factories and products only
 through abstract types: GUIFactory, Button and Checkbox. This
 lets you pass any factory or product subclass to the client
 code without breaking it.
*/
public class Application {

    private GuiFactory factory;
    private Button button;
    private CheckBox checkBox;

    public Application(GuiFactory factory) {
        this.factory = factory;
        button = factory.createButton();
        checkBox = factory.createCheckBox();
    }

    public void createUI() {
        button.paint();
        checkBox.paint();
    }

}
