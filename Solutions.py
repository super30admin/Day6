'''
PROBLEM 1

TIME COMPLEXITY: O(N)
SPACE COMPLEXITY: O(N)

- we will traverse the array and keep adding the elements to  a global variable sums, maintiaing the value sums as key and the number of times sums has occured as value in a dictionary
- check if sums-k is in dictionary, if yes increment the count by value of dictionary[sums-k]
- check if sums is in dictionary,if not, add dictionary[sums]=1, otherwise incrememnt the value of dictionary[sums]

'''

class Solution:
    def subarraySum(self, nums: List[int], k: int) -> int:
        dicti={}
        count=0
        sums=0
        dicti[0]=1
        for i in nums:
            sums+=i
            
            if sums-k in dicti:
                count+=dicti[sums-k]
            if sums in dicti:
                dicti[sums]+=1
            else:
                dicti[sums]=1
        return count

'''
PROBLEM 2

TIME COMPLEXITY: O(N)
SPACE COMPLEXITY: O(N)

- traverse through the array, maintaining a global variable sums such that, if element is 1, do sums++ and if element is 0, do sums--
- maintain the value of sums as key and index as value in the dicctionary
- if sums already exists in the dicctionary, update the max variable initially set to 0. ELSE, put value of sums and index in the dictionary

'''
class Solution:
    def findMaxLength(self, nums: List[int]) -> int:
        
        dicti={}
        dicti[0]=-1
        sums=0
        maxi=0
        for i in range(len(nums)):
            
            if nums[i]==0:
                sums-=1
            else:
                sums+=1
            
            if sums in dicti:
                maxi=max(maxi,i-dicti[sums])
            else:
                dicti[sums]=i
            
        return maxi
                
    


'''
PROBLEM 3

TIME COMPLEXITY: O(N)
SPACE COMPLEXITY: O(26)

- traverse the string
- if the current character is already present in hashset, remove it and increment the global variable "count" by 2. If not, add the current character to hashset
- if the hashset is not empty, return count + 1, Else return count

'''

class Solution:
    def longestPalindrome(self, s: str) -> int:
        hashset=set()
        count=0
        for ch in s:
            if ch in hashset:
                hashset.remove(ch)
                count+=2
            else:
                hashset.add(ch)
        if len(hashset)>0:
            return count+1
        else:
            return count