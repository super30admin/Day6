#Executed on leet code
#time complexity -O(n)
#space complexity - O(n)
class Solution:
    def findMaxLength(self, nums: List[int]) -> int:
        mydict = {0:-1}
        ## cum_sum is cumulative sum up to that number
        ## maxlen is so far the maximum length found
        cum_sum = 0; maxlen = 0
        for i in range(len(nums)):
            if nums[i]==1: cum_sum += 1
            else: cum_sum -= 1
            if cum_sum in mydict:
                maxlen = max(maxlen, i - mydict[cum_sum])
            else:
                mydict[cum_sum] = i
        return (maxlen)
        