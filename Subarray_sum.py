#time complexity : o(n*n)
#Leetcode submission: Time Limit Exceeded
#brute force algorithm is the check sum for every element from its position to every other position in the array


class Solution(object):
    def subarraySum(self, nums, k):
        """
        :type nums: List[int]
        :type k: int
        :rtype: int
        """

        #initializing count to 0 which is to be returned
        count=0
        for i in range(len(nums)):
            total=0
            for j in range(i,len(nums)):
                #print j
                total=total+nums[j]
                if (total == k):
                    count =count+1
                    #print ("d",count)
        return count
                