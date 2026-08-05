import java.util.HashMap;
public class FrequencyCount {
    public static void main(String[] args) {
        int arr[] = {4,1,4,2,1,4};

        HashMap<Integer,Integer> map = new HashMap<>();

        for(int num : arr){
            if(map.containsKey(num)){  //check i exists or not
                    map.put(num, map.get(num) + 1 );
            }else{
                map.put(num,1);
            }
        }
        System.out.println(map);
    }
}
