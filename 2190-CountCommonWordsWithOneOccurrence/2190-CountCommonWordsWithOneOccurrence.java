// Last updated: 21/01/2026, 11:57:36
class Solution {
    public int countWords(String[] words1, String[] words2) {
        Map<String, Integer> map = new HashMap<>();
        
        for (String word : words1) {
            map.put(word, map.getOrDefault(word, 0) + 1);
        }
        
        for (String word : words2) {
            if (map.containsKey(word) && map.get(word) <= 1) {
                map.put(word, map.get(word) - 1);
            }
        }
        
        int count = 0;
        for (int value : map.values()) {
            if (value == 0) {
                count++;
            }
        }
        
        return count;
    }
}