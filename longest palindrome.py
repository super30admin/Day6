# // Time Complexity : O(n)
# // Space Complexity : O(1) - Since we are storing at max 26 chars
# // Did this code successfully run on Leetcode : Yes
# // Any problem you faced while coding this : No


# // Your code here along with comments explaining your approach
# Sol 1 : Using Hashmap
# we store the number of ocurances of the chars 
# if its even we add it to count
# if its odd we add value - 1 to count
# finaly we add 1 if there was odd in map

# Sol 2: Using Hashset
# for each char we add to set or remove from set 
# add if not there in set and remove if there
# while removing we increase the count
# finally if set is not empty add one to the count

class Solution:
    def longestPalindrome(self, s: str) -> int:

        ele = {}
        flag = False
        count = 0
        
        for i in s:
            if i in ele:
                ele[i]+=1
            else:
                ele[i] = 1
        for j in ele:
            if ele[j]%2 == 0:
                count += ele[j]
            else:
                count = count + ele[j]-1
                flag = True
        if flag:
            count +=1
        
        return count
        
        
        
#         elements = set()
#         count = 0
        
#         for i in s:
#             if i in elements:
#                 count +=2
#                 elements.remove(i)
#             else:
#                 elements.add(i)
#         if len(elements)>0:
#             count +=1
        
#         return count 
                            