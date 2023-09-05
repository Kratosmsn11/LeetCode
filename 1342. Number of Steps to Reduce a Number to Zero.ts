// Using Recursion
function numberOfSteps(num: number): number {
    // base case
    if(num == 0){
        return 0;
    }

    return numberOfSteps((num%2 == 0) ? num/2 : num-1) + 1;
};
