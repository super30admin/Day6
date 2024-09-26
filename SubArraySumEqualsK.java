/**  
 * time complexity :  O(n)
 * space complexity : O(1)
 * leet code execution successfull
 * Steps: 1) run the loop for array length
 *         2) while traversing through loop verify if the computed sum for every iteration minus K returns element in hashset.
 *         3) if element exist increment count with get value,else place sum into hashmap. 
 *          4) once loop completes the count will have total subarray count.
 */

import java.util.HashMap;

class SubArraySumEqualsK{

    public int findSubArray(int arr[], int k){

        HashMap<Integer,Integer> map = new HashMap<>();
        int count=0,sum =0;
        for(int i=0; i<arr.length; i++){    
            sum += arr[i];   // sum = 0+1 =1; 1+4 =5; 5+3 =8; 8+1 = 9; 11
            if(sum==k)
                count++;    
            if(map.containsKey(sum-k)){  //1-4 = 3; 5-4 =1; 8-4 =4; 9-4 =5;7 
                count += map.get(sum-k);}   //count =1; 2;
            Integer val = map.get(sum); // null,null,null,null,null
            if(val==null){
                map.put(sum, 1);   // 1,1;5,1;8,1;,9,1
            }
            else{
                map.put(sum, val+1);
            }

        }
        return count;
    }


public static void main(String[] args) {
    SubArraySumEqualsK sk = new SubArraySumEqualsK();
    int arr[] = {1,1,1,1,1,1,1,1,2,2,2,3,3,4,4,3,2,2,2};
    int k = 4;
    System.out.println(sk.findSubArray(arr, k));
    
}



}