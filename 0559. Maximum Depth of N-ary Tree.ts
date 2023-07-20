/**
 * Definition for Node.
 * class Node {
 *     val: number
 *     children: Node[]
 *     constructor(val?: number, children?: Node[]) {
 *         this.val = (val===undefined ? 0 : val)
 *         this.children = (children===undefined ? [] : children)
 *     }
 * }
 */

function maxDepth(root: Node | null): number {
    // base case
    if(root == null){
        return 0;
    }
        
    let max : number = 0;
    // iterating through the children node and updating the maxDepth variable if
    // the children node have more depth than the current.
    for(const child of root.children){
        max = Math.max(max, maxDepth(child));
    }

    return max + 1;
};
