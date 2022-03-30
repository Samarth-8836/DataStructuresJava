package com.patelsamarth;

public class Euler_2_sum_of_even_fibonacci {
    public static void main(String[] args) {
        Euler_2_sum_of_even_fibonacci ins = new Euler_2_sum_of_even_fibonacci();
        System.out.println(ins.sumOfEvenFib());
    }

    public Integer sumOfEvenFib() {
        Integer sum = 0;
        int a = 1;
        int b = 2;
        while(b<=4000000) {
            if(b%2 == 0) {
                sum += b;
            }
            b = a + b;
            a = b - a;
        }
        return sum;
    }
}
