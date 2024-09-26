# Time Complexity:- O(n)
# Space Complexity:- O(n)
# Approach:- Since its a binary array-1 or 0 only, everytime i encounter a 0 i will increase the
# sum by 1 everytime i encounter a 1 i will decrease the sum, if the sum is 0 at any point the number
# of 0 and 1 are equal in that range else if I have encountered the same sum before the number of 0
# and 1 are equal in that range as well.
class Solution:
    def findMaxLength(self, nums: List[int]) -> int:
        c={}
        sum=0
        maxlen=0
        for i in range(len(nums)):
            # if 0 increase the sum by 1
            if nums[i]==0:
                sum+=1
            else:
                sum-=1
            # if i have seen the sum before the number of 0 and 1 in that range are equal
            if sum in c:
                maxlen=max(maxlen,i-c[sum])
            # if sum is 0 then the entire range from 0 till i has equal 0 and 1
            elif sum==0:
                maxlen=i+1
            else:
                # make a note of the sum i am seeing till now and at which index i am seeing the sum
                c[sum]=i           
        return maxlen