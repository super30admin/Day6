# // Time Complexity :O(n)
# // Space Complexity :O(n)
# // Did this code successfully run on Leetcode :yes
# // Any problem you faced while coding this :no


# // Your code here along with comments explaining your approach



class Solution:
    def subarraySum(self, nums: List[int], k: int) -> int:
        print(nums)
        dict={}
        dict[0]=1
        rsum=0
        count=0
        for i in nums:
            rsum=rsum+i
            
            
            if rsum-k in dict.keys():
                count=count+dict[rsum-k]
                print(count)
                print(nums[rsum-k:rsum])
            # dict[rsum]=1
            if rsum in dict.keys():
                dict[rsum]=dict[rsum]+1
            else:
                dict[rsum]=1
                
            
                
            
        print(dict)
        return count
                
            