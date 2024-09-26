from collections import defaultdict

class Solution:
    def longestPalindrome(self, s: str) -> int:
        longest,character_frequency=0,defaultdict(int)
        for char_element  in  range(0,len(s)):
            if s[char_element]  in character_frequency.keys():
                character_frequency[s[char_element]]+=1
                if character_frequency[s[char_element]]%2==0:
                        longest+=2
                else:
                    if character_frequency[s[char_element]] % 2 != 0 and char_element == len(s) - 1 and s[char_element]==s[len(s) - 1]:
                        longest += 1
            else:

                print(s[char_element])
                character_frequency[s[char_element]]=1
        if 1 in character_frequency.values():
            longest+=1
        return longest

if __name__ == '__main__':
    s="abccccdd"
    print(Solution().longestPalindrome("aaaa"))


    #space=o(n)
    #time=O(n)