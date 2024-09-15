# Approach: A palindrome should have even frequencies of characters with or without one odd frequency character at most
# We can use hashsets as they retain the unique values (In python, use set)
# Iterate over the string and check if the character has already occurred -- If yes this will be its next occurrence and we add 2 to count
# Delete the char from set so that we can keep track of subsequent characters of same time
# Time complexity: O(N) where N is the length of the string that we go over to check every of its char
# Space Complexity: O(1) since storing strings/chars is of finite space (26 characters)

def longest_palindrome(string):

    # base-case
    
    if not s:
        return 0

    hashset = set()
    longest_palindrome_length = 0

    for char in string:
        if char in hashset:
            longest_palindrome_length += 2
            hashset.remove(char)

        else:
            # if character not in hashset, add the entry
            hashset.add(char)

    if len(hashset) > 0:
        # case of any single frequency characters
        longest_palindrome_length += 1

    return longest_palindrome_length


