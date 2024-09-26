class Solution(object):
    def findMaxLength(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        max_length = 0
        dict_runningsum = {}  # for getting the running sums and indexes of running sums
        i_sum = 0
        dict_runningsum[0] = 0
        for i in range(len(nums)):
            if nums[i] == 0:
                i_sum -= 1
            else:
                i_sum += 1
            # compliment =
            if i_sum in dict_runningsum:
                l = (i + 1) - dict_runningsum[i_sum] # i+1 to get the exact position if we have to find in case [] of nums= [0,1,0,1,0,0,1,1],basically when we have to count from the beginning
                if l > max_length:
                    max_length = l
            else:
                dict_runningsum[i_sum] = i + 1
        return max_length


a=[0,1]
j=Solution()
print(j.findMaxLength(a))
