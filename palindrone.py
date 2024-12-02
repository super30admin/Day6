def longestPalindrome(s: str):
        hashSet=set()
        count=0
        for st in s:
            if st not in hashSet:
                hashSet.add(st)
            else:
                hashSet.remove(st)
                count=count+2
        print(hashSet)
        
        if len(hashSet)==0:
            return count
        else:
            return count+1
#Time complexity==O(N)
#Space Complexity==O(1)