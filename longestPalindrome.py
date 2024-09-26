class Solution:
    def longestPalindrome(self, s: str) -> int:
        '''
        Algorithm:
        Add all the even occurences and 
        add one element from the odd occurence. 
        T = O(N)
        S = O(N)
        '''
        len_of_longest_palindrome = 0 
        count_dict = collections.defaultdict(int)
        flag = False
        for i in s:
            count_dict[i] += 1
            
        for i in count_dict:
            if count_dict[i] %2 == 0:
                len_of_longest_palindrome += count_dict[i]
            else:
                len_of_longest_palindrome += count_dict[i] - 1
                if not flag:
                    len_of_longest_palindrome += 1 
                    flag = True
        return len_of_longest_palindrome 
    
    
