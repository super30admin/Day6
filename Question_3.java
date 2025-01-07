public int longestPalindrome(String s) {
    int counts[] = new int[52];
    for(int i=0;i<=51;i++) counts[i]=0;
    for(char c:s.toCharArray()) {
        if(c<='Z') counts[c-'A']++;
        else counts[26+c-'a']++;
    }
    int lonPalindrome = 0, oddVis = 0;
    for(int i=0;i<=51;i++){
        if(counts[i]%2==0) lonPalindrome+=counts[i];
        else {
            lonPalindrome+=counts[i]-1;
            oddVis = 1;
        }
    }
    return lonPalindrome+oddVis;
}

