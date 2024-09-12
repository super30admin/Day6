// Time Complexity : O(N)
// Space Complexity : O(N)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : no
//

/* Saw a pattern that we can consider all the even frequencies if the chars
  but if freq is 1 then only one such char can be considered also if more than
  one char with odd frequencies then one of them can be taken as complete if
  there is not a single char with freq 1 as the odd one can be in between the
  palindrome.
*/
class LongestPalindrome
{
    public int longestPalindrome(String s)
    {
      if(s.length() == 1) return 1;

      HashMap<Character, Integer> map = new HashMap<>();
      boolean oneTaken = false;
      boolean odd = false;
      int len = s.length();
      int count = 0;

      for(int i = 0; i < len; i++){

          char ch = s.charAt(i);

          if(map.containsKey(ch)){
              int value = map.get(ch);
              map.put(ch, value + 1);
          }
          else{
               map.put(ch,1);
           }
      }


      for(char c : map.keySet())
      {

          int val = map.get(c);

          if(val % 2 == 0)
              count += val;
          else{
              if(val == 1)
              {
                  if(!oneTaken)
                  {
                      count += 1;
                      oneTaken = true;
                  }
                  continue;
              }
              count += val - 1 ;
              odd = true;
          }

      }

     if(odd && !oneTaken) count+=1;

      return count;
    }
}
