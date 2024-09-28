class Solution:
    def subarraySum(self, nums: List[int], k: int) -> int:
        char_count ={}
        char_count[0] = 1
        run_sum = 0
        total = 0
        for i in range(len(nums)):
            run_sum += nums[i]
            
            check = run_sum - k
            if check in char_count:
                total += char_count[check]
            
            if run_sum not in char_count:
                char_count[run_sum] = 1
            else:
                char_count[run_sum] += 1
                
                
            
        return total
                    
                