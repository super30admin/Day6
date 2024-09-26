//Time complexity: O(n)
//space complexity: O(n)
//Problem runs on Leetcode

//Approach: Create an array in which the count of each character is maintained. 
//For the count maintained, divide each count by 2 and multiply by 2. Add this value to result.
//If length of string!=result, return result+1(odd case), else return result(even case)


class Solution {
    public int longestPalindrome(String s) {
        final int len = s.length();

       final int size = 128;
       final int[] counts = new int[size];
       for (int i = 0; i < s.length(); i++) {
         counts[s.charAt(i)]++; //count is incremented at the position of the character's ASCII value
    }

      int result = 0;
      for (int i = 0, bound = size; i < size; i++) {
          result += (counts[i] / 2 * 2); //formula for length calculation
    }
      return result == len? result: result + 1;
    }
}
