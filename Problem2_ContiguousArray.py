#Time Complexity: O(n)
#Space Complexity: O(n)
#Working on Leetcode: yes

class Solution:
    def findMaxLength(self, nums):
        max_subarray, total = 0, 0
        count_mapper = {}

        for i in range(len(nums)):
            if nums[i] == 0:
                total -= 1
            else:
                total += 1
            
            if total == 0:
                max_subarray = i+1
            elif total in count_mapper:
                max_subarray = max(max_subarray, i-count_mapper[total])
            else:
                count_mapper[total] = i
        
        return max_subarray

if __name__ == "__main__":
    obj = Solution()
    nums = [0,1]
    print(obj.findMaxLength(nums))