class Solution:
    def subarraySum(self, nums: List[int], k: int) -> int:
        '''O(n) time complexity
            O(n) space complexity'''
        hash_map={0:1}
        sum=0
        count=0
        
        for i in range(len(nums)):
            #find running sum
            sum=sum+nums[i]
            #check if running sum minus k already exists in hashmap
            if sum-k in hash_map:
                count=count+hash_map[sum-k]
            #check if sum exists in hashmap
            if sum not in hash_map:
                hash_map[sum]=0
            #increase count of sum by 1
            hash_map[sum]=hash_map[sum]+1
        return count
                