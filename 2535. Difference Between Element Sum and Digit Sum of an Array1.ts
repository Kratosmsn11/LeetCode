function differenceOfSum(nums: number[]): number {
    let sumOfDigits = 0;
    let sumOfElement = 0;
    
    for(const num of nums){
        sumOfElement += num;
        for(const digit of getNextDigit(num)){
            sumOfDigits += digit;
        }
    }

    return Math.abs(sumOfDigits - sumOfElement);
};

function* getNextDigit(num: number): Generator<number>{
    while(num>0){
        const digit = num % 10;
        yield digit
        num = Math.floor(num/10);
    }
};
