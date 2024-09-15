using System;
using System.Collections.Generic;
using System.Text;

namespace ConsoleApp1
{/*
  * T.C: O(n): as traversing all elements in the pattern
  * S.C: O(n): as we are splitting string into string array and also comparing the strings
  */
    public class WordPattern
    {
        public bool WordPattern(string pattern, string s)
        {
            Dictionary<char, string> pSet = new Dictionary<char, string>();
            Dictionary<string, char> sSet = new Dictionary<string, char>();

            char[] patternArray = pattern.ToCharArray();
            string[] stringArray = s.Split(" ");

            for (int i = 0; i < patternArray.Length; i++)
            {
                if(pSet.ContainsKey(patternArray[i]))
                {
                    if (!pSet[patternArray[i]].Equals(stringArray[i]))
                        return false;
                }
                else
                {
                    pSet.Add(patternArray[i], stringArray[i]);
                }

                if(sSet.ContainsKey(stringArray[i]))
                {
                    if (sSet[stringArray[i]] != patternArray[i])
                            return false;
                }
                else
                {
                    sSet.Add(stringArray[i], patternArray[i]);
                }
            }

        }
        return true;
    }
}
