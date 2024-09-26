class Solution:
    def subarraySum(self, nums: List[int], k: int) -> int:
        rsum = 0
        count = 0
        map = dict()
        map[0]=1
        if len(nums)<1 or len(nums)>20000:
            return 0
        for i in nums:
            rsum += i
            if rsum - k in map:
                count +=map[rsum-k]
            if rsum  not in map:
                map[rsum] = 1
            else:
                map[rsum] += 1
        return count
    
# this implementation takes O(n) complexity where n is the number of list elements
            
            
        