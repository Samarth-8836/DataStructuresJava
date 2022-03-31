package com.patelsamarth.DsAndAlgo.Arrays;

import java.util.HashMap;

public class arrays_contains_duplicate {
    public static void main(String[] args) {
        arrays_contains_duplicate ref = new arrays_contains_duplicate();
        int arr[] = {1,2,3,4,5};
        System.out.println(ref.containsDuplicate(arr));
    }

    public boolean containsDuplicate(int[] arr) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        for(int i=0; i<arr.length; i++) {
            if(hm.containsKey(arr[i])) {
                return true;
            }
            else {
                hm.put(arr[i], i);
            }
        }
        return false;
    }
}
