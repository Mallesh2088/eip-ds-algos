package com.eip.samples;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public final class App {
    private App() {
    }

 
    public static void main(String[] args) {
        String str = "leetcodel";
        int[] counter = new int[26];
        int i =0;
        while(i < str.length()) {
            System.out.println(str.charAt(i) - 'a');
            counter[str.charAt(i) - 'a']++;
            i++;
        }
        for (int j = 0; j < str.length(); j++) {
            if(counter[str.charAt(j) - 'a'] == 1){
                System.out.println(j);
                break;
            }
        }
    }

    public boolean containsDuplicate(int[] nums) {
        if(nums == null) return false;
        if(nums.length == 1) return false;
        Arrays.sort(nums);
        
        Map<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < nums.length; i++) {
            int val = nums[i];
            if(map.containsKey(val)) {
                return true;
            }
            map.put(val,val);
        }
        return true;  
    }

    
}
