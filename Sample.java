/******************** PROBLEM 2 *******************/

// Time Complexity : 0(N)
// Space Complexity : 0(1)
// Did this code successfully run on Leetcode : YES
// Any problem you faced while coding this : NO


/* Intuition is to find the running sum and save the first occurence in a hashmap
Whenever there is a duplicate, find the length and update the max */
class Solution {
    public int findMaxLength(int[] nums) {
        if(nums==null || nums.length==0 || nums.length==1){
            return 0;
        }
        int max=0,rSum=0;
        HashMap<Integer,Integer> seen=new HashMap<>();
        seen.put(0,-1);
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0){
                rSum--;
            }else{
                rSum++;
            }
            if(!seen.containsKey(rSum)){
                seen.put(rSum,i);
            }else{
                max=Math.max(max,i-seen.get(rSum));
            }
        }
        return max;
    }
}

/*************************** PROBLEM 3 ****************************/
// Time Complexity : 0(N)
// Space Complexity : 0(1)
// Did this code successfully run on Leetcode : YES
// Any problem you faced while coding this : NO

/*
Intuition is to add the seen characters to a set and if the character appears
again remove from set and increase the count by 2. If there are elements
present at the end then increment by 1
*/
class Solution {
    public int longestPalindrome(String s) {
        if(s.length()==1){
            return 1;
        }
        int count=0;
        HashSet<Character> seen=new HashSet<>();
        for(char each:s.toCharArray()){
            if(seen.contains(each)){
                count+=2;
                seen.remove(each);
            }else{
                seen.add(each);
            }
        }
        if(!seen.isEmpty()){
            count++;
        }
        return count;
    }
}