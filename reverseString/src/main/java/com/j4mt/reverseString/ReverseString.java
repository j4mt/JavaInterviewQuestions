package com.j4mt.reverseString;

public class ReverseString {

    public static void main(String[] args) {

        String str = "syad yppah";
        System.out.println("String to reverse using string builder : " + str);
        System.out.println("Reversed String using String builder :" + reverseStringSB(str));
        System.out.println("Reversed String using String builder :" + reverseString(str));
    }

    public static String reverseStringSB(String str){
        StringBuilder stringBuilder = new StringBuilder(str);
        return stringBuilder.reverse().toString();
    }

    public static String reverseString(String str){
        char[] strReverse = new char[str.length()];
        for (int i = 0 ; i < str.length() ; i++) {
            strReverse[i] = str.charAt(str.length() - i - 1);
        }
        return String.valueOf(strReverse);
    }
}
