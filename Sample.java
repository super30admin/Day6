// Time Complexity :
// Space Complexity :
// Did this code successfully run on Leetcode :
// Any problem you faced while coding this :


// Your code here along with comments explaining your approach



// 1 Subarray Sum equals K -- done on leetcode originally
// Time Complexity : O(n)
// Space Complexity : O(n) // extra hashmap
class Solution {
    public int subarraySum(int[] nums, int k) {
       
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0,1);
        int count = 0;
        int sum = 0;
        for(int i: nums){
            sum+=i;
            int c = sum - k;
            if(map.containsKey(c))
             count+=map.get(c);
            map.put(sum,map.getOrDefault(sum,0)+1);
        }  
        return count;
    }
}


// 2 Contiguous array 
// Time Complexity : O(n)
// Space Complexity :O(n)
class Solution {
    public int findMaxLength(int[] nums){
        Map<Integer, Integer> map = new HashMap<>();
        map.put(0, -1);
        int maxlen = 0, sum = 0;
        
        for(int i=0 ; i< nums.length ; i++){
            sum +=  (nums[i] == 1) ? 1 : -1;
            
            if(!map.containsKey(sum))
                map.put(sum,i);
            
            else
                maxlen = Math.max(maxlen, i - map.get(sum));
        }
              return maxlen;
    }
}

// 3  Longest Palindrome

//Time Complexity : O(n)
// Space Complexity : O(n)

class Solution {
    public int longestPalindrome(String s) {
        
        HashMap<Character, Integer> map = new HashMap<>();
        boolean odd = false;
        for(char ch : s.toCharArray()){
            map.put(ch, map.getOrDefault(ch,0)+1);
        }
        int count = 0;
        for(Map.Entry<Character, Integer> entry : map.entrySet()){
            if(entry.getValue()%2 == 0){
                count += entry.getValue();
            }
            else{
                odd = true;
                count+= entry.getValue()-1;
            } 
        }
        return odd == true ? count + 1 : count;
    }
}
