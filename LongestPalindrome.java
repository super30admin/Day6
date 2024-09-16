//Time Complexity: O(N)
//Space Complexity: O(1)
class Solution {
    public int longestPalindrome(String s) {
        HashSet<Character> hashSet = new HashSet<>();
        char[] ch = s.toCharArray();
        int count = 0;



        for(int i = 0; i < ch.length; i++)
        {

            if(hashSet.contains(ch[i])){ hashSet.remove(ch[i]); count += 2;}

            else hashSet.add(ch[i]);
        }
        if(!hashSet.isEmpty()) count++;

        return count;

    }   }