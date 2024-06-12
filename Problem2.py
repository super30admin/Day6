#Time complexity: O(n) where n is the length of input array
#Space complexity: O(n) where n is the length of input array
#Does it run on leetcode ? : yes 
#Approach: We take count of each 0 as -1 and 1 as +1. We keep track of the count along with index. If the same count 
#appears again, we know that the subsequence has equal 0 and 1s and take this length into account. 
class Solution:
    # function to find the maximum length of a contiguous subarray with equal number of 0 and 1.
    def findMaxLength(self, nums: List[int]) -> int:
        count=0
        maxlen = 0
        mapp = {0:-1}
        for i,num in enumerate(nums):
            if num==0:
                count -=1
            else:
                count +=1
            #print(i,count)
            if count in mapp:
                maxlen = max(maxlen, i - mapp[count])
            else:
                mapp[count]=i
        return maxlen