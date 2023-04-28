function subtractProductAndSum(n: number): number {
    let prod = 1, sum = 0;
    while(n != 0){
        let t = n % 10;
        n = Math.floor(n/10);
        prod *= t;
        sum += t;
    }
    return prod-sum;
};
