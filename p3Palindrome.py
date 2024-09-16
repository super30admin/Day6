 """"
Given a string s which consists of lowercase or uppercase letters, return the length of the longest palindrome that can be built with those letters.

Letters are case sensitive, for example, "Aa" is not considered a palindrome here.


Example 1:

Input: s = "abccccdd"
Output: 7
Explanation:
One longest palindrome that can be built is "dccaccd", whose length is 7.


Note) The set 'ss' defined above stores the count of unique letters that have odd counts. 
 So, for an array [b, e, d, d, b, b] it would store b and e as they have odd counts.

Why?
The main intention is to count one for all odd count letters 
    after accounting for the even pairs in them if any. For example in [b, e, d, d, b, b]
    we know that for b and e only one count should be taken after accounting for the pair 
    'bb' for 'b'. This is because it doesn't make any difference in the final answer whether
    you have b or e in the middle('bdedb' or 'bdbdb' returns 5). Hope this clears some
    confusion.

ii) Finally, if there are no odd count letters present we want to count all even values 
for the counts(which is basically the length of the given array) as the final answer. 
Otherwise, we would need to adjust for the extra odd counts that we are doing when we are 
counting all the values by removing the count of all distinct odd letters and then counting 
1 for them.
 
Complexity:
Time:O(n)
Space: O(n) hash can be oN in the worst case


 """  
   
class Solution(object):
    def longestPalindrome(self, s):
        """
        :type s: str
        :rtype: int
        """
        hash = set()
        for c in s:
            if c not in hash:
                hash.add(c)
            else:
                hash.remove(c)
        # len(hash) is the number of the odd letters
        return len(s) - len(hash) + 1 if len(hash) > 0 else len(s)