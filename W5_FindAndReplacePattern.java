import java.util.*;

class Solution {
    public List<String> findAndReplacePattern(String[] words, String pattern) {
        List<String> result = new ArrayList<>();

        for (String word : words) {
            if (matches(word, pattern)) {
                result.add(word);
            }
        }

        return result;
    }

    private boolean matches(String word, String pattern) {
        // pattern -> word
        Map<Character, Character> map = new HashMap<>();

        // word -> pattern
        Map<Character, Character> reverseMap = new HashMap<>();

        for (int i = 0; i < pattern.length(); i++) {
            char p = pattern.charAt(i);
            char w = word.charAt(i);

            // Check pattern -> word mapping
            if (map.containsKey(p)) {
                if (map.get(p) != w) {
                    return false;
                }
            } else {
                map.put(p, w);
            }

            // Check word -> pattern mapping
            if (reverseMap.containsKey(w)) {
                if (reverseMap.get(w) != p) {
                    return false;
                }
            } else {
                reverseMap.put(w, p);
            }
        }

        return true;
    }
}
