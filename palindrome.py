# // Time Complexity :O(n)
# // Space Complexity :O(n)
# // Did this code successfully run on Leetcode :yes
# // Any problem you faced while coding this :not sure about space


# // Your code here along with comments explaining your approach




class Solution:
    def longestPalindrome(self, s: str) -> int:
        arr=[False]*100
        count=0
        for i in s:
            # print(i)
            if arr[ord(i)-ord('a')]:
                arr[ord(i)-ord('a')]=False
                count=count+2
                # print(count)
            else:
                arr[ord(i)-ord('a')]=True
        # print(count)
        if True in arr:
            count=count+1
        return count
                
                
        
        