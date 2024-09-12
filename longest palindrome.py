# TC-O(n)
# SC-O(n)
# implementing using hashmap and hashset
class Solution:
    def longestPalindrome(self, s: str) -> int:
        # hash1={}
        # count=0
        # for i in range(len(s)):
        #     if s[i] not in hash1:
        #         hash1[s[i]]=1
        #     else:
        #         hash1[s[i]]+=1
        #     if hash1[s[i]]==2:
        #         count+=2
        #         hash1[s[i]]=0
        # for i in range(len(s)):
        #     if hash1[s[i]]==1:
        #         count+=1
        #         break
        # return count
            hashset = set()
            count=0
            for i in range(len(s)):
                if s[i] in hashset:
                    hashset.remove(s[i])
                    count+=2
                else:
                    hashset.add(s[i])
            if len(hashset)!=0:
                count+=1
            return count