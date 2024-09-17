//time complexity: O(n)
//space complexity: O(1)

public class LongestPalindrome {
        public int longestPalindrome(String s) {
            int count = 0;
            HashSet<Character> set = new HashSet<Character>();
            for (int i = 0; i < s.length(); i ++) {
                char c = s.charAt(i);
                //Check if the char already exists in the set
                if (set.contains(c)) {
                    // remove it
                    set.remove(c);
                    // increament the counter by 2
                    count += 2;
                }
                else {
                // if doesn't contain , add it in the set
                    set.add(c);
                }
            }
            //check if the set is not empty
            if (set.size() > 0) {
                count ++;
            }
            return count;
        }
  }
