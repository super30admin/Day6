class Solution:
    def longestPalindrome(self, s: str) -> int:
        
        '''
        Optimized method-
        When getting letter for first time, add letter as key and value as 1
        When getting for the second time, increment count by 2 and delete the letter from dictionary
        Once iterating through all letters of the word is completed, check the length of dictionary.
        If length > 0, then we need to increment count by 1 as we can have only 1 odd character.
        We are taking set since we are dealing only with letters
        
        Time Complexity - O(N)
        Space Complexity - O(1) since dictionary can have atmax 26 or 52 characters
        
        Code accepted on leetcode
        '''
                if s == None:
            return 0
        
        smap=set()
        count = 0
        
        for letter in s:
            if letter in smap:
                count = count + 2
                smap.remove(letter)
            else:
                smap.add(letter)
                
        if len(smap)>0:
            count = count + 1
            
        return count

        '''
        if s == None:
            return 0
        
        smap={}
        count = 0
        
        for letter in s:
            if letter in smap:
                if smap[letter]==1:
                    count = count + 2
                    smap.pop(letter)
                else:
                    smap[letter]=smap[letter]+1
            else:
                smap[letter]=1
                
        if len(smap)>0:
            count = count + 1
            
        return count
              '''  
        
        '''
        # Brute Force
        if s == None:
            return 0
        
        count = 0
        odd_count=0
        odd=0
        smap = {}
        
        for letter in s:
            if letter in smap:
                smap[letter]=smap[letter]+1
            
            else:
                smap[letter]=1
        
        for i in smap:
            if smap[i]%2==0:
                count=count+smap[i]
            else:
                if(smap[i]>1):
                    odd_count=odd_count+2*(smap[i]//2)
                odd = 1
        if odd == 1:
            result=count+odd_count+1
        else:
            result=count+odd_count
        
        return (result) # i-9 j-7 k-5
        '''
        
                
        