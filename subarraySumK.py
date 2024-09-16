#TC: O(N) 
#SC: O(N) in worst case if hashmap.length == nums.length 
#LC: YESS

class Solution:
    def subarraySum(self, nums: List[int], k: int) -> int:
        hashmap = dict({0: 1})
        rsum = 0
        count = 0
        for num in nums:
            rsum += num
            if rsum - k in hashmap:
                count += hashmap[rsum - k]
            if rsum in hashmap:
                hashmap[rsum] += 1
            else: hashmap[rsum] =1
        print(hashmap)
        return count