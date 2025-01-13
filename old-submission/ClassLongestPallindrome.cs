namespace LeetCodeSubmission.Hashing2;

public class ClassLongestPallindrome
{
    public int LongestPalindrome(string s)
    {
        int oneCount = 0;
        int totalCount = 0;

        Dictionary<char, int> charCount = new Dictionary<char, int>();

        for (int i = 0; i < s.Length; i++)
        {
            char sChar = s[i];
            if (charCount.ContainsKey(s[i]))
            {
                int prevCount;
                if (charCount.TryGetValue(sChar, out prevCount))
                {
                    // key already exist
                    charCount[sChar] = prevCount + 1;
                }
            }
            else
            {
                // key seen for the first time
                charCount.Add(sChar,1);
            }
        }
        
        // iterate the dictionary
        foreach (KeyValuePair<char, int> pair in charCount)
        {
            if (pair.Value % 2 != 0 && pair.Value != 1)
            {
                // odd value other than 1
                totalCount += pair.Value - 1;
                oneCount += 1;
                continue;
            }
            else if (pair.Value % 2 != 0 && pair.Value == 1)
            {
                // odd value equal to 1
                oneCount += 1;
                continue;
            }
            else
            {
                //even count, just add to the total
                totalCount += pair.Value;
                continue;
            }
        }

        return (totalCount+Math.Min(1,oneCount));
    }
}