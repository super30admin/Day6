class Solution:
    def subarraySum(self, nums: List[int], k: int) -> int:
        
        n_sum,count_total = 0,0

        hash_map = {0:1}

        for i in range(len(nums)):

            n_sum += nums[i]

            if n_sum - k in hash_map:
                count_total += hash_map[n_sum-k]

            if n_sum not in hash_map:
                hash_map[n_sum] = 1
            else:
                hash_map[n_sum] +=1

    
        return count_total
         
#This problem finds the number of subarrays with sum equal to k value.#Used hashmap to perform this efficiently with time complexity as O(n)
#and space complexity as O(n)