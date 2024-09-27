#Time Complexity: O(1)
#Sapce Complexity: O(n)
#We are maintaining a hashmap with the running sum and index values. 
#If the rsum value is not in the hashmap we add it
#else if it is already present we find the difference between the current index and the previous index which will be the length of the subarray
class Solution:
    def findMaxLength(self, nums: List[int]) -> int:
        hm={0:-1}
        maxlen=0
        rsum=0
        for i in range(len(nums)):
            if nums[i]==0:
                rsum=rsum-1
            else:
                rsum+=1
            if rsum not in hm:
                hm[rsum]=i
            else:
                maxlen=max(maxlen,i-hm[rsum])
        return maxlen
                
        