/*
LeetCode 49 - Group Anagrams

Approach:
- Sort the characters of each string to create a common key.
- Use a HashMap where the sorted string is the key.
- Store all anagrams having the same key in the same list.
- Return all the grouped anagrams.

Time Complexity: O(n * k log k)
Space Complexity: O(n * k)

where:
n = number of strings
k = maximum length of a string
*/

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class GroupAnagram_49 {

    public static List<List<String>> Anagram(String[] strs) {

        HashMap<String, List<String>> map = new HashMap<>();

        for (String word : strs) {

            char[] ch = word.toCharArray();
            Arrays.sort(ch);

            String key = new String(ch);

            if (map.containsKey(key)) {
                map.get(key).add(word);
            } else {
                List<String> list = new ArrayList<>();
                list.add(word);
                map.put(key, list);
            }
        }

        return new ArrayList<>(map.values());
    }

    public static void main(String[] args) {

        String[] strs = {"eat", "tea", "tan", "ate", "nat", "bat"};

        System.out.println(Anagram(strs));
    }
}