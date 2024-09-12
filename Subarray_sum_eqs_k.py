#Time Complexity - O(n)
#Space Complexity - O(n)
#Successfully compiled and run on Leetcode


class Solution:
    def subarraySum(self, nums: List[int], k: int) -> int:

        currsum = 0
        count = 0

        hashmap = {}

        hashmap[0] = 1  # init of hashmap

        for i in nums:
            currsum += i #first increment current sum
            cumvsum = currsum - k #then find running sum

            if cumvsum in hashmap: #if running sum exists in hashmap, then we have found the subarray
                count += hashmap[cumvsum] # so we increment count

            if currsum in hashmap: #if current sum exists then increment its existence in hashmap by 1
                hashmap[currsum] += 1
            else:
                hashmap[currsum] = 1 #else init with 1

        return count
