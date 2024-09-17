'''
Implementation: 
- Create a dictionary with count, index = 0,0
- start array index at 1
- if 0, decrease count by 1
- if 1, increase count by 1
- For each element,
    - If count already in dict, (i.e. we get one 0 and one 1), maxlength would be max of (previous maxlength) and ((current index) - index of the count previously stored)
        - (previous maxlength) stored to find the longest string later in the array
    - else: add entry in dictionary, (count, index)
- retun maxlength

Time complexity: O(n)
Space complexity: O(n)
'''
class Solution(object):
    def findMaxLength(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        d = {0 : 0} # dict{count, index}
        max_length = 0
        count = 0
        
        for i,val in enumerate(nums, 1): # start array index from 1 as count = 0 initially
            if val == 0:
                count -= 1
            elif val == 1:
                count += 1
             
            if count in d:
                max_length = max(max_length, i - d[count])
            else:
                d[count] = i
            # print(d)
        return max_length