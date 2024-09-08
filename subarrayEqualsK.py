# Time Complexity : O(n)
# Space Complexity :O(n)
# Did this code successfully run on Leetcode :Yes
# Any problem you faced while coding this :No
# initialize dict , count ad Rsum
# loop over array
# calc Rsum, if sum - k in map then inc count
#  also check if Rsum in map then inc value of Map[Rsum] by 1
# else add Rsum
#return count
def subarraySum(self, nums: List[int], k: int) -> int:
    if len(nums) == 0:
        return 0
    count = 0
    Rsum = 0
    Map = dict()
    Map[0] = 1

    for i in range(len(nums)):
        # x
        Rsum +=nums[i]
        #   x - z = y
        if Rsum - k  in Map:
            count+= Map[Rsum-k]
        if Rsum in Map:
            Map[Rsum]+=1
        else:
            Map[Rsum] = 1
        
    return count



