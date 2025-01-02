#Time Complexity = O(n)
#Space Complexity = O(1)
#Leetcode = yes
# approach = we we calculate running sum and every index and store running sum and its count in hashmap and whenever we find that rsum-k is in hahshmap we will add its count to our current count and if rsum - k is not in hashmap then we will add its count. 
class Solution:
    def subarraySum(self, nums: List[int], k: int) -> int:
        runningSum = 0
        HashMap = {0: 1}  # rsum : rsum_count
        count = 0

        for num in nums:
            runningSum += num
            if runningSum - k in HashMap:
                count += HashMap[runningSum - k]
            HashMap[runningSum] = HashMap.get(runningSum, 0) + 1

        return count