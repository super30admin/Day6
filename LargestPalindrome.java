//hashMap approach

// Time Complexity : O(N) with 1 string iteration and 1 hashmap iteration
// Space Complexity : O(1) contant because the hashmap can go just to 52 length
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach


public int longestPalindrome(String s) {
    if(s == null || s.length() == 0) return 0;
    
    //using hashmap for 2 pass
    HashMap<Character,Integer> map = new HashMap<>();
    char[] ch = s.toCharArray();// converting the string to character array
    int count=0; // counter for the palindrome length
    boolean flag = false;// flag if there is any element with 1 left
    
    for(int i=0;i<ch.length;i++){ // adding the elements and their count to the Hashmap
        if(!map.containsKey(ch[i])){
            map.put(ch[i],1);
        }else{
            map.put(ch[i],map.get(ch[i]) + 1);
        }
    }
    
    for(Character character: map.keySet()){ // iteratring thru the hashmap
        if(map.get(character) % 2 == 0){ // if the remainder is 0 then add the value to the count
            count += map.get(character);
        }else{
            count += map.get(character) -1; // if the remainder is not zero then add the value-1
            flag=true; // setting the flag to true which indicates that there is an element with odd appearance
        }
    }
    if(!flag){  // if flag for odd appearance is false then return count
        return count;
    }
    
    return count+1;// if flag for odd appearance is true then return count +1




//hashSet approach

// Time Complexity : O(N) with just 1 string iteration
// Space Complexity : O(1) contant because the hashset can go just to 52 length
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach
public int longestPalindrome(String s) {
    if(s == null || s.length() ==0) return 0;
     
     HashSet<Character> set = new HashSet<>();
     int count=0;
     
     char[] ch = s.toCharArray();
     
     //iterating thru the array to add to the hashset
     for(int i=0;i<ch.length;i++){
         if(!set.contains(ch[i])){ // if the element is not present in the set, then add it to the set
             set.add(ch[i]);
         }else{ // if the element is present in the set then increase the counter by 2 and remove the element from the set
             count += 2;
             set.remove(ch[i]);
         }
     }
     
     if(set.isEmpty()){ // if the set is empty at last it means there is no odd appearance of any chartacter
         return count;
     }
     return count+1;
 }