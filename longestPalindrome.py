class Solution:
    def longestPalindrome(self, s: str) -> int:
        
        dataStore = set()
        count = 0
        for i in s:
            
            if i not in dataStore:
                dataStore.add(i)
            else:
                dataStore.remove(i)
                count+=2
        
        if dataStore:
            count+=1
        
        return count
                
            
            
#         time complexity is o(n)
#  approach is to add new char to hashmap and pop if repetation is seen and also increase count by 2 in that case. if at the end hashmap is notEmpty, add one to counter
