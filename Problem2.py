## Problem2 (https://leetcode.com/problems/contiguous-array/)

class Solution:
    def findMaxLength(self, nums: list[int]) -> int:
        count = 0
        result = 0
        dict_seen = {0: -1}
        
        for i in range(len(nums)):
            n = nums[i]
            if n == 0:
                count -= 1
            if n == 1:
                count += 1

            if count in dict_seen:
                result = max(result, i - dict_seen[count])
            else:
                dict_seen[count] = i

        return result


if __name__ == "__main__":
  
    sol = Solution()


    nums = [0, 1]
    print(sol.findMaxLength(nums))   

    nums = [0, 1, 0]
    print(sol.findMaxLength(nums))    
