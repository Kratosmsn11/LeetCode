class Solution:
    def isAnagram(self, s: str, t: str) -> bool:        
        if len(s) != len(t):
            return False

        letter_count = {}
        for c in s:
            if c in letter_count:
                letter_count[c] += 1
            else:
                letter_count[c] = 1

        for c in t:
            if c not in letter_count or letter_count[c] == 0:
                return False
            else:
                letter_count[c] -= 1
 
        return True
