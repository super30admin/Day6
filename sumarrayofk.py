"Time complexity of the below code is O(N), because we will be iterating through every element of the list"
"Space Complexity of the bwlo code will be O(N), because the length of dictionary is not constant"


class Solution:
    def subarraySum(self, nums: List[int], k: int) -> int:
        my_dict = {}
        my_dict[0] = 1
        count = 0

        rowsum = 0

        for i in range(len(nums)):
            rowsum = rowsum + nums[i]
            difference = rowsum - k

            if difference in my_dict:
                count = count + my_dict[difference]

            my_dict[rowsum] = my_dict.get(rowsum, 0) + 1
        
        return count