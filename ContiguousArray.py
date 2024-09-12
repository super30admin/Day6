class Solution(object):
    def findMaxLength(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        """
        # Brute Force
        # Time complexity is O(n2) and Space complexity is O(1)
        maxLen = 0
        for i in range(len(nums)):
            zeros = 0
            ones = 0
            for j in range(i,len(nums)):
                if(nums[j] == 0):
                    zeros+=1
                else:
                    ones+=1
                if(zeros == ones):
                    maxLen = max(j-i+1,maxLen)
        return maxLen
        """
        # We can reduce the time complexity by storing the previous counts of zeros and ones along with their index
        # Time complexity is O(n) and space complexity is O(n)
        oneZeroDiff = 0
        maxLen = 0
        mem = {0:-1}
        for i in range(len(nums)):
            if(nums[i] == 1):
                oneZeroDiff+=1
            else:
                oneZeroDiff-=1
            if(oneZeroDiff in mem):
                maxLen = max(maxLen,i-mem[oneZeroDiff])
            else:
                mem[oneZeroDiff] = i
        return maxLen