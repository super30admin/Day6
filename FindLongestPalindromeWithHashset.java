// Time Complexity :
// Space Complexity :
// Did this code successfully run on Leetcode :
// Any problem you faced while coding this :


// Your code here along with comments explaining your approach


//we can solve this array,list ,hashmap and with hashset
//In hashmap<char,integer> approach ,each character as the key and value as the count of occurence.Then keep a seperate variable
//for the counter and increment by 2 when you find two occurence of same character in the hasmap and remove that key value from the hashmap.
//At the end your hashmap will have nothing or  will only find key value with just one occurence .At that point in time add +1 to counter variable
//Time Complexity is O(N) and space is O(1) .its O(1) and nor O(N) because its on defined set a-z and A-Z and will not grow
//This approach is two pass solution meaning- You are iterating through the string to create hashmap and then itertaing through the hasmap to get the count

//One pass solution is using the hashset
//Keep a counter variable.
//Each character is checked if exist in hashset,if not place it in hashset.
//If already exist, remove it from hashset and increment counter by 2 
//At the end, if set is empty, meaning i have used all in the palindrome ,if not include +1 to the counter

class Solution {
    public int longestPalindrome(String s) {
        
        if(s == null || s.length() == 0)
            return 0;
        Set<Character> set = new HashSet<>();
        int count = 0;
        
        for(char c : s.toCharArray()){
            if(!set.contains(c))
                set.add(c);
            else{
                count +=2;
                set.remove(c);
            }
        }
        return set.isEmpty()? count : count +1;
        
    }
}