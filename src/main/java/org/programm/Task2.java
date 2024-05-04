package org.programm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Task2 {

    public int[] findDivider(int[] nums){

        if(nums.length==0) return new int[]{};

        Arrays.sort(nums);
        int minValue = nums[0];
        ArrayList<Integer> dividers = new ArrayList<>();

        for (int i = 2; i <= minValue; i++){
            if(minValue%i==0){
                dividers.add(i);
            }
        }

        Set<Integer> uselessDividers = new HashSet<>();
        for(int i = 1; i < nums.length; i++){
            for (int divider : dividers) {
                if (!uselessDividers.contains(divider)) {
                    if (nums[i] % divider != 0) {
                        uselessDividers.add(divider);
                    }
                }
            }
        }
        dividers.removeAll(uselessDividers);
        return dividers.stream().mapToInt(i -> i).toArray();
    }
}
