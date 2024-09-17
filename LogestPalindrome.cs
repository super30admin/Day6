// Time Complexity : O(n)
// Space Complexity : O(1), because there are constant character, a-z and A-z, so lenghth of hashet is constant
// Did this code successfully run on Leetcode :
// Any problem you faced while coding this :


// Your code here along with comments explaining your approach
//https://leetcode.com/problems/longest-palindrome

public int LongestPalindrome(string s) {
        
    if(String.IsNullOrEmpty(s))
        return 0;
    
    HashSet<char> set = new HashSet<char>();
    int maxLen = 0;
    
    foreach(char c in s)
    {
        //If charcter is present in hashset
        //It means, this is pair of character presenr in input, then add 2 in maxLen
        //And also remove that character from hashset
        if(set.Contains(c))
        {
            maxLen += 2; 
            set.Remove(c);
        }
        else             //If charcter is not present in hashset, add it to hashset, don’t add anything in maxLen
        {
            set.Add(c);
        }
    }
    
    // check if hashset has any data, just add 1 at end to maxLen without even looking at hasset values inside, because 1 character can be added in middle to make it more longer palindrome.
    if(set.Count > 0)
        maxLen += 1;
    
    return maxLen;
}