import java.util.HashMap;

public class firstuniqueCharacter_387{

    public  int UniqueCharacter(String s){

        
        HashMap<Character, Integer> map = new HashMap<>();

        //count the frequency of s

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (map.containsKey(ch)) {
                map.put(ch, map.get(ch) + 1);
            } else {
                map.put(ch, 1);
            }
        }   

        //Traverse the original string again.

        for (int i = 0; i < s.length(); i++) {

            char ch = s.charAt(i);

            if ( map.get(ch) == 1 ) {
                return i;
            }
}
return -1;

    }

    public static void main(String[] args) {
     firstuniqueCharacter_387 obj = new firstuniqueCharacter_387();

     int result = obj.UniqueCharacter("loveleetcode");

     System.out.println(result);
        
    }
}