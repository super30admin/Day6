// Time Complexity : O(n)
// Space Complexity :O(1)
// Did this code successfully run on Leetcode :
// Any problem you faced while coding this :


// Your code here along with comments explaining your approach
// SubArray Sum Equals K
class Solution {
    public int subarraySum(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0,1);
        int count =0; int rSum =0;
        for (int i=0; i < nums.length; i++){
            rSum += nums[i];//running sum
            //y=x-z
            if(map.containsKey(rSum - k)){
                count += map.get(rSum - k);//counting the number of subarrays
            }
            map.put(rSum, map.getOrDefault(rSum,0)+1);
            //insert
            /*if(!map.containsKey(rSum)){
                map.put(rSum,1);
            } else{
                map.put(rSum, map.get(rSum)+1);
            }*/
        }
        return count;
    }
}

//Largest Contiguous array of equal 0,1

class Solution {
    public int findMaxLength(int[] nums) {
        HashMap<Integer, Integer> map=new HashMap<>();
        map.put(0,-1);//dummy one for the including first index in edge cases
        int max = 0;
        int rSum = 0;
        for(int i = 0; i< nums.length; i++){
            if(nums[i] ==0){
                rSum--;
            } else{
                rSum++;
            }
            if(map.containsKey(rSum)){
                max = Math.max(max, i-map.get(rSum));

            } else{
                map.put(rSum, i);
            }

        }
        return max;
    }
}


// longest palindrome
//using hash map
import java.util.*;
class Solution {
    public int longestPalindrome(String s) {
    HashMap <Character, Integer> map = new HashMap<>();
    char [] sc = s.toCharArray();
    for (int i=0; i < sc.length; i++){
        if(!map.containsKey(sc[i])){
            map.put(sc[i], 1);
        } else{
            map.put(sc[i], (map.get(sc[i])+1));
        }
    }
    if(map.size() == 1){
        Collection <Integer> values = map.values();
        int[] arr = values.stream().mapToInt(Integer::intValue).toArray();
        for(Integer v:arr){
            return v;

        }

    } else  if(map.size() == 2){
        int c =0; int mPal = 0;
        Collection <Integer> values = map.values();
        int[] arr = values.stream().mapToInt(Integer::intValue).toArray();
        for(Integer v:arr){
            if(v%2==1){
                c = c+1;
                mPal = mPal+(v/2)*2;
            } else{
            mPal = mPal + (v%2 == 0 ? v : (v/2)*2);
            }
        }
        if(c != 0){
         return mPal+1;
        }else{
            return mPal;
        }



        }  else{
        Collection <Integer> values = map.values();
        int maxPal = 0; int contSing = 0;
        for (Integer v : values){
        //  System.out.println(v);
        //System.out.println(maxPal);
            if(v%2==1 ){
                contSing =+ 1;
                maxPal = maxPal+(v/2)*2;

            } else{

                maxPal = maxPal+ (v%2 == 0 ? v : (v/2)*2);

            }
        }
   System.out.println(maxPal);
   System.out.println(contSing);

        if (contSing%2 != 0){
            maxPal = maxPal + 1;
        }
        return maxPal;
    }
    return -1;
    }
}
// using HashSet
class Solution{
    public int longestPalindrome(String s){
        HashSet<Character> set = new HashSet<>();
        int count = 0;
        for (int i=0; i < s.length(); i++){
            char c = s.charAt(i);
            if(set.contains(c)){
                count +=2;
                set.remove(c);
            } else {
                set.add(c);
            }
        }
        if(!set.isEmpty()){
            count++;
        }
        return count;
    }
}
