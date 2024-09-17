# Time Complexity : O(n)
# Space Complexity : O(1)
# Did this code successfully run on Leetcode : yes
# Any problem you faced while coding this : No
# Your code here along with comments explaining your approach
class Solution:
    def findMaxLength(self,nums):
        if not nums or len(nums) == 0:
            return 0 
        rcount = 0 
        max1 = 0 
        start = end = 0
        d ={0:-1}
        for idx in range(len(nums)): 
            if nums[idx] == 0:
                rcount -= 1 
            else:
                rcount += 1 
            if rcount not in d: 
                d[rcount] = idx 
            else:
                curr = idx - d[rcount]
                if curr > max1:
                    max1 = curr
                    start = d[rcount] + 1 
                    end = idx
        # print("start",start)
        # print("end",end)
        return curr

if __name__ == "__main__":
    s = Solution()
    nums = [1,0,1,0,1,1,1,1,0,0,1,0,1]
    res = s.findMaxLength(nums)
    print(res)

