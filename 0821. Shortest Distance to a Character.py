class Solution:
    def shortestToChar(self, s: str, c: str) -> List[int]:
        
        # initialized the common used variables
        n = len(s)
        max_value = float('inf')
        running_dist = max_value

        # initialized the arrays, 2 based on the direction of traversal & 1 result array to store distance from the target
        left_to_right_traversal = [max_value] * n
        right_to_left_travelsal = [max_value] * n
        result = [0] * n

        # this loop traverse the string from left to right to find the target & uodate the distance from the target for the charecters found after the target.
        for i in range(n):
            if s[i] == c:
                running_dist = 0
                left_to_right_traversal[i] = running_dist
            elif running_dist != max_value:
                running_dist += 1
                left_to_right_traversal[i] = running_dist

        # reset the variable to max_value for an integer.
        running_dist = max_value

        # this loop traverse the string from right to left to find the target & uodate the distance from the target for the charecters found after the target.
        for i in reversed(range(n)):
            if s[i] == c:
                running_dist = 0
                right_to_left_travelsal[i] = running_dist
            elif running_dist != max_value:
                running_dist += 1
                right_to_left_travelsal[i] = running_dist
        
        #this for loop is to traverse both the bi-directional arrays to find the min distance from the target & uodate the result array accordindly.
        for i in range(n):
            result[i] = min(left_to_right_traversal[i], right_to_left_travelsal[i])
        return result
