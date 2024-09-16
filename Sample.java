// Time Complexity :O(n)
// Space Complexity :O(n)
// Did this code successfully run on Leetcode :yes
// Any problem you faced while coding this :No


// Your code here along with comments explaining your approach
class Solution {
    public int longestPalindrome(String s) {
        HashSet<Character> set = new HashSet<>();
        int count = 0;
        for(int i = 0;i< s.length();i++){
            char c = s.charAt(i);
            if(set.contains(c)){
                count +=2;
                set.remove(c);
            }else{
                set.add(c);
            }
        }if(!set.isEmpty()) count++;
            return count;
        
    }
   
}


// Time Complexity :O(n)
// Space Complexity :O(n)
// Did this code successfully run on Leetcode :yes
// Any problem you faced while coding this :No


// Your code here along with comments explaining your approach
class Solution {
    public int subarraySum(int[] nums, int k) {
        //one for rsum and other one fro maintain the count of rsum's
       HashMap<Integer,Integer> map = new HashMap<>();
       int count = 0;
        int rsum = 0;
        map.put(0,1);
        for(int i= 0;i<nums.length;i++){
            rsum +=nums[i];
            if(map.containsKey(rsum-k)){
                count +=map.get(rsum-k);
                }
            int countrsum = 0;
           if(map.containsKey(rsum)){
           countrsum = map.get(rsum);
             }
             countrsum +=1;
           map.put(rsum,countrsum);
        }
        return count;
    }
    
}
// Time Complexity :O(n)
// Space Complexity :O(n)
// Did this code successfully run on Leetcode :yes
// Any problem you faced while coding this :No


// Your code here along with comments explaining your approach


class Solution {
    public int findMaxLength(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int rsum = 0;
        int max = 0;
        map.put(0,-1);
        for(int i =0;i<nums.length;i++){
             if(nums[i] == 1){
                rsum +=1;
            }else{
                 rsum -=1;
             }
                
            if(map.containsKey(rsum)){
                max=Math.max(max,i- map.get(rsum));
            }else{
                 map.put(rsum,i);
            }
        }
               
           
        return max;
    }
}
        