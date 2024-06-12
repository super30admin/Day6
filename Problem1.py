#Time complexity: O(n) where n is the length of input array
#Space complexity: O(n) where n is the length of input array
#Does it run on leetcode ? : yes 
#Approach: The idea here is to keep track of all the intermediate sum of subarray and result is generated by subtracting k
# from the sum and adding the count[sum-k] to the result
import collections
class Solution:
	#function to find the subarray sun equal to k 
    def subarraySum(self, nums: List[int], k: int) -> int:
        count = collections.Counter()
        count[0]=1
        ans, summ =0,0
        for n in nums:
            summ+= n
            ans += count[summ-k]
            count[summ]+=1
        return ans