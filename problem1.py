#560. Subarray Sum Equals K
#time complexity = O(n)
#space complexity = O(n)
#Algorithm : calculated the running sum for each element and find compliment which is difference between running sum and target value
#2.iterate through the array and see if compliment is in map if yes increment count else add it to map 
#3. return  the count value.
#Ran on Leetcode: Yes
class Solution:
    def subarraySum(self, nums: List[int], k: int) -> int:
        rsum = 0
        x = 0
        count = 0
        mapp = { 0 : 1 }
        for i in range(len(nums)):
            rsum = rsum + nums[i]
            compliment = rsum - k
            if compliment in mapp:
                count = count + mapp.get(compliment)
            if rsum not in mapp:
                mapp[rsum] = 0
            mapp[rsum] = mapp.get(rsum, 0) + 1
        return count