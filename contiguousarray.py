"Time Complexity of this code will be O(N). This is because we are iterating through each value of the list"
"Space Complexity will be O(N), this is because, the length of the additional dictionary we are creating is NOT constant"

#Explanation

"Here we are having a rowsum inittated by 0 with -1 initially"

"If we find 0, we decrement the row sum by 1 or else increment by 1"
"We will always store the first occurences of the rowsum"
"If we encounter the rowsum second time, it means, that is one of the contiguous array and we count the length by index - last(occurence) index"
"We keep count of the max length too"

class Solution:
    def findMaxLength(self, nums: List[int]) -> int:
        my_dict = {}
        my_dict[0] = -1
        maxl = 0

        rowsum = 0

        for i in range(len(nums)):
            if nums[i] == 0:
                rowsum = rowsum - 1
            else:
                rowsum = rowsum + 1
            
            if rowsum not in my_dict:
                my_dict[rowsum] = i
            else:
                length = i - my_dict[rowsum]
                maxl = max(maxl, length)
        
        return maxl

        