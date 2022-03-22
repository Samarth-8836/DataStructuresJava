package com.patelsamarth;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Main x = new Main();
        Integer[] a = {1};
        Integer[] b = {2};
        System.out.println(a[0]);
        Integer c = x.summing(a, b);
        System.out.println(c);
        System.out.println(a[0]);
    }

    public Integer summing(Integer[] a, Integer[] b) {
        a[0]=5;
        b[0]=10;
        return a[0]+b[0];
    }
}
