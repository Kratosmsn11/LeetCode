class Solution:
    def canConstruct(self, ransomNote: str, magazine: str) -> bool:
        freq = {}
        for c in magazine:
            freq[c] = freq.get(c, 0) + 1

        for c in ransomNote:
            freq[c] = freq.get(c, 0) - 1
            if freq[c] < 0:
                return False
        
        return True
