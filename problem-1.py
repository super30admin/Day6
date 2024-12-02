#Time Complexity: O(n)
#Space Complexity: O(n)
#Problem sucessfully accepted in leetcode: yes
class Solution:
    def subarraySum(self, nums: List[int], k: int) -> int:
        hashmap={}
        hashmap[0]=1
        currentSum=0
        count=0
        for i in range(len(nums)):
#Add current array index element to sum
            currentSum+=nums[i]
#If a subarray exists with sum k, increment the count 
            if currentSum-k in hashmap:
                count+=hashmap[currentSum-k]
            if currentSum in hashmap:
                hashmap[currentSum]+=1
#If not add the current sum to hashmap and add corresponding value to 1
            else:
                hashmap[currentSum]=1
        return count