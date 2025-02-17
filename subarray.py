class Solution:
    def subarraySum(self, nums: List[int], k: int) -> int:
        
        sum_dict = {0:1}
        array_sum=0
        total_count = 0
        for num in nums:
            array_sum+=num

            if (array_sum-k) in sum_dict:
                total_count+=sum_dict[array_sum-k]

            if (array_sum) in sum_dict:
                sum_dict[array_sum]+=1
            else:
                sum_dict[array_sum]=1
        
        return total_count

