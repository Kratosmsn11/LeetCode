class Solution:
    def makeSmallestPalindrome(self, s: str) -> str:
        i, j = -1, len(s)
        arr = list(s)

        while i < j:
            i += 1
            j -= 1
            if arr[i] == arr[j]:
                continue
            elif arr[i] < arr[j]:
                arr[j] = arr[i]
            else:
                arr[i] = arr[j]
        return "".join(arr)
