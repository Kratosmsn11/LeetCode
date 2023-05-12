function commonFactors(a: number, b: number): number {
    let max = Math.max(a,b);
    let min = Math.min(a,b);
    let res = 0;

    for(let i = 0; i <= min; i++){
        if(min % i == 0 && max % i == 0) res++;
    }

    return res;
};
