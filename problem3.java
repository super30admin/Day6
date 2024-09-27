/* 

Time Complexity: O(N) 

Passed All Test Cases 

Solution: We use HashSet to keep track of the elements and if there exits duplicates, we increase the count by 2 since it is valid for palindrome. 
We add 1 to the count if there exists any single frequency character, since we can always use them in palindrome. 


*/ 


class Solution {
    public int longestPalindrome(String s) {
        //edge case 
        if (s.length() == 0 || s == null) return 0 ; 
        int count = 0 ; 
        
        //using hashset 
        Set<Character> set = new HashSet<>() ; 
        
        for (int i = 0 ; i < s.length() ; i++) {
            char c = s.charAt(i) ; 
            if (!set.contains(c))
                set.add(c) ; 
            else {
                count += 2 ; 
                set.remove(c) ; 
            }
        }
        if (!set.isEmpty())
            return (count + 1) ; 
        else
            return count ; 
    }
}