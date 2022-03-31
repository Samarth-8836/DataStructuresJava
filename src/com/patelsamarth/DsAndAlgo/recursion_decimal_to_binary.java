package com.patelsamarth.DsAndAlgo;

public class recursion_decimal_to_binary {
    public static void main(String[] args) {
        recursion_decimal_to_binary ref = new recursion_decimal_to_binary();
        Integer decimalNumber = 5;
        System.out.println(ref.decToBinary(decimalNumber));
    }

    public Integer decToBinary(Integer dec) {
        recursion_decimal_to_binary ref = new recursion_decimal_to_binary();
        return ref.decToBinaryFinal(dec, 0);
    }

    public Integer decToBinaryFinal(Integer dec, int power) {
        if(dec <= 1) {
            return (int)(1 * Math.pow(10, power));
        }
        return (int)(dec%2 * Math.pow(10, power)) + decToBinaryFinal(dec/2, power + 1);
    }
}
