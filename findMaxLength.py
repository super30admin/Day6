class Solution:
    def findMaxLength(self, nums: List[int]) -> int:
        # # Brute Force [Time Limit Exceeded]
        # maxlen = 0
        # for i in range(len(nums)):
        #     zeros = 0
        #     ones = 0
        #     for j in range(i,len(nums)):
        #         if nums[j]==0:
        #             zeros +=1
        #         else:
        #             ones +=1
        #         if zeros == ones:
        #             maxlen = max(maxlen, j-i+1)
        # return maxlen


        
        # Optimal solution using dictionary
        myDict = {}  # Dictionary to store the sum and its index
        eleSum = 0  # Variable to keep track of the cumulative sum
        maxlen = 0  # Variable to keep track of the maximum length of subarray
        myDict[eleSum] = -1  # Initialize the dictionary with sum 0 at index -1

        for i in range(len(nums)):
            # If the element is 0, subtract 1 from the sum; otherwise, add 1 to the sum
            if nums[i] == 0:
                eleSum -= 1
            else:
                eleSum += 1

            # If the sum is already in the dictionary, we have a subarray with an equal number of 0s and 1s
            if eleSum in myDict:
                # Update the maximum length
                maxlen = max(maxlen, i - myDict[eleSum]) 
            else:
                myDict[eleSum] = i  # Store the sum with its corresponding index

        return maxlen 
