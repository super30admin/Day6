//TimeComplexity - O(N) - N-length of s
//SpaceComplexity - O(1)

class Solution {
  public int longestPalindrome(String s) {
    int result = 0;

    int[] arr = new int[128];

    for(int i=0; i<s.length(); i++){
      char ch = s.charAt(i);
      arr[ch]++;

      if(arr[ch]%2 == 0){
        arr[ch] = 0;
        result = result+2;
      }
    }

    if(result < s.length()){
      result++;
    }

    return result;
  }
}
