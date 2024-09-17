import java.util.*;
//Problem 1
// Time Complexity :
// Space Complexity :


class Solution1 {
    public int subarraySum(int[] nums, int k) {
        HashMap <Integer, Integer> map = new HashMap<>();
        
        int count = 0;
        int currentSum = 0;
        
        map.put(0, 1);
        for(int i : nums){
            currentSum += i;
            int difference = currentSum - k;
            if(map.containsKey(difference)){
                count += map.get(difference);
            }
            if(map.containsKey(currentSum)){
                map.put(currentSum, map.get(currentSum)+1);
            }
            else{
                map.put(currentSum, 1);
            }
        }
        return count;
    }
}

//Problem 2
// Time Complexity :
// Space Complexity :

class Solution {
    public int findMaxLength(int[] nums) {
        HashMap <Integer, Integer> map = new HashMap<>();
        
        int max = 0;
        int currentSum = 0;
        
        map.put(0, -1);
        for(int i = 0; i< nums.length; i++){
            if(nums[i] == 0){
                currentSum += 1;
            }
            else{
                currentSum += -1;
            }
            if(map.containsKey(currentSum)){
                int end = i;
                int start = map.get(currentSum);
                max = Math.max(max, end - start);
            }
            else{
                map.put(currentSum, i);
            }
        }
        return max;
    }
}


//Problem 3
// Time Complexity :
// Space Complexity :

class Solution3
 {
    public int longestPalindrome(String s) {
        HashSet <Character> set = new HashSet<>();
        int size = 0;
        for(int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);
            if(set.contains(ch)){
                size += 2;
                set.remove(ch);
            }
            else
                set.add(ch);
        }
        if(!set.isEmpty()){
            size += 1;
        }
        return size;
    }
}
