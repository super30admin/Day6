// Time Complexity : O(n)
// Space Complexity : O(n)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach
class Solution:
    def longestPalindrome(self, s: str) -> int:
        dataset=set()
        cnt=0
        for i in s:
            if i in dataset:
                cnt+=2
                dataset.remove(i)
            else:
                dataset.add(i)
        if len(dataset)!=0:
            cnt+=1
        return cnt
        
