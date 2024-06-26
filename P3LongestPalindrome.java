// Before class 
// Time Complexity : O(n)
// Space Complexity : O(n)
// Did this code successfully run on Leetcode :yes
// Any problem you faced while coding this :No


// Your code here along with comments explaining your approach
// creating a array to store the frequency of the char 
// checking if the frequency of the char is divisible by 2 then directly add the frequency to the count 
// else subtract 1 if the number is odd add it to count and at final step add 1 to the count 

class Solution {
    public int longestPalindrome(String s) {
        int[] charCountArray = new int[60];
        int count = 0;
        boolean remainder =false;
        for(int i=0;i<s.length();i++){
            int index = s.charAt(i)-'A';
            //System.out.println("Char :"+s.charAt(i)+ "index :"+index);

            if(charCountArray[index]>0){
                charCountArray[index] = charCountArray[index]+1;
            }else{
                charCountArray[index] = 1;
            }
        }
        for(int i=0;i<charCountArray.length;i++){
            int element = charCountArray[i];
            if(element != 0){
                if(element % 2==0){
                    count = count + element;
                }else{
                    count = count + (element-1);
                    remainder = true;
                }
            }
        }
        return remainder?count+1:count;
    }
}