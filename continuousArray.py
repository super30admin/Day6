"""
The approach here is to maintain a hashmap and a running sum. we iterate over the array adding the
value of each element to our total running sum. and after every point after adding the element to the
total we deduct the target value k with the running sum let the resultant be val, now we check if val
is present in the hashmap, if present we add the val key's value in the hashmap to count. Also the total
running sum is added to the hashmap with value 1 if not present , if present we increment the total key's 
value field by 1. So the Basic idea here is we go on calculating the running sum. and add the running sum value
and it's count to the hashmap, also deduct it with the target value, hence on deducting the total with 
the target if we find a value already in the hashmap this means there is sub-array equal to target in 
between the sub-array forming the running sum value and the sub-array forming the value equal to the
value of running sum - target. hence we increment the count value by deductant value found in the hashmap.

Running on leetcode
Time complexity - O(N) - since iterating through the whole array.
"""

def subarraySum(self, nums, k):
        count = 0
        total = 0
        dict1 = {}
        dict1[0] = 1
        for i in range(len(nums)):
            total += nums[i]
            val = total - k 
            if val in dict1:
                count += dict1[val]
                
            if total in dict1:
                dict1[total] = dict1[total] + 1
            else:
                dict1[total] = 1
        
        return count