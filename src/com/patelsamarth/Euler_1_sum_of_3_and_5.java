package com.patelsamarth;

public class Euler_1_sum_of_3_and_5 {
    public static void main(String[] args) {
        Euler_1_sum_of_3_and_5 ins = new Euler_1_sum_of_3_and_5();
        System.out.println(ins.sumOf3And5());
    }

    public Integer sumOf3And5() {
        Integer sum = 0;
        for(int i = 3; i<1000; i++) {
            if(i%3 == 0 || i%5 == 0) {
                sum += i;
            }
        }
        return sum;
    }
}
