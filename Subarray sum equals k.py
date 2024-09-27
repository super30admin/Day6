#!/usr/bin/env python3
# -*- coding: utf-8 -*-
"""
Created on Mon Nov 30 12:23:07 2020

@author: gerrard
"""

class Solution {
    public int subarraySum(int[] nums, int k) {
        
        HashMap<Integer,Integer> prevSum = new HashMap();
        prevSum.put(0,1);
        int sum = 0;
        int result = 0;
        
        for (int i = 0; i<nums.length; i++){
            
            sum = sum + nums[i];
            // if (sum == k){
            //     result = result+1;
            // }
            if(prevSum.containsKey(sum-k)){
                result = result + prevSum.get(sum-k);
            }
            
            prevSum.put(sum,prevSum.getOrDefault(sum,0)+1);
        }
        
        return result;
            
        
    }
}