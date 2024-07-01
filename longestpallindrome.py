# // Time Complexity : O(n)
# // Space Complexity : O(n) 
# // Did this code successfully run on Leetcode : yes
# // Any problem you faced while coding this : I faced the issues while deciding the odd logic. 


class Solution:
    def longestPalindrome(self, s: str) -> int:
        dicti = Counter(s)
        odd = False
        ans = 0
        for i,j in dicti.items():
            if j % 2 ==0:
                ans += j
            else:
             ans+= j - 1
             odd = True
        if odd:
            ans+= 1

        return ans
    


    # Approach: 
    # 1. Create a dictionary of the string.
    # 2. Iterate over the dictionary and check if the value is even or odd.
    # 3. If the value is even, add the value to the answer.
    # 4. If the value is odd, add the value - 1 to the answer and set a
    # flag to True
    # 5. If the flag is True, add 1 to the answer.