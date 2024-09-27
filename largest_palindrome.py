class Solution:
    def longestPalindrome(self, s: str) -> int:
        my_dict={}
        palindrome_len=0
        large_odd_num=-1

        for char in s:
            if char in my_dict:
                my_dict[char]+=1
            else:
                my_dict[char]=1

        for key in my_dict:
            if my_dict[key]%2==0:
                palindrome_len+= my_dict[key]
            else:
                palindrome_len+= my_dict[key]-1 #taking odd num-1 value to make palindrome
                if my_dict[key]>large_odd_num:
                    large_odd_num = my_dict[key]

        if large_odd_num ==-1:
            return palindrome_len
        else:
            return palindrome_len +1   #returning +1 as we did -1 before


s=Solution()
print(s.longestPalindrome("abccccdd"))