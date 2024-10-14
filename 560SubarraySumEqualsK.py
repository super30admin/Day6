# Time complexity = O(n). Space Complexity = O(n)
class Solution:
    def subarraySum(self, nums: List[int], k: int) -> int:
        map1 = {0:1}
        count = 0
        rsum = 0

        for num in nums:
            rsum += num
            diff = rsum - k
            # print(f'num2 {num2} rsum {rsum}')
            # if diff in map1:
            #     count += map1[diff]
            count += map1.get(diff, 0)
            if rsum not in map1:
                map1[rsum] = 1
            else:
                map1[rsum] += 1
        return count