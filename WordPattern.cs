// Time Complexity : O(n)
// Space Complexity : O(n)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach
// Take first word and char from pattern
// 	a. If char exists, get value - index
// 	b. Otherwise Add char to hashmap and index as value
// 	c. Add word to hashmap and index as value
// 	d. We are comparing index of pattern char and string word
// 	e. If its different return false;
public bool WordPattern(string pattern, string s) {

    if(String.IsNullOrEmpty(pattern) || String.IsNullOrEmpty(s))
        return false;
    
    var strArray = s.Split(" ");
    if(strArray.Length != s.Length)
        return false;
    
    Dictionary<char, string> sMap = new Dictionary<char, string>();
    Dictionary<string, char> pMap = new Dictionary<string, char>();

    for(int i = 0; i < s.Length; i++)
    {
        char c = s[i];
        string str = strArray[i];
        if(sMap.ContainsKey(c))
        {
            if(sMap[c] != str)
                return false;
        }
        else
            sMap.Add(c, str);
        
        if(pMap.ContainsKey(str))
        {
            if(pMap[str] != c)
                return false;
        }
        else
            pMap.Add(str, c);
    }
    return true;
}
