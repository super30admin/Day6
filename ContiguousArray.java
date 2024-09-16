import java.util.*;
public class ContiguousArray {

        public int findMaxLength(int[] nums) {
            HashMap<Integer,Integer> map = new HashMap<>();
            map.put(0,-1);
            int count =0;
            int max_length = 0;

            for(int i=0;i<nums.length;i++){
                if(nums[i]==0)
                    count = count -1;
                else
                    count+=1;
                // running sum added and checking whether key already present or not
                if(!map.containsKey(count)){
                    map.put(count,i);
                }else{//if key already present subtract index and return
                    max_length = Math.max(max_length,i-map.get(count));
                }
            }
            return max_length;
        }
        public static  void main(String [] args){
            ContiguousArray c = new ContiguousArray();
            int arr[] = {1,0,0,1,0,0};
            int result = c.findMaxLength(arr);
            System.out.println(result);
        }
    }
// TC : iterating through entire array : O(N);
//SC : using auxilary hashmap to store : O(N);
