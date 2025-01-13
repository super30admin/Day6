'''
Approach:

1. Store alphabets asnd their count in a dictionary
    Eg: {a: count(a)}
2. Sum up all the alpabets that have "even" count
3. For alphabets with "odd" count, sum "odd-count-1" into even count
4. Return even-count + 1 if odd-count != 0; else return even-count

Time Complexity:
1. Iterating the entire list , so 0(n) where n is the size of list
2. Iterating the entire dictionary , so 0(m) where m is the number of keys in list
Time Complexity 0(n)+0(m) 


'''


class Solution:
    def longestPalindrome(self, s: str) -> int:
        
        # store the count of alphabets in a dictionary
        alphabetsCount = {}
        
        # convert str to list
        str = list(s)
        
        #print('List str is:\t',str)
        
        for a in str:
            if a not in alphabetsCount:
                alphabetsCount[a] = 1
            else:
                alphabetsCount[a] = alphabetsCount[a] +1
        
        print('Dictionary is:\t',alphabetsCount)
        
        oddCount = 0 # it should remain odd
        evenCount = 0
        
        # Iterate through the dictionary
        for alphabet in alphabetsCount:
            if alphabetsCount[alphabet] % 2 == 0:
                evenCount += alphabetsCount[alphabet]
            
            else:
                evenCount += alphabetsCount[alphabet]-1 # if a count is 41, 40 can be equally divided on lhs and rhs, only 1 a needs to be kept in middle
                oddCount += 1
                
        print('Even Count is:\t',evenCount)
        print('Odd Count is:\t',oddCount)
        
        if oddCount != 0:
            return (evenCount+1)
        else:
            return (evenCount)
        