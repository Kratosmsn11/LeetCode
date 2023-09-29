function isMonotonic(nums: number[]): boolean {
    let inc = true;
    let dec = true;
    let i = 0;

    while(i !== nums.length && (inc || dec)){
        if(nums[i] > nums[i+1]){
            inc = false;
        }
        if(nums[i] < nums[i+1]){
            dec = false;
        }
        ++i;
    }

    return inc || dec;
};
