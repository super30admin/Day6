# Hashing-2

# Explain your approach in **three sentences only** at top of your code

## Problem1 (https://leetcode.com/problems/subarray-sum-equals-k/)
# Initialize a running summ and increment it with each array element. We will initialize the hashmap
# with value 1 for key 0 when the running sum is 0.
# Check if running sum - K (key) already exists in the hashmap then it means the subarray exists and
# update the final count by count (value) mapped to the running sum (key).
# If the running sum does not exist we will insert in the map or else increment value by 1.

## Problem2 (https://leetcode.com/problems/contiguous-array/)
# Initialize running sum variable, result variable and an hash map to store 1s and 0s where the first
# entry would be -1 for "0" for the edge case that the array is empty.
# Iterate over the array and if we get a "0" we decrement the running sum or when we get "1" we 
# increment the running sum by 1.
# We will look for the running sum as key in the hashmap, if the key does not exist we insert it else
# we will update it by taking the maximum as we need to return the Max length of sub-array.

## Problem3 (https://leetcode.com/problems/longest-palindrome)
# We need to check if the input string is in palindrome, which means it should have the same characters
# when read backward and forward except the pivot character at the center.
# We will use the hashset data structure as it will allow us to get characters and check if pairs form
# If the same character is inside the string we remove the character and increase the result by 2
# If the character does not exist we add it. In case there remains a single or multiple characters we 
# add 1 to the result as we can pick only one char to make it a Palindrome. 
