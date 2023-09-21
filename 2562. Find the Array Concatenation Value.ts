function findTheArrayConcVal(nums: number[]): number {
    let concVal = 0;

    let start = 0;
    let end = nums.length - 1;
    while(start <= end){
        concVal += start === end ? nums[start] : concat(nums[start], nums[end]);
        ++start;
        --end;
    }

    return Number(concVal);
};

function concat(a: number, b: number) : number{
    return Number(`${a}${b}`);
};
