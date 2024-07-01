
# // Time Complexity : O(n)
# // Space Complexity : O(n) 
# // Did this code successfully run on Leetcode : yes
# // Any problem you faced while coding this : I faced the issues while deciding the odd logic for handing difference of 0 sum. 

class Solution:
    def subarraySum(self, nums: List[int], k: int) -> int:
        runninSum=defaultdict(int)
        runninSum[0]=1
        count=0
        currentSum=0
        for i in range(len(nums)):
            currentSum+=nums[i]
            diff=currentSum-k
            count+=runninSum[diff]
            runninSum[currentSum]+=1
        return count
    
    # Approach:
    # 1. Create a dictionary to store the running sum of the array. 
    # 2. Initialize the dictionary with 0 as key and 1 as value.
    # 3. Initialize the count variable to 0.  
    # 4. Iterate through the array and for each element, add the element to the current sum.
    # 5. Calculate the difference between the current sum and the target sum.
    # 6. Increment the count by the value of the difference in the dictionary.
    # 7. Add the current sum to the dictionary with a value of 1.
    # 8. return count of subarray.
