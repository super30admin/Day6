# Time Complexity :O(n)
# Space Complexity :O(n)
#  Did this code successfully run on Leetcode :yes
# Any problem you faced while coding this :no
#Leetcode : 560


#Given an array of integers nums and an integer k, return the total number of continuous subarrays whose sum equals to k.

#Step 1 : Crucial idea - If you subtract a part of a continous sum from req sum, then if the present in previous array then
#we can say that this is one of the subarrays.

#step 2: Initialize dictionary with currentSum = 0 and key as 1 because there will be one subarray with sum 0 obviously
#Step 3: Main idea: Take currentSum, difference. If difference is present in dict then add to the count the value
#Step 4: Also if currentSum is present update the value to +1 else make a new entry

def main():
    nums = [3,4,7,2,-3,1,4,2,0,1]
    k = 7
    ans = subarraySum(nums,k)
    print(ans)

def subarraySum(nums, k):
    """
    :type nums: List[int]
    :type k: int
    :rtype: int
    """
    myDict = {}
    myDict[0] = 1
    currentSum = 0
    count = 0
    difference = 0

    for each in nums:
        currentSum += each
        difference = currentSum - k

        if difference in myDict:
            count += myDict[difference]
        if currentSum not in myDict:
            myDict[currentSum] = 1
        else:
            myDict[currentSum] = myDict[currentSum] + 1

    return count


if __name__ == '__main__':
    main()