import java.util.HashSet;

class LongestPalindrome {
    public int longestPalindrome(String s) {

        //initializing hashset,size
        HashSet<Character> hashset = new HashSet<>();

        int size=0;
        //loop through given string
        for(int x=0;x<s.length();x++){
            char ch = s.charAt(x);
            //ashset contains character add 2 for the size and remove character frm the hashset
            if(hashset.contains(ch)){
                size+=2;
                hashset.remove(ch);
            }//if character is not in hashset add that character to hashset
            else{
                hashset.add(ch);
            }
        }//if hashset is present with single count charachters add 1 for the size.
        if(!hashset.isEmpty()){
            size+=1;
        }
        return size;
    }
}

//time complexity=o(n)
//space complexity=o(n)