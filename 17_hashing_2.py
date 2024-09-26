// Time Complexity :O(n)
// Space Complexity :O(n)
// Did this code successfully run on Leetcode :yes
// Any problem you faced while coding this : used brute force, sum and cummulative methods. and found optimal among them. all good.
// Your code here along with comments explaining your approach
// using running sum and hashmap we can easily keep track of total count.
class Solution:
    def subarraySum(self, nums: List[int], k: int) -> int:
        running_sum = 0
        hash_table = collections.defaultdict(lambda:0)
        total = 0
        for x in nums:
            running_sum += x
            s = running_sum - k
            if s in hash_table:
                total += hash_table[s]
            if running_sum == k:
                total += 1
            hash_table[running_sum] += 1
        return total