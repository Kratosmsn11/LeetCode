class Solution:
    def doesValidArrayExist(self, derived: List[int]) -> bool:
        n = len(derived)
        original = [0] * n

        for i in range(1, n):
            original[i] = original[i-1] ^ derived[i-1]

        return derived[-1] == original[-1] ^ original[0]
