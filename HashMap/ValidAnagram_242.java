import java.util.HashMap;

public class ValidAnagram_242 {

    public boolean isAnagram(String s, String t) {

        if (s.length() != t.length()) {
            return false;
        }

        HashMap<Character, Integer> map = new HashMap<>();

        // Count frequency of s
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (map.containsKey(ch)) {
                map.put(ch, map.get(ch) + 1);
            } else {
                map.put(ch, 1);
            }
        }   

        // Decrease frequency using t
        for (int i = 0; i < t.length(); i++) {
            char ch = t.charAt(i);

            if (!map.containsKey(ch)) {
                return false;
            }

            map.put(ch, map.get(ch) - 1);
        }

        // Check all frequencies
        for (Character key : map.keySet()) {
            if (map.get(key) != 0) {
                return false;
            }
        }

        return true;
    }


  public static void main(String[] args) {
    
        String s = "anagram";
        String t = "nagaram";

        ValidAnagram_242 obj = new ValidAnagram_242();

        boolean r = obj.isAnagram(s, t);

        System.out.println(r);


       
}
    }
