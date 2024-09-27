"""
https://leetcode.com/problems/longest-palindrome/
Given a string s which consists of lowercase or uppercase letters,
return the length of the longest palindrome that can be built with those letters.
Letters are case sensitive, for example, "Aa" is not considered a palindrome here.
:return

Approach we will make the hashmap, the we iterate over the keys which are having more than 1 values,
We can take out those keys one by one.
Time Complexity- O(n)
Space Complexity- O(n)
"""


class Solution:
    def longestPalindrome(self, s: str) -> int:
        if len(s)==0 or s==None:
            return 0
        count = 0
        hashset=set()
        for character in s:
            if character in hashset:
                count+=2
                hashset.remove(character)
            else:
                hashset.add(character)
        if not len(hashset)==0:
            count+=1
        return count

        # for character in s:
        #     if not character in hashmap.keys():
        #         hashmap[character]=1
        #     else:
        #         hashmap[character]+=1
        #
        # for key in hashmap:
        #     if hashmap.get(key)>1:
        #         if hashmap[key]%2==0:
        #             count+=hashmap[key]
        #             # hashmap.pop(key)
        #         else:
        #             count+=hashmap[key]-1
        #
        #     if hashmap.get(key)==1 and flag==False:
        #         count+=1
        #         flag=True


        # print("the longest palindrome is", count)
        # return hashmap


s="ccc"
solve=Solution()
print(solve.longestPalindrome(s))