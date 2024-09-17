class Solution(object):
    def findMaxLength(self, nums):
        """
            // Time Complexity: O(n)
            // Space Complexity: O(n)
            // Did this code successfully run on Leetcode :
                Yes
            // Any problem you faced while coding this :
                Its a really tricky problem.
            // Your code here along with comments explaining your approach:
                We start with an initial
        """
        """
        !!! IMPORTANT !!! 
        When ever the running sum is zero it means we have come to the same
        point as we started. All zero's and one's have cancelled each other.
        So the max_length will equal till the current nums' index.
        
        if running_sum is > 0 = more 1's
        if running_sum is < 0 = more 0's
        if running_sum is == 0 equal number of 1's and 0's
        """
        # initial running total
        running_sum = 0
        # initial running sum is 0
        # we are index 0 with 0 sum
        # As we are starting from y == 0 in graph. Imagine the graph
        # Key = current_running_sum value
        # Value = index at which we first encountered this running_sum
        # Starting at index 0 and the current running sum is zero
        count_dict = {0: 0}
        # max_length
        max_length = 0
        for index, num in enumerate(nums, 1):  # O(n)
            if num == 0:
                running_sum -= 1
            else:
                running_sum += 1
            if running_sum in count_dict:  # O(1)
                # if we have already seen this sum it means we are back
                # to that same point and the 1's and O's are equal.
                # we can subtract the current index from the index of the
                # index of the first occurance of the same running sum
                max_length = max(max_length, index - count_dict[running_sum])  # O(1)
            else:
                # this is the first time we saw this sum
                count_dict[running_sum] = index  # O(1)
        return max_length


if __name__ == '__main__':
    h = Solution()
    print(f'The length of max contiguous sub array with equal number of 1\'s and zero\'s is \n'
          f'    {h.findMaxLength([0, 0, 0, 0, 1, 1])}')
