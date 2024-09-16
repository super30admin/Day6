class Solution:
    def findMaxLength(self, nums: List[int]) -> int:
        '''
        Time Complexity - O(N)
        Space Complexity - O(N) for dictionary
        
        Algorithm:
        Whenever we are getting 1, we are incrementing count by 1 and whenever we are getting 0, 
        we are decrementing count by 1
        For every count as key, we are storing the index at which we are getting that count in the dictionary
        
        Code accepted on leetcode
        '''
        
        if nums == None:
            return 0
        
        count=0
        nmap={}
        nmap[0]=-1
        max_length=0
        
        for i in range(len(nums)):
            
            if nums[i] == 1:
                count=count+1
                
            else:
                count=count-1
                
            if count not in nmap:
                nmap[count]=i
            
            else: 
                max_length=max(max_length,i-nmap[count])
                
        
        return max_length
                
            