class Solution(object):
    def subarraySum(self, nums, k):
        """
        :type nums: List[int]
        :type k: int
        :rtype: int
        """
        # # O(n2) Time Complexity, O(1) space complexity
        # runSum = 0
        # count = 0
        # for i in range(len(nums)):
        #     runSum = 0
        #     for j in range(i,len(nums)):
        #         runSum += nums[j]
        #         if(runSum == k):
        #             count+=1
        # return count
    # We can reduce the Time complexity by avoiding recomputations of previous running sums again and again
    # So we store the running sum till previous element and its count in a hashmap. If (k-rnSum) exists in hashmap then
    # we found a subarray where rnSum = k
    # Time Complexity of this approach is O(n) and space complexity is O(n)
        rnSum = 0
        count = 0
        mem = {0:1}
        for i in range(len(nums)):
            rnSum += nums[i]
            if((rnSum - k) in mem):
                count+=mem[rnSum-k]
            if(rnSum in mem):
                mem[rnSum]+=1
            else:
                mem[rnSum]=1
        return count