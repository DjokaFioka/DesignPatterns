package org.example.behavioral.interpreter.net_core_central;

import java.util.ArrayList;

public class Interpreter {
    public void interpret(Context context) {
        var expressions = context.getExpression().split(" ");
        var expressionTypes = new ArrayList<Expression>();

        for (var e : expressions) {
            if (e.equals("-l")) {
                expressionTypes.add(new LowerExpression());
            } else if (e.equals("-u")) {
                expressionTypes.add(new UpperExpression());
            }
        }

        for (var t : expressionTypes) {
            t.evaluate(context);
        }

        System.out.println(context.getValue());
    }
}
