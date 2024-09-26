class Solution {
    public int longestPalindrome(String s) {
        HashMap<Character, Integer> h = new HashMap<>(); //creating hashmap to store the frequency of characters
        int sum =0;
        boolean hasOdd = false;
        int j=0;
        int k=0;
        for(int i=0;i<s.length();i++){
            if(h.containsKey(s.charAt(i))){
                h.put(s.charAt(i), h.get(s.charAt(i)) + 1);
            }
            else
                h.put(s.charAt(i),1);
        }
        for(int i:h.values()){    //if the charcater is present even number of times then we are adding its frequency
            if(i%2 == 0)
                sum = sum + i;
            else{                //if the charcater is present odd number of times then making boolean as true and adding
                hasOdd = true;
                sum = sum + i-1;
            }
        }
        if(hasOdd ==  true)  //if we came across one character with odd times frequency then we are adding one charcter among them.     
            return sum+1;
        else
            return sum;
         }
}
