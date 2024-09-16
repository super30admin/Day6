class Solution:
    def subarraySum(self, nums: List[int], k: int) -> int:
        if nums is None or len(nums)==0:
            return 0
        res_map ={}
        res_map[0]=1
        print(res_map)
        count=0
        rsum=0
        for i in range(len(nums)):
            rsum =rsum+nums[i]
            diff = rsum-k
            if diff in res_map:
                count =count + res_map[diff]
            if rsum in res_map:
                res_map[rsum]=res_map[rsum]+1
            else:
                res_map[rsum]=1
        return count
            
            
        