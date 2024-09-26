#// Time Complexity : O(n)
#// Space Complexity : O(n) using a hashmap of unknown size
#// Did this code successfully run on Leetcode : yes
#// Any problem you faced while coding this : none
#
#
#// Your code here along with comments explaining your approach
# count = 0
# hashmap = new Map()
# for each letter in string
#   if hashmap.has(letter)
#     remove letter from hashmap
#     count += 2
#   else
#     hashmap.set(letter)
#
# return hashmap.isEmpty() ? count : count + 1

longestPalindrome = (s) ->
  count = 0
  hashmap = new Map()

  s.split('').map (letter, index) ->
    if hashmap.has(letter)
      hashmap.delete(letter)
      count += 2
    else
      hashmap.set(letter)

  return count if hashmap.size == 0
  return count + 1

#longestPalindrome('abccccdd')
