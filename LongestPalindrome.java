// Time Complexity : O(n) where n is the length of array
// Space Complexity : O(n) where n is the length of array
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : 

class LongestPalindrome {
    public int LongestPalindrome(String s) {
        Set<Character> set = new HashSet();
        int res = 0;
        
        //StringBuilder sb = new StringBuilder();
        
        for(int i=0;i< s.length();i++){
            char c = s.charAt(i);
            if(set.contains(c)){
                res+=2;
                //sb.append(s.charAt(i));
                set.remove(c);
            }else{
                set.add(c);
            }
        }
        
        /*
        StringBuilder ans = new StringBuilder(sb);
        StringBuilder rev = sb.reverse();
        if(!set.isEmpty()) ans.append(set.iterator().next());
        ans.append(rev);
        System.out.println(ans);
        */
        return set.isEmpty() ? res : res+1;
    }
}