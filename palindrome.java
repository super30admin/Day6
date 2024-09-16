/* Time complexity: O(n)
Space Complexity: O(1)
1. Using hashset to find if a given string can be represented as palindrome or not.
2. Add into the hashset, each character of teh string as we iterate through it, if its not already there. Otherwise, just increment the count by 2, where count represents the length of the palindrome thata can be made with given string.
3. After incrementing the count, remove the element from the given string and proceed in the same fashion throughout the string. If there are elements left in the hashset after the process, increment the count by 1 as free element can be added to the centre of the palindrome irrespective of the number of elements left in teh hashset.
*/

class Solution{
    public int longestpalindrome(String s){

        int count = 0;
        HashSet<Character> set = new HashSet<> ();

        for(int i=0; i<s.length(); i++){
            int c = s.charAt(i);
            if(set.contains(c)){
                count += 2;
                set.remove(c);
            }
            else{
                set.add(c);
            }
            
        }

        if(!set.isEmpty()){
            count += 1;
        }

        return count;

    }
}