package com.TeTraedr.Calculator;

public class Priority_Of_Processing {
    private float[] arrayNum;
    private char[] arraySign;


    Priority_Of_Processing(float[] aN, char[] aS) {
        arrayNum = aN;
        arraySign = aS;
    }

    public float priority() {
        Help_Methods hlp = new Help_Methods();
        float[] aN = arrayNum;
        char[] aS = arraySign;

        for (int i = 0, n = 1; i < aS.length; i++, n++)
            if (aS[i] == '*' || aS[i] == '/') {
                aN[n] = new Operators().compute(aN[i], aN[n], aS[i]);
                aN = hlp.delPos(aN, i);
                aS = hlp.delPos(aS, i);
            }

        return new Calculator().gear_1(aN, aS);
    }

    public float result(String op) {
        Calculator calc = new Calculator();
        Help_Methods hlp = new Help_Methods();
        String r = brakeBrackets(op, (int[]) hlp.Brackets(op)[0], (int[]) hlp.Brackets(op)[1]);
        return calc.gear_2(r);
    }

    private String brakeBrackets(String op, int[] openBrackets, int[] closeBrackets) {
        Help_Methods hlp = new Help_Methods();
        Calculator calc = new Calculator();
        int[] farray = openBrackets;
        int[] sarray = closeBrackets;
        float numb = 0;
        String test = op;

        for (int j = farray.length - 1, i = 0; j >= 0; j--) {
            if (sarray[i] > farray[j]) {
                numb = calc.gear_2(hlp.cutStr(op, farray[j], sarray[i]));//calc 3+6+1 and five float 10
                test = hlp.crtStr(op, farray[j], sarray[i], Float.toString(numb));
                farray = (int[]) hlp.Brackets(test)[0];
                sarray = (int[]) hlp.Brackets(test)[1];
                return brakeBrackets(test, farray, sarray);
            }
        }
        return test;
    }


}
