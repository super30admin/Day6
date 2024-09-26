#// Time Complexity : O(n)
#// Space Complexity : O(1)
#// Did this code successfully run on Leetcode : Yes
#// Any problem you faced while coding this : was trying to use the nested if loops which was making to missing few casses

#// Your code here along with comments explaining your approach
#    1.Iterate through the entire Array
#    2.At each element comute a running sum
#    3.Maintain a Hashmap of running sum: times it has occured
#    4.Compare if the complement of the number is present in the Hash map,if yes that mean that there is a sub array
#     hence increment the count by the value of the complement from the hash map
#    5.if 4 is False then add the current rsum to the hash map and continue.

class Solution:
    def subarraySum(self, nums: List[int], k: int) -> int:
        if not nums:
            return -1
        
        rsum = 0
        hashmap = {}
        count = 0
        hashmap[0] = 1
        
        for i in range(len(nums)):
            rsum += nums[i]
            if (rsum - k) in hashmap.keys():
                count += hashmap[rsum-k]  
            if rsum not in hashmap.keys():
                hashmap[rsum] = 1
            else:
                hashmap[rsum] += 1
        print(hashmap)
        return count