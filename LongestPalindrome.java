// Time Complexity: O(n)
// Space Complexity: O(1)
// The program ran successfully on leetcode

class Solution {
    public int longestPalindrome(String s) {
        int[] arr = new int[128];
        int res = 0;
        for(char c: s.toCharArray()) {
            arr[c]++;
            if(arr[c] %2 == 0){
                res += 2;
                arr[c] = 0;
            }
        }
        for(int i : arr){
            if(i>0) {
                return res + 1;
            }
        }
        return res;
    }
}