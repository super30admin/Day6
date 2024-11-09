/*
Time Complexity: O(n), where n is the length of the input string.
Space Complexity: O(1), because the set array has a fixed size and does not depend on the input size.

Did this code successfully run on Leetcode : Yes
 */

class LongestPalindromeUsingArray {
    public int longestPalindrome(String s) {

        int count = 0; //to keep a track of length

        /*
        The Problem with ASCII Range Overlap
        When the code uses the expression c - 'A' for indexing the set array, it assumes that only alphabetic characters (uppercase or lowercase) will be present in the string. Let's take a closer look at this calculation:

        Step 1: Index Calculation
        For uppercase letters (A-Z), the ASCII values range from 65 to 90.
        When we subtract the ASCII value of 'A' (which is 65), the result will be a number between 0 and 25.

        Example:
        'A' - 'A' = 0
        'B' - 'A' = 1
        'Z' - 'A' = 25
        For lowercase letters (a-z), the ASCII values range from 97 to 122.
        When we subtract the ASCII value of 'A' (which is 65), the result will be a number between 32 and 57.

        Example:
        'a' - 'A' = 97 - 65 = 32
        'b' - 'A' = 98 - 65 = 33
        'z' - 'A' = 122 - 65 = 57
        So, the calculation c - 'A' will create indices between 0 and 57. This is fine for the current case where we are only
        considering alphabetic characters, but here's the problem:

        Step 2: Overlap with Digits
        If digits were included in the string, their ASCII values (48 to 57) overlap with the ASCII values of lowercase letters (32 to 57).

        For digits (0-9), the ASCII values range from 48 to 57.
        Example:
        '0' - 'A' = 48 - 65 = -17
        '1' - 'A' = 49 - 65 = -16
        ... '9' - 'A' = 57 - 65 = -8
        This results in negative indices when subtracting 'A' from the ASCII values of digits. Negative indices are invalid in Java array indexing,
        which would cause the program to break.

        In the below code, we are assuming only alphabetic characters are present. This is why the mapping c - 'A' works correctly for all the alphabetic characters:

        Uppercase letters are mapped to indices 0 to 25.
        Lowercase letters are mapped to indices 32 to 57.
        Since the code does not account for digits, including digits would lead to invalid index values, as explained.

        So we use 58 as the size
        We are starting form bigger A to smaller z whose ASCII value is form 65 to 122 so we need a size of 122 - 65 which is 57 and +1.
        In between we don't have digits. we just have some 4 to 5 other characters
         */
        char[] set = new char[58];

        for(char c : s.toCharArray())
        {
            /*
            Here we can also use boolean set[c-'A'] = 0; instead of zero put it false and in else, put it as true, above set
            will be a boolean array
            */

            if(set[c-'A'] != 0) { //If c is already present in char array
                count += 2;
                set[c-'A'] = 0;
            }
            else {
                set[c-'A'] = c;
            }
        }

        if(count < s.length()) return count+1;

        return count;
    }
}