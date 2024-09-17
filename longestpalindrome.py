
#time complecity = 0(n)
#Leetcode - Not all test cases are passed

###using hashset####
class Solution:
    def longestPalindrome(self, s: str) -> int:
        #we are creating a set and if the letter is alredy in the set, it means, two letters are present whoch means we can form a palindrome using it.
        #hence we remove the character from the set and increment the count.


        set1=set() # creating a ser
        count=0  #initalising the count to 0
        for char in s:
            if char not in set1: #checking if the character is in ser
                set1.add(char) #if not there, we are adding it to the set
            else:
                set1.remove(char) # if the character is there, we are removing it from the set
                count+=2 #and incrementing the character by 2  (aa
        if set1!= None:
            return count+1
        else:
            return count



    ###using hashmap######


class Solution:
    def longestPalindrome(self, s: str) -> int:
        dict1 = dict()
        count = 0
        flag = None
        for char in s:
            if char not in dict1:
                dict1[char] = 1  # if the char is not in dictionary, add it
            else:
                dict1[char] += 1  # if the char is already in dictionary,increase the value

        for value in dict1.values():
            a = (value // 2)  # if the value is even and we divide it by 2 and add it to count (quotient * 2)
            count = count + (2 * a)
            if value % 2 == 1:  # if the value is odd make the flag as true
                flag = True
        if flag == True:  # if there
            return count + 1
        else:
            return count




