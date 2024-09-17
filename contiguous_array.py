

class Solution:
    def findMaxLength(self, nums: List[int]) -> int:
        '''O(n) Time complexity
            O(n) space complexity'''
        
        hash_map={0:-1}
        sum=0
        max=0
        for i in range(len(nums)):
            #for 0 subtract 1 and for 1 add 1
            if nums[i]==0:
                sum=sum-1
            else:
                sum=sum+1
            
            #store the earliest index where the value of running sum occures in a hashmap
            if sum not in hash_map:
                hash_map[sum]=i
            #check if the current running sum occured before and update maximum accordingly
            #The sum of elements in the subarray which is balanced will be zero
            else:
                length=i-hash_map[sum]
                if length>max:
                    max=length
        return max
                
            