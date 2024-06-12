# SC -O(1)
# TC -O(1)
class Solution:
    def longestPalindrome(self, s: str) -> int:
        count=0
        
        values=set()
        
        for i in s:
            if i in values:
                count=count+2
                values.remove(i)
            else:
                values.add(i)
        if len(values)>0:       
            count =count+1
        return count
		
		
		
# SC -O(1)
# TC -O(n)
class Solution:
    def findMaxLength(self, nums: List[int]) -> int:
        
        if (not nums) or (len(nums)==0): return 0
    
        length=0
        rs=0
        hashmap={0:-1}

        for index in range(0,len(nums)):
            if nums[index] ==0:
                rs=rs-1
            else:
                rs=rs+1

            if rs in hashmap.keys():
                length = max(length,index-hashmap[rs])
            else:
                hashmap[rs]=index
        return length