# Tc: O(n)
# Sc: O(n)

class Solution:
    def findMaxLength(self, nums) -> int:
        # if len(nums) == 1:
        #     return 0
        # if len(nums) == 2:
        #     if (nums[0] == 0 and nums[1] == 1) or (nums[0] == 1 and nums[1] == 0): return 2
        #     else:
        #         return 0
        pos_dic = {0:-1}
        sum = 0
        res = 0
        for i in range(len(nums)):
            if nums[i] == 0:
                sum -= 1
            else:
                sum += 1
            if sum not in pos_dic:
                pos_dic[sum] = i
            else:
                res = max(res,i-pos_dic[sum])
        return res

obj = Solution()
print(obj.findMaxLength([0,0,0,1,1,1,1]))