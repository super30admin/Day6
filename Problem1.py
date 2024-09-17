#timecomplexity O(n)
#spacecomplexity O(n) maintaining sum in hash
# maintaining the culumative sum and keeping that into hash
# at every index, i am checking that sum at that point i.e difference bw key and sum present in the hash or not if yes then increase the respective value(by 1) of key

class Solution:
    def subarraySum(self, nums: List[int], k: int) -> int:
        if nums==None or len(nums)==0: return 0
        sumN=0
        hash={}
        hash[0]=1
        count=0
        for i in range(len(nums)):
            sumN+=nums[i]
            cul=sumN-k
            if cul in hash:
                count = count+hash[cul]
            if sumN in hash:
                hash[sumN] +=1
            else:
                hash[sumN] =1
        return count

            
