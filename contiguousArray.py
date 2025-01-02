class Solution:
    def findMaxLength(self, nums: List[int]) -> int:
        # Brute Force Approach
        # Gave TLE error
        # maxLen = 0
        # for i in range(len(nums)):
        #     countZero = 0
        #     countOne = 0
        #     for j in range(i,len(nums)):
        #         if nums[j] == 1:
        #             countOne+=1
        #         else:
        #             countZero+=1

        #         if countZero == countOne:
        #             maxLen = max(maxLen, j-i+1)
        # return maxLen        


        # Optimize Approach
        map = {}
        maxLen = 0
        map[0] = -1
        rSum = 0
        for i in range(len(nums)):
            if nums[i] == 0:
                rSum-=1
            else:
                rSum+=1

            if map.get(rSum) is None:
                map[rSum] = i
            else:
                maxLen = max(maxLen,i-map[rSum])
        return maxLen            


            
        
