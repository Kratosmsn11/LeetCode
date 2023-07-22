function countDigits(num: number): number {
    let result = 0, a = num;

    while(a > 0){
        let temp = a % 10;
        a = (a - temp)/10;
        if(num % temp == 0){
            result++;
        }
    }

    return result;
};
