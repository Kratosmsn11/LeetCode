/**
 * Definition for a binary tree node.
 * class TreeNode {
 *     val: number
 *     left: TreeNode | null
 *     right: TreeNode | null
 *     constructor(val?: number, left?: TreeNode | null, right?: TreeNode | null) {
 *         this.val = (val===undefined ? 0 : val)
 *         this.left = (left===undefined ? null : left)
 *         this.right = (right===undefined ? null : right)
 *     }
 * }
 */

function minDepth(root: TreeNode | null): number {
    if(root == null) return 0;

    let left = minDepth(root.left);
    let right = minDepth(root.right);

    if(left == 0 || right == 0){
        return (left+right)+1;
    }

    let res = Math.min(right, left)+1;

    return res;
};
