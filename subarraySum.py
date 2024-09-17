# Time Complexity : O(n)
# Space Complexity : O(n)
# Did this code successfully run on Leetcode :YES
# Any problem you faced while coding this :NO


class Solution:
    def subarraySum(self, nums, k: int) -> int:
        #hashmap to store running_sum and its occurences
        hashmap = {}
        hashmap[0]=1
        r_sum = 0
        count = 0

        for i in range(len(nums)):
            r_sum = r_sum+nums[i]
            if r_sum-k in hashmap.keys():
                count+=hashmap[r_sum-k]
            if r_sum in hashmap.keys():
                hashmap[r_sum]+=1
            else:
                hashmap[r_sum]=1
        return count


obj = Solution()
arr = [1,1,1]
k = 2
print(obj.subarraySum(arr,k))
