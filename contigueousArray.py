# TC: O(n)
# SC: O(n)
# LC: Yes
class Solution:
    def findMaxLength(self, nums: List[int]) -> int:
        #rsum = k : v | rsum : index
        hashmap = dict({0: -1})
        maxnum, rsum, counter = 0, 0, 0
        for num in nums:
            # count running sum
            if num is 0: rsum += -1
            else: rsum += 1
            # if the rsum is already in hashmap
            if rsum in hashmap:
                # max(max, currentIndex - index of prev rsum )
                maxnum = max(maxnum, counter - hashmap[rsum])
            else: hashmap[rsum] = counter
            # increase the counter cuz we got no index
            counter += 1
        return maxnum 