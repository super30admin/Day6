# Time Complexity : O(n)
# Space Complexity : O(1)
# Did this code successfully run on Leetcode : yes
# Any problem you faced while coding this : NO



from collections import defaultdict
class Solution:
    def findMaxLength(self, nums: List[int]) -> int:
        max_len=0
        running_sum=0
        hashmap=defaultdict(int)
        # # for edgecase
        hashmap[0]=(-1)
        print("###", hashmap)
        for i in range(len(nums)):
            if nums[i]==0:
                running_sum-=1
            else:
                running_sum+=1
            # Append dict to check first occuranceto find the total length (from first to current idx)
            if running_sum not in hashmap:
                hashmap[running_sum]=i
            else:
                max_len=max(max_len,i-hashmap[running_sum])
        return (max_len)
                
                
                
            