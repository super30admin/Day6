# Time Complexity : O(n)
# Space Complexity : O(52 characters) = O(1)
# Did this code successfully run on Leetcode :
# Any problem you faced while coding this : Yes
# Your code here along with comments explaining your approach

class Solution:
    def longestPallindrom(self,string):
        if not string or len(string) == 0 :
            return 0 
        count = 0 
        set1 = set()
        for i in range(len(string)):
            if string[i] not in set1 :
                set1.add(string[i])
            else:
                count += 2 
                set1.remove(string[i])
        
        if set1:
            count += 1 
        return count 
        

if __name__ == "__main__":
    s = Solution()
    string = "abccccdd"
    res = s.longestPallindrom(string)
    print(res)