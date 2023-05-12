function countNegatives(grid: number[][]): number {
    let count = 0, n = grid.length, m = grid[0].length;
        for(let i=0; i<n; i++){
            let s = 0, e = m-1;
            while(s<=e){
                let mid = s + Math.floor((e-s)/2);
                if(grid[i][mid] < 0) e = mid-1;
                else s = mid + 1;
            }
            count += m-s;
        }
        return count;
};
