// Time Complexity : O(n) //please verify it
// Space Complexity : O(1) //please verify it
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : no 


// Your code here along with comments explaining your approach
## Problem1 Solution 
class Solution {
    public int longestPalindrome(String s) {
        
        HashSet<Character> myHash = new HashSet<>(); // initiate a hash set to store the characters 
        
        char[] myChar= s.toCharArray(); // convert the string to the character array
        int count=0; //initial count is 0 
        
        for(char c: myChar)
        {
            if(myHash.contains(c)) //if the hash set contains the character
            {
                count=count+2; //remove it from the hash set and increase the count by 2 
                myHash.remove(c); 
            }
            else
            {
                myHash.add(c); //else add it to the hash set since it is a odd character
            }
        }
        if(!myHash.isEmpty()) // if my hash set is not empty, that means it contains odd number of character
        {
            count=count+1; // increase count by 1 
        }
        return count; //return count
    }
}

// Time Complexity : O(n) //please verify it
// Space Complexity : O(n) //please verify it
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : no 


// Your code here along with comments explaining your approach
## Problem2 Solution 

class Solution {
    public int findMaxLength(int[] nums) {
        HashMap<Integer, Integer> myMap = new HashMap<>(); //Hash map to store the running sum and the index
        
        myMap.put(0,-1); //initially add this to count the first balanced array from the beginning itself
        
        int rSum=0; int max=0; // initialise
        
        for(int i=0;i<nums.length; i++) //for all the numbers present in the array 
        {
            if(nums[i]==0) // if the number is 0, subtract -1
            {
                rSum=rSum-1;
            }
            else
            {
                rSum= rSum+1; //else number is 1 so add 1 to running sum 
            }
            
            if(myMap.containsKey(rSum)) //if my map contains the running sum 
            {
                max= Math.max(max, i- myMap.get(rSum)); //that means the array betwwen the first occurance and this occurance of rsum is balanced. 
                //compare it with previous max and keep the max of both 
            }
            else
            {
                myMap.put(rSum,i); //else add the rsum and the index of occurance to the map 
            }
        }
        return max; //return the max balanced array found
    }
}

// Your code here along with comments explaining your approach
## Problem3 Solution 

// Time Complexity : O(n) //please verify it
// Space Complexity : O(n) //please verify it
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : no 
class Solution {
    public int subarraySum(int[] nums, int k) {
         
        HashMap<Integer, Integer> myHash= new HashMap<>(); //create a hash map to store the running sum and its occurance in the array 
        int rSum=0; int count=0; //initialise the count 
        myHash.put(0,1); //the initial condition to take care the beginning of the sum 
        
        for(int i=0; i<nums.length; i++)
        {
            rSum= rSum+ nums[i]; //running sum 

            if(myHash.containsKey(rSum-k)) //if my map contains the running sum minus the target key 
            {
                count= count+ myHash.get(rSum-k); //then increase the count since the target is present 
            }
            
            if(!myHash.containsKey(rSum)){ //else if it does not contain the key 
            myHash.put(rSum,1); //put it into the map 
            }
            else
            {
                myHash.put(rSum,myHash.get(rSum) +1);  // increase the value index if it is occuring more than once
            }
        }
        return count; //return count
    }
}