function subtractProductAndSum(n: number): number {
    const digits = n.toString().split("");
    let prod = 1, sum = 0;
    for(let i = 0; i < digits.length; i++){
        prod *= Number(digits[i]);
        sum += Number(digits[i]);
    }
    return prod-sum;
};
