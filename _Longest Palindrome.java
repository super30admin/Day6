// this will take o(n) time and space complexity is o(1) - since it consists of characters and they are max to max 52 including both lowercase and pper case


// this program is working absolutely fine its just that i didn't understand why did we used hashset instead of hashmap

// In this program I am checking whether that character already exists or not in the map if it does than I increment its frequency by 1 otherwise assign its freq to 1.
// then i am traversing through the map through an iterator and checking if the frequency is even or odd . If it is even than i am adding it in the length variable
// as it is if it is odd them i decrement its freq by 1 and then add in length variable. After that we check if map is empty or not if it is than we return length as it is else we increment the length by 1 and
// then return .since we can have one extra character in between that could make a palindrome


class Solution {
    public int longestPalindrome(String s) {
        HashMap<Character,Integer> map=new HashMap<>();
        int count=0;
        for(int i=0;i<s.length();i++)
        {
            if(map.containsKey(s.charAt(i)))   //containskey looks for both upper and lower case
            {

                count+=2;
                map.remove(s.charAt(i));
            }
            else
                map.put(s.charAt(i),1);
        }
        if(map.isEmpty())
        {
            return count;
        }
        else
            return count+1;
    }
}
