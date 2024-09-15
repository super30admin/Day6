# Time Complexity : O(n) where n is the number of elements we take to process in 1 loop 
# Space Complexity : O(n) here it is n as we are creating a hashMap to store the frequency of running sum 
# Did this code successfully run on Leetcode :  Yes 
# Any problem you faced while coding this : No


# Your code here along with comments explaining your approach : - We take a running sum of elements in the array and subtract it by the k value
#  and if the result is in hashMap we add it in count in this way we can get the subarray between the elements of the running sum 


class Solution:
    def subarraySum(self, nums: List[int], k: int) -> int:
        hashMap = {}
        hashMap[0] = 1
        count = 0 

        hashMapKeys = 0
        for i in range(len(nums)):     
            hashMapKeys = hashMapKeys + nums[i]
            if (hashMapKeys-k) in hashMap:
                count = count + hashMap[hashMapKeys-k]
            if hashMapKeys in hashMap:
                hashMap[hashMapKeys] = hashMap[hashMapKeys]+1
            else:
                hashMap[hashMapKeys] = 1
        return count 
