// General Explanation
// int result = 0
// sort nums
// left = 3
// int x = target - left
// do a binary search in the with the remaining elements in nums to find the integer that is less than or equal to x
// left = 3, right = 6 i.e. if(left + right <= target) result++;

// Examples for the approach used.
// possible subsets => [3], [3, 5], [3, 5, 6] & [3, 6].

// example [3, 4, 5, 6, 7]
// subsets when is left == 3 : [3], [3, 4], [3, 5], [3, 6], [3, 4, 5], [3, 4, 6], [3, 5, 6] & [3, 4, 5, 6].
// subsets when is left == 4 : [4] & [4, 5].

// inputs = [ 3, 12, 17, 45, 52, 62, 73, 89, 100 ] target = 100
// left == 3 , right = 89, possible subsets = 2^7
// left == 12, right = 73, possible subsets = 2^5
// left == 17, right = 73, possible subsets = 2^4
import java.math.*;
class Solution {
    public int numSubseq(int[] nums, int target) {
        Arrays.sort(nums);

        int left = 0, right = nums.length-1; 
        BigInteger res = new BigInteger("0");
        while(left <= right){
            for(int i = right; i>=left; i--){
                if(nums[left] + nums[i] <= target){
                    right = i;
                    BigInteger currRes = new BigInteger("2").pow(right-left);
                    res = res.add(currRes);
                    break;
                }
            }
            left++;
        }

        String mod = Integer.toString((int)1e9 + 7);
        return res.mod(new BigInteger(mod)).intValue();
    }
}
