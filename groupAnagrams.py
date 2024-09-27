#Leetcode Problem: 49
#key is sorted string and words are mapped to sorted string(key)
class Solution:
    def groupAnagrams(self, strs):
        anagrams=defaultdict(list)
        for i in strs:
            anagrams[tuple(sorted(i))].append(i)
        result=[]
        for k,v in anagrams.items():
            result.append(v)
        return result  

#TC: O(n klog k)  where n is total number of strings in list and k is avg length of a string
#SC: O(n)

#We can solve this by using prime numbers as well i.e. by assigning prime numbers to each letter and doing multiplication
#and putting it as key. this will take O(n*k)