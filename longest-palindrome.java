//Time Complexity: O(n), n is the number of characters in the string
//time complexity: O(1), because string has only upper/lower case so n will be 26 at max, so its constant
//running on leetcode: yes
//can be solved with hashmap also
class Solution {
    public int longestPalindrome(String s) {
        //base case
        if (s==null || s.length()==0)
            {
                return 0;
            }
        int count=0;
        //make a hashset
        HashSet<Character> st = new HashSet<>();
        for (int i=0; i < s.length(); i++)
        {
            //traverse the string and get each character
            char c = s.charAt(i);
            //char not present in hashset, add it to hashset
            if (!st.contains(c))
            {
                st.add(c);
            }
            else
            {
                //char present in the hashset, increase count by 2 and remove character from string
                count = count+2;
                st.remove(c);
            }
        }
        if (st.isEmpty() || st==null)
        {
            return count;
        }
        else//string not empty, one odd character which is remaining in the string can be added to the palindrome
        {
            return count+1;
        }   
    }
}
