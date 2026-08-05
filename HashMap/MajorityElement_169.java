/*
LeetCode 169 - Majority Element

Approach:
- Count the frequency of each element using a HashMap.
- Traverse the array and update the frequency of every element.
- If the frequency of any element becomes greater than n / 2,
  return that element immediately.

Time Complexity: O(n)
Space Complexity: O(n)
*/
import java.util.HashMap;

public class MajorityElement_169 {
    public static void main(String[] args) {
        int arr[] = {1,2,2,1,2,2};
       

        HashMap<Integer,Integer> map = new HashMap<>();

        // Count frequency
        for(int num : arr){

            if(map.containsKey(num)){
                map.put(num, map.get(num)+1);
            }else{
                map.put(num,1);
            }
        }

        // Find majority element
       for (Integer key : map.keySet()){
           if (map.get(key) > arr.length / 2) {
              System.out.println(key);
             //System.out.println(map.get(key));
}
        }
    }
}
