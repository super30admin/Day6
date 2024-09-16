import java.io.*;
import java.util.*;
class SubArraySumK {
    public int subarraySum(int[] nums, int k) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int max =0;
        int count =0;
        map.put(0,1);
        for(int i=0;i<nums.length;i++){
            //finding running sum to store into map
            count +=nums[i];
            if(map.containsKey(count-k)){
                max += map.get(count-k);
            }
            //retrieving if sum already present otherwise just add the sum and index;
            map.put(count,map.getOrDefault(count,0)+1);
        }
        return max;
    }
    public static void main(String[] args){
        SubArraySumK s = new SubArraySumK();
        int arr[] = {1,2,3,4,-2,6,4,-4,8,12,-8};
        int target = 4;
        int max = s.subarraySum(arr,target);
        System.out.println(max);
    }
}
// TC: O(N) iterating through entire array to store in hashmap
//SC : O(N) using auxilary space of hashmap to store