"""
Runtime Complexity:
O(n) - because we go over 'n' elements in the list and compute its rsum and check the difference of rsum with target in hashmap and increment the respective count.
If the rsum is not in hashmap then we put it.
Space Complexity:
O(n) - Because we declare a hashmap and store rsum traversing each element. If the rsum is already present then we just update the count or put the new rsum into our map.
Yes, the code worked on leetcode.
"""


class Solution:
    def subarraySum(self, nums: List[int], k: int) -> int:
        if len(nums)==0:
            return 0
        count = 0
        rsum = 0
        sub_map = {}
        sub_map[0] = 1
        for i in range(0,len(nums)):
            rsum = rsum+nums[i]
            
            if (rsum-k) in sub_map:
                count = count + sub_map.get(rsum-k)
                
            if rsum in sub_map:
                sub_map[rsum] = sub_map.get(rsum)+1
                
            else:
                sub_map[rsum] =1
        return count
