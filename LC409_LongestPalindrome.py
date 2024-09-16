"""
We dont need a specific order
Basic approach - find the pairs of characters or take frequency of each character
                 in a dictionary.

We then remove pairs from the dictionary and from the characters still left with freq 1, we can put those in the middle

Time complexity - O(n)
Space Complexity - O(1)

How to approach if we need to return the palindrome as well?
Drawback of strings - they are immutable - concatenation leads to creation of new string under the hood
We need to use a mutable data structure to store the palindrome - we can use an array
and store the elements from first and last index

M2 - string io in python - to use string builder


s = "abbcd"
set () = {}
a --> set {a} count = 0
b --> set {a,b}  count = 0
b --> set {a}   count = 2


"""
s = 'abccccdd'
class Solution:
    def longestPalindrome(self, s: str) -> int:
        count = 0
        store = set()

        list_S = list(s)


        for i in range(len(list_S)):
            if list_S[i] in store:
                count+=2
                store.remove(list_S[i])
            else :
                store.add(list_S[i])

        if len(store)!=0:
            count+=1

        return count

object = Solution()
y = object.longestPalindrome(s)
print(y)
