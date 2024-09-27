class Solution{
    public int longestPalindrome(String s){
        if(s == null || s.length == 0) return 0; // if the string is empty or dosent have any elements, we return 0;
        HashSet<Character> set = new HashSet<>(); // we create a hashset with name set and give char as the input for the hashset.
        int count = 0; // we initialize the variable called as count to 0 which stores the length of the palindrone.
        for(int i = 0; i < s.length(); i++){ // we go through each element in the string
            char c = s.charAt(i); // we take the char present at each of the index i in s and store it in the c.
            if(set.contains(c)){ // if the set already contains c
                count = count + 2; // we increment the count by 2
                set.remove(c); // and we remove c.
            }
            else{ // if the set dosent contains c.
                set.add(c) //we add c to the set.
            }
        }
        if(!set.isEmpty()){ // we check if the set is not empty. the fact that we have left over elements in the set shows that there is odd occurances of that element.
            count = count +1 ; // so we increment the count by 1.
        }
    }
    return count;
}
//O(n) - time complexity.
//O(1) - space complexity.