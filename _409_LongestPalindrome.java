
// space complexity - o(1)
    	//time - o(n)
      //Ran on leeetcode successfully : Yes
      // Problem faced  : No
    	//Approach : count the occurence of each character and based on even and odd count, increase length

class Solution {
    public int longestPalindrome(String s) {

        int[] arr = new int[256];
        for(int i=0; i<s.length(); i++){
            arr[s.charAt(i) - '\0']++;
        }
        int len = 0;
        boolean hasOdd = false;
        for(int i=0; i<256; i++){
            len = len + (arr[i]/2)*2;
            if(!hasOdd && arr[i]%2 != 0 ){
                hasOdd = true;
            }
        }
        if(hasOdd){
            len++;
        }
        return len;
    }
}
