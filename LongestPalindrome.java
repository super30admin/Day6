//time - O(n)
//space - O(1)

class Solution {
    public int longestPalindrome(String s) {
        boolean[] support = new boolean[128];
        int result = 0;
        for(int i = 0; i < s.length(); i++)
        {
            if(support[s.charAt(i)])
            {
                result += 2; //alreay this char is seen and we are seeing it again, so add both to result
                support[s.charAt(i)] = false;; //remove the prev occurence so its not counted again
            }
            else
            {
                support[s.charAt(i)] = true; //we are seeing this for the first time
            }
        }
        for(int i = 0; i < 128; i++)
        {
            if(support[i]) // if anny other char char has been seen only once then add one such to result
            {
                result += 1;
                break;
            }
        }
        return result;
     }
}
