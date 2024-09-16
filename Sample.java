//Contiguous Array
// Time Complexity :O(n)
// Space Complexity :O(n)
// Did this code successfully run on Leetcode :yes
// Any problem you faced while coding this :no


// Your code here along with comments explaining your approach
class Solution {
    public int findMaxLength(int[] nums) {
        
        int sum=0;
        int max=0;
        HashMap<Integer, Integer> hp= new HashMap<>();
        for(int i=0; i< nums.length;i++)
        {
            if(nums[i]==0)
            {  
            sum=sum+1;
            }
            else
                sum=sum-1;
            if(sum==0)
            {
                max= i+1;
            }
            if(!hp.containsKey(sum))
            {
                hp.put(sum,i);
                
            }
            else
            {
                max=Math.max(max,i -hp.get(sum));
            }
                
        }
        return max;
    }
}

//Subarray sum equals k
// Time Complexity :O(n)
// Space Complexity :O(n)
// Did this code successfully run on Leetcode :yes
// Any problem you faced while coding this :no


// Your code here along with comments explaining your approach
class Solution {
    public int subarraySum(int[] nums, int k) {
      
      int count=0;
      int sum=0;
      HashMap<Integer, Integer> hp= new HashMap<>();
        hp.put(0,1);
      for(int i=0;i< nums.length;i++)
      {
          sum=sum + nums[i];
          int comp=sum-k;
          if(hp.containsKey(comp))
          {
              count=count+hp.get(comp);
             
            
          }
          if(!hp.containsKey(sum))
          {
              hp.put(sum,1);
              
          }
          else
              hp.put(sum,hp.get(sum)+1);
              
          
      }
        return count;
    }
}

//Longest Palindrome
// Time Complexity :O(n)
// Space Complexity :O(n) we can get this as O(1) , if we explicitly give the required space as 52 , as the question tells us only 
 // alphabets(both lowecase and upparcase) are allowed here. As we didn't do that its O(n). 
// Did this code successfully run on Leetcode :yes
// Any problem you faced while coding this :no


// Your code here along with comments explaining your approach
class Solution {
    public int longestPalindrome(String s) {
       int count=0; 
        HashSet<Character> hs= new HashSet<>();
        for(int i=0; i<s.length();i++)
            
        {
            char ch= s.charAt(i);
            if(hs.contains(ch))
            {
                count= count+2;
                hs.remove(ch);
            }
            else
            {
                hs.add(ch);
            }
           
        }
         return hs.isEmpty() ? count : count+1;
    }
}
