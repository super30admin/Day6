package S30.Hashing_2;

// Time Complexity : Push: O(1), Pop: O(1), Peek: O(1)
// Space Complexity : O(1) - Size of stack is fixed as value of MAX
// Did this code successfully run on Leetcode : N/A
// Any problem you faced while coding this : None

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import java.util.HashMap;

class DataValue{
    int count;
    List<Integer> indices;

    public DataValue(int count){
        this.count = count;
        this.indices = new ArrayList<Integer>();
    }
}

public class SubarraySumEqualsK {

    public int subarraySum(int[] nums, int k) {

        if(nums == null || nums.length == 0) return 0;

        //map to store running sum and the number of times encountered
        HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
        //handle edge case to count starting subarrays
        map.put(0,1);
        int prefixSum = 0;
        int count = 0;

        for(int i = 0; i < nums.length; i++){

            prefixSum += nums[i];
            if(map.containsKey(prefixSum - k)){
                count += map.get(prefixSum - k);
            }
            map.put(prefixSum, map.getOrDefault(prefixSum,0)+1);
        }

        return count;

    }

    public void printAllSubArraysWithSumK(int[] nums, int k){

        if(nums == null || nums.length == 0) return;

        List<List<Integer>> result = new ArrayList<>();
        //map to store running sum and the number of times encountered
        HashMap<Integer,DataValue> map = new HashMap<Integer,DataValue>();
        //handle edge case to count starting subarrays
        map.put(0,new DataValue(1));
        map.get(0).indices.add(-1);
        int prefixSum = 0;
        int count = 0;

        for(int i = 0; i < nums.length; i++){

            prefixSum += nums[i];
            if(map.containsKey(prefixSum - k)){
                count += map.get(prefixSum - k).count;
                DataValue dataPoint = map.get(prefixSum-k);
                for(int idx : dataPoint.indices){
                    result.add(Arrays.asList(idx+1,i));
                }
                dataPoint.count+=1;
                dataPoint.indices.add(i);
                map.put(prefixSum,dataPoint);
            }else{
                map.put(prefixSum, new DataValue(1));
                map.get(prefixSum).indices.add(i);
            }

        }

        System.out.print("Subarray Starting and Ending Indices are: ");

        for(int i = 0; i < result.size(); i++){
            System.out.print("[" + result.get(i).get(0) + ", " + result.get(i).get(1) + "], ");
        }


    }

    public static void main(String[] args) {
        SubarraySumEqualsK test = new SubarraySumEqualsK();
        System.out.println(test.subarraySum(new int[]{1,1,1}, 2));
        test.printAllSubArraysWithSumK(new int[]{1,1,1}, 2);
    }
}
