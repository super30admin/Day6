import java.util.HashSet;

// Time Complexity : O(n)
// Space Complexity : O(1) -> only  dealing with char which are limited in  number.
// Did this code successfully run on Leetcode : YES
// Any problem you faced while coding this : To find the rowIndex and colIndex.
//approach is to use hashset to store the char and if we find that char is already present in the set we're gonna pop and +2 to the ans as it means there are 2 char of same value and in the end check if the set is not empty then it means there are some single values present in the set we can +1 to the ans.
class Problem2 {
    public int longestPalindrome(String s) {
        if(s== null|| s.length()==0){
            return 0;
        }
        if(s.length()==1){
            return 1;
        }
        HashSet<Character> set = new HashSet<>();
        int cnt = 0;
        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);
            if(set.contains(c)){
                cnt = cnt +2;
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