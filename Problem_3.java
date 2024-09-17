// Time: O(n)
// Space: O(n)
class Solution {
    public int longestPalindrome(String s) {
      if(s.length() == 0){
        return 0;
      }
      HashSet<Character> set = new HashSet<>();
      int count = 0;
      
      
      for(int i=0;i<s.length();i++){
        char ch = s.charAt(i);
        if(set.contains(ch)){ // already the character is presetn in hashset, meaning there are atleast 2 occurences of that chracter
          set.remove(ch);
          count += 2;
        }else{
          set.add(ch);
        }
      }
      
      return count = set.isEmpty() ? count : count + 1 ; // if set is empty, all characters had even occurences, else atleast one character occured odd number of times, and only one extra such character can be included
        
    }
}
