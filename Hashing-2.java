//SubArray sum equals k
// Time Complexity :O(n)
// Space Complexity :O(n)
// Did this code successfully run on Leetcode :yes
// Any problem you faced while coding this :no

class Solution {
    public int subarraySum(int[] nums, int k) {
        
        //initialising the Hashmap 
        HashMap<Integer,Integer> map = new HashMap<>();
        
        //putting the default value in the hashmap
        map.put(0,1);
        int rSum = 0;
        int count = 0;
        //iterate through the length of the array
        for(int i = 0; i < nums.length; i++){
            //add the value of each index to the resultSum
            rSum = rSum  + nums[i];

            //check if the ma contains the the complement of rSum and given value k
            if(map.containsKey(rSum - k)){
                count += map.get(rSum - k); // if found, add the value to count
            }

            map.put(rSum,map.getOrDefault(rSum,0) +1);
        }
        
        //return the count
        return count;
    }
    
}

//--------------------------------------------------------------//
//Contiguous Array
// Time Complexity :O(n)
// Space Complexity :O(n)
// Did this code successfully run on Leetcode :yes
// Any problem you faced while coding this :no
class Solution {
    public int findMaxLength(int[] nums) {
        
        HashMap<Integer, Integer> map = new HashMap<>();
        
        int max = 0;
        int rSum = 0;
        map.put(0,-1);
        
        for (int i = 0; i < nums.length; i++){
            
            if(nums[i] == 0){
                rSum = rSum -1;
                
            }else{
                rSum = rSum +1;
            }
            if(map.containsKey(rSum)){
                max = Math.max(max,i - map.get(rSum));
            }else{
                map.put(rSum,i);
            }
        }
        return max;
        
    }
}
//--------------------------------------------------------------//
//Longest Palindrome
// Time Complexity :O(n)
// Space Complexity :O(n)
// Did this code successfully run on Leetcode :yes
// Any problem you faced while coding this :no

class Solution {
    public int longestPalindrome(String s) {
        
        HashSet<Character> set = new HashSet<>();
        
        int result  = 0;
        
        for(int i =0; i<s.length();i++){
            
            char c = s.charAt(i);
            if(set.contains(c)){
                result +=2;
                set.remove(c);
            }else{
                set.add(c);
            }
        }
        if(!set.isEmpty()){
            result++;
        }    
        return result;
    }
    
}