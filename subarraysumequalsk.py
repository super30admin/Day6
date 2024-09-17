class Solution(object):
    def subarraySum(self, nums, k):
        """
        :type nums: List[int]
        :type k: int
        :rtype: int
        """

        #using map to store the previous rsums which we have got and then after finding the new one we will be searching for the one which will be formed by complimenting this sum from k (if that exists that means we have got the subarray
        #so increase count accordingly by hmap[copliment] times , else we will only store the value of this new sum in the map.
        #O(N)
        #O(N)
        
        if not nums:
            return 0
        mp={}
        count=0
        rsum=0
        #1st entry >> 0 has occured 1 time
        mp[0]=1
        for i in (nums):
            #maintain rsum
            rsum+=i
            #find extra value from rsum by (rsum-k)
            compliment=rsum-k
            #check if value is present in map, then increase count by how many times it is present
            if compliment in mp:
                count+=mp[compliment]
            #maintain map if rsum occurence changes
            mp[rsum]=mp.get(rsum,0)+1
        return count
            