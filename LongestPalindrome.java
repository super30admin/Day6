public class LongestPalindrome {
    public int longestPalindrome(String s) {

    //time complexity: O(n)
    //space complexity: O(1)
    //thought process:
    //1. create an array to store the count of each character
    //2. iterate through the string and store the count of each character
    //3. iterate through the array and add the count of each character to the total count
    //4. if the count of a character is odd, add 1 to the odd count
    //5. return the total count + 1 if the odd count is greater than 0
    int[] arr = new int[60];
    for (int i =0; i < s.length();i ++){
        arr[s.charAt(i) - 'A']++;
    }
    int oddCount =0;
    int totalCount =0;
    for (int i =0; i < arr.length;i ++){
        totalCount = totalCount + ((arr[i]/2)*2);
      if (arr[i] % 2 ==1){
        oddCount ++;
    }      
        
    }
    if(oddCount >=1)
    totalCount++;
    return totalCount;
    }
    
}
