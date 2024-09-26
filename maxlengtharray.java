//TC:O(n)
//SC:O(n)
//succesfully ran on leetcode

class Solution {
    public int findMaxLength(int[] nums)
    {

        int currsum=0;
        int max=0;
        HashMap<Integer,Integer> hashmap=new HashMap<>();

        hashmap.put(0,-1);

        for(int i=0;i<nums.length;i++)
        {
            //keep track of the current sum
            //if the element is 0 add 1
            //if the element is 1 add -1
            if(nums[i]==0)
            {
                currsum+=1;
            }
            else
            {
                currsum+=-1;
            }

            //if the current sum is in the hashmap calculate the current index-the index where the sum 1st occured
            //keep track of max which denotes the max length of equal number of 0's and 1's
            if(hashmap.containsKey(currsum))
            {
                max=Math.max(max,i-hashmap.get(currsum));
            }
            //otherwise add new entry currsum:i to the hashmap
            else
            {
                hashmap.put(currsum,i);
            }
        }
        return max;
    }
}
