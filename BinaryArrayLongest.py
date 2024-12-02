"""
Leetcode - Sucessful
Time Complexity - O(N)  or O(N log n) ?? - pls clarify

The approach here is simple, keep a count variable and a maxarr both set to 0. now traverse through
 the elements, while traversing if 1 occurs add +1 to count , if 0 occurs add -1 to count. if at any
 point counts equals 0 set maxarr to 0. Also keep a hashmap wherein you keep adding the count and index
 values at that particular position. if for a value of count you come across that key in the hashmap,
 we now find the max amoungst the maxarr and the value equal to index at that particular posiition minus
 the value of that count occuring in the hashmap. this way we get our max-sub array.
 
"""

def findMaxLength(self, nums):
    dict1 = {}
    count = 0 
    maxarr = 0
    for i in range(len(nums)):
        if nums[i] == 0:
            count += -1
        else:
            count += 1
        
        if count == 0:
            maxarr = i + 1
        if count in dict1:
            maxarr = max(maxarr,i - dict1[count])
        else:
            dict1[count] = i
    
    return maxarr

