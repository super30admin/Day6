"Time Complexity of the below code is O(N). This is because we are iterating through every character in the string"
"Space Complexity of the code below is O(1). This is because we are using a dictionary and its length is constant."

#Explanation

"First we get the character frequence and store it in a dictionary"
"Then we iterate through the dictionary and keep adding the freq of the characters depending on if it is even or odd"
"We also have to make sure if there are any left over count, hence we made a bool variable making sure if we have a odd freq"
"If we have a odd freq, we can add 1 length"

class Solution:
    def longestPalindrome(self, s: str) -> int:
        my_dict = {}
        count = 0
        odd_found = False

        for char in s:
            my_dict[char] = my_dict.get(char, 0) + 1

        for key in my_dict:
            value = my_dict.get(key)

            if value % 2 == 0:
                count = count + value
            else:
                count = count + (value-1)
                odd_found = True
        
        if odd_found:
            count = count + 1

        return count


        