package com.savio.dijkstrainterpreter;

import java.util.Stack;

public class DijkstraAlgorithm {

    Stack<String> operationSatck = new Stack<>();
    Stack<Double> valueStack = new Stack<>();
    boolean isNumber = false;

    public void interpretExpression(String expression) {
        String[] string = expression.split(" ");

        for (String s : string) {
            isNumber = isNumberCheck(s);
            if (s.equals("{")) {
                // do nothing
            } else if (s.equals("+")) {
                this.operationSatck.push(s);
            } else if (s.equals("*")) {
                this.operationSatck.push(s);
            } else if (s.equals(")")) {
                String operation = this.operationSatck.pop();
                if (operation.equals("+")) {
                    this.valueStack.push(this.valueStack.pop() + this.valueStack.pop());
                } else if (operation.equals("*")) {
                    this.valueStack.push(this.valueStack.pop() * this.valueStack.pop());
                }
            } else if (isNumber){
                this.valueStack.push(Double.parseDouble(s));
            }
        }
    }

    private boolean isNumberCheck(String s) {
        if(s.equals("+") || s.equals("*") || s.equals("(") || s.equals(")"))
            return false;
        return true;
    }

    public void result(){
        System.out.println(this.valueStack.pop());
    }
}
