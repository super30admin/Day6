class LongestPalindrme{
    public int longestPalindrome(String s) {
        int[] chararr = new int[128];

        for(int i=0;i<s.length();i++){
            chararr[Math.abs(s.charAt(i))]++;
        }

        int result=0;
        boolean oddchar=false;
        for(int i=0;i<chararr.length;i++){
            if((chararr[i]%2!=0) && !oddchar){
                result+= chararr[i];
                oddchar=true;
            }else if(chararr[i]%2!=0 && oddchar){
                result+= chararr[i]-1;
            }else{
                result+= chararr[i];
            }
        }
        return result;
    }
    // TIme Complexity : O(n)
    //Space Complexity : O(1)
}