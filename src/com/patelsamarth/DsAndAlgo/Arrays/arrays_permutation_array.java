package com.patelsamarth.DsAndAlgo.Arrays;

import java.util.HashMap;
import java.util.Map;

public class arrays_permutation_array {
    public static void main(String[] args) {
        arrays_permutation_array ref = new arrays_permutation_array();
        int arr1[] = {1,2,3,4,5,5,5};
        int arr2[] = {2,1,3,5,5,5,4};
        System.out.println(ref.permutationsArray(arr1, arr2));
    }

    public boolean permutationsArray(int[] arr1, int[] arr2) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        HashMap<Integer, Integer> hm2 = new HashMap<>();
        

        for(int i=0; i<arr1.length; i++) {
            if(hm.containsKey(arr1[i])) {
                hm.put(arr1[i], hm.get(arr1[i]) + 1);
            }
            else {
                hm.put(arr1[i], 1);
            }
        }

        for(int i=0; i<arr2.length; i++) {
            if(hm2.containsKey(arr2[i])) {
                hm2.put(arr2[i], hm2.get(arr2[i]) + 1);
            }
            else {
                hm2.put(arr2[i], 1);
            }
        }

        if(hm.size() != hm2.size()) return false;
        for(Map.Entry<Integer,Integer> m : hm.entrySet()) {
            if(m.getValue() != hm2.get(m.getKey())) {
                return false;
            }
        }

        return true;
    }
}
