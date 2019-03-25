package com.TeTraedr.Calculator;

import java.util.Scanner;

public class Calculator {
    private String example = "";

    public int[] getArrayPosSign(String example) {
        return crtArray_posSign(example);
    }

    public float[] getArrayN(String example) {
        return arrFromNumber(getArrayPosSign(example), example);
    }

    public char[] getArrayS(String example) {
        return new Help_Methods().giveSign(getArrayPosSign(example), example);
    }

    public float test5() {
        Scanner in = new Scanner(System.in);
        System.out.println("Введіть приклад");
        example = in.nextLine();
        return gear5(example);
    }

    private int[] crtArray_posSign(String str) {
        Help_Methods hlp = new Help_Methods();
        char[] chars = str.toCharArray();
        int[] array;

        int count = 0;
        for (int i = 1, p = i - 1; i < str.length(); i++, p++) {
            if ((hlp.checkConditionSign(chars[i])) && (!hlp.checkConditionSign(chars[p]))) {
                count++;
            }
        }
        array = new int[count];

        for (int i = 1, p = i - 1, c = 0; c < array.length; i++, p++) {
            if ((hlp.checkConditionSign(chars[i])) && (!hlp.checkConditionSign(chars[p]))) {
                array[c] = i;
                c++;
            }
        }
        return array;
    }

    private float[] arrFromNumber(int[] arraySign, String example) {
        char[] ex = example.toCharArray();
        float[] numbers = new float[arraySign.length + 1];
        String number;

        for (int i = 0; i <= arraySign.length; i++) {

            if (i == 0) {//for first number
                number = "";
                for (int j = 0; j < arraySign[i]; j++) {
                    if (ex[j] != ')' && ex[j] != '(')
                        number += ex[j];
                }
            } else if (arraySign.length >= 2) {//if is more than two number in example
                if (i == arraySign.length) {
                    number = "";
                    for (int j = (arraySign[i - 1] + 1); j < example.length(); j++) {
                        if (ex[j] != ')' && ex[j] != '(')
                            number += ex[j];
                    }
                } else {
                    number = "";
                    for (int j = (arraySign[i - 1] + 1); j < arraySign[i]; j++) {
                        if (ex[j] != ')' && ex[j] != '(')
                            number += ex[j];
                    }
                }
            } else {//if is only two number on example
                number = "";
                for (int j = arraySign[i - 1] + 1; j < example.length(); j++) {
                    if (ex[j] != ')' && ex[j] != '(')
                        number += ex[j];
                }
            }
            numbers[i] = Float.parseFloat(number);//   System.out.println("Число -->"+countNumber[i]);
        }
        return numbers;
    }


    private float gear4(String example) {
        Priority_Of_Processing piop = new Priority_Of_Processing(getArrayN(example), getArrayS(example));
        return piop.priority();
    }


    private float gear5(String example) {
        Help_Methods hlp = new Help_Methods();
        example = hlp.controlexample(example);
        Priority_Of_Processing piop = new Priority_Of_Processing(getArrayN(example), getArrayS(example));
        return piop.result(example);
    }


    private float result(float[] arrayNum, char[] arraySign) {
        float result = 0;
        for (int i = 0, n = 1; i < arrayNum.length - 1; i++, n++) {
            if (i == 0) result = new Operators().compute(arrayNum[i], arrayNum[n], arraySign[i]);
            else result = new Operators().compute(result, arrayNum[n], arraySign[i]);
        }
        return result;
    }


    public float gear_1(float[] arrayN, char[] arrayC) {
        if (arrayC.length == 0 && arrayN.length == 1)
            return arrayN[0];
        return result(arrayN, arrayC);
    }

    public float gear_2(String op) {
        return gear4(op);
    }


    public float start(String op) {
        return gear5(op);
    }

}