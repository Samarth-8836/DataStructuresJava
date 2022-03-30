package com.patelsamarth;

import java.math.BigInteger;
import java.util.ArrayList;

public class Euler_3_largest_prime_factor {
    public static void main(String []args){
        Euler_3_largest_prime_factor ins = new Euler_3_largest_prime_factor();
        BigInteger inp = new BigInteger("600851475143");
        System.out.println(ins.largestPrime(inp));
    }

    public BigInteger largestPrime(BigInteger inp) {
        ArrayList<BigInteger> primes = new ArrayList<BigInteger>();
        
        BigInteger one = new BigInteger("1");
        BigInteger zero = new BigInteger("0");
        BigInteger two = new BigInteger("2");
        BigInteger i = new BigInteger("2");
        while((i).compareTo(inp) <= 0) {
            if(inp.mod(i).compareTo(zero) == 0) {
                inp = inp.divide(i);
                System.out.println(i);
                primes.add(i);
                i = two;
            }
            i = i.add(one);
        }

        return primes.get(primes.size() - 1);
    }
}
