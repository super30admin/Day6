#timecomplexity O(n)
#spacecomplexity O(n) for sum at every index
class Solution:
    def findMaxLength(self, nums: List[int]) -> int:
        if nums==[] or len(nums)==0: return 0
        sumN=0
        hash={}
        hash[sumN]=-1# adding default sum into the hash edge case
        maxcount=0#intial max =0
        for i in range(len(nums)):
            if nums[i]==0:
                sumN -=1
            else:
                sumN +=1
            if sumN in hash:
                maxcount=max(maxcount,i-hash[sumN])
            else:
                hash[sumN]=i
        return maxcount

#desc keeping sum for 0 and 1 if 0 is encouter 0  sum in reduce by -1 else  sum = +1
#keeping the hash for the sum and index of the array
#if we encouter sum in hash mean from that index to current index subarray is balanced
