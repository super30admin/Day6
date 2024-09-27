// Time Complexity : O(n)
// Space Complexity : O(n) but technically is O(1) since we can have atmost 52 characters(uppercase and lowercase) in hashSet
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach
//palindromes can have pairs and atmost one solo element.
//Add chars to hashSet, if already present then remove them and add 2 to the count. (pairs)
//At the end, check whether the hashSet is empty, if not then add 1 to the count.(solo)
class Solution {
    public int longestPalindrome(String s) {
        
        HashSet<Character> hashSet = new HashSet<>();
        int count = 0;
        
        for(int i=0;i<s.length(); i++){
            char ch = s.charAt(i);
            if(hashSet.contains(ch)){
                count+=2;
                hashSet.remove(ch);
                
            }
            else{
                hashSet.add(ch);
            }
            
            
        }
        if(!(hashSet.isEmpty())){
            count+=1;
        }
        return count;
    }
}