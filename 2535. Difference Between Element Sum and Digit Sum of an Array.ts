function differenceOfSum(nums: number[]): number {
    let sumOfDigits = 0;
    let sumOfElement = 0;
    
    for(const num of nums){
        sumOfElement += num;
        for(const digit of getDigits(num)){
            sumOfDigits += digit;
        }
    }

    return Math.abs(sumOfDigits - sumOfElement);
};

function getDigits(num: number){
    const listOfDigits = [];
    while(num>0){
        const t = num % 10;
        listOfDigits.push(t);
        num = Math.floor(num/10);
    }

    return listOfDigits;
};
