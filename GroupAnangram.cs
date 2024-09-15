using System;
using System.Collections.Generic;
using System.Text;

namespace ConsoleApp1
{
    public class GroupAnangram
    {
        /*
         * T.C: O(nkLogk) k is average string length in array and since we are sorting string which contribute klogk and traversing whole array which is n times
         * S.C: O(nk) n is the list of string storing in hashmap and k is average length of string
         */
        public IList<IList<string>> GroupAnagrams(string[] strs)
        {
            List<IList<string>> anagramString = new List<IList<string>>();
            Dictionary<string, List<string>> anagrams = new Dictionary<string, List<string>>();

            foreach (var str in strs)
            {
                char[] charArray = str.ToCharArray();
                Array.Sort(charArray);
                string strSorted = new string(charArray);

                if (!anagrams.ContainsKey(strSorted))
                {
                    anagrams.Add(strSorted, new List<string>());
                }

                anagrams[strSorted].Add(str);
            }

            foreach (var item in anagrams)
            {
                anagramString.Add(item.Value);
            }

           
            return anagramString;
        }


        /*
         * T.C : O(nk) where n is number of items in array and k is average lenght of strings in array
         * S.C: O(nk) we are using hashmap which saves all the string.
         */

        public IList<IList<string>> GroupAnagrams1(string[] strs)
        {
            Dictionary<double, List<string>> anagrams = new Dictionary<double, List<string>>();
            List<IList<string>> anagramString = new List<IList<string>>();

            foreach (var str in strs)
            {
                double product = GetProduct(str);
                if (!anagrams.ContainsKey(product))
                {
                    anagrams.Add(product, new List<string>());
                }
                anagrams[product].Add(str);
            }


            foreach (var item in anagrams)
            {
                anagramString.Add(item.Value);
            }

            return anagramString;
        }

        private double  GetProduct(string str)
        {
            int[] primNumbers = new int[] { 2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97 };
            char[] charArray = str.ToCharArray();
            double product = 1;

            for (int i = 0; i < charArray.Length; i++)
            {
                product *= primNumbers[charArray[i] - 'a'];
            }

            return product;
        }
    }
}
