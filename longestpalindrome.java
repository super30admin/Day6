// Time Complexity : o(n)
// Space Complexity : o(1)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : no


// Your code here along with comments explaining your approach

class Solution {
    public int longestPalindrome(String s) {
        HashSet<Character> hset = new HashSet<>();
        int count =0;
        
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(!hset.contains(c)){
                hset.add(c);
            }else{
                hset.remove(c);
                count = count+2;
            }
        }
        
        if(hset.isEmpty()){
            return count;
        }else{
            return count + 1;
        }
    }
}

MY APPROACH:

Here we are using hashes we will be traversing string and key is if we will found two same letter in string count is 2 so first found a add a again found remove a and make count 2 some letters which are not repeated will be there so check if hashset is empty return count otherwise count +1
