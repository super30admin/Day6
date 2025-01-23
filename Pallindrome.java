/* Have a HashTable with key as character, and it's freq as value.
Iterate through the freq of each character, if odd count exists, inc the oddFreq,
else decrement the oddFreq. If oddFreq is greater than 0, then return
(length of string - oddFreq count) + 1.
T.C : 0(n)
S.C : 0(1)
*/


import java.util.HashMap;
public class Pallindrome {
    public int longestPalindrome(String s) {

        HashMap<Character, Integer> hs = new HashMap<>();

        int oddFreqCharsCount = 0;

        for(char c: s.toCharArray())
        {
            hs.put(c, hs.getOrDefault(c, 0) + 1);

            if(hs.get(c)%2!=0)
            {
                oddFreqCharsCount++;
            }
            else
            {
                oddFreqCharsCount--;
            }
        }

        if(oddFreqCharsCount>0)
        {
            return (s.length() - oddFreqCharsCount)+1;
        }

        return s.length();

    }

}
