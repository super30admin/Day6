# Time Complexity :O(n)
# Space Complexity :O(n)
#  Did this code successfully run on Leetcode :yes
# Any problem you faced while coding this :no
#Leetcode : 525

#Given a binary array, find the maximum length of a contiguous subarray with equal number of 0 and 1.

# Example 1:
# Input: [0,1]
# Output: 2
# Explanation: [0, 1] is the longest contiguous subarray with equal number of 0 and 1.

#Step 1: Crucial Idea: We will keep a dict with key as currentSum and value as Starting Index. The idea is similar to previous problem.
#Step 2: Here instead of difference we will keep a track of end index.

def main():
    nums = [0,0,1,0,0,0,1,1]
    ans = findMaxLength(nums)
    print(ans)

def findMaxLength(nums):
    """
    :type nums: List[int]
    :rtype: int
    """
    maxAns = 0
    currentSum = 0
    myDict = {}

    # Adding the first sum on -1 index
    myDict[0] = -1

    for index in range(len(nums)):
        # Basic condition for currentSum
        if nums[index] is 0:
            currentSum += 1
        else:
            currentSum -= 1
        # Core idea where currentSum is same that means it subarray is surely equal
        # For example sums are [-1,0,-1,0,-1] as we can see position 0 to 3 or 1 to 4 are satisfying. That is what we want.

        # We check here if the value is already present.
        # If Yes we directly take the currentIndex that is the end index and start index from the value of the dict and compare with max.
        if currentSum in myDict:
            end = index
            start = myDict[currentSum]

            maxAns = max(maxAns, end - start)
        else:
            myDict[currentSum] = index

    return maxAns

if __name__ == '__main__':
    main()

