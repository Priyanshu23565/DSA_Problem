package Practice;

import java.util.HashMap;
import java.util.Map;

public class TwoSum03 {
 
    // 1 - Approach

    // public static void main(String[] args) {
    //     // int arr[]={2,7,11,15};
        
    //     // int target=9;
    //     // for(int i=0;i<arr.length-1;i++){
    //     //     for(int j=i+1;j<arr.length;j++){
    //     //         if(arr[i]+arr[j]==target){
    //     //             System.out.println(i+" "+ j);
    //     //         }
    //     //     }
           
    //     // }
    // }




 // 2 - Approach
 
    public int[] twoSum(int[] nums, int target) {
       Map<Integer, Integer> numMap = new HashMap<>();
        int n = nums.length;

        // Build the hash table
        for (int i = 0; i < n; i++) {
            numMap.put(nums[i], i);
        }

        // Find the complement
        for (int i = 0; i < n; i++) {
            int complement = target - nums[i];
            if (numMap.containsKey(complement) && numMap.get(complement) != i) {
                return new int[]{i, numMap.get(complement)};
            }
        }

        return new int[]{}; // No solution found
    }
    

    public static void main(String[] args) {
        int arr[]={2,6,5,8,11};
        int target=11;
        TwoSum03 s= new TwoSum03();
        s.twoSum(arr, target);



    }


    // }
        
        // int target=14;
        // int s=0;
        // for(int i=0;i<arr.length-1;i++){
        //     s=target-arr[i]; //12
        //     if(s==arr[i]){
        //         System.out.println("Emplt");
        //     }
            
        // }




        /*
         Approach 1
   
        int arr[]={2,7,11,15};
        
        int target=26;
        for(int i=0;i<arr.length-1;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]+arr[j]==target){
                    System.out.println(i+" "+ j);
                }
            }
           
        }
        */
       
    }
    

