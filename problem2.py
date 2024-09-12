## Space Complexity : O(n)
## Time COmplexity : O(n)

class Solution:
    def findMaxLength(self, nums: List[int]) -> int:
        temp ={}
        max_length, total = 0,0

        for i in range(len(nums)):
            if nums[i] == 0:
                total -=1
            else:
                total += 1

            if total == 0:
                max_length = i +1
            elif total in temp:
                max_length = max(max_length, i-temp[total])
            else:
                temp[total] = i
        return max_length
