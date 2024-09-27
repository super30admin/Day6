class Solution:
    def longestPalindrome(self, s: str) -> int:
        #initializing the hashset
        hashmap=collections.defaultdict(int)
        count=0
        for i in range(len(s)):
            #checking condition to check existence of key in hashset
            if(hashmap.get(s[i])==None):
                hashmap[s[i]]==1
            else:
                #if key exists increase count by 2 and remove the key
                count+=2
                print(s[i],count)
                hashmap.pop(s[i])  
        #if hashset is not empty, increase count by 1
        if(hashmap):
                count+=1
        return count