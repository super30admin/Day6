class Solution {
    public int longestPalindrome(String s) {
        int[] count = new int[128];
    for (char c : s.toCharArray()) {
        count[c]++;
    }
    int length = 0;
    boolean hasOdd = false;
    for (int n : count) {
        if (n % 2 == 0) {
            length += n;
        } else {
            length += n - 1;
            hasOdd = true;
        }
    }
    return hasOdd ? length + 1 : length;
    }
}

//Python
/*
class Solution:
    def longestPalindrome(self, s: str) -> int:
        chars={}
        for char in s:
            if char not in chars:
                chars[char] = 1
            else:
                chars[char] += 1

        result = 0
        odd = 0

        if len(chars) == 1:
            return chars[s[0]]

        for i in chars.values():
            if i > 1:
                if i % 2 == 0:
                    result += i
                else:
                    result += i-1
                    odd += 1
            else:
                odd += 1

        if odd > 0:
            result += 1

        return result
        
        */
