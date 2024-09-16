// Time Complexity :
// Space Complexity :
// Did this code successfully run on Leetcode :
// Any problem you faced while coding this :

class Solution {
    public int longestPalindrome(String s) {
        if(s==null || s.length()==0)return 0;
        HashSet<Character> set= new HashSet<>();
        int count = 0;
        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);
            if(set.contains(c)){
                set.remove(c);
                count = count+2;
                
            }else{
                set.add(c);
            }
        }if(!set.isEmpty()){
            count++;
        }return count;
        }
        
    }
