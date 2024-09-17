// Longest Palindrome

// Time-Complexity- O(n) 
// Space Complexity-O(52)that is O(1) - creating a hashset to keep track of the characters max would be 52 since our program statements says lowercase and uppercase are allowed
// passed test cases on leetcode-yes
// faced problem-no

class LongestPali {
    public int longestPalindrome(String s) {
        Set<Character> hs=new HashSet<Character>();
        int resultCount=0;
        
        for(char c:s.toCharArray()){
            //if hashset already contains the current character then increment the resultcount by 2 and remove the occurence of the current char
            if(hs.contains(c)){
                //the reason to add resultCount by 2 is, as we already have witnessed the char before.
                  resultCount+=2;
                //removing the current char in the set
                hs.remove(c);
            }
            else hs.add(c);
            
        }
        
        
        
            //if set is empty then all characters have been paired and returning the result
            if(hs.isEmpty()) return resultCount;
            
            //if the set has characters that means they have occured odd number of times and so every present char is left without pairing to any previous of the same char. In a palindrome there can be a case where the mid character present can occur only once, so we can choose anyone of the characters that left unpaired, so incrementing the count by 1 and returning ex:nitin have only 1 t and it is a palindrome, madam have one d and so it is. aaaa is still palindrome.
        
            else return resultCount+1;
        
    }
}
