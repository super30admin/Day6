/**
 * Time Complexity - O(n) -n length of string
 * Space Complexity - O(1)
 * LeetCode -  yes
 */

class LongestPalindrome{
    public int longestPalindrome(String s) {

        int[] arr = new int[128];
        int count=0;
        for(char c : s.toCharArray()){
            arr[c]++;
            if(arr[c] % 2==0){
                count+=2;
                arr[c]=0;
            }
        }

        return count == s.length() ? count : count+1;
    }
}