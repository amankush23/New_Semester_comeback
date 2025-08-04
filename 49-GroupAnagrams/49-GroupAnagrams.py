# Last updated: 8/4/2025, 11:13:34 PM
from typing import List
from collections import defaultdict

class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        # Using defaultdict to automatically handle missing keys
        anagram_map = defaultdict(list)
        
        for word in strs:
            # The key is the sorted version of the word
            sorted_word = ''.join(sorted(word))
            anagram_map[sorted_word].append(word)
        
        # Return the grouped anagrams as a list of lists
        return list(anagram_map.values())
