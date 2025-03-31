package org.example.behavioral.interpreter.net_core_central;

public class UpperExpression implements Expression{
    @Override
    public void evaluate(Context context) {
        context.setValue(context.getValue().toUpperCase());
    }
}
