class Solution:
    def flipAndInvertImage(self, image: List[List[int]]) -> List[List[int]]:
        for row in image:
            print("before: ", row)
            row = self.rowReversal(row)
            print("after : ", row)
        return image

    def rowReversal(self, row: List[int]) -> List[int]:
        left, right = 0, len(row)-1

        while left <= right:
            row[left], row[right] = self.imageInvert(row[right]), self.imageInvert(row[left])
            left += 1
            right -= 1
        return row

    def imageInvert(self, num: int) -> int:
        return num ^ 1
