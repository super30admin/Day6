
//hashmap solution
// class Solution {
//     public int longestPalindrome(String s) {
//       if(s == null || s.length() == 0) return -1;

//       HashMap<Character, Integer> map = new HashMap<>();

//       int count = 0;
//       boolean flag = false;
//       for(char c : s.toCharArray()){//O(n)
//         map.put(c, map.getOrDefault(c, 0)+1);
//       }

//       for(char c : map.keySet()){//constant because of 26 caharacter sc- O(1)
//         int freq = map.get(c);
//         if(freq % 2 == 0){
//             count += freq;
//         }else{
//             count += freq -1;
//             flag = true;
//         }
//       }
//       if(flag){
//         count += 1;
//       }
//       return count;
//     }
// }



//hashset solution
class Solution {
    public int longestPalindrome(String s) {
      if(s == null || s.length() == 0) return -1;

      HashSet<Character> set = new HashSet<>();

      int count = 0;
      
      for(char c : s.toCharArray()){//O(n)
        if(set.contains(c)){
            count += 2;
            set.remove(c);
        }else{
            set.add(c);
        }
      }

      if(set.size() > 0){
        count += 1;
      }
      return count;
    }
}