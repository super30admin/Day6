//Time complexity : O(n)
//Space Complexity : O(1)
// Did the code run in leetcode : yes
class LongestPalindrome {
    public int longestPalindrome(String s) {
        if(s.length() == 1){
            return 1;
        }
        if(s.length() == 0 || s == null){
            return 0;
        }
        int cnt = 0;
        HashSet<Character> set = new HashSet<>();
        for(int i =0 ; i< s.length(); i++){
            char c = s.charAt(i);
            if(set.contains(c)){
                cnt = cnt+2;
                set.remove(c);
            }
            else{
                set.add(c);
            }
        }
        if(!set.isEmpty()){
            cnt++;
        }
        return cnt;
    }
}