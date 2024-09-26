//subArraysum equals k
// Time Complexity :O(n)
// Space Complexity :O(n)
// Did this code successfully run on Leetcode :yes
// Any problem you faced while coding this :no


// Your code here along with comments explaining your approach

class Solution {
    public int subarraySum(int[] nums, int k) {
   
        
      
        HashMap<Integer,Integer> hash=new HashMap<>();
        int sum=0;
        int count=0;
        hash.put(0,1);
        for(int i=0;i<nums.length;i++){
            sum=sum+nums[i];
            
            if(hash.containsKey(sum-k)){
                int temp=hash.get(sum-k);
                count=count+temp;
                
            }
            hash.put(sum,hash.getOrDefault(sum,0)+1);
            
        }
      
        return count;
        
    }
}

//Contiguous array
// Time Complexity :O(n)
// Space Complexity :O(n)
// Did this code successfully run on Leetcode :yes
// Any problem you faced while coding this :no


// Your code here along with comments explaining your approach

class Solution {
    public int findMaxLength(int[] nums) {
        HashMap<Integer,Integer> hash=new HashMap<>();
        int max=0;
        hash.put(0,-1);
        int count=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0){
                count=count-1;
                if(hash.containsKey(count)){
                    max=Math.max(max,i-hash.get(count));
                }else{
                    hash.put(count,i);
                }
            }
            if(nums[i]==1){
                count=count+1;
                if(hash.containsKey(count)){
                    max=Math.max(max,i-hash.get(count));
                }else{
                    hash.put(count,i);
                }
            }
        }
        return max;
        
    }
}

//Longest palnidrome
// Time Complexity :O(n)
// Space Complexity :O(n)
// Did this code successfully run on Leetcode :yes
// Any problem you faced while coding this :no


// Your code here along with comments explaining your approach

class Solution {
    public int longestPalindrome(String s) {
        HashMap<Character,Integer> hash=new HashMap<>();
        for(int i=0;i<s.length();i++){
            hash.put(s.charAt(i),hash.getOrDefault(s.charAt(i),0)+1);
        }
        int flag=0;
        int result=0;
        for (Map.Entry mapElement : hash.entrySet()) {
           
  
            
            int value = (int)mapElement.getValue();
            if(value%2==0){
                result=result+value;
            }
            else if(flag==0){
                result=result+value;
                flag=1;
                
            }else{
                result=result+(value-1);
            }
  
            
        }
        
        
        return result;
    }
}
