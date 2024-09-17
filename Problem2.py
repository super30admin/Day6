#525. Contiguous Array
#time complexity = O(n)
#space complexity = O(1)
#Algorithm : intialise a map with 0 = -1 and a rsum variable
#2.Iterate through array and if you find num[i] is 0 then decrement rsum by 1 else increment by 1
#3 check if rsum is alread in map if yes compare the max value wrt to difference of current index  to that of index value whose rsum is in map
#4. Add rsum to the map
#5. retun the max value
#Ran on Leetcode: Yes
class Solution:
    def findMaxLength(self, nums: List[int]) -> int:
        mapp = {0 : -1}
        rsum, maxcount = 0, 0
        for i in range(len(nums)):
            if nums[i] == 0:
                rsum = rsum - 1 
            else:
                rsum = rsum + 1
            if rsum in mapp:
                maxcount = max(maxcount, i - mapp[rsum])
            else:
                mapp[rsum] = i
        return maxcount