package org.example.behavioral.interpreter.net_core_central;

public class Context {
    private String expression;
    private String value;

    public Context(String expression, String value) {
        this.expression = expression;
        this.value = value;
    }

    public String getExpression() {
        return expression;
    }

    public void setExpression(String expression) {
        this.expression = expression;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
