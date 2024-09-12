#Time Complexity: O(n)
#Space Complexity: O(n)
#Working on LeetCode: Yes

class Solution:
    def subarraySum(self, nums, k):
        count_mapper = {0:1}
        count, s = 0,0

        for num in nums:
            s += num
            if s-k in count_mapper:
                count += count_mapper[s-k]
            
            if s in count_mapper:
                count_mapper[s] += 1
            else:
                count_mapper[s] = 1

        return count

if __name__ == "__main__":
    obj = Solution()
    nums = [1,1,1]
    print(obj.subarraySum(nums))