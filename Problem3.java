//Time Complexity: O(N)
//Space Complexity: O(1)
//For the solution, we make use of a HashSet. We covert the input string into a char array
//and we iterate through the array to check if the alphabet is present in the Hashset or not.
//if it is not present, we add it to the hashset; if it is present, we remove it and increment the
//result by 2. In the end we check if our hashset is empty or not. If it is not empty, we increment the
//result by 1 since one element can be added to the middle of the pallindrome
class Solution {
    public int longestPalindrome(String s) {
        HashSet <Character> set = new HashSet<>();
        int result = 0;
        for(int i =0; i<s.length();i++){
            char c = s.charAt(i);
            if(set.contains(c)){
                result+=2;
                set.remove(c);
            }else{
                set.add(c);
            }
        }
        if(!set.isEmpty()) result +=1;
        return result;
    } 
}