
//Problem -1;
// Time Complexity :O(n)
// Space Complexity :O(n)
// Did this code successfully run on Leetcode :Yes
// Any problem you faced while coding this : I referred the class for the concept as am unaware of the runningSum Concept

// Your code here along with comments explaining your approach
/* Here am using the concept of RunningSum Pattern to avoid nested traversals for finding the subarrays.
HashMap does the mapping for the  runSum and how many times its occuring. First we will find the runSum for elements
in the given array. Here we know the target value. So we will check if the runSum-k is present in the anyposition of the
runSum.If it exists we will increase the count by mapped value to the existing rsum. if it does not exist in the map then
we will put in the map. if its entering for the first time we will put 1 else nu of times occuring plus 1.
Here we should make sure we are covering the edgecase.If we get value forthe first time then 0 won't be available in the
hashmap so we will map intiallywith 0 and 1. At last we will return the count.
*/

class Solution {
    public int subarraySum(int[] nums, int k) {
        HashMap<Integer,Integer> map=new HashMap<>();
        int numOfSubArrays =0;
        int rSum=0;
        map.put(0,1);
        for(int i=0;i<nums.length;i++){
            rSum=rSum+nums[i];
            if(map.containsKey(rSum-k)){
                numOfSubArrays=numOfSubArrays+map.get(rSum-k);
            }
            if(map.containsKey(rSum)){
                map.put(rSum,map.get(rSum)+1);
            }
            else map.put(rSum,1);
        }

        return numOfSubArrays;


    }
}

//Problem -2;
// Time Complexity :O(n)
// Space Complexity :O(n)
// Did this code successfully run on Leetcode :Yes
// Any problem you faced while coding this : I referred the class for the concept as am unaware of the runningSum Concept

// Your code here along with comments explaining your approach
/* Same approach of the problem 1 but here we just need to return max length of the balanced array.
Here we will mapwith the rsum and the index at which its occuring.We will check if rsum existing in the map ,
ifso then we check which count is max and we store it to the max variable
We will return the count in the end.
*/
class Solution {
    public int findMaxLength(int[] nums) {
        int rSum=0;
        int count=0;
        HashMap<Integer,Integer> map=new HashMap<>();
        map.put(0,-1);
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0) rSum--;
            if(nums[i]==1) rSum++;
            if(map.containsKey(rSum)){
                count=Math.max(count,i-map.get(rSum));
            }
            else map.put(rSum,i);
        }
        return count;

    }
}


//Problem -3;
// Time Complexity :O(n)
// Space Complexity :O(1)
// Did this code successfully run on Leetcode :Yes
// Any problem you faced while coding this : no

// Your code here along with comments explaining your approach
/* Here the basic approach could be we store the character of the string to hashset,
if it already exitst in the set then we will add 2 to the count and remove element from the set.
we keep on doing for all characters. In the end we will check if set is empty then
we return count else we will add one to count and return.
*/

class Solution {
    public int longestPalindrome(String s) {
        HashSet<Character> set = new HashSet<>();
        int count=0;
        for(int i=0;i<s.length();i++){
            if(set.contains(s.charAt(i))) {count+=2;
                set.remove(s.charAt(i));}
            else set.add(s.charAt(i));

        }
        if(!set.isEmpty()) count++;
        return count;


    }
}