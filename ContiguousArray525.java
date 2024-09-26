/**
 * time complexity :  O(n)
 * space complexity : O(n) < n is max of arr.length
 * leet code submission :  successfull
 * procedure : to get contiguous array, intialize hashmap with 0,-1 and for every 0 decrement rsum by 1 and increment if it's 1.
 *              if element at that specific index doesn't exist add it into hashmap with index as rsum and value as index. if element exists
 *              do verifiy for max value w.r.t index - element from map. and return max. it'll giv answer
 */
import java.util.HashMap;

class ContiguousArray525{

    private int find(int arr[]){

        if(arr.length==0||arr==null)
            return 0;

        HashMap<Integer,Integer> map = new HashMap<>();
        map.put(0,-1);
        int rSum =0,max =0;
        for(int i =0; i<arr.length;i++){
            rSum = arr[i]==0 ? rSum -1 : rSum +1;
            if(!map.containsKey(rSum))
                map.put(rSum, arr[i]);
            else
                max = Math.max(max, i-map.get(rSum));
        }
        return max;
    }


    public static void main(String[] args) {

        ContiguousArray525 ca = new ContiguousArray525();
        int arr[] = {0,1,0,1,1,1,1,1,0,0,1,0,1};
        System.out.println(ca.find(arr));
        

    }
}