//o(n)
class Solution {
    public int longestPalindrome(String s) {
        int res = 0;
        boolean flag = false;
        if(s.length() == 1){
            return 1;
        }
        HashMap<Character, Integer> map = new HashMap();
        for(char c : s.toCharArray()){
            if(map.containsKey(c)){
                map.put(c, map.get(c)+1);
            }
            else{
                map.put(c, 1);
            }
        }
        for(int i : map.values()){
            if((i & 1) == 1){
                res += i-1;
                flag = true;
            }
            else{
                res += i;
            }
        }
        if(flag){
            res += 1;
        }
        return res;
    }
}
