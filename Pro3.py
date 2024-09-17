class Solution:
    def longestPalindrome(self, s: str) -> int:
        
        store_dic = dict()
        for single_str in s:
            if single_str in store_dic:
                del store_dic[single_str]
            else:
                store_dic[single_str] = 1

        if len(store_dic) == 0:
            return len(s) - len(store_dic)
        else:
            return len(s) - len(store_dic) + 1