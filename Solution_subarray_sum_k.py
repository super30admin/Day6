"""
Time complexity O(n)
space Complexity  O(n) 

create a dict and give value 0:1 here Key is running sum and value is count 
if rsum-k is in dictionary add their count value . (Find compliment and add that continuous subarray count to the count variable )
if rsum not in dictionary add 1 as value
if rsum is present just increment its value 


"""
class Solution_subarray_sum_k:
    def subarraySum(self, nums: List[int], k: int) -> int:
        if nums is null or len(nums)==0:
            return 0
        sumd={0:1} #running sum:count
        count=0
        rsum=0
        
        for num in nums:
            rsum += num
            
            if rsum-k in sumd:
                count += sumd[rsum-k]
            if rsum in sumd:
                sumd[rsum]+=1
            else:
                sumd[rsum]=1
        
        return count
