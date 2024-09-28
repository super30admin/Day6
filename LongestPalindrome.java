// Time Complexity : O(n) where n is the length of input array
// Space Complexity : O(n) for the HashMap
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : Nothing specific

//used the thought that palindrome is possible with even count of alphabets and single odd count of a character
//Took a hasmap to keep count of all the occurrences of characters
//when there are even counts, it is definitely part of palindrome length
//first ocuurence of odd count will be added as is but after that only even occurrences of rest of the odd count characters is considered


class Solution {
    public int longestPalindrome(String s) {
        int count=0;
        HashMap<Character,Integer> res=new HashMap<>();
        char[] c=s.toCharArray();
        for (char ch:c){
            if(res.containsKey(ch)){
                res.put(ch,res.get(ch)+1);
            }
            else{
                res.put(ch,1);
            }
        }
        boolean odd=false;
        for(Map.Entry<Character,Integer> ent:res.entrySet()){
            if(ent.getValue()%2==0) count+=ent.getValue();
            else {
                if(!odd){
                    count+=ent.getValue();
                    odd=true;
                }
                else{
                    count+=ent.getValue()-1;
                }
            }
        }
        return count;
    }
}