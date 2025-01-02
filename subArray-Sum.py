class Solution:
    def subarraySum(self, nums: List[int], k: int) -> int:
        # brute force approach
        # count= 0
        # for i in range(len(nums)):
        #     sum = 0
        #     for j in range(i,len(nums)):
        #         sum+=nums[j]
        #         if sum == k:
        #             count+=1
        # return count


        # optimize solution
        map = defaultdict(int)
        prefix_sum = 0
        map[0] = 1
        count = 0
        for i in range(len(nums)):
            prefix_sum +=  nums[i]
            if k-prefix_sum in map:
                count += map[prefix_sum]
            map[prefix_sum] += 1
        return count 

   

                
        
        
