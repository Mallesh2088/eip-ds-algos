package com.eip.algos;

import java.util.HashMap;
import java.util.Map;

public class ArrayContainsDuplicate {
    public boolean containsDuplicate(int[] nums) {
        if(nums == null) return false;
        if(nums.length == 1) return false;
        
        Map<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < nums.length; i++) {
            int val = nums[i];
            if(map.containsKey(val)) {
                return true;
            }
            map.put(val,val);
        }
        return false;  
    }
}