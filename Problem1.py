# Time Complexity: O(n)

# Space Complexity: O(n) for the hash map and the cumulative sum array

# Did it run on Leetcode:Yes

# Approach:
# Calulculate the cumulative sum at each index in the list.
# If at any point the the dofference between the current cumulative sum and cumulative sum at previous index=target, then we know that all elements
# after the previous cumulative index including the element at the index of new cumulative sum will give me summation which equals to the target
# Now we maintain a hashmap wherein if the difference between current sum and target is found,we increment the count value in hashmap by 1. the total count of subarray
# will be current count+ value of the count in hashmap so that we cover all permutattions of the subarrays.

class Solution:
    def subarraySum(self, nums, k):
        count = 0
        s = 0
        sumDict = {0:1}

        for i in nums:
            s+=i
            if s - k in sumDict:
                count += sumDict[s - k]
            if s in sumDict:
                sumDict[s] += 1
            else:
                sumDict[s] = 1
        return count


s = Solution()
print(s.subarraySum([1, 1, 1], 2))
