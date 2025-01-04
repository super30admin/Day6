#time complexity: O(n)
#space complecity: O(n)
class Solution:
    def subarraySum(self, nums: List[int], k: int) -> int:
        cnt =0
        if(len(nums) == 0):
            return 0
        if(len(nums) == 1):
            if(nums[0] == k):
                return 1
            else:
                return 0
        rsum=0
        hmap= dict()
        hmap[0]= 1
        for n in nums:
            rsum += n
            search_value = rsum - k
            if search_value in hmap:
                cnt += hmap[search_value]
            if rsum not in hmap:
                hmap[rsum]= 1
            else:
                hmap[rsum] += 1
        return cnt
                       
