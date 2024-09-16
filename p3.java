// TC : O(n)
// SC : O(1)

// Approach: Take all the even numbered characters and for odd leave one char and take everything.

class Solution {
  public int longestPalindrome(String s) {
    HashMap<Character, Integer> map = new HashMap<>();
    for(int i=0; i<s.length(); i++) {
      char ch = s.charAt(i);
      map.put(ch, map.getOrDefault(ch,0)+1);
    }
    boolean flag = false;
    int ans = 0;
    for(int val: map.values()) {
      if(val%2 == 0)
        ans = ans + val;
      else if(val%2 != 0) {
        if(!flag) {
          ans = ans + val;
          flag = true;
        }

        else {
          ans = ans + val - 1;
        }

      }
    }
    return ans;


  }
}