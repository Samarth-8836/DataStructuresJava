package com.patelsamarth.DsAndAlgo.Arrays;

import java.util.HashMap;

public class arrays_two_sum {
    public static void main(String[] args) {
        arrays_two_sum ref = new arrays_two_sum();
        int arr[] = {2,5,9,6};
        int target = 16;
        System.out.println(ref.twoSum(arr, target)[1]);
    }

    public int[] twoSum(int arr[], int target) {
        HashMap<Integer, Integer> hm= new HashMap<>();
        for(int i=0; i<arr.length; i++) {
            if(hm.containsKey(target - arr[i])) {
                int returnArr[] = {arr[i], target - arr[i]};
                return returnArr;
            } else {
                hm.put(arr[i], i);
            }
        }
        throw new IllegalArgumentException("No Solution");
    }
}
