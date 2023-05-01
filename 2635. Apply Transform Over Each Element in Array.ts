function map(arr: number[], fn: (n: number, i: number) => number): number[] {
    const res = [];
    for(var i = 0; i < arr.length; i++){
        res.push(fn(arr[i], i));
    }
    return res;
};
