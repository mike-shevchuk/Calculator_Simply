package com.TeTraedr.Calculator;


import java.sql.SQLOutput;

public class Help_Methods {





    public void print_array(float[] array) {
        System.out.print("[ ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(" " + array[i] + " ");
        }
        System.out.println("]");
    }


    public void print_array(int[] array) {
        System.out.print("[ ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(" " + array[i] + " ");
        }
        System.out.println("]");
    }

    public void print_array(char[] array) {
        System.out.print("[ ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(" " + array[i] + " ");
        }
        System.out.println("]");
    }


    public char[] giveSign(int[] array, String example) {
        char[] ex = example.toCharArray();
        char[] arrayC = new char[array.length];
        for (int i = 0; i < array.length; i++) {
            arrayC[i] = ex[array[i]];
        }
        return arrayC;
    }

    public String cutStr(String str, int f, int k) {
        char[] c_array = str.toCharArray();
        String result = "";
        for (int i = f + 1; i < k; i++) {
            result += c_array[i];
        }
        return result;
    }

    public String crtStr(String str, int f, int k, String put) {
        char[] carray = str.toCharArray();
        String result = "";
        for (int i = 0; i < str.length(); i++) {
            if (i == f) {
                result += put;
                i = k;
            } else result += carray[i];
        }
        return result;
    }


    public float[] delPos(float[] array, int pos) {
        float[] array2 = new float[array.length - 1];
        for (int j = 0, i = 0; i < array.length; i++) {
            if (i != pos) {
                array2[j] = array[i];
                j++;
            }
        }
        return array2;
    }

    public int[] delPos(int[] array, int pos) {
        int[] array2 = new int[array.length - 1];
        for (int j = 0, i = 0; i < array.length; i++) {
            if (i != pos) {
                array2[j] = array[i];
                j++;
            }
        }
        return array2;
    }

    public char[] delPos(char[] array, int pos) {
        char[] array2 = new char[array.length - 1];
        for (int j = 0, i = 0; i < array.length; i++) {
            if (i != pos) {
                array2[j] = array[i];
                j++;
            }
        }
        return array2;
    }


    public Object[] Brackets(String op) {
        char[] Cop = op.toCharArray();
        int count1, count2, length;
        length = count1 = count2 = 0;
        for (int i = 0; i < op.length(); i++)
            if (Cop[i] == '(' || Cop[i] == ')') {
                if (Cop[i] == '(') count1++;
                if (Cop[i] == ')') count2++;
            }
        if (count1 == count2) length = count1;
        else if (count1>count2){
            System.out.println("Faul");
            return new Object[0];
        }
        else if (count1<count2){
            System.out.println("Faul");
            return new Object[0];
        }
        int[] farray = new int[length];
        int[] sarray = new int[length];
        for (int i = 0, f = 0, s = 0; i < op.length(); i++) {
            if (Cop[i] == '(') farray[f++] = i;
            else if (Cop[i] == ')') sarray[s++] = i;
        }
   /*print_array(farray);
    print_array(sarray);*/
        return new Object[]{farray, sarray};
    }

    public boolean checkConditionSign(char sign) {
        if (sign == '+' || sign == '-' || sign == '*' || sign == '/') return true;
        else return false;
    }



    public String controlexample(String example) {
        float[] arraynumbers = new Calculator().getArrayN(example);
        char[] arraysigns = new Calculator().getArrayS(example);
/*        print_array(arraynumbers);
        print_array(arraysigns);*/


        char[] c = example.toCharArray();
          if (arraynumbers.length != (arraysigns.length+1)){
            return "Помилка в кільк.знаків";
        }

        if (c[0] == '(' && c[example.length() - 1] == ')') {
            example = example.substring(1, example.length() - 1);
            return example;
        }



        else if (Brackets(example).length == 0){
            return "Помилка в дужках";
        }






        return example;
    }

}



