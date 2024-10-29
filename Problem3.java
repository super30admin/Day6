package PACKAGE_NAME;

public class Problem3 {
    public int longestPalindrome(String s) {
        char[] freq = new char[256];
        int count =0;
        char[] input = s.toCharArray();
        for(char ch : input){
            if(freq[ch -' '] != 0){
                freq[ch -' '] = 0;
                count=count+2;

            }else{
                freq[ch -' ']= ch;
            }
        }
        //if count is less than the length of the count that means we have
        //chars which are of odd size . and out of all the odd sizes only
        //one can be taken
        if(s.length()>count){
            return count+1;
        }else{
            return count;
        }
    }
}
