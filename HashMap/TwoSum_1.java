/*
LeetCode 1 - Two Sum

Approach:
- Store each number and its index in a HashMap.
- For every element, check whether its complement exists.

Time Complexity: O(n)
Space Complexity: O(n)
*/

import java.util.*;

class TwoSum_1{
    public int[] twoSum(int[] nums, int target){
        HashMap<Integer,Integer> map = new HashMap<>();

        for(int i = 0;i<nums.length;i++){
            int complement = target - nums[i];
            if(map.containsKey(complement)){
               return new int[]{map.get(complement), i};
            }else{
               map.put(nums[i], i);
            }
        }
          
        return new int[]{};
    }

    public static void main(String[] args){
       TwoSum_1 obj = new TwoSum_1();   

       int[] nums = {2,7,11,15};
       int target=9;
       int[] ans = obj.twoSum(nums, target);
        System.out.println(Arrays.toString(ans));
    }
}