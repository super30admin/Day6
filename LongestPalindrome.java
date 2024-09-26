// Time Complexity : O(N)
// Space Complexity : O(N)
// Did this code successfully run on Leetcode : Yes.
// Any problem you faced while coding this : Nope.


// Your code here along with comments explaining your approach
class LongestPalindrome {
    public int longestPalindrome(String s) {
        int arr[] = new int[256];
        for(char ch : s.toCharArray()){
            arr[ch]++;
        }
        int ans = 0;
        boolean exists = false;
        for(int count : arr){
            if(count % 2 == 0){
             ans += count;   
            }
            else{
                exists = true;
                ans += count - 1;
            }
        }
    return exists?ans+1:ans;
    }
}