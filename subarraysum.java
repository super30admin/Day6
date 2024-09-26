
//TC: O(n)
//SC: O(n)
//Succesfully ran on leetcode
//Had problem with figuring out the runnning sum approach

class Solution {
    public int subarraySum(int[] nums, int k)
    {
        int currsum=0;
        int count=0;
        HashMap<Integer,Integer> hashmap=new HashMap<>();

        hashmap.put(0,1);

        for(int i=0;i<nums.length;i++)
        {
            //while traversing the array keep track of the current sum
            currsum+=nums[i];
            //For each element in the array calculate compliment which is current sum value - k
            int compliment=currsum-k;
            //if compliment exists in the hashmap it means that the part of the array from index 0 until now must have a subarray with sum equal to k
            //so we increment the count by value stored in the hashmap for key compliment
            if(hashmap.containsKey(compliment))
            {
                count+=hashmap.get(compliment);
            }
            //if the current sum already exists in the hashmap increment its value by 1
            if(hashmap.containsKey(currsum))
            {
                hashmap.put(currsum,hashmap.get(currsum)+1);
            }
            //if the current sum doesnt exist in the hashmap add a new entry key=current sum value; value=1
            else
            {
                hashmap.put(currsum,1);
            }
        }
        return count;

    }
}
