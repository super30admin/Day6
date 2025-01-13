'''
Find the length of longest pallindrome
LeetCode: https://leetcode.com/problems/longest-palindrome/

Additional: return the longest pallindrome
'''

class Solution:
    def __init__(self):
        
        self.length = 0
        
        self.frontStack = []
        self.mid = None
        self.backStack = []
        
        
    def getSolution(self,inputString):
        
        # Create inputString dictionary
        dict = {}
        
        # Iterate the list inputString
        for i in range(0,len(inputString)):
            
            if inputString[i] not in dict:
                dict[inputString[i]] = 1
            
            else:
                self.frontStack.append(inputString[i])
                self.backStack.append(inputString[i])
                del dict[inputString[i]]
                
                self.length +=2
        
        # Check if we need inputString mid here
        for alpha in dict:
            self.mid = alpha
            self.length+=1
            break
        
        # pop from backStack and push into frontStack
        while len(self.backStack)!=0:
            self.frontStack.append(self.backStack.pop())
            continue
        
        # Print the pallindrome
        print('Longest Pallindrome is:\t',self.frontStack)
        print('Length of longest pallindrome is:\t',self.length)
        
sol = Solution()
sol.getSolution("bbabcdddedef")