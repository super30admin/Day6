class Solution:
    '''
    Space Complexity: O(n)
    Time Complexity: O(n)
    Missed edge cases
    '''
    def subarraySum(self, nums: List[int], k: int) -> int:
        s=0 # running sum
        x = {0:1}
        c = 0
        for i in nums:
            s = s + i
            if(s-k) in x.keys():
                c+=x[s-k]
            
            if(s in x.keys()):
                x[s] += 1
            else:
                x[s] = 1
            
        return c