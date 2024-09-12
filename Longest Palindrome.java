// Time Complexity : O(n)
// Space Complexity : O(#unique chars)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : no

// Your code here along with comments explaining your approach
//iterate over string add char to hashset if not exists, else remove and count+= 2
//in the end if set not empty can use 1 char, count+=1
//return count

class Solution {
    public int longestPalindrome(String s) {
        //base case
        if(s==null || s.length()==0)
            return 0;
        
        //initialize count, hashset
        int count=0;
        HashSet<Character> set = new HashSet<>();
        
        //iterate over string add char to hashset if not exists, else remove and count+= 2
        for(char ch : s.toCharArray()){
            if(!set.contains(ch))
                set.add(ch);
            else{
                set.remove(ch);
                count += 2;
            }
        }
        
        //in the end if set not empty can use 1 char, count+=1
        if(!set.isEmpty())
            count += 1; 
        
        //return count
        return count;
    }
}