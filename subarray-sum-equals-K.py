#Reference Video: https://youtu.be/bqN9yB0vF08
class Solution:
    def subarraySum(self, nums: List[int], k: int) -> int:
        #brute force
        # count = 0
        # for start in range(len(nums)): 
        #     for end in range(start + 1,len(nums)): 
        #         sum = 0
        #         for i in range(start, end):
        #             sum += nums[i]
        #         if sum == k:
        #             count += 1
        # return count
        
        #using dictionary
        count = 0 #to keep count of the sub arrays
        s = 0 #keep track of sum
        dic = {0:1} #dic initialized with s which is zero and occured once
        
        for num in nums:
            #keep adding num to the sum
            s += num
            #if the difference exists in the dictionary, add the value of difference in dictionary to count
            if s-k in dic:
                count += dic[s-k]
            #If the sum exists in the dic, increase the value by 1
            if s in dic:
                dic[s] += 1
            else:
                #If the sum does not exist in the dic, add it to dic with count as value
                dic[s] = 1
                
        return count
        
                 