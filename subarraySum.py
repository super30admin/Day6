class Solution:
    def subarraySum(self, nums: List[int], k: int) -> int:
        # Brute Force time complexity = O(N) and space comp = O(1)
        # ans = 0
        # for i in range(len(nums)):
        #     sum = 0
        #     for j in range(i,len(nums)):
        #         sum += nums[j]
        #         if sum == k:
        #             ans += 1
        # return ans

        count = 0
        rSum = 0
        # Dictionary to store the frequency of running sums
        myDict = {0:1}
        for num in nums:
            rSum += num
            diff = rSum -k # PRefix
            if diff in myDict:
                count += myDict[diff]
            # add running sum as key with it's frequency as value in dictionary
            if rSum in myDict:
                myDict[rSum] += 1
            else:
                myDict[rSum] = 1
        return count



        


        
