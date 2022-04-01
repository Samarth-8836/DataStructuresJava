package com.patelsamarth.DsAndAlgo;

public class recursion_string_reverse {
    public static void main(String[] args) {
        recursion_string_reverse ref = new recursion_string_reverse();
        String question = "abcd";
        question = question.toUpperCase();
        System.out.println(ref.reverseString(question));
    }

    public String reverseString(String s) {
        if(s.isEmpty()) {
            return s;
        }
        return reverseString(s.substring(1)) + s.charAt(0);
    }
}
