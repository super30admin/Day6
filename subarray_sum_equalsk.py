# time complexity: O(n)- traversing the array once
# space complexity: O(n)
# approach: store running sum as key and count of running sum as value in a hashmap
# subtract the running sum with target and check if that result is in hashmap. 
# increment the count if result in hashmap
# 








class Solution:
    def subarraySum(self, nums: List[int], k: int) -> int:
        if len(nums)==0:
            return 0
        hashmap =dict()
        rsum = 0
        hashmap[0]=1
        count = 0
        for num in nums:
            rsum = rsum + num
            if (rsum-k) in hashmap:
                count = count + hashmap[rsum-k]
            if rsum in hashmap:
                hashmap[rsum]= hashmap[rsum]+1
            else:
                hashmap[rsum]=1
        return count
        