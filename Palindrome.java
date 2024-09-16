//The bruteforce solution time complexity is O(n*n) as we map each character with count as key value pair in hashmap.
//Then the elements whose values are odd are counted to nearest even digit . We use a space of O(n) in this computation.
//In Optimal solution we use hashset whenever a character repeats we increase the count and remove it. This solution takes
//O(n) time compleity and O(n) space complexity.

class Solution {
  public int longestPalindrome(String s) {
    int count = 0;
    HashSet<Character> hs = new HashSet<>();
    if(s.length() == 0)
      return 0;
    else{
      for(int i=0;i<s.length();i++){
        Character letter = s.charAt(i);
        if(hs.contains(letter)){
          hs.remove(letter);
          count += 2;
        }
        else
          hs.add(letter);
      }
      if(hs.isEmpty())
        return count;
      else
        return count+1;
    }


// Bruteforce solution
//         HashMap<Integer,Integer> map = new HashMap<>();
//         int count = 0,max=0;
//         for(int i=0;i<s.length();i++){
//             int key = s.charAt(i);
//             if(map.containsKey(key))
//                 map.put(key, map.get(key) + 1);
//             else
//                map.put(key,1);
//         }

//         for (int e: map.values()) {
//             count += e / 2 * 2;
//             if (count % 2 == 0 && e % 2 == 1)
//                 count++;
//         }

//         return count;
  }

}