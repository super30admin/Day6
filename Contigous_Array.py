#Time Complexity - O(n)
#Space Complexity - O(n)
#Successfully compiled and run on Leetcode


class Solution:
    def findMaxLength(self, nums: List[int]) -> int:
        currsum = 0
        maxi = 0

        hm = {}
        hm[0] = -1 # init of hashmap

        for i in range(len(nums)):
            if (nums[i] == 0): #if num is 1 = init with -1 or num is 0 = init with 1
                currsum += 1
            else:
                currsum -= 1

            if currsum in hm: # check if running sum exists
                end = i
                start = hm[currsum]

                maxi = max(maxi, (end - start)) # then calcuate the difference in its first seen index and current index
                # maxi will have max length of contigous array
            else:
                hm[currsum] = i #else just add the entry into hashmap

        return maxi