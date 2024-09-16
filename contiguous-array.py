class Solution:
    def findMaxLength(self, nums: List[int]) -> int:
        hashMap = {}
        hashMap[0] = -1 #[0,1] => [-1,0] does not acct for the first two elems 
        rSum = 0
        maxLength = 0
        for i in range(len(nums)):
            rSum =  rSum-1 if nums[i]==0 else rSum+1
            if rSum in hashMap:
                maxLength = max(maxLength, i-hashMap[rSum])
            else:
                hashMap[rSum] = i
        return maxLength
                
#TC: O(N) the algorithm goes over all the elements once
#SC: O(N) at any time all our elements can have different running sums hence all the different sums could be in the hashtable