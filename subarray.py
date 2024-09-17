
#time complexity = 0(n)

#we have a run sum
# and a count

#we check if the complement of the run sum is there
#

class Solution:
    def subarraySum(self, nums: List[int], k: int) -> int:
        runsum=0
        count=0
        dct={}
        dct[0]=1
        for i in range(len(nums)):  # i made a mistake here. I dod len(nums-1) and was not getting op
            runsum+=nums[i]
            val=runsum-k
            if val in dct.keys():
                count+=dct.get(val)
            if runsum in dct.keys():
                dct[runsum]=(dct.get(runsum))+1
            else:
                dct[runsum]=1
        return count