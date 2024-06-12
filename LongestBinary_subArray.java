/*
 Time Complexity :  O(N)
 Space Complexity : O(N)
 is Worked on leetcode : YES

 */

public class LongestBinary_subArray {

//     1010111100101
    public int findMaxLength(int[] nums) {
        HashMap<Integer, Integer>map =  new HashMap<Integer, Integer> ();
        map.put(0,-1);
        int cummSum = 0;
        int max_len = 0;
        for(int i=0;i<nums.length; i++){
//             if element is zero then reduce sum  by 1 else add sum by 1
            if(nums[i] == 0){
                cummSum -= 1;
            }else{
                cummSum += 1;
            }
//              if map dont have cummsum put that into map
//             else update the maximum length because if you see cummsum again that means that the 
//             array have same num of zeros and one after that cummsum
            if(!map.containsKey(cummSum)){
                map.put(cummSum,i);
            }else{
                int len = i - map.get(cummSum);
                if(len > max_len){
                    max_len = len;
                }
            }
        }
        return max_len;
        
        
    }
}