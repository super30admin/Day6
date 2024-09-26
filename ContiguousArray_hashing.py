class Solution:
    def findMaxLength(self, nums: List[int]) -> int:
        if len(nums)<1 or len(nums)>100000:
            return 0
        num = dict()
        rsum = 0
        count = 0
        # start = 0
        # end = 0
        num[rsum] = -1
        for i in range(len(nums)):
            if nums[i] == 1:
                rsum += 1
            else:
                rsum -= 1
            if rsum not in num:
                num[rsum] = i
            else:
                count = max(i-num[rsum], count)
                # if i - num[rsum] >= count:
                #     end = i
                #     start = num[rsum]+1
                #     print(start, end)
                #     count = i-num[rsum]
                #     # max(i - num[rsum], count)
        # print(nums[start:end+1])
        return count

# this implementation takes O(n) complexity where n is the number of elements present in the list
                
                
                        