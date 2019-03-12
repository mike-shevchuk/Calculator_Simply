package com.TeTraedr.Calculator;

public class Operators {


    public float compute(float number1, float number2, char sign) {
        if (new Help_Methods().checkConditionSign(sign)) {
            if (sign == '+') return number1 + number2;
            if (sign == '-') return number1 - number2;
            if (sign == '*') return number1 * number2;
            if (sign == '/') return number1 / number2;
        } else {
            throw new UnsupportedOperationException();
        }
        return -1;
    }
}





