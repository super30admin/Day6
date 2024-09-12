import java.util.HashSet;

class LongestPallindrome {

    //Time Complexty: 0(n)
    //Space Complexity:0(1)
    //Did it successfully run on leetcode : Yes
    //Did you face any problems while coding: No
    //In short, explain your approach: This approach is based on the fact that 2 types of pallindrome can be formed, 1st is
    // with even no. of characters. 2nd is with odd no. of character. If it's even, then all the characters have to be present
    // twice in the string and if the no. of characters is odd, then it will have pairs of characters and the middle character
    // will have 1 occurence. Keeping this concept in mind,I am extracting each character of the string. Then checking if the character is present
    //in the hashset or not. If it is present, then I am increasing the count to count + 2 as it will be the second or even
    //no. of times occurence o the character in the string. Then I am removing the element from the hashset as it is already
    // occured before and this time it's forming a pair. If it is not present, I am directl adding it to the hashset

    public int longestPalindrome(String s) {
        if(s.length() ==0 || s == null){
            return 0;
        }
        HashSet<Character> set = new HashSet<>();
        int count = 0;
        for(int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            if(set.contains(c)){
                count = count + 2;
                set.remove(c);
            }
            else{
                set.add(c);
            }
        }
        if(!set.isEmpty()){
            count++;
        }
        return count;
    }
}