// time - o(n)
// space - constant

class Solution {
    public int longestPalindrome(String s) {

        int len=0;

        HashMap<Character,Integer> map = new HashMap<>();

        for(char c : s.toCharArray()) map.put(c,map.getOrDefault(c,0)+1);

        for(char key : map.keySet())
        {

            if(map.get(key)%2==0)  len += map.get(key);

            else len += map.get(key)-1;

        }

        if(len!=s.length()) len++;

        return len;
    }
}
