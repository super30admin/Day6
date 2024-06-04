/**
 Approach: Using HashSet to store the value to find its repeated occurrence

 Working:
     Have counter to return length out the palindrome
     Iterate through the string length
         if char is present in the set then it's a repeated occurrence,
         increment counter by 2// which will form an even length palindrome
         remove the char form the set
         else Add the char in the set if value is not present,

     finally check if the set is empty after iterating to the string length
     if set is not empty, it contains odd chars
     just increment counter by 1 // so it form a odd length palindrome

 Time Complexity: O(n)
 Space Complexity: O(1) //as the maximum range of a string can go upto 26 chars which is much less than the limit provided as the length of the string

 */

class LongestPalindrome {
    public int longestPalindrome(String s) {

        if(s == null || s.length() == 0){
            return 0;
        }

        HashSet<Character> set = new HashSet<>();
        int count = 0;
        for(int i=0;i<s.length(); i++) {

            char c= s.charAt(i);

            //if char already present in set, it stats the the character is seen for the second time, so we add the even count to the existing count, so it form and even length palindrome
            if(set.contains(c)) {
                count+=2;
                set.remove(c);
            }
            else{
                set.add(c);
            }
        }

        //if the set id not empty finally, the we have n odd number characters, so we and add one character from it to make it an odd length palindrome
        if(!set.isEmpty()) {
            count+=1;
        }

        return count;

    }
}
