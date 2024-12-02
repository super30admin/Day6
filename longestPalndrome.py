# TC: O(n)
# SC: O(1) as characters in the string ranges in constant len of size 52

def longestPalindrome(self, s: str) -> int:
        hset = set()
        count = 0
        
        for i in s:
            if i not in hset:
                hset.add(i)
            else:
                count+= 2
                hset.remove(i)
        if len(hset)>0:
            count += 1
        return count
