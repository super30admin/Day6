// Time Complexity :o(n)
// Space Complexity:o(1) store 26 characters frequency
// Approach : Using HashMap build character frequency and iterate through the frequency map
// and if the frequency is even then add to count else odd then add frequency-1 to count and turn the flag to true
// at the end if the flag is true we have characters with odd frequency and increment count by 1

class Solution {
    public int longestPalindrome(String s) {
        HashMap<Character,Integer> map = new HashMap<>();
        int count =0;
        boolean flag = false;

        // Character frequency map
        for (Character c : s.toCharArray()){
            map.put(c, map.getOrDefault(c,0)+1);
        }

        // iterate through frequency map
        for(Character c : map.keySet()){
            int freq = map.get(c);
            if(freq % 2 == 0){
                count+=freq;
            } else{
                count+=freq-1;
                flag=true;
            } 
        }
        if (flag){
            return count+1;
        } else{
            return count;
        }
    }
}

// Time Complexity :O(n)
// Space Complexity:O(n)
// Approach : Using HashSet iterate through the string and check if ths character is already in Hashset
// then we can form a pair and increment the counter to +2 and remove the character from set.
// At the end if we left with any characters in set implies those characters are occcured in odd frequency from the string
// So increment the count by 1. 

class Solution {
    public int longestPalindrome(String s) {
        HashSet<Character> set = new HashSet<>();
        int count =0;

        for(Character c : s.toCharArray()){
            if (set.contains(c)){
                // we are in second occurence of character
                count+=2;
                set.remove(c);
            } else{
                // we are in the first occurence of character
                set.add(c);
            }
        }
        if (!set.isEmpty()){
            return count+1;
        }else{
            return count;
        }
    }
}