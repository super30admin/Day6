class LongestPalindrom {
  // Time Complexity : O(N)
  // Space Complexity : O(1)
  // Did this code successfully run on Leetcode : Yes
  // Any problem you faced while coding this : had confused in case of odd char of frequency

  static int longest(String s){
    if(s == null || s.length() < 2) return s.length();

    HashSet<Character> hashSet = new HashMap<>();

    int count = 0;
    for(int i = 0; i < s.length(); i++){

      if(hashSet.contains(s.charAt(i))){
        count += 2;
        hashSet.remove(s.charAt(i));
      }else{
        hashSet.add(s.charAt(i));
      }
    }

    if(!hashSet.isEmpty()){
      count +=1;
    }

    return count;
  }

}
