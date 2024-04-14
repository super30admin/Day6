// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach
class LongestPalindrome {


    // Approach 1 - using hashmap, where we storing character as key and its frequency as value
    // freq is multiple of 2 then considering it for longest palindrome string
    // freq is odd, adding freq-1 to count and if any odd frequencies encountered setting flag as true.
    // if flag is true, finally incrementing count +1
    public int longestPalindrome(String s) {
        HashMap<Character,Integer> map = new HashMap();
        int count =0;
        boolean flag = false;
        for(char c : s.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        for(char c : map.keySet()) {
            int freq = map.get(c) ;

            if( freq % 2 == 0) {
                count += freq;
            }else {
                flag = true;
                count += freq - 1;
            }
        }

        if(flag) {
            count++;
        }

        return count;
    }

    //Approach 2
   /* public int longestPalindrome(String s) {

        char[] set = new char[60];
        int count = 0;

        for(char c : s.toCharArray()) {
            if(set[c-'A'] != 0) {
                count+=2;
                set[c-'A'] = 0;
            }else {
                set[c-'A'] = c;
            }
        }

        for(int i=0;i<60;i++) {
            if(set[i] != 0) {
                count++;
                break;
            }
        }

        return count;
    }*/
}