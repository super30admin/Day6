#time complexity: o(n) since we have to traverse whole array
#space complexity:o(n) dict length could depend on len of array
#passed all cases on LeetCode:yes
#difficulty faced:
# comments:in the code
#https://leetcode.com/problems/subarray-sum-equals-k/
class Solution:
    def subarraySum(self, nums: 'List[int]', k: int) -> int:
        
        dict1 = {}
        
        #how many times this count has happened
        #have to store base case as 0 happened once that is rsum is 0 1 time
        dict1[0] = 1
        
        rsum = 0
        count = 0
        
        for i in range(0,len(nums)):
            rsum += nums[i]
           

            if rsum-k in dict1:
                count = count+dict1[rsum-k]   
                
            if rsum in dict1:
                dict1[rsum] += 1 
            else:
                dict1[rsum] = 1
            
        return count
"""
 #we try to find rsum-k in the dict bec that means we can form a contiguous array going back from this element to some element back in the array which had rsum -k running sum. so these will form an array such that we find the count
# [3,4, 7, 6,-3, 2, 0, 1, 0, 7, 6, 5,10]
#0[3,7,14,20,17,19,19,20,20,27,33,38,48]    <-rsum, k = 7
#  0,1,2, 2, 2, 2, 2, 2, 2, 5, 5, 5, 5  <-count
how count is updated:
0th 3-7 = -4, not in dict hence count = 0;store 3:1
1st: 7-7 = 0, 0 has value of 1 in dict so count+1 = 1; store 7:1
2nd: 14-7 =7, 7 has a value of 1 in dict so count+1; store 14:1
3rd 20-7 = 14,14 has a value of 1 in dict so count+1; store 20:1
4th 17-7 = 10,10 not present in dict so count remains same; store 17:1
5th 19-7 = 12,12 not present in dict so count remains same; store 19:1
6th 19-7 = 12,12 not present in dict so count remains same; store 19:2
7th 20-7 = 13,13 not present in dict so count remains same; store 20:2
8th 20-7 = 13,13 not present in dict so count remains same; store 20:3
9th 27-7 = 20,20 has a value of 3 in dict so count+3; store 27:1





dict for above:
{
  0:1 #base case
  3:1
  7:1
  14:1
  20:3
  17:1
  19:2
  27:1
  33:1
  38:1
  48:1
}
"""            
            
            
            