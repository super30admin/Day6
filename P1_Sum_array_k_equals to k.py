# Time Complexity : O(n)
# Space Complexity : O(n)
# Is this problem on leetcode: Yes
# Approach to solve this problem:

# Problem statement subarray sum equals to k
    def subarraySum(self, nums: List[int], k: int) -> int:
        sumdict = {0:1}                    # Initiaiting dictionary key as 0 and value as 1
        n = len(nums)                      
        count = 0                          # For maintaining count of continuous subarray
        s = 0                              # Total count of Cummulative sum
        
        for num in nums:
            s += num                       # Adding cummulative sum
            if s-k in sumdict:             # If cum_sum subs target is in dictionary 
                count += sumdict[s-k]
            if s in sumdict:               # If cum_sum is in sumdict already, add 1
                sumdict[s] += 1
            else:                          # If cum_sum was not present in sumdict, assign 1 
                sumdict[s] = 1
        return count

