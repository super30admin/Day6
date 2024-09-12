/* Just keep adding the char in a hashset (if not already present). If aleady present, just remove the element from set and increase length count by 2. Because this means that the char has been seen for the second time. Any charcter that is seen twice, can be use in palindrome. Only one charcter out of all single occurences can be used once (in the middle). For example 'ccdc' or 'cac'. Only one char from 
the extra 'c' and the 'd' can be used as the middle char for fisrt string
Time complexity: 
Space complexity: O(1) - Only 52 alphabets (if array of fixed size if used) or an Hashset of constant size would be used
*/
class Solution {
    /* Approach1
    public int longestPalindrome(String s) {
        char[] charArray = s.toCharArray();
        HashMap<Character, Integer> mapping = new HashMap();
        int max = 0;
        boolean oneUsed = false;
        for(Character c : charArray)
        {
            if(!mapping.containsKey(c))
                mapping.put(c,1);
            else
            {
                int count = mapping.get(c);
                mapping.put(c,count+1);
            }
        }
        
        for(int value : mapping.values())
        {
            if((value==1 && !oneUsed))
            {
                max=max+1;
                oneUsed=true;
            }
            else
            {
                if(!oneUsed && value%2==1)
                {
                    max=max+1;
                    oneUsed=true;
                }
                max=((value/2)*2)+max;
            }
        }
        return max;
    }
    */
    
    /* Approach2
    public int longestPalindrome(String s) {
        char[] charArray = s.toCharArray();
        HashSet<Character> counts = new HashSet();
        int max=0;
        for(Character c : charArray)
        {
            //The time complexity of contains operation is O(1)
            if(!counts.contains(c))
                counts.add(c);
            else
            {
                max=max+2;
                counts.remove(c);
            }
        }
        if(counts.size()>0)
            max=max+1;
        return max;
    }
    */
    
    /* Approach3 
    Replace hashset with hashed array of size 52 (lower and upper case albhabets). Space complexity would be O(1) in every case.
    HashMap, HashSet and Hashed index. But under the hood, HashMap and HashSet would have a longer array assigned. Whereas in case of 
    hashed array, the size would be max 52.
    */
    public int longestPalindrome(String s) {
        /*'A'-'Z': 65-90, 'a'-'z': 97-122*/
        char[] charArray = s.toCharArray();
        int[] counts = new int[52];
        int max=0;
        int count = 0;
        for(Character c : charArray)
        {
            if(c>='A' && c<='Z') //Upper case. Book till index 25 booked for upper case. 
            {
                if(counts[c-'A']==0)
                {
                    counts[c-'A']=1;
                    count++;
                }
                else
                {
                    max=max+2;
                    counts[c-'A']=0;
                    count--;
                } 
            } 
            else //Lower case
            {
                if(counts[(c-'a')+26]==0)
                {
                    counts[(c-'a')+26]=1;
                    count++;
                }
                else
                {
                    max=max+2;
                    counts[(c-'a')+26]=0;
                    count--;
                } 
            }
        }
        return count==0?max:max+1;
    }
}