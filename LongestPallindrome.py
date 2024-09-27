# Time Complexity : O(N) //As it would run N number of time the letters present
#  Space Complexity : O(1) //It would run for 26 letters
#  Did this code successfully run on Leetcode : Yes
#  Any problem you faced while coding this : N/A

#  Your code here along with comments explaining your approach
class Solution:
    def longestPalindrome(self, s: str) -> int:
        hashMap = {}
        
        #storing the repqated value of the letter as value and key as alphabet
        for i in s:
            hashMap[i] = hashMap.get(i, 0) + 1            
        print("hashMap Final", hashMap)
        
        #Define our result varibale and another variable which will handle the single char case
        longLen = 0 
        char = 0
        #Traverse the hashmap and add thos element which have even values
        for i in hashMap:
            if hashMap[i] % 2 == 0:
                longLen = longLen + hashMap[i]
            else:
                longLen = longLen + hashMap[i] - 1 #for case like "ccc", it is pallindrome but it is odd
                char = 1
        return longLen+char